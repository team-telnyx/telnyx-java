// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.subnumberorders.SubNumberOrderCancelParams
import com.telnyx.api.models.subnumberorders.SubNumberOrderCancelResponse
import com.telnyx.api.models.subnumberorders.SubNumberOrderListParams
import com.telnyx.api.models.subnumberorders.SubNumberOrderListResponse
import com.telnyx.api.models.subnumberorders.SubNumberOrderRetrieveParams
import com.telnyx.api.models.subnumberorders.SubNumberOrderRetrieveResponse
import com.telnyx.api.models.subnumberorders.SubNumberOrderUpdateParams
import com.telnyx.api.models.subnumberorders.SubNumberOrderUpdateRequirementGroupParams
import com.telnyx.api.models.subnumberorders.SubNumberOrderUpdateRequirementGroupResponse
import com.telnyx.api.models.subnumberorders.SubNumberOrderUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SubNumberOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SubNumberOrderService {

    private val withRawResponse: SubNumberOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SubNumberOrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubNumberOrderService =
        SubNumberOrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SubNumberOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): SubNumberOrderRetrieveResponse =
        // get /sub_number_orders/{sub_number_order_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: SubNumberOrderUpdateParams,
        requestOptions: RequestOptions,
    ): SubNumberOrderUpdateResponse =
        // patch /sub_number_orders/{sub_number_order_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: SubNumberOrderListParams,
        requestOptions: RequestOptions,
    ): SubNumberOrderListResponse =
        // get /sub_number_orders
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: SubNumberOrderCancelParams,
        requestOptions: RequestOptions,
    ): SubNumberOrderCancelResponse =
        // patch /sub_number_orders/{sub_number_order_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun updateRequirementGroup(
        params: SubNumberOrderUpdateRequirementGroupParams,
        requestOptions: RequestOptions,
    ): SubNumberOrderUpdateRequirementGroupResponse =
        // post /sub_number_orders/{id}/requirement_group
        withRawResponse().updateRequirementGroup(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SubNumberOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubNumberOrderService.WithRawResponse =
            SubNumberOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<SubNumberOrderRetrieveResponse> =
            jsonHandler<SubNumberOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SubNumberOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subNumberOrderId", params.subNumberOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders", params._pathParam(0))
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

        private val updateHandler: Handler<SubNumberOrderUpdateResponse> =
            jsonHandler<SubNumberOrderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SubNumberOrderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrderUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subNumberOrderId", params.subNumberOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<SubNumberOrderListResponse> =
            jsonHandler<SubNumberOrderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SubNumberOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrderListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders")
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

        private val cancelHandler: Handler<SubNumberOrderCancelResponse> =
            jsonHandler<SubNumberOrderCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: SubNumberOrderCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrderCancelResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subNumberOrderId", params.subNumberOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateRequirementGroupHandler:
            Handler<SubNumberOrderUpdateRequirementGroupResponse> =
            jsonHandler<SubNumberOrderUpdateRequirementGroupResponse>(clientOptions.jsonMapper)

        override fun updateRequirementGroup(
            params: SubNumberOrderUpdateRequirementGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubNumberOrderUpdateRequirementGroupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sub_number_orders", params._pathParam(0), "requirement_group")
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
