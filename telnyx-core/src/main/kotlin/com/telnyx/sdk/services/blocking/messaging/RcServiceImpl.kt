// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging

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
import com.telnyx.sdk.models.messaging.rcs.RcInviteTestNumberParams
import com.telnyx.sdk.models.messaging.rcs.RcInviteTestNumberResponse
import com.telnyx.sdk.models.messaging.rcs.RcListBulkCapabilitiesParams
import com.telnyx.sdk.models.messaging.rcs.RcListBulkCapabilitiesResponse
import com.telnyx.sdk.models.messaging.rcs.RcRetrieveCapabilitiesParams
import com.telnyx.sdk.models.messaging.rcs.RcRetrieveCapabilitiesResponse
import com.telnyx.sdk.services.blocking.messaging.rcs.AgentService
import com.telnyx.sdk.services.blocking.messaging.rcs.AgentServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RcServiceImpl internal constructor(private val clientOptions: ClientOptions) : RcService {

    private val withRawResponse: RcService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agents: AgentService by lazy { AgentServiceImpl(clientOptions) }

    override fun withRawResponse(): RcService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcService =
        RcServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agents(): AgentService = agents

    override fun inviteTestNumber(
        params: RcInviteTestNumberParams,
        requestOptions: RequestOptions,
    ): RcInviteTestNumberResponse =
        // put /messaging/rcs/test_number_invite/{id}/{phone_number}
        withRawResponse().inviteTestNumber(params, requestOptions).parse()

    override fun listBulkCapabilities(
        params: RcListBulkCapabilitiesParams,
        requestOptions: RequestOptions,
    ): RcListBulkCapabilitiesResponse =
        // post /messaging/rcs/bulk_capabilities
        withRawResponse().listBulkCapabilities(params, requestOptions).parse()

    override fun retrieveCapabilities(
        params: RcRetrieveCapabilitiesParams,
        requestOptions: RequestOptions,
    ): RcRetrieveCapabilitiesResponse =
        // get /messaging/rcs/capabilities/{agent_id}/{phone_number}
        withRawResponse().retrieveCapabilities(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RcService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val agents: AgentService.WithRawResponse by lazy {
            AgentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RcService.WithRawResponse =
            RcServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun agents(): AgentService.WithRawResponse = agents

        private val inviteTestNumberHandler: Handler<RcInviteTestNumberResponse> =
            jsonHandler<RcInviteTestNumberResponse>(clientOptions.jsonMapper)

        override fun inviteTestNumber(
            params: RcInviteTestNumberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RcInviteTestNumberResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { inviteTestNumberHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listBulkCapabilitiesHandler: Handler<RcListBulkCapabilitiesResponse> =
            jsonHandler<RcListBulkCapabilitiesResponse>(clientOptions.jsonMapper)

        override fun listBulkCapabilities(
            params: RcListBulkCapabilitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RcListBulkCapabilitiesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messaging", "rcs", "bulk_capabilities")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBulkCapabilitiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveCapabilitiesHandler: Handler<RcRetrieveCapabilitiesResponse> =
            jsonHandler<RcRetrieveCapabilitiesResponse>(clientOptions.jsonMapper)

        override fun retrieveCapabilities(
            params: RcRetrieveCapabilitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RcRetrieveCapabilitiesResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
