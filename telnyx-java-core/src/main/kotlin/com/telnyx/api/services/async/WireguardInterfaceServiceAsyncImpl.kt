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
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceCreateParams
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceCreateResponse
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceDeleteParams
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceDeleteResponse
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceListParams
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceListResponse
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceRetrieveParams
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WireguardInterfaceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WireguardInterfaceServiceAsync {

    private val withRawResponse: WireguardInterfaceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireguardInterfaceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WireguardInterfaceServiceAsync =
        WireguardInterfaceServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: WireguardInterfaceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireguardInterfaceCreateResponse> =
        // post /wireguard_interfaces
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: WireguardInterfaceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireguardInterfaceRetrieveResponse> =
        // get /wireguard_interfaces/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: WireguardInterfaceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireguardInterfaceListResponse> =
        // get /wireguard_interfaces
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: WireguardInterfaceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireguardInterfaceDeleteResponse> =
        // delete /wireguard_interfaces/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WireguardInterfaceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WireguardInterfaceServiceAsync.WithRawResponse =
            WireguardInterfaceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<WireguardInterfaceCreateResponse> =
            jsonHandler<WireguardInterfaceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: WireguardInterfaceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_interfaces")
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

        private val retrieveHandler: Handler<WireguardInterfaceRetrieveResponse> =
            jsonHandler<WireguardInterfaceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: WireguardInterfaceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_interfaces", params._pathParam(0))
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

        private val listHandler: Handler<WireguardInterfaceListResponse> =
            jsonHandler<WireguardInterfaceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WireguardInterfaceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_interfaces")
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

        private val deleteHandler: Handler<WireguardInterfaceDeleteResponse> =
            jsonHandler<WireguardInterfaceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: WireguardInterfaceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wireguard_interfaces", params._pathParam(0))
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
