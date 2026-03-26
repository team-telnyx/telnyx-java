package com.telnyx.sdk.websocket.texttospeech

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
 * WebSocket connection for real-time text-to-speech synthesis.
 *
 * This class manages a WebSocket connection to the Telnyx TTS API,
 * allowing you to stream text and receive synthesized audio in real-time.
 *
 * Example usage:
 * ```kotlin
 * val connection = TextToSpeechWebSocket(clientOptions, params)
 * connection.addListener(object : WebSocketListener<TtsServerEvent> {
 *     override fun onEvent(event: TtsServerEvent) {
 *         when (event) {
 *             is TtsServerEvent.AudioChunkFrame -> {
 *                 event.audio?.let { base64Audio ->
 *                     val audioBytes = Base64.getDecoder().decode(base64Audio)
 *                     // Process audio bytes
 *                 }
 *             }
 *             is TtsServerEvent.FinalFrame -> println("Synthesis complete")
 *             is TtsServerEvent.ErrorFrame -> println("Error: ${event.error}")
 *         }
 *     }
 * })
 * connection.connect()
 * connection.waitForOpen()
 * connection.send(TtsClientEvent.handshake(mapOf("voice_speed" to 1.0)))
 * connection.send(TtsClientEvent.text("Hello, world!"))
 * connection.close()
 * ```
 */
class TextToSpeechWebSocket(
    private val clientOptions: ClientOptions,
    private val params: TtsStreamParams = TtsStreamParams.none(),
    private val okHttpClient: OkHttpClient? = null
) : Closeable {

    companion object {
        private const val TTS_PATH = "/text-to-speech/speech"
        private const val NORMAL_CLOSURE_CODE = 1000
    }

    private val jsonMapper = clientOptions.jsonMapper
    private val listeners = CopyOnWriteArrayList<WebSocketListener<TtsServerEvent>>()
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
    fun addListener(listener: WebSocketListener<TtsServerEvent>) {
        listeners.add(listener)
    }

    /**
     * Remove a listener.
     */
    fun removeListener(listener: WebSocketListener<TtsServerEvent>) {
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
     * Send a client event to the server.
     *
     * @param event The event to send.
     * @throws IllegalStateException if the connection is not open.
     */
    fun send(event: TtsClientEvent) {
        val webSocket = webSocketRef.get()
            ?: throw IllegalStateException("WebSocket is not connected")
        if (state.get() != WebSocketConnectionState.OPEN) {
            throw IllegalStateException("WebSocket is not open. Current state: ${state.get()}")
        }
        val json = jsonMapper.writeValueAsString(event)
        webSocket.send(json)
    }

    /**
     * Send text to be synthesized.
     *
     * @param text The text to synthesize.
     * @param force When true, interrupts current synthesis and starts new.
     */
    @JvmOverloads
    fun sendText(text: String, force: Boolean? = null) {
        send(TtsClientEvent.text(text, force))
    }

    /**
     * Send a handshake event with optional voice settings.
     *
     * @param voiceSettings Provider-specific voice settings.
     */
    @JvmOverloads
    fun sendHandshake(voiceSettings: Map<String, Any>? = null) {
        send(TtsClientEvent.handshake(voiceSettings))
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
            "$wsUrl$TTS_PATH?$queryString"
        } else {
            "$wsUrl$TTS_PATH"
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
                    val event = jsonMapper.readValue(text, TtsServerEvent::class.java)
                    listeners.forEach { it.onEvent(event) }

                    if (event is TtsServerEvent.ErrorFrame) {
                        val error = WebSocketError(event.error ?: "Unknown error", errorData = event)
                        listeners.forEach { it.onError(error) }
                    }
                } catch (e: Exception) {
                    val error = WebSocketError("Failed to parse WebSocket message: $text", e)
                    listeners.forEach { it.onError(error) }
                }
            }

            override fun onMessage(webSocket: WebSocket, bytes: ByteString) {
                // TTS server sends JSON text messages, not binary
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
