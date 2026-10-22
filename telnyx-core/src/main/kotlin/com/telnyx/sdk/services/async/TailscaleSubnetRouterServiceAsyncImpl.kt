// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.composeCancellableAsync
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
import com.telnyx.sdk.core.mapCancellable
import com.telnyx.sdk.core.ownResponse
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterCreateParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterCreateResponse
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterDeleteParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterDeleteResponse
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterListPageAsync
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterListPageResponse
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterListParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterRetrieveParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterRetrieveResponse
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterUpdateParams
import com.telnyx.sdk.models.tailscalesubnetrouters.TailscaleSubnetRouterUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Tailscale Subnet Router operations */
class TailscaleSubnetRouterServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TailscaleSubnetRouterServiceAsync {

    private val withRawResponse: TailscaleSubnetRouterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TailscaleSubnetRouterServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TailscaleSubnetRouterServiceAsync =
        TailscaleSubnetRouterServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: TailscaleSubnetRouterCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TailscaleSubnetRouterCreateResponse> =
        // post /tailscale_subnet_routers
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieve(
        params: TailscaleSubnetRouterRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TailscaleSubnetRouterRetrieveResponse> =
        // get /tailscale_subnet_routers/{id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: TailscaleSubnetRouterUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TailscaleSubnetRouterUpdateResponse> =
        // patch /tailscale_subnet_routers/{id}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: TailscaleSubnetRouterListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TailscaleSubnetRouterListPageAsync> =
        // get /tailscale_subnet_routers
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: TailscaleSubnetRouterDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TailscaleSubnetRouterDeleteResponse> =
        // delete /tailscale_subnet_routers/{id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TailscaleSubnetRouterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TailscaleSubnetRouterServiceAsync.WithRawResponse =
            TailscaleSubnetRouterServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TailscaleSubnetRouterCreateResponse> =
            jsonHandler<TailscaleSubnetRouterCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TailscaleSubnetRouterCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tailscale_subnet_routers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val retrieveHandler: Handler<TailscaleSubnetRouterRetrieveResponse> =
            jsonHandler<TailscaleSubnetRouterRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TailscaleSubnetRouterRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tailscale_subnet_routers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val updateHandler: Handler<TailscaleSubnetRouterUpdateResponse> =
            jsonHandler<TailscaleSubnetRouterUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: TailscaleSubnetRouterUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tailscale_subnet_routers", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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

        private val listHandler: Handler<TailscaleSubnetRouterListPageResponse> =
            jsonHandler<TailscaleSubnetRouterListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TailscaleSubnetRouterListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tailscale_subnet_routers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TailscaleSubnetRouterListPageAsync.builder()
                                    .service(TailscaleSubnetRouterServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<TailscaleSubnetRouterDeleteResponse> =
            jsonHandler<TailscaleSubnetRouterDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: TailscaleSubnetRouterDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TailscaleSubnetRouterDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("tailscale_subnet_routers", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .composeCancellableAsync {
                    clientOptions.httpClient.executeAsync(it, requestOptions).ownResponse()
                }
                .mapCancellable { response ->
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
