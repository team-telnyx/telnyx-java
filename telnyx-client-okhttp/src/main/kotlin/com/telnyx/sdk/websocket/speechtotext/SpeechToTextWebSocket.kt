package com.telnyx.sdk.websocket.speechtotext

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.websocket.WebSocketConnectionState
import com.telnyx.sdk.websocket.WebSocketError
import com.telnyx.sdk.websocket.WebSocketListener
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.WebSocket
import okio.ByteString
import java.io.Closeable
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CopyOnWriteArrayList
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference

/**
 * WebSocket connection for real-time speech-to-text transcription.
 *
 * This class manages a WebSocket connection to the Telnyx STT API,
 * allowing you to stream audio data and receive transcription results in real-time.
 *
 * Example usage:
 * ```kotlin
 * val connection = SpeechToTextWebSocket(clientOptions, params)
 * connection.addListener(object : WebSocketListener<SttServerEvent> {
 *     override fun onEvent(event: SttServerEvent) {
 *         when (event) {
 *             is SttServerEvent.TranscriptFrame -> println("Transcript: ${event.transcript}")
 *             is SttServerEvent.ErrorFrame -> println("Error: ${event.error}")
 *         }
 *     }
 * })
 * connection.connect()
 * connection.waitForOpen()
 * connection.send(audioBytes)
 * connection.close()
 * ```
 */
