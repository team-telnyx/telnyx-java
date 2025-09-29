// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.numberorders.NumberOrderCreateParams
import com.telnyx.api.models.numberorders.NumberOrderCreateResponse
import com.telnyx.api.models.numberorders.NumberOrderListParams
import com.telnyx.api.models.numberorders.NumberOrderListResponse
import com.telnyx.api.models.numberorders.NumberOrderRetrieveParams
import com.telnyx.api.models.numberorders.NumberOrderRetrieveResponse
import com.telnyx.api.models.numberorders.NumberOrderUpdateParams
import com.telnyx.api.models.numberorders.NumberOrderUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NumberOrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NumberOrderServiceAsync {

    private val withRawResponse: NumberOrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberOrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NumberOrderServiceAsync =
        NumberOrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NumberOrderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderCreateResponse> =
        // post /number_orders
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: NumberOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderRetrieveResponse> =
        // get /number_orders/{number_order_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: NumberOrderUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderUpdateResponse> =
        // patch /number_orders/{number_order_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: NumberOrderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberOrderListResponse> =
        // get /number_orders
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberOrderServiceAsync.WithRawResponse =
            NumberOrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NumberOrderCreateResponse> =
            jsonHandler<NumberOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NumberOrderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberOrderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_orders")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<NumberOrderRetrieveResponse> =
            jsonHandler<NumberOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NumberOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberOrderRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("numberOrderId", params.numberOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_orders", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<NumberOrderUpdateResponse> =
            jsonHandler<NumberOrderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: NumberOrderUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberOrderUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<NumberOrderListResponse> =
            jsonHandler<NumberOrderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberOrderListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberOrderListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_orders")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
