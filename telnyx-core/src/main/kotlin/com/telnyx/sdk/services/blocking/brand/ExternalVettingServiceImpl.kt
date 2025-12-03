// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.brand

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
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingImportsParams
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingImportsResponse
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingListParams
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingListResponse
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingOrderParams
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingOrderResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExternalVettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalVettingService {

    private val withRawResponse: ExternalVettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalVettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalVettingService =
        ExternalVettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: ExternalVettingListParams,
        requestOptions: RequestOptions,
    ): List<ExternalVettingListResponse> =
        // get /brand/{brandId}/externalVetting
        withRawResponse().list(params, requestOptions).parse()

    override fun imports(
        params: ExternalVettingImportsParams,
        requestOptions: RequestOptions,
    ): ExternalVettingImportsResponse =
        // put /brand/{brandId}/externalVetting
        withRawResponse().imports(params, requestOptions).parse()

    override fun order(
        params: ExternalVettingOrderParams,
        requestOptions: RequestOptions,
    ): ExternalVettingOrderResponse =
        // post /brand/{brandId}/externalVetting
        withRawResponse().order(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalVettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalVettingService.WithRawResponse =
            ExternalVettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<ExternalVettingListResponse>> =
            jsonHandler<List<ExternalVettingListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: ExternalVettingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ExternalVettingListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("brand", params._pathParam(0), "externalVetting")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val importsHandler: Handler<ExternalVettingImportsResponse> =
            jsonHandler<ExternalVettingImportsResponse>(clientOptions.jsonMapper)

        override fun imports(
            params: ExternalVettingImportsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalVettingImportsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { importsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val orderHandler: Handler<ExternalVettingOrderResponse> =
            jsonHandler<ExternalVettingOrderResponse>(clientOptions.jsonMapper)

        override fun order(
            params: ExternalVettingOrderParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalVettingOrderResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
