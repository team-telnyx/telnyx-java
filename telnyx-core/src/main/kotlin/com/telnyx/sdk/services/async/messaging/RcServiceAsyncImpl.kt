// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging

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
import com.telnyx.sdk.models.messaging.rcs.RcInviteTestNumberParams
import com.telnyx.sdk.models.messaging.rcs.RcInviteTestNumberResponse
import com.telnyx.sdk.models.messaging.rcs.RcListBulkCapabilitiesParams
import com.telnyx.sdk.models.messaging.rcs.RcListBulkCapabilitiesResponse
import com.telnyx.sdk.models.messaging.rcs.RcRetrieveCapabilitiesParams
import com.telnyx.sdk.models.messaging.rcs.RcRetrieveCapabilitiesResponse
import com.telnyx.sdk.services.async.messaging.rcs.AgentServiceAsync
import com.telnyx.sdk.services.async.messaging.rcs.AgentServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Send RCS messages */
class RcServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RcServiceAsync {

    private val withRawResponse: RcServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agents: AgentServiceAsync by lazy { AgentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RcServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcServiceAsync =
        RcServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Send RCS messages */
    override fun agents(): AgentServiceAsync = agents

    override fun inviteTestNumber(
        params: RcInviteTestNumberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RcInviteTestNumberResponse> =
        // put /messaging/rcs/test_number_invite/{id}/{phone_number}
        withRawResponse().inviteTestNumber(params, requestOptions).thenApply { it.parse() }

    override fun listBulkCapabilities(
        params: RcListBulkCapabilitiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RcListBulkCapabilitiesResponse> =
        // post /messaging/rcs/bulk_capabilities
        withRawResponse().listBulkCapabilities(params, requestOptions).thenApply { it.parse() }

    override fun retrieveCapabilities(
        params: RcRetrieveCapabilitiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RcRetrieveCapabilitiesResponse> =
        // get /messaging/rcs/capabilities/{agent_id}/{phone_number}
        withRawResponse().retrieveCapabilities(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RcServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val agents: AgentServiceAsync.WithRawResponse by lazy {
            AgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RcServiceAsync.WithRawResponse =
            RcServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Send RCS messages */
        override fun agents(): AgentServiceAsync.WithRawResponse = agents

        private val inviteTestNumberHandler: Handler<RcInviteTestNumberResponse> =
            jsonHandler<RcInviteTestNumberResponse>(clientOptions.jsonMapper)

        override fun inviteTestNumber(
            params: RcInviteTestNumberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RcInviteTestNumberResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging",
                        "rcs",
                        "test_number_invite",
                        params._pathParam(0),
                        params._pathParam(1),
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
                            .use { inviteTestNumberHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listBulkCapabilitiesHandler: Handler<RcListBulkCapabilitiesResponse> =
            jsonHandler<RcListBulkCapabilitiesResponse>(clientOptions.jsonMapper)

        override fun listBulkCapabilities(
            params: RcListBulkCapabilitiesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RcListBulkCapabilitiesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging", "rcs", "bulk_capabilities")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listBulkCapabilitiesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveCapabilitiesHandler: Handler<RcRetrieveCapabilitiesResponse> =
            jsonHandler<RcRetrieveCapabilitiesResponse>(clientOptions.jsonMapper)

        override fun retrieveCapabilities(
            params: RcRetrieveCapabilitiesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RcRetrieveCapabilitiesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "messaging",
                        "rcs",
                        "capabilities",
                        params._pathParam(0),
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveCapabilitiesHandler.handle(it) }
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
