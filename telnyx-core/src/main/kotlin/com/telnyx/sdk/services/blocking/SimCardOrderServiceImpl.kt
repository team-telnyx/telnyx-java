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
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateResponse
import com.telnyx.sdk.models.simcardorders.SimCardOrderListPage
import com.telnyx.sdk.models.simcardorders.SimCardOrderListPageResponse
import com.telnyx.sdk.models.simcardorders.SimCardOrderListParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderRetrieveParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** SIM Card Orders operations */
class SimCardOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SimCardOrderService {

    private val withRawResponse: SimCardOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SimCardOrderService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardOrderService =
        SimCardOrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SimCardOrderCreateParams,
        requestOptions: RequestOptions,
    ): SimCardOrderCreateResponse =
        // post /sim_card_orders
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SimCardOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): SimCardOrderRetrieveResponse =
        // get /sim_card_orders/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: SimCardOrderListParams,
        requestOptions: RequestOptions,
    ): SimCardOrderListPage =
        // get /sim_card_orders
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimCardOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardOrderService.WithRawResponse =
            SimCardOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SimCardOrderCreateResponse> =
            jsonHandler<SimCardOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SimCardOrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardOrderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_orders")
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

        private val retrieveHandler: Handler<SimCardOrderRetrieveResponse> =
            jsonHandler<SimCardOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SimCardOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardOrderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_orders", params._pathParam(0))
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

        private val listHandler: Handler<SimCardOrderListPageResponse> =
            jsonHandler<SimCardOrderListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SimCardOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimCardOrderListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_orders")
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
                        SimCardOrderListPage.builder()
                            .service(SimCardOrderServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
