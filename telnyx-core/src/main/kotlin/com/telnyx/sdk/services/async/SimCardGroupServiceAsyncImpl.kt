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
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupCreateResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupDeleteParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupDeleteResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupListPageAsync
import com.telnyx.sdk.models.simcardgroups.SimCardGroupListPageResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupListParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupRetrieveResponse
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateParams
import com.telnyx.sdk.models.simcardgroups.SimCardGroupUpdateResponse
import com.telnyx.sdk.services.async.simcardgroups.ActionServiceAsync
import com.telnyx.sdk.services.async.simcardgroups.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SimCardGroupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SimCardGroupServiceAsync {

    private val withRawResponse: SimCardGroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SimCardGroupServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SimCardGroupServiceAsync =
        SimCardGroupServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    override fun create(
        params: SimCardGroupCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGroupCreateResponse> =
        // post /sim_card_groups
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: SimCardGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGroupRetrieveResponse> =
        // get /sim_card_groups/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: SimCardGroupUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGroupUpdateResponse> =
        // patch /sim_card_groups/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SimCardGroupListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGroupListPageAsync> =
        // get /sim_card_groups
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SimCardGroupDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SimCardGroupDeleteResponse> =
        // delete /sim_card_groups/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SimCardGroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SimCardGroupServiceAsync.WithRawResponse =
            SimCardGroupServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<SimCardGroupCreateResponse> =
            jsonHandler<SimCardGroupCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: SimCardGroupCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGroupCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_groups")
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

        private val retrieveHandler: Handler<SimCardGroupRetrieveResponse> =
            jsonHandler<SimCardGroupRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SimCardGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGroupRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_groups", params._pathParam(0))
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

        private val updateHandler: Handler<SimCardGroupUpdateResponse> =
            jsonHandler<SimCardGroupUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: SimCardGroupUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGroupUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_groups", params._pathParam(0))
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

        private val listHandler: Handler<SimCardGroupListPageResponse> =
            jsonHandler<SimCardGroupListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SimCardGroupListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGroupListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_groups")
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
                                SimCardGroupListPageAsync.builder()
                                    .service(SimCardGroupServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<SimCardGroupDeleteResponse> =
            jsonHandler<SimCardGroupDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: SimCardGroupDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SimCardGroupDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_groups", params._pathParam(0))
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
