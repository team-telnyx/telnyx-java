// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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

    /** Create a new MCP server for a mission */
    fun createMcpServer(missionId: String): CompletableFuture<McpServerCreateMcpServerResponse> =
        createMcpServer(missionId, McpServerCreateMcpServerParams.none())

    /** @see createMcpServer */
    fun createMcpServer(
        missionId: String,
        params: McpServerCreateMcpServerParams = McpServerCreateMcpServerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerCreateMcpServerResponse> =
        createMcpServer(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see createMcpServer */
    fun createMcpServer(
        missionId: String,
        params: McpServerCreateMcpServerParams = McpServerCreateMcpServerParams.none(),
    ): CompletableFuture<McpServerCreateMcpServerResponse> =
        createMcpServer(missionId, params, RequestOptions.none())

    /** @see createMcpServer */
    fun createMcpServer(
        params: McpServerCreateMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerCreateMcpServerResponse>

    /** @see createMcpServer */
    fun createMcpServer(
        params: McpServerCreateMcpServerParams
    ): CompletableFuture<McpServerCreateMcpServerResponse> =
        createMcpServer(params, RequestOptions.none())

    /** @see createMcpServer */
    fun createMcpServer(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerCreateMcpServerResponse> =
        createMcpServer(missionId, McpServerCreateMcpServerParams.none(), requestOptions)

    /** Delete an MCP server from a mission */
    fun deleteMcpServer(
        mcpServerId: String,
        params: McpServerDeleteMcpServerParams,
    ): CompletableFuture<Void?> = deleteMcpServer(mcpServerId, params, RequestOptions.none())

    /** @see deleteMcpServer */
    fun deleteMcpServer(
        mcpServerId: String,
        params: McpServerDeleteMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see deleteMcpServer */
    fun deleteMcpServer(params: McpServerDeleteMcpServerParams): CompletableFuture<Void?> =
        deleteMcpServer(params, RequestOptions.none())

    /** @see deleteMcpServer */
    fun deleteMcpServer(
        params: McpServerDeleteMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get a specific MCP server by ID */
    fun getMcpServer(
        mcpServerId: String,
        params: McpServerGetMcpServerParams,
    ): CompletableFuture<McpServerGetMcpServerResponse> =
        getMcpServer(mcpServerId, params, RequestOptions.none())

    /** @see getMcpServer */
    fun getMcpServer(
        mcpServerId: String,
        params: McpServerGetMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerGetMcpServerResponse> =
        getMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see getMcpServer */
    fun getMcpServer(
        params: McpServerGetMcpServerParams
    ): CompletableFuture<McpServerGetMcpServerResponse> =
        getMcpServer(params, RequestOptions.none())

    /** @see getMcpServer */
    fun getMcpServer(
        params: McpServerGetMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerGetMcpServerResponse>

    /** List all MCP servers for a mission */
    fun listMcpServers(missionId: String): CompletableFuture<McpServerListMcpServersResponse> =
        listMcpServers(missionId, McpServerListMcpServersParams.none())

    /** @see listMcpServers */
    fun listMcpServers(
        missionId: String,
        params: McpServerListMcpServersParams = McpServerListMcpServersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerListMcpServersResponse> =
        listMcpServers(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see listMcpServers */
    fun listMcpServers(
        missionId: String,
        params: McpServerListMcpServersParams = McpServerListMcpServersParams.none(),
    ): CompletableFuture<McpServerListMcpServersResponse> =
        listMcpServers(missionId, params, RequestOptions.none())

    /** @see listMcpServers */
    fun listMcpServers(
        params: McpServerListMcpServersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerListMcpServersResponse>

    /** @see listMcpServers */
    fun listMcpServers(
        params: McpServerListMcpServersParams
    ): CompletableFuture<McpServerListMcpServersResponse> =
        listMcpServers(params, RequestOptions.none())

    /** @see listMcpServers */
    fun listMcpServers(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerListMcpServersResponse> =
        listMcpServers(missionId, McpServerListMcpServersParams.none(), requestOptions)

    /** Update an MCP server definition */
    fun updateMcpServer(
        mcpServerId: String,
        params: McpServerUpdateMcpServerParams,
    ): CompletableFuture<McpServerUpdateMcpServerResponse> =
        updateMcpServer(mcpServerId, params, RequestOptions.none())

    /** @see updateMcpServer */
    fun updateMcpServer(
        mcpServerId: String,
        params: McpServerUpdateMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerUpdateMcpServerResponse> =
        updateMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see updateMcpServer */
    fun updateMcpServer(
        params: McpServerUpdateMcpServerParams
    ): CompletableFuture<McpServerUpdateMcpServerResponse> =
        updateMcpServer(params, RequestOptions.none())

    /** @see updateMcpServer */
    fun updateMcpServer(
        params: McpServerUpdateMcpServerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerUpdateMcpServerResponse>

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
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/mcp-servers`, but is
         * otherwise the same as [McpServerServiceAsync.createMcpServer].
         */
        fun createMcpServer(
            missionId: String
        ): CompletableFuture<HttpResponseFor<McpServerCreateMcpServerResponse>> =
            createMcpServer(missionId, McpServerCreateMcpServerParams.none())

        /** @see createMcpServer */
        fun createMcpServer(
            missionId: String,
            params: McpServerCreateMcpServerParams = McpServerCreateMcpServerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerCreateMcpServerResponse>> =
            createMcpServer(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see createMcpServer */
        fun createMcpServer(
            missionId: String,
            params: McpServerCreateMcpServerParams = McpServerCreateMcpServerParams.none(),
        ): CompletableFuture<HttpResponseFor<McpServerCreateMcpServerResponse>> =
            createMcpServer(missionId, params, RequestOptions.none())

        /** @see createMcpServer */
        fun createMcpServer(
            params: McpServerCreateMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerCreateMcpServerResponse>>

        /** @see createMcpServer */
        fun createMcpServer(
            params: McpServerCreateMcpServerParams
        ): CompletableFuture<HttpResponseFor<McpServerCreateMcpServerResponse>> =
            createMcpServer(params, RequestOptions.none())

        /** @see createMcpServer */
        fun createMcpServer(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerCreateMcpServerResponse>> =
            createMcpServer(missionId, McpServerCreateMcpServerParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /ai/missions/{mission_id}/mcp-servers/{mcp_server_id}`, but is otherwise the same as
         * [McpServerServiceAsync.deleteMcpServer].
         */
        fun deleteMcpServer(
            mcpServerId: String,
            params: McpServerDeleteMcpServerParams,
        ): CompletableFuture<HttpResponse> =
            deleteMcpServer(mcpServerId, params, RequestOptions.none())

        /** @see deleteMcpServer */
        fun deleteMcpServer(
            mcpServerId: String,
            params: McpServerDeleteMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see deleteMcpServer */
        fun deleteMcpServer(
            params: McpServerDeleteMcpServerParams
        ): CompletableFuture<HttpResponse> = deleteMcpServer(params, RequestOptions.none())

        /** @see deleteMcpServer */
        fun deleteMcpServer(
            params: McpServerDeleteMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /ai/missions/{mission_id}/mcp-servers/{mcp_server_id}`, but is otherwise the same as
         * [McpServerServiceAsync.getMcpServer].
         */
        fun getMcpServer(
            mcpServerId: String,
            params: McpServerGetMcpServerParams,
        ): CompletableFuture<HttpResponseFor<McpServerGetMcpServerResponse>> =
            getMcpServer(mcpServerId, params, RequestOptions.none())

        /** @see getMcpServer */
        fun getMcpServer(
            mcpServerId: String,
            params: McpServerGetMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerGetMcpServerResponse>> =
            getMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see getMcpServer */
        fun getMcpServer(
            params: McpServerGetMcpServerParams
        ): CompletableFuture<HttpResponseFor<McpServerGetMcpServerResponse>> =
            getMcpServer(params, RequestOptions.none())

        /** @see getMcpServer */
        fun getMcpServer(
            params: McpServerGetMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerGetMcpServerResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/mcp-servers`, but is
         * otherwise the same as [McpServerServiceAsync.listMcpServers].
         */
        fun listMcpServers(
            missionId: String
        ): CompletableFuture<HttpResponseFor<McpServerListMcpServersResponse>> =
            listMcpServers(missionId, McpServerListMcpServersParams.none())

        /** @see listMcpServers */
        fun listMcpServers(
            missionId: String,
            params: McpServerListMcpServersParams = McpServerListMcpServersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerListMcpServersResponse>> =
            listMcpServers(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see listMcpServers */
        fun listMcpServers(
            missionId: String,
            params: McpServerListMcpServersParams = McpServerListMcpServersParams.none(),
        ): CompletableFuture<HttpResponseFor<McpServerListMcpServersResponse>> =
            listMcpServers(missionId, params, RequestOptions.none())

        /** @see listMcpServers */
        fun listMcpServers(
            params: McpServerListMcpServersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerListMcpServersResponse>>

        /** @see listMcpServers */
        fun listMcpServers(
            params: McpServerListMcpServersParams
        ): CompletableFuture<HttpResponseFor<McpServerListMcpServersResponse>> =
            listMcpServers(params, RequestOptions.none())

        /** @see listMcpServers */
        fun listMcpServers(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerListMcpServersResponse>> =
            listMcpServers(missionId, McpServerListMcpServersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /ai/missions/{mission_id}/mcp-servers/{mcp_server_id}`, but is otherwise the same as
         * [McpServerServiceAsync.updateMcpServer].
         */
        fun updateMcpServer(
            mcpServerId: String,
            params: McpServerUpdateMcpServerParams,
        ): CompletableFuture<HttpResponseFor<McpServerUpdateMcpServerResponse>> =
            updateMcpServer(mcpServerId, params, RequestOptions.none())

        /** @see updateMcpServer */
        fun updateMcpServer(
            mcpServerId: String,
            params: McpServerUpdateMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerUpdateMcpServerResponse>> =
            updateMcpServer(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see updateMcpServer */
        fun updateMcpServer(
            params: McpServerUpdateMcpServerParams
        ): CompletableFuture<HttpResponseFor<McpServerUpdateMcpServerResponse>> =
            updateMcpServer(params, RequestOptions.none())

        /** @see updateMcpServer */
        fun updateMcpServer(
            params: McpServerUpdateMcpServerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerUpdateMcpServerResponse>>
    }
}
