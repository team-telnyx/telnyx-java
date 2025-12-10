// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging10dlc.brand

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
import com.telnyx.sdk.models.messaging10dlc.brand.externalvetting.ExternalVettingImportsParams
import com.telnyx.sdk.models.messaging10dlc.brand.externalvetting.ExternalVettingImportsResponse
import com.telnyx.sdk.models.messaging10dlc.brand.externalvetting.ExternalVettingListParams
import com.telnyx.sdk.models.messaging10dlc.brand.externalvetting.ExternalVettingListResponse
import com.telnyx.sdk.models.messaging10dlc.brand.externalvetting.ExternalVettingOrderParams
import com.telnyx.sdk.models.messaging10dlc.brand.externalvetting.ExternalVettingOrderResponse
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
    ): CompletableFuture<List<ExternalVettingListResponse>> =
        // get /10dlc/brand/{brandId}/externalVetting
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun imports(
        params: ExternalVettingImportsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalVettingImportsResponse> =
        // put /10dlc/brand/{brandId}/externalVetting
        withRawResponse().imports(params, requestOptions).thenApply { it.parse() }

    override fun order(
        params: ExternalVettingOrderParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalVettingOrderResponse> =
        // post /10dlc/brand/{brandId}/externalVetting
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

        private val listHandler: Handler<List<ExternalVettingListResponse>> =
            jsonHandler<List<ExternalVettingListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: ExternalVettingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ExternalVettingListResponse>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "brand", params._pathParam(0), "externalVetting")
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
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }

        private val importsHandler: Handler<ExternalVettingImportsResponse> =
            jsonHandler<ExternalVettingImportsResponse>(clientOptions.jsonMapper)

        override fun imports(
            params: ExternalVettingImportsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalVettingImportsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "brand", params._pathParam(0), "externalVetting")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { importsHandler.handle(it) }
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
                    .addPathSegments("10dlc", "brand", params._pathParam(0), "externalVetting")
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
