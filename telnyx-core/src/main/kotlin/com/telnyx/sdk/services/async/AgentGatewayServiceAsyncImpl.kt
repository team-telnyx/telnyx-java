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
import com.telnyx.sdk.models.agentgateways.AgentGatewayCreateParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayDeleteParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayListPageAsync
import com.telnyx.sdk.models.agentgateways.AgentGatewayListPageResponse
import com.telnyx.sdk.models.agentgateways.AgentGatewayListParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayResponse
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveModelsParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveModelsResponse
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveSpendLogsParams
import com.telnyx.sdk.models.agentgateways.AgentGatewayRetrieveSpendLogsResponse
import com.telnyx.sdk.services.async.agentgateways.ApiServiceAsync
import com.telnyx.sdk.services.async.agentgateways.ApiServiceAsyncImpl
import com.telnyx.sdk.services.async.agentgateways.GuardrailServiceAsync
import com.telnyx.sdk.services.async.agentgateways.GuardrailServiceAsyncImpl
import com.telnyx.sdk.services.async.agentgateways.KeyServiceAsync
import com.telnyx.sdk.services.async.agentgateways.KeyServiceAsyncImpl
import com.telnyx.sdk.services.async.agentgateways.McpServerServiceAsync
import com.telnyx.sdk.services.async.agentgateways.McpServerServiceAsyncImpl
import com.telnyx.sdk.services.async.agentgateways.PolicyAttachmentServiceAsync
import com.telnyx.sdk.services.async.agentgateways.PolicyAttachmentServiceAsyncImpl
import com.telnyx.sdk.services.async.agentgateways.PolicyServiceAsync
import com.telnyx.sdk.services.async.agentgateways.PolicyServiceAsyncImpl
import com.telnyx.sdk.services.async.agentgateways.TeamServiceAsync
import com.telnyx.sdk.services.async.agentgateways.TeamServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AgentGatewayServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentGatewayServiceAsync {

    private val withRawResponse: AgentGatewayServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val apis: ApiServiceAsync by lazy { ApiServiceAsyncImpl(clientOptions) }

    private val guardrails: GuardrailServiceAsync by lazy {
        GuardrailServiceAsyncImpl(clientOptions)
    }

    private val keys: KeyServiceAsync by lazy { KeyServiceAsyncImpl(clientOptions) }

    private val mcpServers: McpServerServiceAsync by lazy {
        McpServerServiceAsyncImpl(clientOptions)
    }

    private val policies: PolicyServiceAsync by lazy { PolicyServiceAsyncImpl(clientOptions) }

    private val policyAttachments: PolicyAttachmentServiceAsync by lazy {
        PolicyAttachmentServiceAsyncImpl(clientOptions)
    }

    private val teams: TeamServiceAsync by lazy { TeamServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AgentGatewayServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentGatewayServiceAsync =
        AgentGatewayServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** REST APIs on an instance, served to agents as tools. */
    override fun apis(): ApiServiceAsync = apis

    /** Checks an instance runs on model and tool requests. */
    override fun guardrails(): GuardrailServiceAsync = guardrails

    /** Keys on an instance. */
    override fun keys(): KeyServiceAsync = keys

    /** MCP servers on an instance, served to agents at one MCP endpoint. */
    override fun mcpServers(): McpServerServiceAsync = mcpServers

    /** Named sets of guardrails an instance applies to requests. */
    override fun policies(): PolicyServiceAsync = policies

    /** Where an instance applies each policy. */
    override fun policyAttachments(): PolicyAttachmentServiceAsync = policyAttachments

    /** Teams on an instance: shared model lists, budgets, and rate limits. */
    override fun teams(): TeamServiceAsync = teams

    override fun create(
        params: AgentGatewayCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayResponse> =
        // post /agent_gateways
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieve(
        params: AgentGatewayRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayResponse> =
        // get /agent_gateways/{instance_id}
        withRawResponse().retrieve(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: AgentGatewayListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayListPageAsync> =
        // get /agent_gateways
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: AgentGatewayDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayResponse> =
        // delete /agent_gateways/{instance_id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieveModels(
        params: AgentGatewayRetrieveModelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayRetrieveModelsResponse> =
        // get /agent_gateways/{instance_id}/models
        withRawResponse().retrieveModels(params, requestOptions).mapCancellable { it.parse() }

    override fun retrieveSpendLogs(
        params: AgentGatewayRetrieveSpendLogsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayRetrieveSpendLogsResponse> =
        // get /agent_gateways/{instance_id}/spend_logs
        withRawResponse().retrieveSpendLogs(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentGatewayServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val apis: ApiServiceAsync.WithRawResponse by lazy {
            ApiServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val guardrails: GuardrailServiceAsync.WithRawResponse by lazy {
            GuardrailServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val keys: KeyServiceAsync.WithRawResponse by lazy {
            KeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mcpServers: McpServerServiceAsync.WithRawResponse by lazy {
            McpServerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val policies: PolicyServiceAsync.WithRawResponse by lazy {
            PolicyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val policyAttachments: PolicyAttachmentServiceAsync.WithRawResponse by lazy {
            PolicyAttachmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val teams: TeamServiceAsync.WithRawResponse by lazy {
            TeamServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentGatewayServiceAsync.WithRawResponse =
            AgentGatewayServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** REST APIs on an instance, served to agents as tools. */
        override fun apis(): ApiServiceAsync.WithRawResponse = apis

        /** Checks an instance runs on model and tool requests. */
        override fun guardrails(): GuardrailServiceAsync.WithRawResponse = guardrails

        /** Keys on an instance. */
        override fun keys(): KeyServiceAsync.WithRawResponse = keys

        /** MCP servers on an instance, served to agents at one MCP endpoint. */
        override fun mcpServers(): McpServerServiceAsync.WithRawResponse = mcpServers

        /** Named sets of guardrails an instance applies to requests. */
        override fun policies(): PolicyServiceAsync.WithRawResponse = policies

        /** Where an instance applies each policy. */
        override fun policyAttachments(): PolicyAttachmentServiceAsync.WithRawResponse =
            policyAttachments

        /** Teams on an instance: shared model lists, budgets, and rate limits. */
        override fun teams(): TeamServiceAsync.WithRawResponse = teams

        private val createHandler: Handler<AgentGatewayResponse> =
            jsonHandler<AgentGatewayResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AgentGatewayCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways")
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

        private val retrieveHandler: Handler<AgentGatewayResponse> =
            jsonHandler<AgentGatewayResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AgentGatewayRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0))
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

        private val listHandler: Handler<AgentGatewayListPageResponse> =
            jsonHandler<AgentGatewayListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AgentGatewayListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways")
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
                                AgentGatewayListPageAsync.builder()
                                    .service(AgentGatewayServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<AgentGatewayResponse> =
            jsonHandler<AgentGatewayResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AgentGatewayDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayResponse>> {
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

        private val retrieveModelsHandler: Handler<AgentGatewayRetrieveModelsResponse> =
            jsonHandler<AgentGatewayRetrieveModelsResponse>(clientOptions.jsonMapper)

        override fun retrieveModels(
            params: AgentGatewayRetrieveModelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveModelsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "models")
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
                            .use { retrieveModelsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveSpendLogsHandler: Handler<AgentGatewayRetrieveSpendLogsResponse> =
            jsonHandler<AgentGatewayRetrieveSpendLogsResponse>(clientOptions.jsonMapper)

        override fun retrieveSpendLogs(
            params: AgentGatewayRetrieveSpendLogsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayRetrieveSpendLogsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "spend_logs")
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
}
