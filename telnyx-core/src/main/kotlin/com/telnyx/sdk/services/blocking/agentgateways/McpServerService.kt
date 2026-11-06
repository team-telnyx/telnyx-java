// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.mcpservers.AgentGatewayMcpServerResponse
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerDeleteParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerListParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerListResponse
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerUpdateParams
import java.util.function.Consumer

/** MCP servers on an instance, served to agents at one MCP endpoint. */
interface McpServerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): McpServerService

    /**
     * Adds an MCP server. The instance serves its tools at `{gateway_url}/mcp`, each named with the
     * server's `name` and a hyphen, to the keys granted the server and, with `open_to_every_key`,
     * to every key. The instance must be `ready`; otherwise the request answers `409`.
     */
    fun create(instanceId: String, params: McpServerCreateParams): AgentGatewayMcpServerResponse =
        create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: McpServerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayMcpServerResponse =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(params: McpServerCreateParams): AgentGatewayMcpServerResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: McpServerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayMcpServerResponse

    /**
     * Changes an MCP server's settings. A field left out stays as it is. `auth` is replaced whole,
     * `tools: []` exposes every tool, and `static_headers: {}` clears the headers. The instance
     * must be `ready`; otherwise the request answers `409`.
     */
    fun update(serverId: String, params: McpServerUpdateParams): AgentGatewayMcpServerResponse =
        update(serverId, params, RequestOptions.none())

    /** @see update */
    fun update(
        serverId: String,
        params: McpServerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayMcpServerResponse =
        update(params.toBuilder().serverId(serverId).build(), requestOptions)

    /** @see update */
    fun update(params: McpServerUpdateParams): AgentGatewayMcpServerResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: McpServerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayMcpServerResponse

    /**
     * Lists the MCP servers the instance serves at `{gateway_url}/mcp`, without their credentials.
     * The instance must be `ready`; otherwise the request answers `409`.
     */
    fun list(instanceId: String): McpServerListResponse =
        list(instanceId, McpServerListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: McpServerListParams = McpServerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerListResponse =
        list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(
        instanceId: String,
        params: McpServerListParams = McpServerListParams.none(),
    ): McpServerListResponse = list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: McpServerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerListResponse

    /** @see list */
    fun list(params: McpServerListParams): McpServerListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(instanceId: String, requestOptions: RequestOptions): McpServerListResponse =
        list(instanceId, McpServerListParams.none(), requestOptions)

    /**
     * Removes an MCP server and returns it as it was. Its `id` stays in the tool permissions that
     * name it until they are next set. The instance must be `ready`; otherwise the request answers
     * `409`.
     */
    fun delete(serverId: String, params: McpServerDeleteParams): AgentGatewayMcpServerResponse =
        delete(serverId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        serverId: String,
        params: McpServerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayMcpServerResponse =
        delete(params.toBuilder().serverId(serverId).build(), requestOptions)

    /** @see delete */
    fun delete(params: McpServerDeleteParams): AgentGatewayMcpServerResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: McpServerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayMcpServerResponse

    /** A view of [McpServerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): McpServerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/mcp_servers`, but is
         * otherwise the same as [McpServerService.create].
         */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: McpServerCreateParams,
        ): HttpResponseFor<AgentGatewayMcpServerResponse> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: McpServerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayMcpServerResponse> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: McpServerCreateParams): HttpResponseFor<AgentGatewayMcpServerResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: McpServerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayMcpServerResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /agent_gateways/{instance_id}/mcp_servers/{server_id}`, but is otherwise the same as
         * [McpServerService.update].
         */
        @MustBeClosed
        fun update(
            serverId: String,
            params: McpServerUpdateParams,
        ): HttpResponseFor<AgentGatewayMcpServerResponse> =
            update(serverId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            serverId: String,
            params: McpServerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayMcpServerResponse> =
            update(params.toBuilder().serverId(serverId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: McpServerUpdateParams): HttpResponseFor<AgentGatewayMcpServerResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: McpServerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayMcpServerResponse>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/mcp_servers`, but is
         * otherwise the same as [McpServerService.list].
         */
        @MustBeClosed
        fun list(instanceId: String): HttpResponseFor<McpServerListResponse> =
            list(instanceId, McpServerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: McpServerListParams = McpServerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerListResponse> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: McpServerListParams = McpServerListParams.none(),
        ): HttpResponseFor<McpServerListResponse> = list(instanceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: McpServerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: McpServerListParams): HttpResponseFor<McpServerListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<McpServerListResponse> =
            list(instanceId, McpServerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /agent_gateways/{instance_id}/mcp_servers/{server_id}`, but is otherwise the same as
         * [McpServerService.delete].
         */
        @MustBeClosed
        fun delete(
            serverId: String,
            params: McpServerDeleteParams,
        ): HttpResponseFor<AgentGatewayMcpServerResponse> =
            delete(serverId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            serverId: String,
            params: McpServerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayMcpServerResponse> =
            delete(params.toBuilder().serverId(serverId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: McpServerDeleteParams): HttpResponseFor<AgentGatewayMcpServerResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: McpServerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayMcpServerResponse>
    }
}
