// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.multipartFormData
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.audio.AudioTranscribeParams
import com.telnyx.sdk.models.ai.audio.AudioTranscribeResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Turn audio into text or text into audio. */
class AudioServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AudioServiceAsync {

    private val withRawResponse: AudioServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudioServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudioServiceAsync =
        AudioServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun transcribe(
        params: AudioTranscribeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudioTranscribeResponse> =
        // post /ai/audio/transcriptions
        withRawResponse().transcribe(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudioServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudioServiceAsync.WithRawResponse =
            AudioServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val transcribeHandler: Handler<AudioTranscribeResponse> =
            jsonHandler<AudioTranscribeResponse>(clientOptions.jsonMapper)

        override fun transcribe(
            params: AudioTranscribeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudioTranscribeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "audio", "transcriptions")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { transcribeHandler.handle(it) }
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
