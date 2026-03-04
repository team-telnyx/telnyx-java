// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.models.speechtotext.SpeechToTextTranscribeParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Speech to text command operations */
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
    fun transcribe(params: SpeechToTextTranscribeParams): CompletableFuture<Void?> =
        transcribe(params, RequestOptions.none())

    /** @see transcribe */
    fun transcribe(
        params: SpeechToTextTranscribeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

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
         * Returns a raw HTTP response for `get /speech-to-text/transcription`, but is otherwise the
         * same as [SpeechToTextServiceAsync.transcribe].
         */
        fun transcribe(params: SpeechToTextTranscribeParams): CompletableFuture<HttpResponse> =
            transcribe(params, RequestOptions.none())

        /** @see transcribe */
        fun transcribe(
            params: SpeechToTextTranscribeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
