// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.prepare
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
import com.telnyx.sdk.services.blocking.managedaccounts.ActionService
import com.telnyx.sdk.services.blocking.managedaccounts.ActionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ManagedAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ManagedAccountService {

    private val withRawResponse: ManagedAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptions) }

    override fun withRawResponse(): ManagedAccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManagedAccountService =
        ManagedAccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun create(
        params: ManagedAccountCreateParams,
        requestOptions: RequestOptions,
    ): ManagedAccountCreateResponse =
        // post /managed_accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ManagedAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): ManagedAccountRetrieveResponse =
        // get /managed_accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ManagedAccountUpdateParams,
        requestOptions: RequestOptions,
    ): ManagedAccountUpdateResponse =
        // patch /managed_accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ManagedAccountListParams,
        requestOptions: RequestOptions,
    ): ManagedAccountListResponse =
        // get /managed_accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun getAllocatableGlobalOutboundChannels(
        params: ManagedAccountGetAllocatableGlobalOutboundChannelsParams,
        requestOptions: RequestOptions,
    ): ManagedAccountGetAllocatableGlobalOutboundChannelsResponse =
        // get /managed_accounts/allocatable_global_outbound_channels
        withRawResponse().getAllocatableGlobalOutboundChannels(params, requestOptions).parse()

    override fun updateGlobalChannelLimit(
        params: ManagedAccountUpdateGlobalChannelLimitParams,
        requestOptions: RequestOptions,
    ): ManagedAccountUpdateGlobalChannelLimitResponse =
        // patch /managed_accounts/{id}/update_global_channel_limit
        withRawResponse().updateGlobalChannelLimit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ManagedAccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ManagedAccountService.WithRawResponse =
            ManagedAccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        private val createHandler: Handler<ManagedAccountCreateResponse> =
            jsonHandler<ManagedAccountCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ManagedAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedAccountCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("managed_accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ManagedAccountRetrieveResponse> =
            jsonHandler<ManagedAccountRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ManagedAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedAccountRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("managed_accounts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ManagedAccountUpdateResponse> =
            jsonHandler<ManagedAccountUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ManagedAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedAccountUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ManagedAccountListResponse> =
            jsonHandler<ManagedAccountListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ManagedAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagedAccountListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("managed_accounts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<ManagedAccountGetAllocatableGlobalOutboundChannelsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("managed_accounts", "allocatable_global_outbound_channels")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getAllocatableGlobalOutboundChannelsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<ManagedAccountUpdateGlobalChannelLimitResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
