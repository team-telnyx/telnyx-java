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
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderCreateParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderCreateResponse
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderListPage
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderListPageResponse
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderListParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderRetrieveParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Inexplicit number orders for bulk purchasing without specifying exact numbers */
class InexplicitNumberOrderServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InexplicitNumberOrderService {

    private val withRawResponse: InexplicitNumberOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InexplicitNumberOrderService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InexplicitNumberOrderService =
        InexplicitNumberOrderServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: InexplicitNumberOrderCreateParams,
        requestOptions: RequestOptions,
    ): InexplicitNumberOrderCreateResponse =
        // post /inexplicit_number_orders
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: InexplicitNumberOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): InexplicitNumberOrderRetrieveResponse =
        // get /inexplicit_number_orders/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InexplicitNumberOrderListParams,
        requestOptions: RequestOptions,
    ): InexplicitNumberOrderListPage =
        // get /inexplicit_number_orders
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InexplicitNumberOrderService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InexplicitNumberOrderService.WithRawResponse =
            InexplicitNumberOrderServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<InexplicitNumberOrderCreateResponse> =
            jsonHandler<InexplicitNumberOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: InexplicitNumberOrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InexplicitNumberOrderCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inexplicit_number_orders")
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

        private val retrieveHandler: Handler<InexplicitNumberOrderRetrieveResponse> =
            jsonHandler<InexplicitNumberOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InexplicitNumberOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InexplicitNumberOrderRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inexplicit_number_orders", params._pathParam(0))
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

        private val listHandler: Handler<InexplicitNumberOrderListPageResponse> =
            jsonHandler<InexplicitNumberOrderListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InexplicitNumberOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InexplicitNumberOrderListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inexplicit_number_orders")
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
                        InexplicitNumberOrderListPage.builder()
                            .service(InexplicitNumberOrderServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
