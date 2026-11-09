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
import com.telnyx.sdk.models.agentgateways.AgentGatewayCreateParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayDeleteParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayListPage
import com.telnyx.sdk.models.agentgateways.AgentGatewayListPageResponse
import com.telnyx.sdk.models.agentgateways.AgentGatewayListParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayResponse
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveModelsParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveModelsResponse
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveSpendLogsParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveSpendLogsResponse
import com.telnyx.sdk.services.blocking.agentgateways.ApiService
import com.telnyx.sdk.services.blocking.agentgateways.ApiServiceImpl
import com.telnyx.sdk.services.blocking.agentgateways.GuardrailService
import com.telnyx.sdk.services.blocking.agentgateways.GuardrailServiceImpl
import com.telnyx.sdk.services.blocking.agentgateways.KeyService
import com.telnyx.sdk.services.blocking.agentgateways.KeyServiceImpl
import com.telnyx.sdk.services.blocking.agentgateways.McpServerService
import com.telnyx.sdk.services.blocking.agentgateways.McpServerServiceImpl
import com.telnyx.sdk.services.blocking.agentgateways.PolicyAttachmentService
import com.telnyx.sdk.services.blocking.agentgateways.PolicyAttachmentServiceImpl
import com.telnyx.sdk.services.blocking.agentgateways.PolicyService
import com.telnyx.sdk.services.blocking.agentgateways.PolicyServiceImpl
import com.telnyx.sdk.services.blocking.agentgateways.TeamService
import com.telnyx.sdk.services.blocking.agentgateways.TeamServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AgentGatewayServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentGatewayService {

    private val withRawResponse: AgentGatewayService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val apis: ApiService by lazy { ApiServiceImpl(clientOptions) }

    private val guardrails: GuardrailService by lazy { GuardrailServiceImpl(clientOptions) }

    private val keys: KeyService by lazy { KeyServiceImpl(clientOptions) }

    private val mcpServers: McpServerService by lazy { McpServerServiceImpl(clientOptions) }

    private val policies: PolicyService by lazy { PolicyServiceImpl(clientOptions) }

    private val policyAttachments: PolicyAttachmentService by lazy {
        PolicyAttachmentServiceImpl(clientOptions)
    }

    private val teams: TeamService by lazy { TeamServiceImpl(clientOptions) }

    override fun withRawResponse(): AgentGatewayService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentGatewayService =
        AgentGatewayServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** REST APIs on an instance, served to agents as tools. */
    override fun apis(): ApiService = apis

    /** Checks an instance runs on model and tool requests. */
    override fun guardrails(): GuardrailService = guardrails

    /** Keys on an instance. */
    override fun keys(): KeyService = keys

    /** MCP servers on an instance, served to agents at one MCP endpoint. */
    override fun mcpServers(): McpServerService = mcpServers

    /** Named sets of guardrails an instance applies to requests. */
    override fun policies(): PolicyService = policies

    /** Where an instance applies each policy. */
    override fun policyAttachments(): PolicyAttachmentService = policyAttachments

    /** Teams on an instance: shared model lists, budgets, and rate limits. */
    override fun teams(): TeamService = teams

    override fun create(
        params: AgentGatewayCreateParams,
        requestOptions: RequestOptions,
    ): AgentGatewayResponse =
        // post /agent_gateways
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AgentGatewayRetrieveParams,
        requestOptions: RequestOptions,
    ): AgentGatewayResponse =
        // get /agent_gateways/{instance_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AgentGatewayListParams,
        requestOptions: RequestOptions,
    ): AgentGatewayListPage =
        // get /agent_gateways
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AgentGatewayDeleteParams,
        requestOptions: RequestOptions,
    ): AgentGatewayResponse =
        // delete /agent_gateways/{instance_id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun retrieveModels(
        params: AgentGatewayRetrieveModelsParams,
        requestOptions: RequestOptions,
    ): AgentGatewayRetrieveModelsResponse =
        // get /agent_gateways/{instance_id}/models
        withRawResponse().retrieveModels(params, requestOptions).parse()

    override fun retrieveSpendLogs(
        params: AgentGatewayRetrieveSpendLogsParams,
        requestOptions: RequestOptions,
    ): AgentGatewayRetrieveSpendLogsResponse =
        // get /agent_gateways/{instance_id}/spend_logs
        withRawResponse().retrieveSpendLogs(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentGatewayService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val apis: ApiService.WithRawResponse by lazy {
            ApiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val guardrails: GuardrailService.WithRawResponse by lazy {
            GuardrailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val keys: KeyService.WithRawResponse by lazy {
            KeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mcpServers: McpServerService.WithRawResponse by lazy {
            McpServerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val policies: PolicyService.WithRawResponse by lazy {
            PolicyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val policyAttachments: PolicyAttachmentService.WithRawResponse by lazy {
            PolicyAttachmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val teams: TeamService.WithRawResponse by lazy {
            TeamServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentGatewayService.WithRawResponse =
            AgentGatewayServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** REST APIs on an instance, served to agents as tools. */
        override fun apis(): ApiService.WithRawResponse = apis

        /** Checks an instance runs on model and tool requests. */
        override fun guardrails(): GuardrailService.WithRawResponse = guardrails

        /** Keys on an instance. */
        override fun keys(): KeyService.WithRawResponse = keys

        /** MCP servers on an instance, served to agents at one MCP endpoint. */
        override fun mcpServers(): McpServerService.WithRawResponse = mcpServers

        /** Named sets of guardrails an instance applies to requests. */
        override fun policies(): PolicyService.WithRawResponse = policies

        /** Where an instance applies each policy. */
        override fun policyAttachments(): PolicyAttachmentService.WithRawResponse =
            policyAttachments

        /** Teams on an instance: shared model lists, budgets, and rate limits. */
        override fun teams(): TeamService.WithRawResponse = teams

        private val createHandler: Handler<AgentGatewayResponse> =
            jsonHandler<AgentGatewayResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AgentGatewayCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways")
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

        private val retrieveHandler: Handler<AgentGatewayResponse> =
            jsonHandler<AgentGatewayResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AgentGatewayRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0))
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

        private val listHandler: Handler<AgentGatewayListPageResponse> =
            jsonHandler<AgentGatewayListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AgentGatewayListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways")
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
                    .let {
                        AgentGatewayListPage.builder()
                            .service(AgentGatewayServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<AgentGatewayResponse> =
            jsonHandler<AgentGatewayResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AgentGatewayDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveModelsHandler: Handler<AgentGatewayRetrieveModelsResponse> =
            jsonHandler<AgentGatewayRetrieveModelsResponse>(clientOptions.jsonMapper)

        override fun retrieveModels(
            params: AgentGatewayRetrieveModelsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayRetrieveModelsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "models")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveModelsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveSpendLogsHandler: Handler<AgentGatewayRetrieveSpendLogsResponse> =
            jsonHandler<AgentGatewayRetrieveSpendLogsResponse>(clientOptions.jsonMapper)

        override fun retrieveSpendLogs(
            params: AgentGatewayRetrieveSpendLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "spend_logs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveSpendLogsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
