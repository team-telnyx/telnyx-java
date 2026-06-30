// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.speechtotext.SpeechToTextListProvidersParams
import com.telnyx.sdk.models.speechtotext.SpeechToTextListProvidersResponse
import java.util.function.Consumer

/** Discover available speech-to-text providers, models, and supported languages. */
interface SpeechToTextService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeechToTextService

    /**
     * Retrieve the canonical list of supported speech-to-text providers, models, accepted language
     * codes, and the service types each model supports.
     *
     * Service types:
     * * `streaming` — standalone WebSocket transcription via `/speech-to-text/transcription`.
     * * `file_based` — file-based transcription via `/ai/audio/transcriptions`.
     * * `in_call` — live call transcription via Call Control `transcription_start`.
     * * `ai_assistant` — STT configured on a Call Control AI Assistant via voice-assistant
     *   `TranscriptionConfig` (covers both live-streaming and non-streaming/batch models).
     *
     * Use this endpoint to discover which (provider, model) combinations are available for the
     * surface you need, and which language codes each accepts. `auto` in a `languages` array
     * indicates the provider performs language detection.
     */
    fun listProviders(): SpeechToTextListProvidersResponse =
        listProviders(SpeechToTextListProvidersParams.none())

    /** @see listProviders */
    fun listProviders(
        params: SpeechToTextListProvidersParams = SpeechToTextListProvidersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SpeechToTextListProvidersResponse

    /** @see listProviders */
    fun listProviders(
        params: SpeechToTextListProvidersParams = SpeechToTextListProvidersParams.none()
    ): SpeechToTextListProvidersResponse = listProviders(params, RequestOptions.none())

    /** @see listProviders */
    fun listProviders(requestOptions: RequestOptions): SpeechToTextListProvidersResponse =
        listProviders(SpeechToTextListProvidersParams.none(), requestOptions)

    /**
     * A view of [SpeechToTextService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeechToTextService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /speech-to-text/providers`, but is otherwise the
         * same as [SpeechToTextService.listProviders].
         */
        @MustBeClosed
        fun listProviders(): HttpResponseFor<SpeechToTextListProvidersResponse> =
            listProviders(SpeechToTextListProvidersParams.none())

        /** @see listProviders */
        @MustBeClosed
        fun listProviders(
            params: SpeechToTextListProvidersParams = SpeechToTextListProvidersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SpeechToTextListProvidersResponse>

        /** @see listProviders */
        @MustBeClosed
        fun listProviders(
            params: SpeechToTextListProvidersParams = SpeechToTextListProvidersParams.none()
        ): HttpResponseFor<SpeechToTextListProvidersResponse> =
            listProviders(params, RequestOptions.none())

        /** @see listProviders */
        @MustBeClosed
        fun listProviders(
            requestOptions: RequestOptions
        ): HttpResponseFor<SpeechToTextListProvidersResponse> =
            listProviders(SpeechToTextListProvidersParams.none(), requestOptions)
    }
}
