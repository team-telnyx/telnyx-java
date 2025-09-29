// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.brand

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
import com.telnyx.api.models.brand.externalvetting.ExternalVettingImportParams
import com.telnyx.api.models.brand.externalvetting.ExternalVettingImportResponse
import com.telnyx.api.models.brand.externalvetting.ExternalVettingListParams
import com.telnyx.api.models.brand.externalvetting.ExternalVettingListResponse
import com.telnyx.api.models.brand.externalvetting.ExternalVettingOrderParams
import com.telnyx.api.models.brand.externalvetting.ExternalVettingOrderResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExternalVettingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalVettingServiceAsync {

    private val withRawResponse: ExternalVettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalVettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ExternalVettingServiceAsync =
        ExternalVettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ExternalVettingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalVettingListResponse> =
        // get /brand/{brandId}/externalVetting
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun import_(
        params: ExternalVettingImportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalVettingImportResponse> =
        // put /brand/{brandId}/externalVetting
        withRawResponse().import_(params, requestOptions).thenApply { it.parse() }

    override fun order(
        params: ExternalVettingOrderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalVettingOrderResponse> =
        // post /brand/{brandId}/externalVetting
        withRawResponse().order(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalVettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalVettingServiceAsync.WithRawResponse =
            ExternalVettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<ExternalVettingListResponse> =
            jsonHandler<ExternalVettingListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExternalVettingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalVettingListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", params._pathParam(0), "externalVetting")
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

        private val importHandler: Handler<ExternalVettingImportResponse> =
            jsonHandler<ExternalVettingImportResponse>(clientOptions.jsonMapper)

        override fun import_(
            params: ExternalVettingImportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalVettingImportResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", params._pathParam(0), "externalVetting")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { importHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val orderHandler: Handler<ExternalVettingOrderResponse> =
            jsonHandler<ExternalVettingOrderResponse>(clientOptions.jsonMapper)

        override fun order(
            params: ExternalVettingOrderParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalVettingOrderResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", params._pathParam(0), "externalVetting")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { orderHandler.handle(it) }
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
