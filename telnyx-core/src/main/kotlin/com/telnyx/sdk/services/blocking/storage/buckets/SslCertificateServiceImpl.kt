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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.multipartFormData
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateCreateParams
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateCreateResponse
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateDeleteParams
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateDeleteResponse
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateRetrieveParams
import com.telnyx.sdk.models.storage.buckets.sslcertificate.SslCertificateRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** SSL certificate operations */
class SslCertificateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SslCertificateService {

    private val withRawResponse: SslCertificateService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SslCertificateService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SslCertificateService =
        SslCertificateServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SslCertificateCreateParams,
        requestOptions: RequestOptions,
    ): SslCertificateCreateResponse =
        // put /storage/buckets/{bucketName}/ssl_certificate
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SslCertificateRetrieveParams,
        requestOptions: RequestOptions,
    ): SslCertificateRetrieveResponse =
        // get /storage/buckets/{bucketName}/ssl_certificate
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun delete(
        params: SslCertificateDeleteParams,
        requestOptions: RequestOptions,
    ): SslCertificateDeleteResponse =
        // delete /storage/buckets/{bucketName}/ssl_certificate
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SslCertificateService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SslCertificateService.WithRawResponse =
            SslCertificateServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SslCertificateCreateResponse> =
            jsonHandler<SslCertificateCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SslCertificateCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SslCertificateCreateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bucketName", params.bucketName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "buckets", params._pathParam(0), "ssl_certificate")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val retrieveHandler: Handler<SslCertificateRetrieveResponse> =
            jsonHandler<SslCertificateRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SslCertificateRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SslCertificateRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bucketName", params.bucketName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "buckets", params._pathParam(0), "ssl_certificate")
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

        private val deleteHandler: Handler<SslCertificateDeleteResponse> =
            jsonHandler<SslCertificateDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SslCertificateDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SslCertificateDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bucketName", params.bucketName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "buckets", params._pathParam(0), "ssl_certificate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
