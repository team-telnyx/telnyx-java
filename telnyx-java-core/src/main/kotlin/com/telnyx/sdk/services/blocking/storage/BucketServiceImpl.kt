// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

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
import com.telnyx.sdk.models.storage.buckets.BucketCreatePresignedUrlParams
import com.telnyx.sdk.models.storage.buckets.BucketCreatePresignedUrlResponse
import com.telnyx.sdk.services.blocking.storage.buckets.SslCertificateService
import com.telnyx.sdk.services.blocking.storage.buckets.SslCertificateServiceImpl
import com.telnyx.sdk.services.blocking.storage.buckets.UsageService
import com.telnyx.sdk.services.blocking.storage.buckets.UsageServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BucketServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BucketService {

    private val withRawResponse: BucketService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sslCertificate: SslCertificateService by lazy {
        SslCertificateServiceImpl(clientOptions)
    }

    private val usage: UsageService by lazy { UsageServiceImpl(clientOptions) }

    override fun withRawResponse(): BucketService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BucketService =
        BucketServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sslCertificate(): SslCertificateService = sslCertificate

    override fun usage(): UsageService = usage

    override fun createPresignedUrl(
        params: BucketCreatePresignedUrlParams,
        requestOptions: RequestOptions,
    ): BucketCreatePresignedUrlResponse =
        // post /storage/buckets/{bucketName}/{objectName}/presigned_url
        withRawResponse().createPresignedUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BucketService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val sslCertificate: SslCertificateService.WithRawResponse by lazy {
            SslCertificateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val usage: UsageService.WithRawResponse by lazy {
            UsageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BucketService.WithRawResponse =
            BucketServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun sslCertificate(): SslCertificateService.WithRawResponse = sslCertificate

        override fun usage(): UsageService.WithRawResponse = usage

        private val createPresignedUrlHandler: Handler<BucketCreatePresignedUrlResponse> =
            jsonHandler<BucketCreatePresignedUrlResponse>(clientOptions.jsonMapper)

        override fun createPresignedUrl(
            params: BucketCreatePresignedUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BucketCreatePresignedUrlResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
