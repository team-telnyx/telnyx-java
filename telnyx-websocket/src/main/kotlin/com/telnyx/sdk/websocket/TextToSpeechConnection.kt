// Custom code for WebSocket streaming support - persists across codegen runs.

package com.telnyx.sdk.websocket

import com.fasterxml.jackson.databind.json.JsonMapper
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.texttospeech.StreamClientEvent
import com.telnyx.sdk.models.texttospeech.StreamServerEvent
import java.io.Closeable
import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.jvm.optionals.getOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener

/**
 * A synchronous Text-to-Speech WebSocket connection with an iterator-based API.
 *
 * Use this when you want to iterate over TTS events synchronously.
 *
 * Example usage:
 * ```kotlin
 * val connection = TextToSpeechConnection.connect(clientOptions)
 * connection.use { conn ->
 *     // Send initial handshake with voice settings
 *     conn.send(StreamClientEvent.builder()
 *         .text(" ")
 *         .voiceSettings(StreamClientEvent.VoiceSettings.builder()
 *             .putAdditionalProperty("voice", JsonValue.from("telnyx.NaturalHD.Alloy"))
 *             .build())
 *         .build())
 *
 *     // Send text to synthesize
 *     conn.sendText("Hello, world!")
 *
 *     for (event in conn) {
 *         when {
 *             event.isAudioChunk() -> {
 *                 val audioBytes = Base64.getDecoder().decode(event.asAudioChunk().audio())
 *                 // Process audio bytes
 *             }
 *             event.isFinalFrameEvent() -> break
 *             event.isError() -> throw WebSocketError(event.asError().error())
 *         }
 *     }
 * }
 * ```
 */
