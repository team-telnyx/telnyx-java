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
import com.telnyx.api.models.numberorders.NumberOrderCreateParams
import com.telnyx.api.models.numberorders.NumberOrderCreateResponse
import com.telnyx.api.models.numberorders.NumberOrderListParams
import com.telnyx.api.models.numberorders.NumberOrderListResponse
import com.telnyx.api.models.numberorders.NumberOrderRetrieveParams
import com.telnyx.api.models.numberorders.NumberOrderRetrieveResponse
import com.telnyx.api.models.numberorders.NumberOrderUpdateParams
import com.telnyx.api.models.numberorders.NumberOrderUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NumberOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NumberOrderService {

    private val withRawResponse: NumberOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberOrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberOrderService =
        NumberOrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NumberOrderCreateParams,
        requestOptions: RequestOptions,
    ): NumberOrderCreateResponse =
        // post /number_orders
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: NumberOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): NumberOrderRetrieveResponse =
        // get /number_orders/{number_order_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: NumberOrderUpdateParams,
        requestOptions: RequestOptions,
    ): NumberOrderUpdateResponse =
        // patch /number_orders/{number_order_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: NumberOrderListParams,
        requestOptions: RequestOptions,
    ): NumberOrderListResponse =
        // get /number_orders
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberOrderService.WithRawResponse =
            NumberOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NumberOrderCreateResponse> =
            jsonHandler<NumberOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NumberOrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_orders")
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

        private val retrieveHandler: Handler<NumberOrderRetrieveResponse> =
            jsonHandler<NumberOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NumberOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("numberOrderId", params.numberOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_orders", params._pathParam(0))
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

        private val updateHandler: Handler<NumberOrderUpdateResponse> =
            jsonHandler<NumberOrderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: NumberOrderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("numberOrderId", params.numberOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_orders", params._pathParam(0))
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

        private val listHandler: Handler<NumberOrderListResponse> =
            jsonHandler<NumberOrderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_orders")
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
    }
}
