// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.emptyHandler
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.speechtotext.SpeechToTextTranscribeParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SpeechToTextServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SpeechToTextServiceAsync {

    private val withRawResponse: SpeechToTextServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpeechToTextServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeechToTextServiceAsync =
        SpeechToTextServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun transcribe(
        params: SpeechToTextTranscribeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /speech-to-text/transcription
        withRawResponse().transcribe(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpeechToTextServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeechToTextServiceAsync.WithRawResponse =
            SpeechToTextServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val transcribeHandler: Handler<Void?> = emptyHandler()

        override fun transcribe(
            params: SpeechToTextTranscribeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("speech-to-text", "transcription")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { transcribeHandler.handle(it) }
                    }
                }
        }
    }
}
