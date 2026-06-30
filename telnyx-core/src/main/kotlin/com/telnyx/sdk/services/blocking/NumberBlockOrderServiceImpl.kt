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
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderCreateParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderCreateResponse
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderListPage
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderListPageResponse
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderListParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderRetrieveParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderRetrieveResponse
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
    ): NumberBlockOrderListPage =
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

        private val listHandler: Handler<NumberBlockOrderListPageResponse> =
            jsonHandler<NumberBlockOrderListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberBlockOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NumberBlockOrderListPage> {
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
                    .let {
                        NumberBlockOrderListPage.builder()
                            .service(NumberBlockOrderServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
