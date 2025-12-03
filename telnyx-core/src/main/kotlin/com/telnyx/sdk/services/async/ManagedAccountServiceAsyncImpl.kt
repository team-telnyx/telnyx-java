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
import com.telnyx.sdk.models.managedaccounts.ManagedAccountCreateParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountCreateResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountGetAllocatableGlobalOutboundChannelsParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountGetAllocatableGlobalOutboundChannelsResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountListParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountListResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountRetrieveParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountRetrieveResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateGlobalChannelLimitParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateGlobalChannelLimitResponse
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateParams
import com.telnyx.sdk.models.managedaccounts.ManagedAccountUpdateResponse
import com.telnyx.sdk.services.async.managedaccounts.ActionServiceAsync
import com.telnyx.sdk.services.async.managedaccounts.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ManagedAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ManagedAccountServiceAsync {

    private val withRawResponse: ManagedAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ManagedAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ManagedAccountServiceAsync =
        ManagedAccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    override fun create(
        params: ManagedAccountCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedAccountCreateResponse> =
        // post /managed_accounts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ManagedAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedAccountRetrieveResponse> =
        // get /managed_accounts/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ManagedAccountUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedAccountUpdateResponse> =
        // patch /managed_accounts/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ManagedAccountListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedAccountListResponse> =
        // get /managed_accounts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getAllocatableGlobalOutboundChannels(
        params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse> =
        // get /managed_accounts/allocatable_global_outbound_channels
        withRawResponse().getAllocatableGlobalOutboundChannels(params, requestOptions).thenApply {
            it.parse()
        }

    override fun updateGlobalChannelLimit(
        params: ManagedAccountUpdateGlobalChannelLimitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagedAccountUpdateGlobalChannelLimitResponse> =
        // patch /managed_accounts/{id}/update_global_channel_limit
        withRawResponse().updateGlobalChannelLimit(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ManagedAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ManagedAccountServiceAsync.WithRawResponse =
            ManagedAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<ManagedAccountCreateResponse> =
            jsonHandler<ManagedAccountCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ManagedAccountCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedAccountCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("managed_accounts")
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

        private val retrieveHandler: Handler<ManagedAccountRetrieveResponse> =
            jsonHandler<ManagedAccountRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ManagedAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedAccountRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("managed_accounts", params._pathParam(0))
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

        private val updateHandler: Handler<ManagedAccountUpdateResponse> =
            jsonHandler<ManagedAccountUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ManagedAccountUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("managed_accounts", params._pathParam(0))
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

        private val listHandler: Handler<ManagedAccountListResponse> =
            jsonHandler<ManagedAccountListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ManagedAccountListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedAccountListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("managed_accounts")
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

        private val getAllocatableGlobalOutboundChannelsHandler:
            Handler<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse> =
            jsonHandler<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse>(
                clientOptions.jsonMapper
            )

        override fun getAllocatableGlobalOutboundChannels(
            params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("managed_accounts", "allocatable_global_outbound_channels")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getAllocatableGlobalOutboundChannelsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateGlobalChannelLimitHandler:
            Handler<ManagedAccountUpdateGlobalChannelLimitResponse> =
            jsonHandler<ManagedAccountUpdateGlobalChannelLimitResponse>(clientOptions.jsonMapper)

        override fun updateGlobalChannelLimit(
            params: ManagedAccountUpdateGlobalChannelLimitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "managed_accounts",
                        params._pathParam(0),
                        "update_global_channel_limit",
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
                            .use { updateGlobalChannelLimitHandler.handle(it) }
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
