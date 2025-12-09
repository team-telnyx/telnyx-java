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
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateResponse
import com.telnyx.sdk.models.simcardorders.SimCardOrderListPageAsync
import com.telnyx.sdk.models.simcardorders.SimCardOrderListPageResponse
import com.telnyx.sdk.models.simcardorders.SimCardOrderListParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderRetrieveParams
import com.telnyx.sdk.models.simcardorders.SimCardOrderRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SimCardOrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SimCardOrderServiceAsync {

    private val withRawResponse: SimCardOrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SimCardOrderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardOrderServiceAsync =
        SimCardOrderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SimCardOrderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardOrderCreateResponse> =
        // post /sim_card_orders
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SimCardOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardOrderRetrieveResponse> =
        // get /sim_card_orders/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SimCardOrderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardOrderListPageAsync> =
        // get /sim_card_orders
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimCardOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardOrderServiceAsync.WithRawResponse =
            SimCardOrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SimCardOrderCreateResponse> =
            jsonHandler<SimCardOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SimCardOrderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardOrderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_orders")
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

        private val retrieveHandler: Handler<SimCardOrderRetrieveResponse> =
            jsonHandler<SimCardOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SimCardOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardOrderRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_orders", params._pathParam(0))
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

        private val listHandler: Handler<SimCardOrderListPageResponse> =
            jsonHandler<SimCardOrderListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SimCardOrderListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardOrderListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_orders")
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
                                SimCardOrderListPageAsync.builder()
                                    .service(SimCardOrderServiceAsyncImpl(clientOptions))
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
