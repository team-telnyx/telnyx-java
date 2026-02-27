// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage.buckets

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetApiUsageParams
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetApiUsageResponse
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetBucketUsageParams
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetBucketUsageResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Bucket Usage operations */
class UsageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageService {

    private val withRawResponse: UsageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService =
        UsageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getApiUsage(
        params: UsageGetApiUsageParams,
        requestOptions: RequestOptions,
    ): UsageGetApiUsageResponse =
        // get /storage/buckets/{bucketName}/usage/api
        withRawResponse().getApiUsage(params, requestOptions).parse()

    override fun getBucketUsage(
        params: UsageGetBucketUsageParams,
        requestOptions: RequestOptions,
    ): UsageGetBucketUsageResponse =
        // get /storage/buckets/{bucketName}/usage/storage
        withRawResponse().getBucketUsage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageService.WithRawResponse =
            UsageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getApiUsageHandler: Handler<UsageGetApiUsageResponse> =
            jsonHandler<UsageGetApiUsageResponse>(clientOptions.jsonMapper)

        override fun getApiUsage(
            params: UsageGetApiUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageGetApiUsageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bucketName", params.bucketName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "buckets", params._pathParam(0), "usage", "api")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getApiUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getBucketUsageHandler: Handler<UsageGetBucketUsageResponse> =
            jsonHandler<UsageGetBucketUsageResponse>(clientOptions.jsonMapper)

        override fun getBucketUsage(
            params: UsageGetBucketUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageGetBucketUsageResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bucketName", params.bucketName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "buckets", params._pathParam(0), "usage", "storage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getBucketUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
