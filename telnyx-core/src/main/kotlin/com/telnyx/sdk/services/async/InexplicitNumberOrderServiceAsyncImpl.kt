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
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderCreateParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderCreateResponse
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderListParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderListResponse
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderRetrieveParams
import com.telnyx.sdk.models.inexplicitnumberorders.InexplicitNumberOrderRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InexplicitNumberOrderServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InexplicitNumberOrderServiceAsync {

    private val withRawResponse: InexplicitNumberOrderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InexplicitNumberOrderServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InexplicitNumberOrderServiceAsync =
        InexplicitNumberOrderServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: InexplicitNumberOrderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InexplicitNumberOrderCreateResponse> =
        // post /inexplicit_number_orders
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: InexplicitNumberOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InexplicitNumberOrderRetrieveResponse> =
        // get /inexplicit_number_orders/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InexplicitNumberOrderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InexplicitNumberOrderListResponse> =
        // get /inexplicit_number_orders
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InexplicitNumberOrderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InexplicitNumberOrderServiceAsync.WithRawResponse =
            InexplicitNumberOrderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<InexplicitNumberOrderCreateResponse> =
            jsonHandler<InexplicitNumberOrderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: InexplicitNumberOrderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inexplicit_number_orders")
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

        private val retrieveHandler: Handler<InexplicitNumberOrderRetrieveResponse> =
            jsonHandler<InexplicitNumberOrderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InexplicitNumberOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inexplicit_number_orders", params._pathParam(0))
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

        private val listHandler: Handler<InexplicitNumberOrderListResponse> =
            jsonHandler<InexplicitNumberOrderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InexplicitNumberOrderListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InexplicitNumberOrderListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inexplicit_number_orders")
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
