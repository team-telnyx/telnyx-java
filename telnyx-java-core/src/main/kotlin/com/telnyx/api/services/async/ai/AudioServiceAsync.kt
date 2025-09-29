// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.audio.AudioTranscribeParams
import com.telnyx.api.models.ai.audio.AudioTranscribeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AudioServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudioServiceAsync

    /**
     * Transcribe speech to text. This endpoint is consistent with the
     * [OpenAI Transcription API](https://platform.openai.com/docs/api-reference/audio/createTranscription)
     * and may be used with the OpenAI JS or Python SDK.
     */
    fun transcribe(params: AudioTranscribeParams): CompletableFuture<AudioTranscribeResponse> =
        transcribe(params, RequestOptions.none())

    /** @see transcribe */
    fun transcribe(
        params: AudioTranscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudioTranscribeResponse>

    /** A view of [AudioServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudioServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/audio/transcriptions`, but is otherwise the
         * same as [AudioServiceAsync.transcribe].
         */
        fun transcribe(
            params: AudioTranscribeParams
        ): CompletableFuture<HttpResponseFor<AudioTranscribeResponse>> =
            transcribe(params, RequestOptions.none())

        /** @see transcribe */
        fun transcribe(
            params: AudioTranscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudioTranscribeResponse>>
    }
}
