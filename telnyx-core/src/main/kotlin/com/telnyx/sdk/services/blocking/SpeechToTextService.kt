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

    /**
     * Open a WebSocket connection to stream audio and receive transcriptions in real-time.
     * Authentication is provided via the standard `Authorization: Bearer <API_KEY>` header.
     *
     * Supported engines: `Azure`, `Deepgram`, `Google`, `Telnyx`.
     *
     * **Connection flow:**
     * 1. Open WebSocket with query parameters specifying engine, input format, and language.
     * 2. Send binary audio frames (mp3/wav format).
     * 3. Receive JSON transcript frames with `transcript`, `is_final`, and `confidence` fields.
     * 4. Close connection when done.
     */
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
