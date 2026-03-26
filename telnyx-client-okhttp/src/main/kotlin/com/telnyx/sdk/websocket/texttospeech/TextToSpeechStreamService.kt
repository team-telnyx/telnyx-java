package com.telnyx.sdk.websocket.texttospeech

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.websocket.WebSocketListener
import okhttp3.OkHttpClient
import java.util.concurrent.CompletableFuture

/**
 * Service interface for text-to-speech WebSocket streaming.
 *
 * This service provides methods to create WebSocket connections for real-time
 * text-to-speech synthesis.
 */
interface TextToSpeechStreamService {

    /**
     * Create a new WebSocket connection for text-to-speech streaming.
     *
     * @param params The stream parameters including voice, provider, etc.
     * @return A new TextToSpeechWebSocket instance.
     */
    fun createConnection(params: TtsStreamParams = TtsStreamParams.none()): TextToSpeechWebSocket

    /**
     * Create and connect a WebSocket for text-to-speech streaming.
     *
     * @param params The stream parameters.
     * @param listener The listener for WebSocket events.
     * @return A CompletableFuture that completes with the connected WebSocket.
     */
    fun connect(
        params: TtsStreamParams = TtsStreamParams.none(),
        listener: WebSocketListener<TtsServerEvent>
    ): CompletableFuture<TextToSpeechWebSocket>

    /**
     * Create and connect a WebSocket for text-to-speech streaming (blocking).
     *
     * @param params The stream parameters.
     * @param listener The listener for WebSocket events.
     * @return The connected WebSocket.
     */
    fun connectBlocking(
        params: TtsStreamParams = TtsStreamParams.none(),
        listener: WebSocketListener<TtsServerEvent>
    ): TextToSpeechWebSocket
}

/**
 * Implementation of TextToSpeechStreamService.
 */
class TextToSpeechStreamServiceImpl(
    private val clientOptions: ClientOptions,
    private val okHttpClient: OkHttpClient? = null
) : TextToSpeechStreamService {

    override fun createConnection(params: TtsStreamParams): TextToSpeechWebSocket {
        return TextToSpeechWebSocket(clientOptions, params, okHttpClient)
    }

    override fun connect(
        params: TtsStreamParams,
        listener: WebSocketListener<TtsServerEvent>
    ): CompletableFuture<TextToSpeechWebSocket> {
        val connection = createConnection(params)
        connection.addListener(listener)
        return connection.connect().thenApply { connection }
    }

    override fun connectBlocking(
        params: TtsStreamParams,
        listener: WebSocketListener<TtsServerEvent>
    ): TextToSpeechWebSocket {
        val connection = createConnection(params)
        connection.addListener(listener)
        connection.connect()
        connection.waitForOpen()
        return connection
    }

    companion object {
        @JvmStatic
        fun create(clientOptions: ClientOptions): TextToSpeechStreamService {
            return TextToSpeechStreamServiceImpl(clientOptions)
        }

        @JvmStatic
        fun create(clientOptions: ClientOptions, okHttpClient: OkHttpClient): TextToSpeechStreamService {
            return TextToSpeechStreamServiceImpl(clientOptions, okHttpClient)
        }
    }
}