class SpeechToTextWebSocket(
    private val clientOptions: ClientOptions,
    private val params: SttStreamParams,
    private val okHttpClient: OkHttpClient? = null
) : Closeable {

    companion object {
        private const val STT_PATH = "/speech-to-text/transcription"
        private const val NORMAL_CLOSURE_CODE = 1000
    }

    private val jsonMapper = clientOptions.jsonMapper
    private val listeners = CopyOnWriteArrayList<WebSocketListener<SttServerEvent>>()
    private val state = AtomicReference(WebSocketConnectionState.CLOSED)
    private val webSocketRef = AtomicReference<WebSocket?>(null)
    private val openFuture = AtomicReference<CompletableFuture<Unit>?>(null)

    /**
     * Returns the current connection state.
     */
    fun state(): WebSocketConnectionState = state.get()

    /**
     * Returns true if the connection is open and ready to send data.
     */
    fun isOpen(): Boolean = state.get() == WebSocketConnectionState.OPEN

    /**
     * Add a listener for WebSocket events.
     */
    fun addListener(listener: WebSocketListener<SttServerEvent>) {
        listeners.add(listener)
    }

    /**
     * Remove a listener.
     */
    fun removeListener(listener: WebSocketListener<SttServerEvent>) {
        listeners.remove(listener)
    }

    /**
     * Connect to the WebSocket server.
     *
     * @return A CompletableFuture that completes when the connection is established.
     */
    fun connect(): CompletableFuture<Unit> {
        if (state.get() != WebSocketConnectionState.CLOSED) {
            val future = CompletableFuture<Unit>()
            future.completeExceptionally(
                IllegalStateException("Connection is already ${state.get()}")
            )
            return future
        }

        state.set(WebSocketConnectionState.CONNECTING)
        val future = CompletableFuture<Unit>()
        openFuture.set(future)

        val url = buildWebSocketUrl()
        val request = Request.Builder()
            .url(url)
            .apply {
                clientOptions.apiKey().ifPresent { apiKey ->
                    addHeader("Authorization", "Bearer $apiKey")
                }
            }
            .build()

        val client = okHttpClient ?: createDefaultOkHttpClient()
        val webSocket = client.newWebSocket(request, createWebSocketListener())
        webSocketRef.set(webSocket)

        return future
    }

    /**
     * Wait for the connection to be established.
     * Blocks until the connection is open or an error occurs.
     *
     * @param timeout The maximum time to wait.
     * @param unit The time unit.
     * @throws WebSocketError if the connection fails.
     */
    @JvmOverloads
    fun waitForOpen(timeout: Long = 30, unit: TimeUnit = TimeUnit.SECONDS) {
        val future = openFuture.get()
            ?: throw IllegalStateException("Connection not started. Call connect() first.")
        try {
            future.get(timeout, unit)
        } catch (e: Exception) {
            throw WebSocketError("Failed to establish connection", e)
        }
    }

    /**
     * Send binary audio data to the server for transcription.
     *
     * @param data Raw audio bytes (mp3, wav, or raw format depending on input_format parameter).
     * @throws IllegalStateException if the connection is not open.
     */
    fun send(data: ByteArray) {
        val webSocket = webSocketRef.get()
            ?: throw IllegalStateException("WebSocket is not connected")
        if (state.get() != WebSocketConnectionState.OPEN) {
            throw IllegalStateException("WebSocket is not open. Current state: ${state.get()}")
        }
        webSocket.send(ByteString.of(*data))
    }

    /**
     * Close the WebSocket connection.
     *
     * @param code The close code (default: 1000 for normal closure).
     * @param reason The close reason (default: "OK").
     */
    fun closeWithReason(code: Int, reason: String) {
        val webSocket = webSocketRef.get() ?: return
        state.set(WebSocketConnectionState.CLOSING)
        webSocket.close(code, reason)
    }

    override fun close() {
        closeWithReason(NORMAL_CLOSURE_CODE, "OK")
    }

    private fun buildWebSocketUrl(): String {
        val baseUrl = clientOptions.baseUrl()
        val wsUrl = baseUrl
            .replace("https://", "wss://")
            .replace("http://", "ws://")
            .trimEnd('/')

        val queryParams = params.toQueryParams()
        val queryString = if (queryParams.isNotEmpty()) {
            queryParams.entries.joinToString("&") { (key, value) ->
                "${java.net.URLEncoder.encode(key, "UTF-8")}=${java.net.URLEncoder.encode(value, "UTF-8")}"
            }
        } else ""

        return if (queryString.isNotEmpty()) {
            "$wsUrl$STT_PATH?$queryString"
        } else {
            "$wsUrl$STT_PATH"
        }
    }

    private fun createDefaultOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(0, TimeUnit.SECONDS) // No timeout for WebSocket reads
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    private fun createWebSocketListener(): okhttp3.WebSocketListener {
        return object : okhttp3.WebSocketListener() {
            override fun onOpen(webSocket: WebSocket, response: Response) {
                state.set(WebSocketConnectionState.OPEN)
                openFuture.get()?.complete(Unit)
                listeners.forEach { it.onOpen() }
            }

            override fun onMessage(webSocket: WebSocket, text: String) {
                try {
                    val event = jsonMapper.readValue(text, SttServerEvent::class.java)
                    listeners.forEach { it.onEvent(event) }

                    if (event is SttServerEvent.ErrorFrame) {
                        val error = WebSocketError(event.error, errorData = event)
                        listeners.forEach { it.onError(error) }
                    }
                } catch (e: Exception) {
                    val error = WebSocketError("Failed to parse WebSocket message: $text", e)
                    listeners.forEach { it.onError(error) }
                }
            }

            override fun onMessage(webSocket: WebSocket, bytes: ByteString) {
                // STT server sends JSON text messages, not binary
                onMessage(webSocket, bytes.utf8())
            }

            override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
                state.set(WebSocketConnectionState.CLOSING)
            }

            override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
                state.set(WebSocketConnectionState.CLOSED)
                webSocketRef.set(null)
                listeners.forEach { it.onClose(code, reason) }
            }

            override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
                state.set(WebSocketConnectionState.CLOSED)
                webSocketRef.set(null)
                val error = WebSocketError(
                    t.message ?: "WebSocket connection failed",
                    t
                )
                openFuture.get()?.completeExceptionally(error)
                listeners.forEach { it.onError(error) }
            }
        }
    }
}
