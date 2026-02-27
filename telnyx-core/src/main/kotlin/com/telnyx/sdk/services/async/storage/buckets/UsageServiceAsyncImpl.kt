// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.buckets

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetApiUsageParams
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetApiUsageResponse
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetBucketUsageParams
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetBucketUsageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Bucket Usage operations */
class UsageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageServiceAsync {

    private val withRawResponse: UsageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UsageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageServiceAsync =
        UsageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getApiUsage(
        params: UsageGetApiUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageGetApiUsageResponse> =
        // get /storage/buckets/{bucketName}/usage/api
        withRawResponse().getApiUsage(params, requestOptions).thenApply { it.parse() }

    override fun getBucketUsage(
        params: UsageGetBucketUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageGetBucketUsageResponse> =
        // get /storage/buckets/{bucketName}/usage/storage
        withRawResponse().getBucketUsage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageServiceAsync.WithRawResponse =
            UsageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getApiUsageHandler: Handler<UsageGetApiUsageResponse> =
            jsonHandler<UsageGetApiUsageResponse>(clientOptions.jsonMapper)

        override fun getApiUsage(
            params: UsageGetApiUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageGetApiUsageResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bucketName", params.bucketName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "buckets", params._pathParam(0), "usage", "api")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getApiUsageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getBucketUsageHandler: Handler<UsageGetBucketUsageResponse> =
            jsonHandler<UsageGetBucketUsageResponse>(clientOptions.jsonMapper)

        override fun getBucketUsage(
            params: UsageGetBucketUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageGetBucketUsageResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bucketName", params.bucketName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "buckets", params._pathParam(0), "usage", "storage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
