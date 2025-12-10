// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc.brand

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
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingExternalVettingParams
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingExternalVettingResponse
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingRetrieveExternalVettingParams
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingRetrieveExternalVettingResponse
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingUpdateExternalVettingParams
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingUpdateExternalVettingResponse
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

    override fun externalVetting(
        params: ExternalVettingExternalVettingParams,
        requestOptions: RequestOptions,
    ): ExternalVettingExternalVettingResponse =
        // post /10dlc/brand/{brandId}/externalVetting
        withRawResponse().externalVetting(params, requestOptions).parse()

    override fun retrieveExternalVetting(
        params: ExternalVettingRetrieveExternalVettingParams,
        requestOptions: RequestOptions,
    ): List<ExternalVettingRetrieveExternalVettingResponse> =
        // get /10dlc/brand/{brandId}/externalVetting
        withRawResponse().retrieveExternalVetting(params, requestOptions).parse()

    override fun updateExternalVetting(
        params: ExternalVettingUpdateExternalVettingParams,
        requestOptions: RequestOptions,
    ): ExternalVettingUpdateExternalVettingResponse =
        // put /10dlc/brand/{brandId}/externalVetting
        withRawResponse().updateExternalVetting(params, requestOptions).parse()

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

        private val externalVettingHandler: Handler<ExternalVettingExternalVettingResponse> =
            jsonHandler<ExternalVettingExternalVettingResponse>(clientOptions.jsonMapper)

        override fun externalVetting(
            params: ExternalVettingExternalVettingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalVettingExternalVettingResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { externalVettingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveExternalVettingHandler:
            Handler<List<ExternalVettingRetrieveExternalVettingResponse>> =
            jsonHandler<List<ExternalVettingRetrieveExternalVettingResponse>>(
                clientOptions.jsonMapper
            )

        override fun retrieveExternalVetting(
            params: ExternalVettingRetrieveExternalVettingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ExternalVettingRetrieveExternalVettingResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("brandId", params.brandId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("10dlc", "brand", params._pathParam(0), "externalVetting")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveExternalVettingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val updateExternalVettingHandler:
            Handler<ExternalVettingUpdateExternalVettingResponse> =
            jsonHandler<ExternalVettingUpdateExternalVettingResponse>(clientOptions.jsonMapper)

        override fun updateExternalVetting(
            params: ExternalVettingUpdateExternalVettingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalVettingUpdateExternalVettingResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateExternalVettingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
