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
import com.telnyx.sdk.models.networks.NetworkCreateParams
import com.telnyx.sdk.models.networks.NetworkCreateResponse
import com.telnyx.sdk.models.networks.NetworkDeleteParams
import com.telnyx.sdk.models.networks.NetworkDeleteResponse
import com.telnyx.sdk.models.networks.NetworkListInterfacesParams
import com.telnyx.sdk.models.networks.NetworkListInterfacesResponse
import com.telnyx.sdk.models.networks.NetworkListParams
import com.telnyx.sdk.models.networks.NetworkListResponse
import com.telnyx.sdk.models.networks.NetworkRetrieveParams
import com.telnyx.sdk.models.networks.NetworkRetrieveResponse
import com.telnyx.sdk.models.networks.NetworkUpdateParams
import com.telnyx.sdk.models.networks.NetworkUpdateResponse
import com.telnyx.sdk.services.async.networks.DefaultGatewayServiceAsync
import com.telnyx.sdk.services.async.networks.DefaultGatewayServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NetworkServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NetworkServiceAsync {

    private val withRawResponse: NetworkServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val defaultGateway: DefaultGatewayServiceAsync by lazy {
        DefaultGatewayServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): NetworkServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkServiceAsync =
        NetworkServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun defaultGateway(): DefaultGatewayServiceAsync = defaultGateway

    override fun create(
        params: NetworkCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkCreateResponse> =
        // post /networks
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: NetworkRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkRetrieveResponse> =
        // get /networks/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: NetworkUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkUpdateResponse> =
        // patch /networks/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: NetworkListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkListResponse> =
        // get /networks
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: NetworkDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkDeleteResponse> =
        // delete /networks/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun listInterfaces(
        params: NetworkListInterfacesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkListInterfacesResponse> =
        // get /networks/{id}/network_interfaces
        withRawResponse().listInterfaces(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NetworkServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val defaultGateway: DefaultGatewayServiceAsync.WithRawResponse by lazy {
            DefaultGatewayServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkServiceAsync.WithRawResponse =
            NetworkServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun defaultGateway(): DefaultGatewayServiceAsync.WithRawResponse = defaultGateway

        private val createHandler: Handler<NetworkCreateResponse> =
            jsonHandler<NetworkCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: NetworkCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks")
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

        private val retrieveHandler: Handler<NetworkRetrieveResponse> =
            jsonHandler<NetworkRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NetworkRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0))
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

        private val updateHandler: Handler<NetworkUpdateResponse> =
            jsonHandler<NetworkUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: NetworkUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pathId", params.pathId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0))
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

        private val listHandler: Handler<NetworkListResponse> =
            jsonHandler<NetworkListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: NetworkListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks")
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

        private val deleteHandler: Handler<NetworkDeleteResponse> =
            jsonHandler<NetworkDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: NetworkDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0))
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

        private val listInterfacesHandler: Handler<NetworkListInterfacesResponse> =
            jsonHandler<NetworkListInterfacesResponse>(clientOptions.jsonMapper)

        override fun listInterfaces(
            params: NetworkListInterfacesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkListInterfacesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("networks", params._pathParam(0), "network_interfaces")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listInterfacesHandler.handle(it) }
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
