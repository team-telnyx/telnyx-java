// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.models.speechtotext.SpeechToTextTranscribeParams
import java.util.function.Consumer

/** Speech to text command operations */
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

    /** Transcribe audio streams to text over WebSocket. */
    fun transcribe(params: SpeechToTextTranscribeParams) = transcribe(params, RequestOptions.none())

    /** @see transcribe */
    fun transcribe(
        params: SpeechToTextTranscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

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
         * Returns a raw HTTP response for `get /speech-to-text/transcription`, but is otherwise the
         * same as [SpeechToTextService.transcribe].
         */
        @MustBeClosed
        fun transcribe(params: SpeechToTextTranscribeParams): HttpResponse =
            transcribe(params, RequestOptions.none())

        /** @see transcribe */
        @MustBeClosed
        fun transcribe(
            params: SpeechToTextTranscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