class TextToSpeechConnection
private constructor(
    private val webSocket: WebSocket,
    private val eventQueue: BlockingQueue<Result<StreamServerEvent>>,
    private val isOpen: AtomicBoolean,
    private val jsonMapper: JsonMapper,
) : Closeable, Iterator<StreamServerEvent> {

    private var nextEvent: StreamServerEvent? = null
    private var hasCalledNext = false

    companion object {
        /**
         * Creates and connects a new Text-to-Speech WebSocket connection.
         *
         * @param clientOptions the client options containing API key and base URL
         * @param okHttpClient the OkHttp client to use (optional)
         * @param jsonMapper the JSON mapper to use (optional)
         * @param timeout connection timeout in milliseconds
         * @return a connected TextToSpeechConnection
         * @throws WebSocketError if connection fails
         */
        @JvmStatic
        @JvmOverloads
        fun connect(
            clientOptions: ClientOptions,
            okHttpClient: OkHttpClient = OkHttpClient(),
            jsonMapper: JsonMapper = jsonMapper(),
            timeout: Long = 30000,
        ): TextToSpeechConnection {
            val eventQueue = LinkedBlockingQueue<Result<StreamServerEvent>>()
            val isOpen = AtomicBoolean(false)
            val connectionError = AtomicBoolean(false)
            var startupError: Throwable? = null

            val url = buildUrl(clientOptions)

            val request =
                Request.Builder()
                    .url(url)
                    .apply {
                        clientOptions.apiKey().getOrNull()?.let { apiKey ->
                            addHeader("Authorization", "Bearer $apiKey")
                        }
                    }
                    .build()

            val openLatch = java.util.concurrent.CountDownLatch(1)

            val webSocket =
                okHttpClient.newWebSocket(
                    request,
                    object : WebSocketListener() {
                        override fun onOpen(webSocket: WebSocket, response: Response) {
                            isOpen.set(true)
                            openLatch.countDown()
                        }

                        override fun onMessage(webSocket: WebSocket, text: String) {
                            try {
                                val event =
                                    jsonMapper.readValue(text, StreamServerEvent::class.java)
                                eventQueue.put(Result.success(event))
                            } catch (e: Exception) {
                                eventQueue.put(
                                    Result.failure(WebSocketError("Failed to parse message", e))
                                )
                            }
                        }

                        override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
                            // Server initiated close
                        }

                        override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
                            isOpen.set(false)
                            eventQueue.put(Result.failure(ConnectionClosedException(code, reason)))
                        }

                        override fun onFailure(
                            webSocket: WebSocket,
                            t: Throwable,
                            response: Response?,
                        ) {
                            isOpen.set(false)
                            if (!connectionError.getAndSet(true)) {
                                startupError = t
                                openLatch.countDown()
                            }
                            eventQueue.put(
                                Result.failure(
                                    WebSocketError(
                                        message = t.message ?: "Connection failed",
                                        cause = t,
                                        code = response?.code,
                                    )
                                )
                            )
                        }
                    },
                )

            // Wait for connection
            if (!openLatch.await(timeout, TimeUnit.MILLISECONDS)) {
                webSocket.cancel()
                throw WebSocketError("Connection timeout")
            }

            if (!isOpen.get()) {
                throw WebSocketError(
                    message = startupError?.message ?: "Failed to connect",
                    cause = startupError,
                )
            }

            return TextToSpeechConnection(webSocket, eventQueue, isOpen, jsonMapper)
        }

        private fun buildUrl(clientOptions: ClientOptions): String {
            val baseUrl = clientOptions.baseUrl().removeSuffix("/")
            val wsUrl = baseUrl.replace("https://", "wss://").replace("http://", "ws://")
            val path = "/text-to-speech/speech"

            return "$wsUrl$path"
        }
    }

    /**
     * Sends a client event to the server.
     *
     * @param event the event to send
     * @return true if sent successfully
     */
    fun send(event: StreamClientEvent): Boolean {
        val json = jsonMapper.writeValueAsString(event)
        return webSocket.send(json)
    }

    /**
     * Sends text to synthesize (convenience method).
     *
     * @param text the text to synthesize
     * @param force when true, interrupts current synthesis
     * @return true if sent successfully
     */
    @JvmOverloads
    fun sendText(text: String, force: Boolean = false): Boolean {
        val eventBuilder = StreamClientEvent.builder().text(text)
        if (force) {
            eventBuilder.force(true)
        }
        return send(eventBuilder.build())
    }

    /**
     * Receives the next TTS event, blocking until available.
     *
     * @return the next event
     * @throws WebSocketError if an error occurs
     * @throws ConnectionClosedException if the connection is closed
     */
    fun recv(): StreamServerEvent {
        val result = eventQueue.take()
        return result.getOrThrow()
    }

    /**
     * Receives the next TTS event with a timeout.
     *
     * @param timeout the maximum time to wait
     * @param unit the time unit
     * @return the next event, or null if timeout
     * @throws WebSocketError if an error occurs
     * @throws ConnectionClosedException if the connection is closed
     */
    fun recv(timeout: Long, unit: TimeUnit): StreamServerEvent? {
        val result = eventQueue.poll(timeout, unit) ?: return null
        return result.getOrThrow()
    }

    /**
     * Receives the next event as raw bytes. This is the raw JSON bytes from the WebSocket message.
     */
    fun recvBytes(): ByteArray {
        throw UnsupportedOperationException("Use recv() for JSON events")
    }

    /** Parses raw JSON data into a StreamServerEvent. */
    fun parseEvent(data: String): StreamServerEvent {
        return jsonMapper.readValue(data, StreamServerEvent::class.java)
    }

    /** Parses raw bytes as JSON into a StreamServerEvent. */
    fun parseEvent(data: ByteArray): StreamServerEvent {
        return jsonMapper.readValue(data, StreamServerEvent::class.java)
    }

    /** Checks if there are more events available. */
    override fun hasNext(): Boolean {
        if (!hasCalledNext) {
            try {
                nextEvent = recv(100, TimeUnit.MILLISECONDS)
                hasCalledNext = true
            } catch (e: ConnectionClosedException) {
                return false
            } catch (e: WebSocketError) {
                return false
            }
        }
        return nextEvent != null
    }

    /** Returns the next TTS event. */
    override fun next(): StreamServerEvent {
        if (!hasCalledNext) {
            hasNext()
        }
        hasCalledNext = false
        return nextEvent ?: throw NoSuchElementException("No more events")
    }

    /** Closes the connection. */
    override fun close() {
        close(1000, "OK")
    }

    /** Closes the connection with a specific code and reason. */
    fun close(code: Int, reason: String) {
        webSocket.close(code, reason)
        isOpen.set(false)
    }

    /** Returns whether the connection is open. */
    fun isOpen(): Boolean = isOpen.get()
}
