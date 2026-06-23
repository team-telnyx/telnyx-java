// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texttospeech.TextToSpeechGenerateSpeechParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechGenerateSpeechResponse
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesResponse
import com.telnyx.sdk.models.texttospeech.TextToSpeechRetrieveSpeechParams
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
     * Generate synthesized speech audio from text input. Returns audio in the requested format
     * (binary audio stream, base64-encoded JSON, or an audio URL for later retrieval).
     *
     * Authentication is provided via the standard `Authorization: Bearer <API_KEY>` header.
     *
     * The `voice` parameter provides a convenient shorthand to specify provider, model, and voice
     * in a single string (e.g. `telnyx.NaturalHD.Alloy` or `Telnyx.Ultra.<voice_id>`).
     * Alternatively, specify `provider` explicitly along with provider-specific parameters.
     *
     * Supported providers: `aws`, `telnyx`, `azure`, `elevenlabs`, `minimax`, `rime`, `resemble`,
     * `xai`.
     *
     * The Telnyx `Ultra` model supports 44 languages with emotion control, speed adjustment, and
     * volume control. Use the `telnyx` provider-specific parameters to configure these features.
     */
    fun generateSpeech(): CompletableFuture<TextToSpeechGenerateSpeechResponse> =
        generateSpeech(TextToSpeechGenerateSpeechParams.none())

    /** @see generateSpeech */
    fun generateSpeech(
        params: TextToSpeechGenerateSpeechParams = TextToSpeechGenerateSpeechParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TextToSpeechGenerateSpeechResponse>

    /** @see generateSpeech */
    fun generateSpeech(
        params: TextToSpeechGenerateSpeechParams = TextToSpeechGenerateSpeechParams.none()
    ): CompletableFuture<TextToSpeechGenerateSpeechResponse> =
        generateSpeech(params, RequestOptions.none())

    /** @see generateSpeech */
    fun generateSpeech(
        requestOptions: RequestOptions
    ): CompletableFuture<TextToSpeechGenerateSpeechResponse> =
        generateSpeech(TextToSpeechGenerateSpeechParams.none(), requestOptions)

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
     * `elevenlabs`, `xai`.
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
     *
     * **Note:** The Telnyx `Ultra` model is not available over WebSocket. Use the HTTP POST
     * `/text-to-speech/speech` endpoint instead.
     */
    fun retrieveSpeech(): CompletableFuture<Void?> =
        retrieveSpeech(TextToSpeechRetrieveSpeechParams.none())

    /** @see retrieveSpeech */
    fun retrieveSpeech(
        params: TextToSpeechRetrieveSpeechParams = TextToSpeechRetrieveSpeechParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieveSpeech */
    fun retrieveSpeech(
        params: TextToSpeechRetrieveSpeechParams = TextToSpeechRetrieveSpeechParams.none()
    ): CompletableFuture<Void?> = retrieveSpeech(params, RequestOptions.none())

    /** @see retrieveSpeech */
    fun retrieveSpeech(requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieveSpeech(TextToSpeechRetrieveSpeechParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /text-to-speech/speech`, but is otherwise the same
         * as [TextToSpeechServiceAsync.generateSpeech].
         */
        fun generateSpeech():
            CompletableFuture<HttpResponseFor<TextToSpeechGenerateSpeechResponse>> =
            generateSpeech(TextToSpeechGenerateSpeechParams.none())

        /** @see generateSpeech */
        fun generateSpeech(
            params: TextToSpeechGenerateSpeechParams = TextToSpeechGenerateSpeechParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TextToSpeechGenerateSpeechResponse>>

        /** @see generateSpeech */
        fun generateSpeech(
            params: TextToSpeechGenerateSpeechParams = TextToSpeechGenerateSpeechParams.none()
        ): CompletableFuture<HttpResponseFor<TextToSpeechGenerateSpeechResponse>> =
            generateSpeech(params, RequestOptions.none())

        /** @see generateSpeech */
        fun generateSpeech(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TextToSpeechGenerateSpeechResponse>> =
            generateSpeech(TextToSpeechGenerateSpeechParams.none(), requestOptions)

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
         * as [TextToSpeechServiceAsync.retrieveSpeech].
         */
        fun retrieveSpeech(): CompletableFuture<HttpResponse> =
            retrieveSpeech(TextToSpeechRetrieveSpeechParams.none())

        /** @see retrieveSpeech */
        fun retrieveSpeech(
            params: TextToSpeechRetrieveSpeechParams = TextToSpeechRetrieveSpeechParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieveSpeech */
        fun retrieveSpeech(
            params: TextToSpeechRetrieveSpeechParams = TextToSpeechRetrieveSpeechParams.none()
        ): CompletableFuture<HttpResponse> = retrieveSpeech(params, RequestOptions.none())

        /** @see retrieveSpeech */
        fun retrieveSpeech(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieveSpeech(TextToSpeechRetrieveSpeechParams.none(), requestOptions)
    }
}
