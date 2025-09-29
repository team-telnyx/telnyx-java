// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.embeddings

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.ai.embeddings.buckets.BucketDeleteParams
import com.telnyx.api.models.ai.embeddings.buckets.BucketListParams
import com.telnyx.api.models.ai.embeddings.buckets.BucketListResponse
import com.telnyx.api.models.ai.embeddings.buckets.BucketRetrieveParams
import com.telnyx.api.models.ai.embeddings.buckets.BucketRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BucketServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BucketService {

    private val withRawResponse: BucketService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BucketService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BucketService =
        BucketServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: BucketRetrieveParams,
        requestOptions: RequestOptions,
    ): BucketRetrieveResponse =
        // get /ai/embeddings/buckets/{bucket_name}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: BucketListParams,
        requestOptions: RequestOptions,
    ): BucketListResponse =
        // get /ai/embeddings/buckets
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: BucketDeleteParams, requestOptions: RequestOptions) {
        // delete /ai/embeddings/buckets/{bucket_name}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BucketService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BucketService.WithRawResponse =
            BucketServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<BucketRetrieveResponse> =
            jsonHandler<BucketRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BucketRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BucketRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bucketName", params.bucketName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings", "buckets", params._pathParam(0))
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

        private val listHandler: Handler<BucketListResponse> =
            jsonHandler<BucketListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BucketListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BucketListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings", "buckets")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: BucketDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bucketName", params.bucketName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "embeddings", "buckets", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
