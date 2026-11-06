// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.mcpservers.AgentGatewayMcpServerResponse
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerDeleteParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerListParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerListResponse
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** MCP servers on an instance, served to agents at one MCP endpoint. */
interface McpServerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): McpServerServiceAsync

    /**
     * Adds an MCP server. The instance serves its tools at `{gateway_url}/mcp`, each named with the
     * server's `name` and a hyphen, to the keys granted the server and, with `open_to_every_key`,
     * to every key. The instance must be `ready`; otherwise the request answers `409`.
     */
    fun create(
        instanceId: String,
        params: McpServerCreateParams,
    ): CompletableFuture<AgentGatewayMcpServerResponse> =
        create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: McpServerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayMcpServerResponse> =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(params: McpServerCreateParams): CompletableFuture<AgentGatewayMcpServerResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: McpServerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayMcpServerResponse>

    /**
     * Changes an MCP server's settings. A field left out stays as it is. `auth` is replaced whole,
     * `tools: []` exposes every tool, and `static_headers: {}` clears the headers. The instance
     * must be `ready`; otherwise the request answers `409`.
     */
    fun update(
        serverId: String,
        params: McpServerUpdateParams,
    ): CompletableFuture<AgentGatewayMcpServerResponse> =
        update(serverId, params, RequestOptions.none())

    /** @see update */
    fun update(
        serverId: String,
        params: McpServerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayMcpServerResponse> =
        update(params.toBuilder().serverId(serverId).build(), requestOptions)

    /** @see update */
    fun update(params: McpServerUpdateParams): CompletableFuture<AgentGatewayMcpServerResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: McpServerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayMcpServerResponse>

    /**
     * Lists the MCP servers the instance serves at `{gateway_url}/mcp`, without their credentials.
     * The instance must be `ready`; otherwise the request answers `409`.
     */
    fun list(instanceId: String): CompletableFuture<McpServerListResponse> =
        list(instanceId, McpServerListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: McpServerListParams = McpServerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerListResponse> =
        list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(
        instanceId: String,
        params: McpServerListParams = McpServerListParams.none(),
    ): CompletableFuture<McpServerListResponse> = list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: McpServerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerListResponse>

    /** @see list */
    fun list(params: McpServerListParams): CompletableFuture<McpServerListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        instanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerListResponse> =
        list(instanceId, McpServerListParams.none(), requestOptions)

    /**
     * Removes an MCP server and returns it as it was. Its `id` stays in the tool permissions that
     * name it until they are next set. The instance must be `ready`; otherwise the request answers
     * `409`.
     */
    fun delete(
        serverId: String,
        params: McpServerDeleteParams,
    ): CompletableFuture<AgentGatewayMcpServerResponse> =
        delete(serverId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        serverId: String,
        params: McpServerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayMcpServerResponse> =
        delete(params.toBuilder().serverId(serverId).build(), requestOptions)

    /** @see delete */
    fun delete(params: McpServerDeleteParams): CompletableFuture<AgentGatewayMcpServerResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: McpServerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayMcpServerResponse>

    /**
     * A view of [McpServerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): McpServerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/mcp_servers`, but is
         * otherwise the same as [McpServerServiceAsync.create].
         */
        fun create(
            instanceId: String,
            params: McpServerCreateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            instanceId: String,
            params: McpServerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: McpServerCreateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: McpServerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /agent_gateways/{instance_id}/mcp_servers/{server_id}`, but is otherwise the same as
         * [McpServerServiceAsync.update].
         */
        fun update(
            serverId: String,
            params: McpServerUpdateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> =
            update(serverId, params, RequestOptions.none())

        /** @see update */
        fun update(
            serverId: String,
            params: McpServerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> =
            update(params.toBuilder().serverId(serverId).build(), requestOptions)

        /** @see update */
        fun update(
            params: McpServerUpdateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: McpServerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/mcp_servers`, but is
         * otherwise the same as [McpServerServiceAsync.list].
         */
        fun list(instanceId: String): CompletableFuture<HttpResponseFor<McpServerListResponse>> =
            list(instanceId, McpServerListParams.none())

        /** @see list */
        fun list(
            instanceId: String,
            params: McpServerListParams = McpServerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerListResponse>> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        fun list(
            instanceId: String,
            params: McpServerListParams = McpServerListParams.none(),
        ): CompletableFuture<HttpResponseFor<McpServerListResponse>> =
            list(instanceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: McpServerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerListResponse>>

        /** @see list */
        fun list(
            params: McpServerListParams
        ): CompletableFuture<HttpResponseFor<McpServerListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerListResponse>> =
            list(instanceId, McpServerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /agent_gateways/{instance_id}/mcp_servers/{server_id}`, but is otherwise the same as
         * [McpServerServiceAsync.delete].
         */
        fun delete(
            serverId: String,
            params: McpServerDeleteParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> =
            delete(serverId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            serverId: String,
            params: McpServerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> =
            delete(params.toBuilder().serverId(serverId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: McpServerDeleteParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: McpServerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayMcpServerResponse>>
    }
}
