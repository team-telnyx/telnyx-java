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
import com.telnyx.sdk.models.numberorders.NumberOrderCreateParams
import com.telnyx.sdk.models.numberorders.NumberOrderCreateResponse
import com.telnyx.sdk.models.numberorders.NumberOrderListPage
import com.telnyx.sdk.models.numberorders.NumberOrderListPageResponse
import com.telnyx.sdk.models.numberorders.NumberOrderListParams
import com.telnyx.sdk.models.numberorders.NumberOrderRetrieveParams
import com.telnyx.sdk.models.numberorders.NumberOrderRetrieveResponse
import com.telnyx.sdk.models.numberorders.NumberOrderUpdateParams
import com.telnyx.sdk.models.numberorders.NumberOrderUpdateResponse
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
    ): NumberOrderListPage =
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

        private val listHandler: Handler<NumberOrderListPageResponse> =
            jsonHandler<NumberOrderListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberOrderListPage> {
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
                    .let {
                        NumberOrderListPage.builder()
                            .service(NumberOrderServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
