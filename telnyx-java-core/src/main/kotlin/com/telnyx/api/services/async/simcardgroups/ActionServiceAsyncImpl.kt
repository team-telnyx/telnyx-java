// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.simcardgroups

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
import com.telnyx.api.models.simcardgroups.actions.ActionListParams
import com.telnyx.api.models.simcardgroups.actions.ActionListResponse
import com.telnyx.api.models.simcardgroups.actions.ActionRemovePrivateWirelessGatewayParams
import com.telnyx.api.models.simcardgroups.actions.ActionRemovePrivateWirelessGatewayResponse
import com.telnyx.api.models.simcardgroups.actions.ActionRemoveWirelessBlocklistParams
import com.telnyx.api.models.simcardgroups.actions.ActionRemoveWirelessBlocklistResponse
import com.telnyx.api.models.simcardgroups.actions.ActionRetrieveParams
import com.telnyx.api.models.simcardgroups.actions.ActionRetrieveResponse
import com.telnyx.api.models.simcardgroups.actions.ActionSetPrivateWirelessGatewayParams
import com.telnyx.api.models.simcardgroups.actions.ActionSetPrivateWirelessGatewayResponse
import com.telnyx.api.models.simcardgroups.actions.ActionSetWirelessBlocklistParams
import com.telnyx.api.models.simcardgroups.actions.ActionSetWirelessBlocklistResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActionServiceAsync {

    private val withRawResponse: ActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync =
        ActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ActionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRetrieveResponse> =
        // get /sim_card_group_actions/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ActionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionListResponse> =
        // get /sim_card_group_actions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun removePrivateWirelessGateway(
        params: ActionRemovePrivateWirelessGatewayParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRemovePrivateWirelessGatewayResponse> =
        // post /sim_card_groups/{id}/actions/remove_private_wireless_gateway
        withRawResponse().removePrivateWirelessGateway(params, requestOptions).thenApply {
            it.parse()
        }

    override fun removeWirelessBlocklist(
        params: ActionRemoveWirelessBlocklistParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionRemoveWirelessBlocklistResponse> =
        // post /sim_card_groups/{id}/actions/remove_wireless_blocklist
        withRawResponse().removeWirelessBlocklist(params, requestOptions).thenApply { it.parse() }

    override fun setPrivateWirelessGateway(
        params: ActionSetPrivateWirelessGatewayParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionSetPrivateWirelessGatewayResponse> =
        // post /sim_card_groups/{id}/actions/set_private_wireless_gateway
        withRawResponse().setPrivateWirelessGateway(params, requestOptions).thenApply { it.parse() }

    override fun setWirelessBlocklist(
        params: ActionSetWirelessBlocklistParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionSetWirelessBlocklistResponse> =
        // post /sim_card_groups/{id}/actions/set_wireless_blocklist
        withRawResponse().setWirelessBlocklist(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse =
            ActionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ActionRetrieveResponse> =
            jsonHandler<ActionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ActionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_group_actions", params._pathParam(0))
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

        private val listHandler: Handler<ActionListResponse> =
            jsonHandler<ActionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ActionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sim_card_group_actions")
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

        private val removePrivateWirelessGatewayHandler:
            Handler<ActionRemovePrivateWirelessGatewayResponse> =
            jsonHandler<ActionRemovePrivateWirelessGatewayResponse>(clientOptions.jsonMapper)

        override fun removePrivateWirelessGateway(
            params: ActionRemovePrivateWirelessGatewayParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRemovePrivateWirelessGatewayResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "sim_card_groups",
                        params._pathParam(0),
                        "actions",
                        "remove_private_wireless_gateway",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { removePrivateWirelessGatewayHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val removeWirelessBlocklistHandler: Handler<ActionRemoveWirelessBlocklistResponse> =
            jsonHandler<ActionRemoveWirelessBlocklistResponse>(clientOptions.jsonMapper)

        override fun removeWirelessBlocklist(
            params: ActionRemoveWirelessBlocklistParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionRemoveWirelessBlocklistResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "sim_card_groups",
                        params._pathParam(0),
                        "actions",
                        "remove_wireless_blocklist",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { removeWirelessBlocklistHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val setPrivateWirelessGatewayHandler:
            Handler<ActionSetPrivateWirelessGatewayResponse> =
            jsonHandler<ActionSetPrivateWirelessGatewayResponse>(clientOptions.jsonMapper)

        override fun setPrivateWirelessGateway(
            params: ActionSetPrivateWirelessGatewayParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionSetPrivateWirelessGatewayResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "sim_card_groups",
                        params._pathParam(0),
                        "actions",
                        "set_private_wireless_gateway",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { setPrivateWirelessGatewayHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val setWirelessBlocklistHandler: Handler<ActionSetWirelessBlocklistResponse> =
            jsonHandler<ActionSetWirelessBlocklistResponse>(clientOptions.jsonMapper)

        override fun setWirelessBlocklist(
            params: ActionSetWirelessBlocklistParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionSetWirelessBlocklistResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "sim_card_groups",
                        params._pathParam(0),
                        "actions",
                        "set_wireless_blocklist",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { setWirelessBlocklistHandler.handle(it) }
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
