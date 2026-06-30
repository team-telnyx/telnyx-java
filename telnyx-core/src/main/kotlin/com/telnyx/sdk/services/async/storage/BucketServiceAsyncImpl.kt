// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.storage.buckets.BucketCreatePresignedUrlParams
import com.telnyx.sdk.models.storage.buckets.BucketCreatePresignedUrlResponse
import com.telnyx.sdk.services.async.storage.buckets.SslCertificateServiceAsync
import com.telnyx.sdk.services.async.storage.buckets.SslCertificateServiceAsyncImpl
import com.telnyx.sdk.services.async.storage.buckets.UsageServiceAsync
import com.telnyx.sdk.services.async.storage.buckets.UsageServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Presigned object URL operations */
class BucketServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BucketServiceAsync {

    private val withRawResponse: BucketServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sslCertificate: SslCertificateServiceAsync by lazy {
        SslCertificateServiceAsyncImpl(clientOptions)
    }

    private val usage: UsageServiceAsync by lazy { UsageServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): BucketServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BucketServiceAsync =
        BucketServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** SSL certificate operations */
    override fun sslCertificate(): SslCertificateServiceAsync = sslCertificate

    /** Bucket Usage operations */
    override fun usage(): UsageServiceAsync = usage

    override fun createPresignedUrl(
        params: BucketCreatePresignedUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BucketCreatePresignedUrlResponse> =
        // post /storage/buckets/{bucketName}/{objectName}/presigned_url
        withRawResponse().createPresignedUrl(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BucketServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val sslCertificate: SslCertificateServiceAsync.WithRawResponse by lazy {
            SslCertificateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageServiceAsync.WithRawResponse by lazy {
            UsageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BucketServiceAsync.WithRawResponse =
            BucketServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** SSL certificate operations */
        override fun sslCertificate(): SslCertificateServiceAsync.WithRawResponse = sslCertificate

        /** Bucket Usage operations */
        override fun usage(): UsageServiceAsync.WithRawResponse = usage

        private val createPresignedUrlHandler: Handler<BucketCreatePresignedUrlResponse> =
            jsonHandler<BucketCreatePresignedUrlResponse>(clientOptions.jsonMapper)

        override fun createPresignedUrl(
            params: BucketCreatePresignedUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BucketCreatePresignedUrlResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectName", params.objectName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "storage",
                        "buckets",
                        params._pathParam(0),
                        params._pathParam(1),
                        "presigned_url",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createPresignedUrlHandler.handle(it) }
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
