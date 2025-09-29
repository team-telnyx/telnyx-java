// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.texttospeech.TextToSpeechGenerateSpeechParams
import com.telnyx.api.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.api.models.texttospeech.TextToSpeechListVoicesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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

    /** Converts the provided text to speech using the specified voice and returns audio data */
    fun generateSpeech(params: TextToSpeechGenerateSpeechParams): CompletableFuture<HttpResponse> =
        generateSpeech(params, RequestOptions.none())

    /** @see generateSpeech */
    fun generateSpeech(
        params: TextToSpeechGenerateSpeechParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** Returns a list of voices that can be used with the text to speech commands. */
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
        fun generateSpeech(
            params: TextToSpeechGenerateSpeechParams
        ): CompletableFuture<HttpResponse> = generateSpeech(params, RequestOptions.none())

        /** @see generateSpeech */
        fun generateSpeech(
            params: TextToSpeechGenerateSpeechParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

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
    }
}
