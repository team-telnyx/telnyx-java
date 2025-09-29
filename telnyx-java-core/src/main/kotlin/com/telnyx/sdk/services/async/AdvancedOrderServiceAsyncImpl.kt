// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.advancedorders.AdvancedOrderCreateParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderCreateResponse
import com.telnyx.sdk.models.advancedorders.AdvancedOrderListParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderListResponse
import com.telnyx.sdk.models.advancedorders.AdvancedOrderRetrieveParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderRetrieveResponse
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateParams
import com.telnyx.sdk.models.advancedorders.AdvancedOrderUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AdvancedOrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AdvancedOrderServiceAsync {

    private val withRawResponse: AdvancedOrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AdvancedOrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdvancedOrderServiceAsync =
        AdvancedOrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AdvancedOrderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdvancedOrderCreateResponse> =
        // post /advanced_orders
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AdvancedOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdvancedOrderRetrieveResponse> =
        // get /advanced_orders/{order_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AdvancedOrderUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdvancedOrderUpdateResponse> =
        // patch /advanced_orders/{order_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AdvancedOrderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdvancedOrderListResponse> =
        // get /advanced_orders
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdvancedOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdvancedOrderServiceAsync.WithRawResponse =
            AdvancedOrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AdvancedOrderCreateResponse> =
            jsonHandler<AdvancedOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AdvancedOrderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdvancedOrderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("advanced_orders")
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

        private val retrieveHandler: Handler<AdvancedOrderRetrieveResponse> =
            jsonHandler<AdvancedOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AdvancedOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdvancedOrderRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("advanced_orders", params._pathParam(0))
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

        private val updateHandler: Handler<AdvancedOrderUpdateResponse> =
            jsonHandler<AdvancedOrderUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AdvancedOrderUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdvancedOrderUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("orderId", params.orderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("advanced_orders", params._pathParam(0))
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

        private val listHandler: Handler<AdvancedOrderListResponse> =
            jsonHandler<AdvancedOrderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AdvancedOrderListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdvancedOrderListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("advanced_orders")
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
