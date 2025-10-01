// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.models.advancedorders.AdvancedOrderCreateParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderCreateResponse
import com.telnyx.sdk.models.advancedorders.AdvancedOrderListParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderListResponse
import com.telnyx.sdk.models.advancedorders.AdvancedOrderRetrieveParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderRetrieveResponse
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateRequirementGroupParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateRequirementGroupResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AdvancedOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdvancedOrderService {

    private val withRawResponse: AdvancedOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AdvancedOrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedOrderService =
        AdvancedOrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AdvancedOrderCreateParams,
        requestOptions: RequestOptions,
    ): AdvancedOrderCreateResponse =
        // post /advanced_orders
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AdvancedOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): AdvancedOrderRetrieveResponse =
        // get /advanced_orders/{order_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AdvancedOrderListParams,
        requestOptions: RequestOptions,
    ): AdvancedOrderListResponse =
        // get /advanced_orders
        withRawResponse().list(params, requestOptions).parse()

    override fun updateRequirementGroup(
        params: AdvancedOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions,
    ): AdvancedOrderUpdateRequirementGroupResponse =
        // patch /advanced_orders/{advanced-order-id}/requirement_group
        withRawResponse().updateRequirementGroup(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdvancedOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdvancedOrderService.WithRawResponse =
            AdvancedOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AdvancedOrderCreateResponse> =
            jsonHandler<AdvancedOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AdvancedOrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdvancedOrderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("advanced_orders")
                    .body(json(clientOptions.jsonMapper, params._body()))
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

        private val retrieveHandler: Handler<AdvancedOrderRetrieveResponse> =
            jsonHandler<AdvancedOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AdvancedOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdvancedOrderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("advanced_orders", params._pathParam(0))
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

        private val listHandler: Handler<AdvancedOrderListResponse> =
            jsonHandler<AdvancedOrderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AdvancedOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdvancedOrderListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("advanced_orders")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateRequirementGroupHandler:
            Handler<AdvancedOrderUpdateRequirementGroupResponse> =
            jsonHandler<AdvancedOrderUpdateRequirementGroupResponse>(clientOptions.jsonMapper)

        override fun updateRequirementGroup(
            params: AdvancedOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdvancedOrderUpdateRequirementGroupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("advancedOrderId", params.advancedOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("advanced_orders", params._pathParam(0), "requirement_group")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateRequirementGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
