package com.telnyx.sdk.websocket

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.websocket.speechtotext.SpeechToTextStreamService
import com.telnyx.sdk.websocket.speechtotext.SpeechToTextStreamServiceImpl
import com.telnyx.sdk.websocket.texttospeech.TextToSpeechStreamService
import com.telnyx.sdk.websocket.texttospeech.TextToSpeechStreamServiceImpl
import okhttp3.OkHttpClient
import java.io.Closeable

/**
 * Client for Telnyx WebSocket-based streaming services.
 *
 * This client provides access to real-time streaming services for:
 * - Speech-to-Text (STT): Real-time audio transcription
 * - Text-to-Speech (TTS): Real-time audio synthesis
 *
 * Example usage:
 * ```kotlin
 * val clientOptions = ClientOptions.builder()
 *     .apiKey("your-api-key")
 *     .build()
 *
 * val wsClient = TelnyxWebSocketClient(clientOptions)
 *
 * // Speech-to-Text streaming
 * val sttParams = SttStreamParams.builder()
 *     .transcriptionEngine(SttStreamParams.TranscriptionEngine.TELNYX)
 *     .language("en-US")
 *     .build()
 *
 * val sttConnection = wsClient.speechToText().connectBlocking(sttParams, object : WebSocketListener<SttServerEvent> {
 *     override fun onEvent(event: SttServerEvent) {
 *         when (event) {
 *             is SttServerEvent.TranscriptFrame -> println("Transcript: ${event.transcript}")
 *             else -> {}
 *         }
 *     }
 * })
 * sttConnection.send(audioBytes)
 * sttConnection.close()
 *
 * // Text-to-Speech streaming
 * val ttsParams = TtsStreamParams.builder()
 *     .voice("telnyx.natural.alloy")
 *     .build()
 *
 * val ttsConnection = wsClient.textToSpeech().connectBlocking(ttsParams, object : WebSocketListener<TtsServerEvent> {
 *     override fun onEvent(event: TtsServerEvent) {
 *         when (event) {
 *             is TtsServerEvent.AudioChunkFrame -> {
 *                 event.audio?.let { base64Audio ->
 *                     val audioBytes = Base64.getDecoder().decode(base64Audio)
 *                     // Process audio bytes
 *                 }
 *             }
 *             else -> {}
 *         }
 *     }
 * })
 * ttsConnection.sendHandshake()
 * ttsConnection.sendText("Hello, world!")
 * ttsConnection.close()
 * ```
 */
class TelnyxWebSocketClient private constructor(
    private val clientOptions: ClientOptions,
    private val okHttpClient: OkHttpClient?
) : Closeable {

    private val speechToTextService: SpeechToTextStreamService by lazy {
        SpeechToTextStreamServiceImpl(clientOptions, okHttpClient)
    }

    private val textToSpeechService: TextToSpeechStreamService by lazy {
        TextToSpeechStreamServiceImpl(clientOptions, okHttpClient)
    }

    /**
     * Returns the Speech-to-Text streaming service.
     */
    fun speechToText(): SpeechToTextStreamService = speechToTextService

    /**
     * Returns the Text-to-Speech streaming service.
     */
    fun textToSpeech(): TextToSpeechStreamService = textToSpeechService

    override fun close() {
        // OkHttpClient manages its own resources
    }

    companion object {
        /**
         * Create a new TelnyxWebSocketClient with the given client options.
         */
        @JvmStatic
        fun create(clientOptions: ClientOptions): TelnyxWebSocketClient {
            return TelnyxWebSocketClient(clientOptions, null)
        }

        /**
         * Create a new TelnyxWebSocketClient with the given client options and OkHttpClient.
         */
        @JvmStatic
        fun create(clientOptions: ClientOptions, okHttpClient: OkHttpClient): TelnyxWebSocketClient {
            return TelnyxWebSocketClient(clientOptions, okHttpClient)
        }

        /**
         * Create a new TelnyxWebSocketClient with just an API key.
         */
        @JvmStatic
        fun fromApiKey(apiKey: String): TelnyxWebSocketClient {
            val clientOptions = ClientOptions.builder()
                .apiKey(apiKey)
                .build()
            return create(clientOptions)
        }

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {
        private var clientOptions: ClientOptions? = null
        private var apiKey: String? = null
        private var okHttpClient: OkHttpClient? = null
        private var baseUrl: String? = null

        fun clientOptions(clientOptions: ClientOptions) = apply {
            this.clientOptions = clientOptions
        }

        fun apiKey(apiKey: String) = apply {
            this.apiKey = apiKey
        }

        fun okHttpClient(okHttpClient: OkHttpClient) = apply {
            this.okHttpClient = okHttpClient
        }

        fun baseUrl(baseUrl: String) = apply {
            this.baseUrl = baseUrl
        }

        fun build(): TelnyxWebSocketClient {
            val options = clientOptions ?: run {
                requireNotNull(apiKey) { "Either clientOptions or apiKey must be provided" }
                ClientOptions.builder()
                    .apiKey(apiKey!!)
                    .apply { baseUrl?.let { baseUrl(it) } }
                    .build()
            }
            return TelnyxWebSocketClient(options, okHttpClient)
        }
    }
}
