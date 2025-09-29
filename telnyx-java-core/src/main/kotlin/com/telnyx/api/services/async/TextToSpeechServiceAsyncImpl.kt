// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.texttospeech.TextToSpeechGenerateSpeechParams
import com.telnyx.api.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.api.models.texttospeech.TextToSpeechListVoicesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class TextToSpeechServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TextToSpeechServiceAsync {

    private val withRawResponse: TextToSpeechServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TextToSpeechServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TextToSpeechServiceAsync =
        TextToSpeechServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun generateSpeech(
        params: TextToSpeechGenerateSpeechParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /text-to-speech/speech
        withRawResponse().generateSpeech(params, requestOptions)

    override fun listVoices(
        params: TextToSpeechListVoicesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TextToSpeechListVoicesResponse> =
        // get /text-to-speech/voices
        withRawResponse().listVoices(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TextToSpeechServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TextToSpeechServiceAsync.WithRawResponse =
            TextToSpeechServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun generateSpeech(
            params: TextToSpeechGenerateSpeechParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("text-to-speech", "speech")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val listVoicesHandler: Handler<TextToSpeechListVoicesResponse> =
            jsonHandler<TextToSpeechListVoicesResponse>(clientOptions.jsonMapper)

        override fun listVoices(
            params: TextToSpeechListVoicesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TextToSpeechListVoicesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("text-to-speech", "voices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listVoicesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
