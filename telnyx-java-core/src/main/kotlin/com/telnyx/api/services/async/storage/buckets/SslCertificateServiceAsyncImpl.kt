// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.storage.buckets

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
import com.telnyx.api.core.http.multipartFormData
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.storage.buckets.sslcertificate.SslCertificateCreateParams
import com.telnyx.api.models.storage.buckets.sslcertificate.SslCertificateCreateResponse
import com.telnyx.api.models.storage.buckets.sslcertificate.SslCertificateDeleteParams
import com.telnyx.api.models.storage.buckets.sslcertificate.SslCertificateDeleteResponse
import com.telnyx.api.models.storage.buckets.sslcertificate.SslCertificateRetrieveParams
import com.telnyx.api.models.storage.buckets.sslcertificate.SslCertificateRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SslCertificateServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SslCertificateServiceAsync {

    private val withRawResponse: SslCertificateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SslCertificateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): SslCertificateServiceAsync =
        SslCertificateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SslCertificateCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SslCertificateCreateResponse> =
        // put /storage/buckets/{bucketName}/ssl_certificate
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SslCertificateRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SslCertificateRetrieveResponse> =
        // get /storage/buckets/{bucketName}/ssl_certificate
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SslCertificateDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SslCertificateDeleteResponse> =
        // delete /storage/buckets/{bucketName}/ssl_certificate
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SslCertificateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SslCertificateServiceAsync.WithRawResponse =
            SslCertificateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SslCertificateCreateResponse> =
            jsonHandler<SslCertificateCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SslCertificateCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SslCertificateCreateResponse>> {
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

        private val retrieveHandler: Handler<SslCertificateRetrieveResponse> =
            jsonHandler<SslCertificateRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SslCertificateRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SslCertificateRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bucketName", params.bucketName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "buckets", params._pathParam(0), "ssl_certificate")
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

        private val deleteHandler: Handler<SslCertificateDeleteResponse> =
            jsonHandler<SslCertificateDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SslCertificateDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SslCertificateDeleteResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
