// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.embeddings.EmbeddingCreateParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingListParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingListResponse
import com.telnyx.sdk.models.ai.embeddings.EmbeddingResponse
import com.telnyx.sdk.models.ai.embeddings.EmbeddingRetrieveParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingRetrieveResponse
import com.telnyx.sdk.models.ai.embeddings.EmbeddingSimilaritySearchParams
import com.telnyx.sdk.models.ai.embeddings.EmbeddingSimilaritySearchResponse
import com.telnyx.sdk.models.ai.embeddings.EmbeddingUrlParams
import com.telnyx.sdk.services.blocking.ai.embeddings.BucketService
import com.telnyx.sdk.services.blocking.ai.embeddings.BucketServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Embed documents and perform text searches */
class EmbeddingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmbeddingService {

    private val withRawResponse: EmbeddingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val buckets: BucketService by lazy { BucketServiceImpl(clientOptions) }

    override fun withRawResponse(): EmbeddingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmbeddingService =
        EmbeddingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Embed documents and perform text searches */
    override fun buckets(): BucketService = buckets

    override fun create(
        params: EmbeddingCreateParams,
        requestOptions: RequestOptions,
    ): EmbeddingResponse =
        // post /ai/embeddings
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EmbeddingRetrieveParams,
        requestOptions: RequestOptions,
    ): EmbeddingRetrieveResponse =
        // get /ai/embeddings/{task_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: EmbeddingListParams,
        requestOptions: RequestOptions,
    ): EmbeddingListResponse =
        // get /ai/embeddings
        withRawResponse().list(params, requestOptions).parse()

    override fun similaritySearch(
        params: EmbeddingSimilaritySearchParams,
        requestOptions: RequestOptions,
    ): EmbeddingSimilaritySearchResponse =
        // post /ai/embeddings/similarity-search
        withRawResponse().similaritySearch(params, requestOptions).parse()

    override fun url(
        params: EmbeddingUrlParams,
        requestOptions: RequestOptions,
    ): EmbeddingResponse =
        // post /ai/embeddings/url
        withRawResponse().url(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmbeddingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val buckets: BucketService.WithRawResponse by lazy {
            BucketServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmbeddingService.WithRawResponse =
            EmbeddingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Embed documents and perform text searches */
        override fun buckets(): BucketService.WithRawResponse = buckets

        private val createHandler: Handler<EmbeddingResponse> =
            jsonHandler<EmbeddingResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EmbeddingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<EmbeddingRetrieveResponse> =
            jsonHandler<EmbeddingRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmbeddingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddingRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("taskId", params.taskId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<EmbeddingListResponse> =
            jsonHandler<EmbeddingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EmbeddingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddingListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val similaritySearchHandler: Handler<EmbeddingSimilaritySearchResponse> =
            jsonHandler<EmbeddingSimilaritySearchResponse>(clientOptions.jsonMapper)

        override fun similaritySearch(
            params: EmbeddingSimilaritySearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddingSimilaritySearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings", "similarity-search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { similaritySearchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val urlHandler: Handler<EmbeddingResponse> =
            jsonHandler<EmbeddingResponse>(clientOptions.jsonMapper)

        override fun url(
            params: EmbeddingUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings", "url")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
