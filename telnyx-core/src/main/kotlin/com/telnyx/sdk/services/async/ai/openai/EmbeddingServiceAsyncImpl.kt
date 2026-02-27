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
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateEmbeddingsParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingCreateEmbeddingsResponse
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListEmbeddingModelsParams
import com.telnyx.sdk.models.ai.openai.embeddings.EmbeddingListEmbeddingModelsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** OpenAI-compatible embeddings endpoints for generating vector representations of text */
class EmbeddingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmbeddingServiceAsync {

    private val withRawResponse: EmbeddingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmbeddingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmbeddingServiceAsync =
        EmbeddingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createEmbeddings(
        params: EmbeddingCreateEmbeddingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmbeddingCreateEmbeddingsResponse> =
        // post /ai/openai/embeddings
        withRawResponse().createEmbeddings(params, requestOptions).thenApply { it.parse() }

    override fun listEmbeddingModels(
        params: EmbeddingListEmbeddingModelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmbeddingListEmbeddingModelsResponse> =
        // get /ai/openai/embeddings/models
        withRawResponse().listEmbeddingModels(params, requestOptions).thenApply { it.parse() }

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

        private val createEmbeddingsHandler: Handler<EmbeddingCreateEmbeddingsResponse> =
            jsonHandler<EmbeddingCreateEmbeddingsResponse>(clientOptions.jsonMapper)

        override fun createEmbeddings(
            params: EmbeddingCreateEmbeddingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddingCreateEmbeddingsResponse>> {
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
                            .use { createEmbeddingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listEmbeddingModelsHandler: Handler<EmbeddingListEmbeddingModelsResponse> =
            jsonHandler<EmbeddingListEmbeddingModelsResponse>(clientOptions.jsonMapper)

        override fun listEmbeddingModels(
            params: EmbeddingListEmbeddingModelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddingListEmbeddingModelsResponse>> {
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
                            .use { listEmbeddingModelsHandler.handle(it) }
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
