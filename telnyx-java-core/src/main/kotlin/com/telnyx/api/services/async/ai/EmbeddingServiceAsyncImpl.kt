// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
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
import com.telnyx.api.models.ai.embeddings.EmbeddingCreateParams
import com.telnyx.api.models.ai.embeddings.EmbeddingListParams
import com.telnyx.api.models.ai.embeddings.EmbeddingListResponse
import com.telnyx.api.models.ai.embeddings.EmbeddingResponse
import com.telnyx.api.models.ai.embeddings.EmbeddingRetrieveParams
import com.telnyx.api.models.ai.embeddings.EmbeddingRetrieveResponse
import com.telnyx.api.models.ai.embeddings.EmbeddingSimilaritySearchParams
import com.telnyx.api.models.ai.embeddings.EmbeddingSimilaritySearchResponse
import com.telnyx.api.models.ai.embeddings.EmbeddingUrlParams
import com.telnyx.api.services.async.ai.embeddings.BucketServiceAsync
import com.telnyx.api.services.async.ai.embeddings.BucketServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EmbeddingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EmbeddingServiceAsync {

    private val withRawResponse: EmbeddingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val buckets: BucketServiceAsync by lazy { BucketServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EmbeddingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmbeddingServiceAsync =
        EmbeddingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun buckets(): BucketServiceAsync = buckets

    override fun create(
        params: EmbeddingCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmbeddingResponse> =
        // post /ai/embeddings
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EmbeddingRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmbeddingRetrieveResponse> =
        // get /ai/embeddings/{task_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EmbeddingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmbeddingListResponse> =
        // get /ai/embeddings
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun similaritySearch(
        params: EmbeddingSimilaritySearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmbeddingSimilaritySearchResponse> =
        // post /ai/embeddings/similarity-search
        withRawResponse().similaritySearch(params, requestOptions).thenApply { it.parse() }

    override fun url(
        params: EmbeddingUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmbeddingResponse> =
        // post /ai/embeddings/url
        withRawResponse().url(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmbeddingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val buckets: BucketServiceAsync.WithRawResponse by lazy {
            BucketServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmbeddingServiceAsync.WithRawResponse =
            EmbeddingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun buckets(): BucketServiceAsync.WithRawResponse = buckets

        private val createHandler: Handler<EmbeddingResponse> =
            jsonHandler<EmbeddingResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmbeddingCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings")
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

        private val retrieveHandler: Handler<EmbeddingRetrieveResponse> =
            jsonHandler<EmbeddingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmbeddingRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddingRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<EmbeddingListResponse> =
            jsonHandler<EmbeddingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmbeddingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddingListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val similaritySearchHandler: Handler<EmbeddingSimilaritySearchResponse> =
            jsonHandler<EmbeddingSimilaritySearchResponse>(clientOptions.jsonMapper)

        override fun similaritySearch(
            params: EmbeddingSimilaritySearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddingSimilaritySearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings", "similarity-search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { similaritySearchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val urlHandler: Handler<EmbeddingResponse> =
            jsonHandler<EmbeddingResponse>(clientOptions.jsonMapper)

        override fun url(
            params: EmbeddingUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings", "url")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { urlHandler.handle(it) }
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
