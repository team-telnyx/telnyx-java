// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texttospeech.TextToSpeechGenerateParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechGenerateResponse
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesResponse
import java.util.function.Consumer

/** Text to speech streaming command operations */
interface TextToSpeechService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TextToSpeechService

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
     * Supported providers: `aws`, `telnyx`, `azure`, `elevenlabs`, `minimax`, `rime`, `resemble`.
     *
     * The Telnyx `Ultra` model supports 44 languages with emotion control, speed adjustment, and
     * volume control. Use the `telnyx` provider-specific parameters to configure these features.
     */
    fun generate(): TextToSpeechGenerateResponse = generate(TextToSpeechGenerateParams.none())

    /** @see generate */
    fun generate(
        params: TextToSpeechGenerateParams = TextToSpeechGenerateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TextToSpeechGenerateResponse

    /** @see generate */
    fun generate(
        params: TextToSpeechGenerateParams = TextToSpeechGenerateParams.none()
    ): TextToSpeechGenerateResponse = generate(params, RequestOptions.none())

    /** @see generate */
    fun generate(requestOptions: RequestOptions): TextToSpeechGenerateResponse =
        generate(TextToSpeechGenerateParams.none(), requestOptions)

    /**
     * Retrieve a list of available voices from one or all TTS providers. When `provider` is
     * specified, returns voices for that provider only. Otherwise, returns voices from all
     * providers.
     *
     * Some providers (ElevenLabs, Resemble) require an API key to list voices.
     */
    fun listVoices(): TextToSpeechListVoicesResponse =
        listVoices(TextToSpeechListVoicesParams.none())

    /** @see listVoices */
    fun listVoices(
        params: TextToSpeechListVoicesParams = TextToSpeechListVoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TextToSpeechListVoicesResponse

    /** @see listVoices */
    fun listVoices(
        params: TextToSpeechListVoicesParams = TextToSpeechListVoicesParams.none()
    ): TextToSpeechListVoicesResponse = listVoices(params, RequestOptions.none())

    /** @see listVoices */
    fun listVoices(requestOptions: RequestOptions): TextToSpeechListVoicesResponse =
        listVoices(TextToSpeechListVoicesParams.none(), requestOptions)

    /**
     * A view of [TextToSpeechService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TextToSpeechService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /text-to-speech/speech`, but is otherwise the same
         * as [TextToSpeechService.generate].
         */
        @MustBeClosed
        fun generate(): HttpResponseFor<TextToSpeechGenerateResponse> =
            generate(TextToSpeechGenerateParams.none())

        /** @see generate */
        @MustBeClosed
        fun generate(
            params: TextToSpeechGenerateParams = TextToSpeechGenerateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TextToSpeechGenerateResponse>

        /** @see generate */
        @MustBeClosed
        fun generate(
            params: TextToSpeechGenerateParams = TextToSpeechGenerateParams.none()
        ): HttpResponseFor<TextToSpeechGenerateResponse> = generate(params, RequestOptions.none())

        /** @see generate */
        @MustBeClosed
        fun generate(
            requestOptions: RequestOptions
        ): HttpResponseFor<TextToSpeechGenerateResponse> =
            generate(TextToSpeechGenerateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /text-to-speech/voices`, but is otherwise the same
         * as [TextToSpeechService.listVoices].
         */
        @MustBeClosed
        fun listVoices(): HttpResponseFor<TextToSpeechListVoicesResponse> =
            listVoices(TextToSpeechListVoicesParams.none())

        /** @see listVoices */
        @MustBeClosed
        fun listVoices(
            params: TextToSpeechListVoicesParams = TextToSpeechListVoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TextToSpeechListVoicesResponse>

        /** @see listVoices */
        @MustBeClosed
        fun listVoices(
            params: TextToSpeechListVoicesParams = TextToSpeechListVoicesParams.none()
        ): HttpResponseFor<TextToSpeechListVoicesResponse> =
            listVoices(params, RequestOptions.none())

        /** @see listVoices */
        @MustBeClosed
        fun listVoices(
            requestOptions: RequestOptions
        ): HttpResponseFor<TextToSpeechListVoicesResponse> =
            listVoices(TextToSpeechListVoicesParams.none(), requestOptions)
    }
}
