// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.texttospeech.TextToSpeechGenerateSpeechParams
import com.telnyx.api.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.api.models.texttospeech.TextToSpeechListVoicesResponse
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

    /** Converts the provided text to speech using the specified voice and returns audio data */
    @MustBeClosed
    fun generateSpeech(params: TextToSpeechGenerateSpeechParams): HttpResponse =
        generateSpeech(params, RequestOptions.none())

    /** @see generateSpeech */
    @MustBeClosed
    fun generateSpeech(
        params: TextToSpeechGenerateSpeechParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

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
         * as [TextToSpeechService.generateSpeech].
         */
        @MustBeClosed
        fun generateSpeech(params: TextToSpeechGenerateSpeechParams): HttpResponse =
            generateSpeech(params, RequestOptions.none())

        /** @see generateSpeech */
        @MustBeClosed
        fun generateSpeech(
            params: TextToSpeechGenerateSpeechParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

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
