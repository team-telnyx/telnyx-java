package com.telnyx.sdk.websocket.speechtotext

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.websocket.WebSocketListener
import okhttp3.OkHttpClient
import java.util.concurrent.CompletableFuture

/**
 * Service interface for speech-to-text WebSocket streaming.
 *
 * This service provides methods to create WebSocket connections for real-time
 * speech-to-text transcription.
 */
interface SpeechToTextStreamService {

    /**
     * Create a new WebSocket connection for speech-to-text streaming.
     *
     * @param params The stream parameters including transcription engine, language, etc.
     * @return A new SpeechToTextWebSocket instance.
     */
    fun createConnection(params: SttStreamParams): SpeechToTextWebSocket

    /**
     * Create and connect a WebSocket for speech-to-text streaming.
     *
     * @param params The stream parameters.
     * @param listener The listener for WebSocket events.
     * @return A CompletableFuture that completes with the connected WebSocket.
     */
    fun connect(
        params: SttStreamParams,
        listener: WebSocketListener<SttServerEvent>
    ): CompletableFuture<SpeechToTextWebSocket>

    /**
     * Create and connect a WebSocket for speech-to-text streaming (blocking).
     *
     * @param params The stream parameters.
     * @param listener The listener for WebSocket events.
     * @return The connected WebSocket.
     */
    fun connectBlocking(
        params: SttStreamParams,
        listener: WebSocketListener<SttServerEvent>
    ): SpeechToTextWebSocket
}

/**
 * Implementation of SpeechToTextStreamService.
 */
class SpeechToTextStreamServiceImpl(
    private val clientOptions: ClientOptions,
    private val okHttpClient: OkHttpClient? = null
) : SpeechToTextStreamService {

    override fun createConnection(params: SttStreamParams): SpeechToTextWebSocket {
        return SpeechToTextWebSocket(clientOptions, params, okHttpClient)
    }

    override fun connect(
        params: SttStreamParams,
        listener: WebSocketListener<SttServerEvent>
    ): CompletableFuture<SpeechToTextWebSocket> {
        val connection = createConnection(params)
        connection.addListener(listener)
        return connection.connect().thenApply { connection }
    }

    override fun connectBlocking(
        params: SttStreamParams,
        listener: WebSocketListener<SttServerEvent>
    ): SpeechToTextWebSocket {
        val connection = createConnection(params)
        connection.addListener(listener)
        connection.connect()
        connection.waitForOpen()
        return connection
    }

    companion object {
        @JvmStatic
        fun create(clientOptions: ClientOptions): SpeechToTextStreamService {
            return SpeechToTextStreamServiceImpl(clientOptions)
        }

        @JvmStatic
        fun create(clientOptions: ClientOptions, okHttpClient: OkHttpClient): SpeechToTextStreamService {
            return SpeechToTextStreamServiceImpl(clientOptions, okHttpClient)
        }
    }
}
