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
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectCreateParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectCreateResponse
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectDeleteParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectDeleteResponse
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectListPageAsync
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectListPageResponse
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectListParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectRetrieveParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectRetrieveResponse
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectUpdateParams
import com.telnyx.sdk.models.virtualcrossconnects.VirtualCrossConnectUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VirtualCrossConnectServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : VirtualCrossConnectServiceAsync {

    private val withRawResponse: VirtualCrossConnectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VirtualCrossConnectServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VirtualCrossConnectServiceAsync =
        VirtualCrossConnectServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: VirtualCrossConnectCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualCrossConnectCreateResponse> =
        // post /virtual_cross_connects
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: VirtualCrossConnectRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualCrossConnectRetrieveResponse> =
        // get /virtual_cross_connects/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: VirtualCrossConnectUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualCrossConnectUpdateResponse> =
        // patch /virtual_cross_connects/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VirtualCrossConnectListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualCrossConnectListPageAsync> =
        // get /virtual_cross_connects
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: VirtualCrossConnectDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VirtualCrossConnectDeleteResponse> =
        // delete /virtual_cross_connects/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VirtualCrossConnectServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VirtualCrossConnectServiceAsync.WithRawResponse =
            VirtualCrossConnectServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<VirtualCrossConnectCreateResponse> =
            jsonHandler<VirtualCrossConnectCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VirtualCrossConnectCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("virtual_cross_connects")
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

        private val retrieveHandler: Handler<VirtualCrossConnectRetrieveResponse> =
            jsonHandler<VirtualCrossConnectRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VirtualCrossConnectRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("virtual_cross_connects", params._pathParam(0))
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

        private val updateHandler: Handler<VirtualCrossConnectUpdateResponse> =
            jsonHandler<VirtualCrossConnectUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: VirtualCrossConnectUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("virtual_cross_connects", params._pathParam(0))
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

        private val listHandler: Handler<VirtualCrossConnectListPageResponse> =
            jsonHandler<VirtualCrossConnectListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VirtualCrossConnectListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("virtual_cross_connects")
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
                                VirtualCrossConnectListPageAsync.builder()
                                    .service(VirtualCrossConnectServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<VirtualCrossConnectDeleteResponse> =
            jsonHandler<VirtualCrossConnectDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: VirtualCrossConnectDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VirtualCrossConnectDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("virtual_cross_connects", params._pathParam(0))
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
