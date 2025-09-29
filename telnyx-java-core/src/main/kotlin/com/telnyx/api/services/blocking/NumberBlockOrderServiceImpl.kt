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
import com.telnyx.api.models.numberblockorders.NumberBlockOrderCreateParams
import com.telnyx.api.models.numberblockorders.NumberBlockOrderCreateResponse
import com.telnyx.api.models.numberblockorders.NumberBlockOrderListParams
import com.telnyx.api.models.numberblockorders.NumberBlockOrderListResponse
import com.telnyx.api.models.numberblockorders.NumberBlockOrderRetrieveParams
import com.telnyx.api.models.numberblockorders.NumberBlockOrderRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NumberBlockOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NumberBlockOrderService {

    private val withRawResponse: NumberBlockOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberBlockOrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberBlockOrderService =
        NumberBlockOrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NumberBlockOrderCreateParams,
        requestOptions: RequestOptions,
    ): NumberBlockOrderCreateResponse =
        // post /number_block_orders
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: NumberBlockOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): NumberBlockOrderRetrieveResponse =
        // get /number_block_orders/{number_block_order_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: NumberBlockOrderListParams,
        requestOptions: RequestOptions,
    ): NumberBlockOrderListResponse =
        // get /number_block_orders
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberBlockOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberBlockOrderService.WithRawResponse =
            NumberBlockOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NumberBlockOrderCreateResponse> =
            jsonHandler<NumberBlockOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NumberBlockOrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberBlockOrderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_block_orders")
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

        private val retrieveHandler: Handler<NumberBlockOrderRetrieveResponse> =
            jsonHandler<NumberBlockOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NumberBlockOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberBlockOrderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("numberBlockOrderId", params.numberBlockOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_block_orders", params._pathParam(0))
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

        private val listHandler: Handler<NumberBlockOrderListResponse> =
            jsonHandler<NumberBlockOrderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberBlockOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberBlockOrderListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_block_orders")
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
