// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.networks

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
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayCreateParams
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayCreateResponse
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayDeleteParams
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayDeleteResponse
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayRetrieveParams
import com.telnyx.sdk.models.networks.defaultgateway.DefaultGatewayRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DefaultGatewayServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DefaultGatewayServiceAsync {

    private val withRawResponse: DefaultGatewayServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DefaultGatewayServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DefaultGatewayServiceAsync =
        DefaultGatewayServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DefaultGatewayCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DefaultGatewayCreateResponse> =
        // post /networks/{id}/default_gateway
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DefaultGatewayRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DefaultGatewayRetrieveResponse> =
        // get /networks/{id}/default_gateway
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: DefaultGatewayDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DefaultGatewayDeleteResponse> =
        // delete /networks/{id}/default_gateway
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DefaultGatewayServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefaultGatewayServiceAsync.WithRawResponse =
            DefaultGatewayServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DefaultGatewayCreateResponse> =
            jsonHandler<DefaultGatewayCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DefaultGatewayCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DefaultGatewayCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("networkIdentifier", params.networkIdentifier().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0), "default_gateway")
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

        private val retrieveHandler: Handler<DefaultGatewayRetrieveResponse> =
            jsonHandler<DefaultGatewayRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DefaultGatewayRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DefaultGatewayRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0), "default_gateway")
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

        private val deleteHandler: Handler<DefaultGatewayDeleteResponse> =
            jsonHandler<DefaultGatewayDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: DefaultGatewayDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DefaultGatewayDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0), "default_gateway")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
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
