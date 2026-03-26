// Custom code for WebSocket streaming support - persists across codegen runs.

package com.telnyx.sdk.websocket

import com.fasterxml.jackson.databind.json.JsonMapper
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.speechtotext.SpeechToTextStreamParams
import com.telnyx.sdk.models.speechtotext.SttServerEvent
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
import okio.ByteString

/**
 * A synchronous Speech-to-Text WebSocket connection with an iterator-based API.
 *
 * Use this when you want to iterate over transcription events synchronously.
 *
 * Example usage:
 * ```kotlin
 * val connection = SpeechToTextConnection.connect(clientOptions, params)
 * connection.use { conn ->
 *     conn.send(audioBytes)
 *
 *     for (event in conn) {
 *         if (event.isTranscript()) {
 *             val transcript = event.asTranscript()
 *             println("${if (transcript.isFinal()) "[FINAL]" else "[INTERIM]"} ${transcript.transcript()}")
 *         }
 *     }
 * }
 * ```
 */
class SpeechToTextConnection
private constructor(
    private val webSocket: WebSocket,
    private val eventQueue: BlockingQueue<Result<SttServerEvent>>,
    private val isOpen: AtomicBoolean,
    private val jsonMapper: JsonMapper,
) : Closeable, Iterator<SttServerEvent> {

    private var nextEvent: SttServerEvent? = null
    private var hasCalledNext = false

    companion object {
        /**
         * Creates and connects a new Speech-to-Text WebSocket connection.
         *
         * @param clientOptions the client options containing API key and base URL
         * @param params the streaming parameters
         * @param okHttpClient the OkHttp client to use (optional)
         * @param jsonMapper the JSON mapper to use (optional)
         * @param timeout connection timeout in milliseconds
         * @return a connected SpeechToTextConnection
         * @throws WebSocketError if connection fails
         */
        @JvmStatic
        @JvmOverloads
        fun connect(
            clientOptions: ClientOptions,
            params: SpeechToTextStreamParams,
            okHttpClient: OkHttpClient = OkHttpClient(),
            jsonMapper: JsonMapper = jsonMapper(),
            timeout: Long = 30000,
        ): SpeechToTextConnection {
            val eventQueue = LinkedBlockingQueue<Result<SttServerEvent>>()
            val isOpen = AtomicBoolean(false)
            val connectionError = AtomicBoolean(false)
            var startupError: Throwable? = null

            val url = buildUrl(clientOptions, params)

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
                                val event = jsonMapper.readValue(text, SttServerEvent::class.java)
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
                            // Signal end of stream
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

            return SpeechToTextConnection(webSocket, eventQueue, isOpen, jsonMapper)
        }

        private fun buildUrl(
            clientOptions: ClientOptions,
            params: SpeechToTextStreamParams,
        ): String {
            val baseUrl = clientOptions.baseUrl().removeSuffix("/")
            val wsUrl = baseUrl.replace("https://", "wss://").replace("http://", "ws://")
            val path = "/speech-to-text/transcription"

            val queryParams = params.toQueryParams()
            val queryString =
                queryParams.entries.joinToString("&") { (key, value) ->
                    "${java.net.URLEncoder.encode(key, "UTF-8")}=${java.net.URLEncoder.encode(value, "UTF-8")}"
                }

            return "$wsUrl$path?$queryString"
        }
    }

    /**
     * Sends binary audio data to the server for transcription.
     *
     * @param data raw audio bytes
     * @return true if sent successfully
     */
    fun send(data: ByteArray): Boolean {
        return webSocket.send(ByteString.of(*data))
    }

    /**
     * Receives the next transcription event, blocking until available.
     *
     * @return the next event
     * @throws WebSocketError if an error occurs
     * @throws ConnectionClosedException if the connection is closed
     */
    fun recv(): SttServerEvent {
        val result = eventQueue.take()
        return result.getOrThrow()
    }

    /**
     * Receives the next transcription event with a timeout.
     *
     * @param timeout the maximum time to wait
     * @param unit the time unit
     * @return the next event, or null if timeout
     * @throws WebSocketError if an error occurs
     * @throws ConnectionClosedException if the connection is closed
     */
    fun recv(timeout: Long, unit: TimeUnit): SttServerEvent? {
        val result = eventQueue.poll(timeout, unit) ?: return null
        return result.getOrThrow()
    }

    /**
     * Receives raw bytes from the event queue. This method parses the result as an SttServerEvent.
     */
    fun recvBytes(): ByteArray {
        throw UnsupportedOperationException("Use recv() for JSON events")
    }

    /** Parses raw JSON data into an SttServerEvent. */
    fun parseEvent(data: String): SttServerEvent {
        return jsonMapper.readValue(data, SttServerEvent::class.java)
    }

    /** Parses raw bytes as JSON into an SttServerEvent. */
    fun parseEvent(data: ByteArray): SttServerEvent {
        return jsonMapper.readValue(data, SttServerEvent::class.java)
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

    /** Returns the next transcription event. */
    override fun next(): SttServerEvent {
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

/** Exception thrown when the WebSocket connection is closed. */
class ConnectionClosedException(val code: Int, val reason: String) :
    Exception("Connection closed: $code $reason")
