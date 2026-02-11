// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.missions.tools.ToolCreateToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolCreateToolResponse
import com.telnyx.sdk.models.ai.missions.tools.ToolDeleteToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolGetToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolGetToolResponse
import com.telnyx.sdk.models.ai.missions.tools.ToolListToolsParams
import com.telnyx.sdk.models.ai.missions.tools.ToolListToolsResponse
import com.telnyx.sdk.models.ai.missions.tools.ToolUpdateToolParams
import com.telnyx.sdk.models.ai.missions.tools.ToolUpdateToolResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ToolServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync

    /** Create a new tool for a mission */
    fun createTool(missionId: String): CompletableFuture<ToolCreateToolResponse> =
        createTool(missionId, ToolCreateToolParams.none())

    /** @see createTool */
    fun createTool(
        missionId: String,
        params: ToolCreateToolParams = ToolCreateToolParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolCreateToolResponse> =
        createTool(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see createTool */
    fun createTool(
        missionId: String,
        params: ToolCreateToolParams = ToolCreateToolParams.none(),
    ): CompletableFuture<ToolCreateToolResponse> =
        createTool(missionId, params, RequestOptions.none())

    /** @see createTool */
    fun createTool(
        params: ToolCreateToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolCreateToolResponse>

    /** @see createTool */
    fun createTool(params: ToolCreateToolParams): CompletableFuture<ToolCreateToolResponse> =
        createTool(params, RequestOptions.none())

    /** @see createTool */
    fun createTool(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolCreateToolResponse> =
        createTool(missionId, ToolCreateToolParams.none(), requestOptions)

    /** Delete a tool from a mission */
    fun deleteTool(toolId: String, params: ToolDeleteToolParams): CompletableFuture<Void?> =
        deleteTool(toolId, params, RequestOptions.none())

    /** @see deleteTool */
    fun deleteTool(
        toolId: String,
        params: ToolDeleteToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteTool(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see deleteTool */
    fun deleteTool(params: ToolDeleteToolParams): CompletableFuture<Void?> =
        deleteTool(params, RequestOptions.none())

    /** @see deleteTool */
    fun deleteTool(
        params: ToolDeleteToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get a specific tool by ID */
    fun getTool(toolId: String, params: ToolGetToolParams): CompletableFuture<ToolGetToolResponse> =
        getTool(toolId, params, RequestOptions.none())

    /** @see getTool */
    fun getTool(
        toolId: String,
        params: ToolGetToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolGetToolResponse> =
        getTool(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see getTool */
    fun getTool(params: ToolGetToolParams): CompletableFuture<ToolGetToolResponse> =
        getTool(params, RequestOptions.none())

    /** @see getTool */
    fun getTool(
        params: ToolGetToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolGetToolResponse>

    /** List all tools for a mission */
    fun listTools(missionId: String): CompletableFuture<ToolListToolsResponse> =
        listTools(missionId, ToolListToolsParams.none())

    /** @see listTools */
    fun listTools(
        missionId: String,
        params: ToolListToolsParams = ToolListToolsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolListToolsResponse> =
        listTools(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see listTools */
    fun listTools(
        missionId: String,
        params: ToolListToolsParams = ToolListToolsParams.none(),
    ): CompletableFuture<ToolListToolsResponse> =
        listTools(missionId, params, RequestOptions.none())

    /** @see listTools */
    fun listTools(
        params: ToolListToolsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolListToolsResponse>

    /** @see listTools */
    fun listTools(params: ToolListToolsParams): CompletableFuture<ToolListToolsResponse> =
        listTools(params, RequestOptions.none())

    /** @see listTools */
    fun listTools(
        missionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ToolListToolsResponse> =
        listTools(missionId, ToolListToolsParams.none(), requestOptions)

    /** Update a tool definition */
    fun updateTool(
        toolId: String,
        params: ToolUpdateToolParams,
    ): CompletableFuture<ToolUpdateToolResponse> = updateTool(toolId, params, RequestOptions.none())

    /** @see updateTool */
    fun updateTool(
        toolId: String,
        params: ToolUpdateToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolUpdateToolResponse> =
        updateTool(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see updateTool */
    fun updateTool(params: ToolUpdateToolParams): CompletableFuture<ToolUpdateToolResponse> =
        updateTool(params, RequestOptions.none())

    /** @see updateTool */
    fun updateTool(
        params: ToolUpdateToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ToolUpdateToolResponse>

    /** A view of [ToolServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/tools`, but is otherwise
         * the same as [ToolServiceAsync.createTool].
         */
        fun createTool(
            missionId: String
        ): CompletableFuture<HttpResponseFor<ToolCreateToolResponse>> =
            createTool(missionId, ToolCreateToolParams.none())

        /** @see createTool */
        fun createTool(
            missionId: String,
            params: ToolCreateToolParams = ToolCreateToolParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolCreateToolResponse>> =
            createTool(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see createTool */
        fun createTool(
            missionId: String,
            params: ToolCreateToolParams = ToolCreateToolParams.none(),
        ): CompletableFuture<HttpResponseFor<ToolCreateToolResponse>> =
            createTool(missionId, params, RequestOptions.none())

        /** @see createTool */
        fun createTool(
            params: ToolCreateToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolCreateToolResponse>>

        /** @see createTool */
        fun createTool(
            params: ToolCreateToolParams
        ): CompletableFuture<HttpResponseFor<ToolCreateToolResponse>> =
            createTool(params, RequestOptions.none())

        /** @see createTool */
        fun createTool(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolCreateToolResponse>> =
            createTool(missionId, ToolCreateToolParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/missions/{mission_id}/tools/{tool_id}`, but
         * is otherwise the same as [ToolServiceAsync.deleteTool].
         */
        fun deleteTool(
            toolId: String,
            params: ToolDeleteToolParams,
        ): CompletableFuture<HttpResponse> = deleteTool(toolId, params, RequestOptions.none())

        /** @see deleteTool */
        fun deleteTool(
            toolId: String,
            params: ToolDeleteToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteTool(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see deleteTool */
        fun deleteTool(params: ToolDeleteToolParams): CompletableFuture<HttpResponse> =
            deleteTool(params, RequestOptions.none())

        /** @see deleteTool */
        fun deleteTool(
            params: ToolDeleteToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/tools/{tool_id}`, but is
         * otherwise the same as [ToolServiceAsync.getTool].
         */
        fun getTool(
            toolId: String,
            params: ToolGetToolParams,
        ): CompletableFuture<HttpResponseFor<ToolGetToolResponse>> =
            getTool(toolId, params, RequestOptions.none())

        /** @see getTool */
        fun getTool(
            toolId: String,
            params: ToolGetToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolGetToolResponse>> =
            getTool(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see getTool */
        fun getTool(
            params: ToolGetToolParams
        ): CompletableFuture<HttpResponseFor<ToolGetToolResponse>> =
            getTool(params, RequestOptions.none())

        /** @see getTool */
        fun getTool(
            params: ToolGetToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolGetToolResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/tools`, but is otherwise
         * the same as [ToolServiceAsync.listTools].
         */
        fun listTools(
            missionId: String
        ): CompletableFuture<HttpResponseFor<ToolListToolsResponse>> =
            listTools(missionId, ToolListToolsParams.none())

        /** @see listTools */
        fun listTools(
            missionId: String,
            params: ToolListToolsParams = ToolListToolsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolListToolsResponse>> =
            listTools(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see listTools */
        fun listTools(
            missionId: String,
            params: ToolListToolsParams = ToolListToolsParams.none(),
        ): CompletableFuture<HttpResponseFor<ToolListToolsResponse>> =
            listTools(missionId, params, RequestOptions.none())

        /** @see listTools */
        fun listTools(
            params: ToolListToolsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolListToolsResponse>>

        /** @see listTools */
        fun listTools(
            params: ToolListToolsParams
        ): CompletableFuture<HttpResponseFor<ToolListToolsResponse>> =
            listTools(params, RequestOptions.none())

        /** @see listTools */
        fun listTools(
            missionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ToolListToolsResponse>> =
            listTools(missionId, ToolListToolsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/missions/{mission_id}/tools/{tool_id}`, but is
         * otherwise the same as [ToolServiceAsync.updateTool].
         */
        fun updateTool(
            toolId: String,
            params: ToolUpdateToolParams,
        ): CompletableFuture<HttpResponseFor<ToolUpdateToolResponse>> =
            updateTool(toolId, params, RequestOptions.none())

        /** @see updateTool */
        fun updateTool(
            toolId: String,
            params: ToolUpdateToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolUpdateToolResponse>> =
            updateTool(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see updateTool */
        fun updateTool(
            params: ToolUpdateToolParams
        ): CompletableFuture<HttpResponseFor<ToolUpdateToolResponse>> =
            updateTool(params, RequestOptions.none())

        /** @see updateTool */
        fun updateTool(
            params: ToolUpdateToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ToolUpdateToolResponse>>
    }
}
