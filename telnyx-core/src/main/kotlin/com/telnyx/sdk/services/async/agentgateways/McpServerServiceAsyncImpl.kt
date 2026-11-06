// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

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
import com.telnyx.sdk.models.agentgateways.mcpservers.AgentGatewayMcpServerResponse
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerDeleteParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerListParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerListResponse
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** MCP servers on an instance, served to agents at one MCP endpoint. */
class McpServerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    McpServerServiceAsync {

    private val withRawResponse: McpServerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): McpServerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): McpServerServiceAsync =
        McpServerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: McpServerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayMcpServerResponse> =
        // post /agent_gateways/{instance_id}/mcp_servers
        withRawResponse().create(params, requestOptions).mapCancellable { it.parse() }

    override fun update(
        params: McpServerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayMcpServerResponse> =
        // patch /agent_gateways/{instance_id}/mcp_servers/{server_id}
        withRawResponse().update(params, requestOptions).mapCancellable { it.parse() }

    override fun list(
        params: McpServerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerListResponse> =
        // get /agent_gateways/{instance_id}/mcp_servers
        withRawResponse().list(params, requestOptions).mapCancellable { it.parse() }

    override fun delete(
        params: McpServerDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentGatewayMcpServerResponse> =
        // delete /agent_gateways/{instance_id}/mcp_servers/{server_id}
        withRawResponse().delete(params, requestOptions).mapCancellable { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        McpServerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): McpServerServiceAsync.WithRawResponse =
            McpServerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AgentGatewayMcpServerResponse> =
            jsonHandler<AgentGatewayMcpServerResponse>(clientOptions.jsonMapper)

        override fun create(
            params: McpServerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "mcp_servers")
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

        private val updateHandler: Handler<AgentGatewayMcpServerResponse> =
            jsonHandler<AgentGatewayMcpServerResponse>(clientOptions.jsonMapper)

        override fun update(
            params: McpServerUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("serverId", params.serverId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "mcp_servers",
                        params._pathParam(1),
                    )
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<McpServerListResponse> =
            jsonHandler<McpServerListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: McpServerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("instanceId", params.instanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent_gateways", params._pathParam(0), "mcp_servers")
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
                    }
                }
        }

        private val deleteHandler: Handler<AgentGatewayMcpServerResponse> =
            jsonHandler<AgentGatewayMcpServerResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: McpServerDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("serverId", params.serverId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent_gateways",
                        params._pathParam(0),
                        "mcp_servers",
                        params._pathParam(1),
                    )
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
    }
}
