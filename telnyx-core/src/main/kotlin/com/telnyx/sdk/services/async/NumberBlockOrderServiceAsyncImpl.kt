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
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderCreateParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderCreateResponse
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderListPageAsync
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderListPageResponse
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderListParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderRetrieveParams
import com.telnyx.sdk.models.numberblockorders.NumberBlockOrderRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NumberBlockOrderServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : NumberBlockOrderServiceAsync {

    private val withRawResponse: NumberBlockOrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NumberBlockOrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NumberBlockOrderServiceAsync =
        NumberBlockOrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: NumberBlockOrderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberBlockOrderCreateResponse> =
        // post /number_block_orders
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: NumberBlockOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberBlockOrderRetrieveResponse> =
        // get /number_block_orders/{number_block_order_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: NumberBlockOrderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NumberBlockOrderListPageAsync> =
        // get /number_block_orders
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NumberBlockOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NumberBlockOrderServiceAsync.WithRawResponse =
            NumberBlockOrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<NumberBlockOrderCreateResponse> =
            jsonHandler<NumberBlockOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NumberBlockOrderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_block_orders")
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

        private val retrieveHandler: Handler<NumberBlockOrderRetrieveResponse> =
            jsonHandler<NumberBlockOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NumberBlockOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("numberBlockOrderId", params.numberBlockOrderId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_block_orders", params._pathParam(0))
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

        private val listHandler: Handler<NumberBlockOrderListPageResponse> =
            jsonHandler<NumberBlockOrderListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NumberBlockOrderListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NumberBlockOrderListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("number_block_orders")
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
                            .let {
                                NumberBlockOrderListPageAsync.builder()
                                    .service(NumberBlockOrderServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
