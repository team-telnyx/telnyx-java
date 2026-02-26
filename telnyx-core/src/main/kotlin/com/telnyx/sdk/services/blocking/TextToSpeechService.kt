// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.sdk.models.texttospeech.TextToSpeechListVoicesResponse
import com.telnyx.sdk.models.texttospeech.TextToSpeechStreamParams
import java.util.function.Consumer

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

    /** Returns a list of voices that can be used with the text to speech commands. */
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
    fun stream() = stream(TextToSpeechStreamParams.none())

    /** @see stream */
    fun stream(
        params: TextToSpeechStreamParams = TextToSpeechStreamParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see stream */
    fun stream(params: TextToSpeechStreamParams = TextToSpeechStreamParams.none()) =
        stream(params, RequestOptions.none())

    /** @see stream */
    fun stream(requestOptions: RequestOptions) =
        stream(TextToSpeechStreamParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `get /text-to-speech/speech`, but is otherwise the same
         * as [TextToSpeechService.stream].
         */
        @MustBeClosed fun stream(): HttpResponse = stream(TextToSpeechStreamParams.none())

        /** @see stream */
        @MustBeClosed
        fun stream(
            params: TextToSpeechStreamParams = TextToSpeechStreamParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see stream */
        @MustBeClosed
        fun stream(
            params: TextToSpeechStreamParams = TextToSpeechStreamParams.none()
        ): HttpResponse = stream(params, RequestOptions.none())

        /** @see stream */
        @MustBeClosed
        fun stream(requestOptions: RequestOptions): HttpResponse =
            stream(TextToSpeechStreamParams.none(), requestOptions)
    }
}
