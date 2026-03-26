// Custom code for WebSocket streaming support - persists across codegen runs.

package com.telnyx.sdk.websocket

import com.fasterxml.jackson.databind.json.JsonMapper
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.speechtotext.SpeechToTextStreamParams
import com.telnyx.sdk.models.speechtotext.SttServerEvent
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.ByteString
import java.io.Closeable
import java.net.URL
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean

/**
 * WebSocket client for real-time Speech-to-Text transcription.
 *
 * Connect to `wss://api.telnyx.com/v2/speech-to-text/transcription` with query parameters
 * specifying the transcription engine, input format, and language. Send binary audio frames
 * and receive JSON transcription events.
 *
 * Example usage:
 * ```kotlin
 * val client = TelnyxOkHttpClient.fromEnv()
 * val params = SpeechToTextStreamParams.builder()
 *     .transcriptionEngine(SpeechToTextStreamParams.TranscriptionEngine.TELNYX)
 *     .inputFormat(SpeechToTextStreamParams.InputFormat.WAV)
 *     .language("en-US")
 *     .interimResults(true)
 *     .build()
 *
 * val ws = SpeechToTextWebSocket(client.clientOptions(), params)
 *
 * ws.on { event ->
 *     when {
 *         event.isTranscript() -> println("Transcript: ${event.asTranscript().transcript()}")
 *         event.isError() -> println("Error: ${event.asError().error()}")
 *     }
 * }
 *
 * ws.onError { error ->
 *     println("WebSocket error: ${error.message}")
 * }
 *
 * ws.waitForOpen()
 * ws.send(audioBytes)
 * // ...
 * ws.close()
 * ```
 */
class SpeechToTextWebSocket(
    private val clientOptions: ClientOptions,
    private val params: SpeechToTextStreamParams,
    private val okHttpClient: OkHttpClient = OkHttpClient(),
    private val jsonMapper: JsonMapper = jsonMapper(),
) : EventEmitter<SttServerEvent>(), Closeable {

    private val url: URL
    private var webSocket: WebSocket? = null
    private val isOpen = AtomicBoolean(false)
    private val openLatch = CountDownLatch(1)
    private val errorListeners = mutableListOf<(WebSocketError) -> Unit>()

    init {
        url = buildUrl()
    }

    /**
     * Registers an error listener.
     *
     * @param listener the listener to register
     * @return this client for chaining
     */
    fun onError(listener: (WebSocketError) -> Unit): SpeechToTextWebSocket {
        errorListeners.add(listener)
        return this
    }

    /**
     * Opens the WebSocket connection. This is called automatically on first send
     * if not already connected.
     *
     * @return this client for chaining
     */
    fun connect(): SpeechToTextWebSocket {
        if (webSocket != null) {
            return this
        }

        val request = Request.Builder()
            .url(url.toString())
            .apply {
                clientOptions.apiKey().ifPresent { apiKey ->
                    addHeader("Authorization", "Bearer $apiKey")
                }
            }
            .build()

        webSocket = okHttpClient.newWebSocket(request, object : WebSocketListener() {
            override fun onOpen(webSocket: WebSocket, response: Response) {
                isOpen.set(true)
                openLatch.countDown()
            }

            override fun onMessage(webSocket: WebSocket, text: String) {
                try {
                    val event = jsonMapper.readValue(text, SttServerEvent::class.java)
                    emit(event)

                    if (event.isError()) {
                        val errorFrame = event.asError()
                        emitError(WebSocketError(
                            message = errorFrame.error(),
                            code = errorFrame.code().orElse(null)?.toIntOrNull(),
                            errorData = errorFrame
                        ))
                    }
                } catch (e: Exception) {
                    emitError(WebSocketError("Failed to parse WebSocket message", e))
                }
            }

            override fun onMessage(webSocket: WebSocket, bytes: ByteString) {
                // Binary messages are not expected from the server
            }

            override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
                isOpen.set(false)
            }

            override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
                isOpen.set(false)
            }

            override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
                isOpen.set(false)
                openLatch.countDown()
                emitError(WebSocketError(
                    message = t.message ?: "WebSocket connection failed",
                    cause = t,
                    code = response?.code
                ))
            }
        })

        return this
    }

    /**
     * Waits for the WebSocket connection to be established.
     *
     * @param timeout maximum time to wait
     * @param unit time unit for the timeout
     * @return true if connected within the timeout, false otherwise
     */
    @JvmOverloads
    fun waitForOpen(timeout: Long = 30, unit: TimeUnit = TimeUnit.SECONDS): Boolean {
        connect()
        return openLatch.await(timeout, unit) && isOpen.get()
    }

    /**
     * Returns a CompletableFuture that completes when the connection is established.
     *
     * @return a future that completes when connected
     */
    fun waitForOpenAsync(): CompletableFuture<Void> {
        return CompletableFuture.runAsync {
            if (!waitForOpen()) {
                throw WebSocketError("Failed to connect to WebSocket")
            }
        }
    }

    /**
     * Sends binary audio data to the server for transcription.
     *
     * @param data raw audio bytes (mp3, wav, or raw format depending on input_format parameter)
     * @return true if the message was enqueued, false if the connection is closed
     */
    fun send(data: ByteArray): Boolean {
        connect()
        return webSocket?.send(ByteString.of(*data)) ?: false
    }

    /**
     * Checks if the WebSocket is currently open and ready to send data.
     *
     * @return true if open, false otherwise
     */
    fun isOpen(): Boolean = isOpen.get()

    /**
     * Closes the WebSocket connection.
     *
     * @param code the close code (default: 1000 for normal closure)
     * @param reason the close reason (default: "OK")
     */
    fun close(code: Int, reason: String) {
        webSocket?.close(code, reason)
        isOpen.set(false)
    }

    override fun close() {
        close(1000, "OK")
    }

    private fun buildUrl(): URL {
        val baseUrl = clientOptions.baseUrl().removeSuffix("/")
        val wsUrl = baseUrl.replace("https://", "wss://").replace("http://", "ws://")
        val path = "/speech-to-text/transcription"

        val queryParams = params.toQueryParams()
        val queryString = queryParams.entries.joinToString("&") { (key, value) ->
            "${java.net.URLEncoder.encode(key, "UTF-8")}=${java.net.URLEncoder.encode(value, "UTF-8")}"
        }

        return URL("$wsUrl$path?$queryString")
    }

    private fun emitError(error: WebSocketError) {
        if (errorListeners.isEmpty()) {
            // If no error listeners, throw as unhandled
            throw error
        }
        errorListeners.forEach { it(error) }
    }
}
