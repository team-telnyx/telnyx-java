// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerCreateMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerCreateMcpServerResponse
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerDeleteMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerGetMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerGetMcpServerResponse
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerListMcpServersParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerListMcpServersResponse
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerUpdateMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerUpdateMcpServerResponse
import java.util.function.Consumer

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

    /** Create a new MCP server for a mission */
    fun createMcpServer(missionId: String): McpServerCreateMcpServerResponse =
        createMcpServer(missionId, McpServerCreateMcpServerParams.none())

    /** @see createMcpServer */
    fun createMcpServer(
        missionId: String,
        params: McpServerCreateMcpServerParams = McpServerCreateMcpServerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerCreateMcpServerResponse =
        createMcpServer(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see createMcpServer */
    fun createMcpServer(
        missionId: String,
        params: McpServerCreateMcpServerParams = McpServerCreateMcpServerParams.none(),
    ): McpServerCreateMcpServerResponse = createMcpServer(missionId, params, RequestOptions.none())

    /** @see createMcpServer */
    fun createMcpServer(
        params: McpServerCreateMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerCreateMcpServerResponse

    /** @see createMcpServer */
    fun createMcpServer(params: McpServerCreateMcpServerParams): McpServerCreateMcpServerResponse =
        createMcpServer(params, RequestOptions.none())

    /** @see createMcpServer */
    fun createMcpServer(
        missionId: String,
        requestOptions: RequestOptions,
    ): McpServerCreateMcpServerResponse =
        createMcpServer(missionId, McpServerCreateMcpServerParams.none(), requestOptions)

    /** Delete an MCP server from a mission */
    fun deleteMcpServer(mcpServerId: String, params: McpServerDeleteMcpServerParams) =
        deleteMcpServer(mcpServerId, params, RequestOptions.none())

    /** @see deleteMcpServer */
    fun deleteMcpServer(
        mcpServerId: String,
        params: McpServerDeleteMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see deleteMcpServer */
    fun deleteMcpServer(params: McpServerDeleteMcpServerParams) =
        deleteMcpServer(params, RequestOptions.none())

    /** @see deleteMcpServer */
    fun deleteMcpServer(
        params: McpServerDeleteMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get a specific MCP server by ID */
    fun getMcpServer(
        mcpServerId: String,
        params: McpServerGetMcpServerParams,
    ): McpServerGetMcpServerResponse = getMcpServer(mcpServerId, params, RequestOptions.none())

    /** @see getMcpServer */
    fun getMcpServer(
        mcpServerId: String,
        params: McpServerGetMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerGetMcpServerResponse =
        getMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see getMcpServer */
    fun getMcpServer(params: McpServerGetMcpServerParams): McpServerGetMcpServerResponse =
        getMcpServer(params, RequestOptions.none())

    /** @see getMcpServer */
    fun getMcpServer(
        params: McpServerGetMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerGetMcpServerResponse

    /** List all MCP servers for a mission */
    fun listMcpServers(missionId: String): McpServerListMcpServersResponse =
        listMcpServers(missionId, McpServerListMcpServersParams.none())

    /** @see listMcpServers */
    fun listMcpServers(
        missionId: String,
        params: McpServerListMcpServersParams = McpServerListMcpServersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerListMcpServersResponse =
        listMcpServers(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see listMcpServers */
    fun listMcpServers(
        missionId: String,
        params: McpServerListMcpServersParams = McpServerListMcpServersParams.none(),
    ): McpServerListMcpServersResponse = listMcpServers(missionId, params, RequestOptions.none())

    /** @see listMcpServers */
    fun listMcpServers(
        params: McpServerListMcpServersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerListMcpServersResponse

    /** @see listMcpServers */
    fun listMcpServers(params: McpServerListMcpServersParams): McpServerListMcpServersResponse =
        listMcpServers(params, RequestOptions.none())

    /** @see listMcpServers */
    fun listMcpServers(
        missionId: String,
        requestOptions: RequestOptions,
    ): McpServerListMcpServersResponse =
        listMcpServers(missionId, McpServerListMcpServersParams.none(), requestOptions)

    /** Update an MCP server definition */
    fun updateMcpServer(
        mcpServerId: String,
        params: McpServerUpdateMcpServerParams,
    ): McpServerUpdateMcpServerResponse =
        updateMcpServer(mcpServerId, params, RequestOptions.none())

    /** @see updateMcpServer */
    fun updateMcpServer(
        mcpServerId: String,
        params: McpServerUpdateMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerUpdateMcpServerResponse =
        updateMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see updateMcpServer */
    fun updateMcpServer(params: McpServerUpdateMcpServerParams): McpServerUpdateMcpServerResponse =
        updateMcpServer(params, RequestOptions.none())

    /** @see updateMcpServer */
    fun updateMcpServer(
        params: McpServerUpdateMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerUpdateMcpServerResponse

    /** A view of [McpServerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): McpServerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/mcp-servers`, but is
         * otherwise the same as [McpServerService.createMcpServer].
         */
        @MustBeClosed
        fun createMcpServer(missionId: String): HttpResponseFor<McpServerCreateMcpServerResponse> =
            createMcpServer(missionId, McpServerCreateMcpServerParams.none())

        /** @see createMcpServer */
        @MustBeClosed
        fun createMcpServer(
            missionId: String,
            params: McpServerCreateMcpServerParams = McpServerCreateMcpServerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerCreateMcpServerResponse> =
            createMcpServer(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see createMcpServer */
        @MustBeClosed
        fun createMcpServer(
            missionId: String,
            params: McpServerCreateMcpServerParams = McpServerCreateMcpServerParams.none(),
        ): HttpResponseFor<McpServerCreateMcpServerResponse> =
            createMcpServer(missionId, params, RequestOptions.none())

        /** @see createMcpServer */
        @MustBeClosed
        fun createMcpServer(
            params: McpServerCreateMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerCreateMcpServerResponse>

        /** @see createMcpServer */
        @MustBeClosed
        fun createMcpServer(
            params: McpServerCreateMcpServerParams
        ): HttpResponseFor<McpServerCreateMcpServerResponse> =
            createMcpServer(params, RequestOptions.none())

        /** @see createMcpServer */
        @MustBeClosed
        fun createMcpServer(
            missionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<McpServerCreateMcpServerResponse> =
            createMcpServer(missionId, McpServerCreateMcpServerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /ai/missions/{mission_id}/mcp-servers/{mcp_server_id}`, but is otherwise the same as
         * [McpServerService.deleteMcpServer].
         */
        @MustBeClosed
        fun deleteMcpServer(
            mcpServerId: String,
            params: McpServerDeleteMcpServerParams,
        ): HttpResponse = deleteMcpServer(mcpServerId, params, RequestOptions.none())

        /** @see deleteMcpServer */
        @MustBeClosed
        fun deleteMcpServer(
            mcpServerId: String,
            params: McpServerDeleteMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see deleteMcpServer */
        @MustBeClosed
        fun deleteMcpServer(params: McpServerDeleteMcpServerParams): HttpResponse =
            deleteMcpServer(params, RequestOptions.none())

        /** @see deleteMcpServer */
        @MustBeClosed
        fun deleteMcpServer(
            params: McpServerDeleteMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/missions/{mission_id}/mcp-servers/{mcp_server_id}`, but is otherwise the same as
         * [McpServerService.getMcpServer].
         */
        @MustBeClosed
        fun getMcpServer(
            mcpServerId: String,
            params: McpServerGetMcpServerParams,
        ): HttpResponseFor<McpServerGetMcpServerResponse> =
            getMcpServer(mcpServerId, params, RequestOptions.none())

        /** @see getMcpServer */
        @MustBeClosed
        fun getMcpServer(
            mcpServerId: String,
            params: McpServerGetMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerGetMcpServerResponse> =
            getMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see getMcpServer */
        @MustBeClosed
        fun getMcpServer(
            params: McpServerGetMcpServerParams
        ): HttpResponseFor<McpServerGetMcpServerResponse> =
            getMcpServer(params, RequestOptions.none())

        /** @see getMcpServer */
        @MustBeClosed
        fun getMcpServer(
            params: McpServerGetMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerGetMcpServerResponse>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/mcp-servers`, but is
         * otherwise the same as [McpServerService.listMcpServers].
         */
        @MustBeClosed
        fun listMcpServers(missionId: String): HttpResponseFor<McpServerListMcpServersResponse> =
            listMcpServers(missionId, McpServerListMcpServersParams.none())

        /** @see listMcpServers */
        @MustBeClosed
        fun listMcpServers(
            missionId: String,
            params: McpServerListMcpServersParams = McpServerListMcpServersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerListMcpServersResponse> =
            listMcpServers(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see listMcpServers */
        @MustBeClosed
        fun listMcpServers(
            missionId: String,
            params: McpServerListMcpServersParams = McpServerListMcpServersParams.none(),
        ): HttpResponseFor<McpServerListMcpServersResponse> =
            listMcpServers(missionId, params, RequestOptions.none())

        /** @see listMcpServers */
        @MustBeClosed
        fun listMcpServers(
            params: McpServerListMcpServersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerListMcpServersResponse>

        /** @see listMcpServers */
        @MustBeClosed
        fun listMcpServers(
            params: McpServerListMcpServersParams
        ): HttpResponseFor<McpServerListMcpServersResponse> =
            listMcpServers(params, RequestOptions.none())

        /** @see listMcpServers */
        @MustBeClosed
        fun listMcpServers(
            missionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<McpServerListMcpServersResponse> =
            listMcpServers(missionId, McpServerListMcpServersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /ai/missions/{mission_id}/mcp-servers/{mcp_server_id}`, but is otherwise the same as
         * [McpServerService.updateMcpServer].
         */
        @MustBeClosed
        fun updateMcpServer(
            mcpServerId: String,
            params: McpServerUpdateMcpServerParams,
        ): HttpResponseFor<McpServerUpdateMcpServerResponse> =
            updateMcpServer(mcpServerId, params, RequestOptions.none())

        /** @see updateMcpServer */
        @MustBeClosed
        fun updateMcpServer(
            mcpServerId: String,
            params: McpServerUpdateMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerUpdateMcpServerResponse> =
            updateMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see updateMcpServer */
        @MustBeClosed
        fun updateMcpServer(
            params: McpServerUpdateMcpServerParams
        ): HttpResponseFor<McpServerUpdateMcpServerResponse> =
            updateMcpServer(params, RequestOptions.none())

        /** @see updateMcpServer */
        @MustBeClosed
        fun updateMcpServer(
            params: McpServerUpdateMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerUpdateMcpServerResponse>
    }
}
