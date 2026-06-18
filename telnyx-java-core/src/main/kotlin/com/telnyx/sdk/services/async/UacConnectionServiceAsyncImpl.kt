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
import com.telnyx.sdk.models.uacconnections.UacConnectionCreateParams
import com.telnyx.sdk.models.uacconnections.UacConnectionCreateResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionDeleteParams
import com.telnyx.sdk.models.uacconnections.UacConnectionDeleteResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionListPageAsync
import com.telnyx.sdk.models.uacconnections.UacConnectionListPageResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionListParams
import com.telnyx.sdk.models.uacconnections.UacConnectionRetrieveParams
import com.telnyx.sdk.models.uacconnections.UacConnectionRetrieveResponse
import com.telnyx.sdk.models.uacconnections.UacConnectionUpdateParams
import com.telnyx.sdk.models.uacconnections.UacConnectionUpdateResponse
import com.telnyx.sdk.services.async.uacconnections.ActionServiceAsync
import com.telnyx.sdk.services.async.uacconnections.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** UAC connection operations */
class UacConnectionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UacConnectionServiceAsync {

    private val withRawResponse: UacConnectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): UacConnectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UacConnectionServiceAsync =
        UacConnectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** UAC connection operations */
    override fun actions(): ActionServiceAsync = actions

    override fun create(
        params: UacConnectionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UacConnectionCreateResponse> =
        // post /uac_connections
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: UacConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UacConnectionRetrieveResponse> =
        // get /uac_connections/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: UacConnectionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UacConnectionUpdateResponse> =
        // patch /uac_connections/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: UacConnectionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UacConnectionListPageAsync> =
        // get /uac_connections
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: UacConnectionDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UacConnectionDeleteResponse> =
        // delete /uac_connections/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UacConnectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UacConnectionServiceAsync.WithRawResponse =
            UacConnectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** UAC connection operations */
        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<UacConnectionCreateResponse> =
            jsonHandler<UacConnectionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UacConnectionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UacConnectionCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("uac_connections")
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

        private val retrieveHandler: Handler<UacConnectionRetrieveResponse> =
            jsonHandler<UacConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UacConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UacConnectionRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("uac_connections", params._pathParam(0))
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

        private val updateHandler: Handler<UacConnectionUpdateResponse> =
            jsonHandler<UacConnectionUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: UacConnectionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UacConnectionUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("uac_connections", params._pathParam(0))
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

        private val listHandler: Handler<UacConnectionListPageResponse> =
            jsonHandler<UacConnectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UacConnectionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UacConnectionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("uac_connections")
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
                                UacConnectionListPageAsync.builder()
                                    .service(UacConnectionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<UacConnectionDeleteResponse> =
            jsonHandler<UacConnectionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: UacConnectionDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UacConnectionDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("uac_connections", params._pathParam(0))
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
