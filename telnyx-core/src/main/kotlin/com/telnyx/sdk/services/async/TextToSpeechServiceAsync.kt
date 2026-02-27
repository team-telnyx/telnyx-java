// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesResponse
import com.telnyx.sdk.models.texttospeech.TextToSpeechStreamParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Text to speech streaming command operations */
interface TextToSpeechServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TextToSpeechServiceAsync

    /**
     * Retrieve a list of available voices from one or all TTS providers. When `provider` is
     * specified, returns voices for that provider only. Otherwise, returns voices from all
     * providers.
     *
     * Some providers (ElevenLabs, Resemble) require an API key to list voices.
     */
    fun listVoices(): CompletableFuture<TextToSpeechListVoicesResponse> =
        listVoices(TextToSpeechListVoicesParams.none())

    /** @see listVoices */
    fun listVoices(
        params: TextToSpeechListVoicesParams = TextToSpeechListVoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TextToSpeechListVoicesResponse>

    /** @see listVoices */
    fun listVoices(
        params: TextToSpeechListVoicesParams = TextToSpeechListVoicesParams.none()
    ): CompletableFuture<TextToSpeechListVoicesResponse> = listVoices(params, RequestOptions.none())

    /** @see listVoices */
    fun listVoices(
        requestOptions: RequestOptions
    ): CompletableFuture<TextToSpeechListVoicesResponse> =
        listVoices(TextToSpeechListVoicesParams.none(), requestOptions)

    /**
     * Open a WebSocket connection to stream text and receive synthesized audio in real time.
     * Authentication is provided via the standard `Authorization: Bearer <API_KEY>` header. Send
     * JSON frames with text to synthesize; receive JSON frames containing base64-encoded audio
     * chunks.
     *
     * Supported providers: `aws`, `telnyx`, `azure`, `murfai`, `minimax`, `rime`, `resemble`,
     * `elevenlabs`.
     *
     * **Connection flow:**
     * 1. Open WebSocket with query parameters specifying provider, voice, and model.
     * 2. Send an initial handshake message `{"text": " "}` (single space) with optional
     *    `voice_settings` to initialize the session.
     * 3. Send text messages as `{"text": "Hello world"}`.
     * 4. Receive audio chunks as JSON frames with base64-encoded audio.
     * 5. A final frame with `isFinal: true` indicates the end of audio for the current text.
     *
     * To interrupt and restart synthesis mid-stream, send `{"force": true}` — the current worker is
     * stopped and a new one is started.
     */
    fun stream(): CompletableFuture<Void?> = stream(TextToSpeechStreamParams.none())

    /** @see stream */
    fun stream(
        params: TextToSpeechStreamParams = TextToSpeechStreamParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see stream */
    fun stream(
        params: TextToSpeechStreamParams = TextToSpeechStreamParams.none()
    ): CompletableFuture<Void?> = stream(params, RequestOptions.none())

    /** @see stream */
    fun stream(requestOptions: RequestOptions): CompletableFuture<Void?> =
        stream(TextToSpeechStreamParams.none(), requestOptions)

    /**
     * A view of [TextToSpeechServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TextToSpeechServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /text-to-speech/voices`, but is otherwise the same
         * as [TextToSpeechServiceAsync.listVoices].
         */
        fun listVoices(): CompletableFuture<HttpResponseFor<TextToSpeechListVoicesResponse>> =
            listVoices(TextToSpeechListVoicesParams.none())

        /** @see listVoices */
        fun listVoices(
            params: TextToSpeechListVoicesParams = TextToSpeechListVoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TextToSpeechListVoicesResponse>>

        /** @see listVoices */
        fun listVoices(
            params: TextToSpeechListVoicesParams = TextToSpeechListVoicesParams.none()
        ): CompletableFuture<HttpResponseFor<TextToSpeechListVoicesResponse>> =
            listVoices(params, RequestOptions.none())

        /** @see listVoices */
        fun listVoices(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TextToSpeechListVoicesResponse>> =
            listVoices(TextToSpeechListVoicesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /text-to-speech/speech`, but is otherwise the same
         * as [TextToSpeechServiceAsync.stream].
         */
        fun stream(): CompletableFuture<HttpResponse> = stream(TextToSpeechStreamParams.none())

        /** @see stream */
        fun stream(
            params: TextToSpeechStreamParams = TextToSpeechStreamParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see stream */
        fun stream(
            params: TextToSpeechStreamParams = TextToSpeechStreamParams.none()
        ): CompletableFuture<HttpResponse> = stream(params, RequestOptions.none())

        /** @see stream */
        fun stream(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            stream(TextToSpeechStreamParams.none(), requestOptions)
    }
}
