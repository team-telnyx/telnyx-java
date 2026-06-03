// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.speechtotext.SpeechToTextListProvidersParams
import com.telnyx.sdk.models.speechtotext.SpeechToTextListProvidersResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Discover available speech-to-text providers, models, and supported languages. */
interface SpeechToTextServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeechToTextServiceAsync

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
    fun listProviders(): CompletableFuture<SpeechToTextListProvidersResponse> =
        listProviders(SpeechToTextListProvidersParams.none())

    /** @see listProviders */
    fun listProviders(
        params: SpeechToTextListProvidersParams = SpeechToTextListProvidersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SpeechToTextListProvidersResponse>

    /** @see listProviders */
    fun listProviders(
        params: SpeechToTextListProvidersParams = SpeechToTextListProvidersParams.none()
    ): CompletableFuture<SpeechToTextListProvidersResponse> =
        listProviders(params, RequestOptions.none())

    /** @see listProviders */
    fun listProviders(
        requestOptions: RequestOptions
    ): CompletableFuture<SpeechToTextListProvidersResponse> =
        listProviders(SpeechToTextListProvidersParams.none(), requestOptions)

    /**
     * A view of [SpeechToTextServiceAsync] that provides access to raw HTTP responses for each
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
        ): SpeechToTextServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /speech-to-text/providers`, but is otherwise the
         * same as [SpeechToTextServiceAsync.listProviders].
         */
        fun listProviders(): CompletableFuture<HttpResponseFor<SpeechToTextListProvidersResponse>> =
            listProviders(SpeechToTextListProvidersParams.none())

        /** @see listProviders */
        fun listProviders(
            params: SpeechToTextListProvidersParams = SpeechToTextListProvidersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SpeechToTextListProvidersResponse>>

        /** @see listProviders */
        fun listProviders(
            params: SpeechToTextListProvidersParams = SpeechToTextListProvidersParams.none()
        ): CompletableFuture<HttpResponseFor<SpeechToTextListProvidersResponse>> =
            listProviders(params, RequestOptions.none())

        /** @see listProviders */
        fun listProviders(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SpeechToTextListProvidersResponse>> =
            listProviders(SpeechToTextListProvidersParams.none(), requestOptions)
    }
}
