// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.openai

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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateResponse
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListModelsParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListModelsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class EmbeddingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmbeddingServiceAsync {

    private val withRawResponse: EmbeddingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmbeddingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmbeddingServiceAsync =
        EmbeddingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EmbeddingCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmbeddingCreateResponse> =
        // post /ai/openai/embeddings
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun listModels(
        params: EmbeddingListModelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmbeddingListModelsResponse> =
        // get /ai/openai/embeddings/models
        withRawResponse().listModels(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmbeddingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmbeddingServiceAsync.WithRawResponse =
            EmbeddingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EmbeddingCreateResponse> =
            jsonHandler<EmbeddingCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmbeddingCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddingCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "openai", "embeddings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listModelsHandler: Handler<EmbeddingListModelsResponse> =
            jsonHandler<EmbeddingListModelsResponse>(clientOptions.jsonMapper)

        override fun listModels(
            params: EmbeddingListModelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddingListModelsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "openai", "embeddings", "models")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listModelsHandler.handle(it) }
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
