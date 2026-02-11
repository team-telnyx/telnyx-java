// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface ToolService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService

    /** Create a new tool for a mission */
    fun createTool(missionId: String): ToolCreateToolResponse =
        createTool(missionId, ToolCreateToolParams.none())

    /** @see createTool */
    fun createTool(
        missionId: String,
        params: ToolCreateToolParams = ToolCreateToolParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolCreateToolResponse =
        createTool(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see createTool */
    fun createTool(
        missionId: String,
        params: ToolCreateToolParams = ToolCreateToolParams.none(),
    ): ToolCreateToolResponse = createTool(missionId, params, RequestOptions.none())

    /** @see createTool */
    fun createTool(
        params: ToolCreateToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolCreateToolResponse

    /** @see createTool */
    fun createTool(params: ToolCreateToolParams): ToolCreateToolResponse =
        createTool(params, RequestOptions.none())

    /** @see createTool */
    fun createTool(missionId: String, requestOptions: RequestOptions): ToolCreateToolResponse =
        createTool(missionId, ToolCreateToolParams.none(), requestOptions)

    /** Delete a tool from a mission */
    fun deleteTool(toolId: String, params: ToolDeleteToolParams) =
        deleteTool(toolId, params, RequestOptions.none())

    /** @see deleteTool */
    fun deleteTool(
        toolId: String,
        params: ToolDeleteToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteTool(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see deleteTool */
    fun deleteTool(params: ToolDeleteToolParams) = deleteTool(params, RequestOptions.none())

    /** @see deleteTool */
    fun deleteTool(
        params: ToolDeleteToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get a specific tool by ID */
    fun getTool(toolId: String, params: ToolGetToolParams): ToolGetToolResponse =
        getTool(toolId, params, RequestOptions.none())

    /** @see getTool */
    fun getTool(
        toolId: String,
        params: ToolGetToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolGetToolResponse = getTool(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see getTool */
    fun getTool(params: ToolGetToolParams): ToolGetToolResponse =
        getTool(params, RequestOptions.none())

    /** @see getTool */
    fun getTool(
        params: ToolGetToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolGetToolResponse

    /** List all tools for a mission */
    fun listTools(missionId: String): ToolListToolsResponse =
        listTools(missionId, ToolListToolsParams.none())

    /** @see listTools */
    fun listTools(
        missionId: String,
        params: ToolListToolsParams = ToolListToolsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolListToolsResponse =
        listTools(params.toBuilder().missionId(missionId).build(), requestOptions)

    /** @see listTools */
    fun listTools(
        missionId: String,
        params: ToolListToolsParams = ToolListToolsParams.none(),
    ): ToolListToolsResponse = listTools(missionId, params, RequestOptions.none())

    /** @see listTools */
    fun listTools(
        params: ToolListToolsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolListToolsResponse

    /** @see listTools */
    fun listTools(params: ToolListToolsParams): ToolListToolsResponse =
        listTools(params, RequestOptions.none())

    /** @see listTools */
    fun listTools(missionId: String, requestOptions: RequestOptions): ToolListToolsResponse =
        listTools(missionId, ToolListToolsParams.none(), requestOptions)

    /** Update a tool definition */
    fun updateTool(toolId: String, params: ToolUpdateToolParams): ToolUpdateToolResponse =
        updateTool(toolId, params, RequestOptions.none())

    /** @see updateTool */
    fun updateTool(
        toolId: String,
        params: ToolUpdateToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolUpdateToolResponse =
        updateTool(params.toBuilder().toolId(toolId).build(), requestOptions)

    /** @see updateTool */
    fun updateTool(params: ToolUpdateToolParams): ToolUpdateToolResponse =
        updateTool(params, RequestOptions.none())

    /** @see updateTool */
    fun updateTool(
        params: ToolUpdateToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolUpdateToolResponse

    /** A view of [ToolService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/missions/{mission_id}/tools`, but is otherwise
         * the same as [ToolService.createTool].
         */
        @MustBeClosed
        fun createTool(missionId: String): HttpResponseFor<ToolCreateToolResponse> =
            createTool(missionId, ToolCreateToolParams.none())

        /** @see createTool */
        @MustBeClosed
        fun createTool(
            missionId: String,
            params: ToolCreateToolParams = ToolCreateToolParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolCreateToolResponse> =
            createTool(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see createTool */
        @MustBeClosed
        fun createTool(
            missionId: String,
            params: ToolCreateToolParams = ToolCreateToolParams.none(),
        ): HttpResponseFor<ToolCreateToolResponse> =
            createTool(missionId, params, RequestOptions.none())

        /** @see createTool */
        @MustBeClosed
        fun createTool(
            params: ToolCreateToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolCreateToolResponse>

        /** @see createTool */
        @MustBeClosed
        fun createTool(params: ToolCreateToolParams): HttpResponseFor<ToolCreateToolResponse> =
            createTool(params, RequestOptions.none())

        /** @see createTool */
        @MustBeClosed
        fun createTool(
            missionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolCreateToolResponse> =
            createTool(missionId, ToolCreateToolParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/missions/{mission_id}/tools/{tool_id}`, but
         * is otherwise the same as [ToolService.deleteTool].
         */
        @MustBeClosed
        fun deleteTool(toolId: String, params: ToolDeleteToolParams): HttpResponse =
            deleteTool(toolId, params, RequestOptions.none())

        /** @see deleteTool */
        @MustBeClosed
        fun deleteTool(
            toolId: String,
            params: ToolDeleteToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteTool(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see deleteTool */
        @MustBeClosed
        fun deleteTool(params: ToolDeleteToolParams): HttpResponse =
            deleteTool(params, RequestOptions.none())

        /** @see deleteTool */
        @MustBeClosed
        fun deleteTool(
            params: ToolDeleteToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/tools/{tool_id}`, but is
         * otherwise the same as [ToolService.getTool].
         */
        @MustBeClosed
        fun getTool(
            toolId: String,
            params: ToolGetToolParams,
        ): HttpResponseFor<ToolGetToolResponse> = getTool(toolId, params, RequestOptions.none())

        /** @see getTool */
        @MustBeClosed
        fun getTool(
            toolId: String,
            params: ToolGetToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolGetToolResponse> =
            getTool(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see getTool */
        @MustBeClosed
        fun getTool(params: ToolGetToolParams): HttpResponseFor<ToolGetToolResponse> =
            getTool(params, RequestOptions.none())

        /** @see getTool */
        @MustBeClosed
        fun getTool(
            params: ToolGetToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolGetToolResponse>

        /**
         * Returns a raw HTTP response for `get /ai/missions/{mission_id}/tools`, but is otherwise
         * the same as [ToolService.listTools].
         */
        @MustBeClosed
        fun listTools(missionId: String): HttpResponseFor<ToolListToolsResponse> =
            listTools(missionId, ToolListToolsParams.none())

        /** @see listTools */
        @MustBeClosed
        fun listTools(
            missionId: String,
            params: ToolListToolsParams = ToolListToolsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolListToolsResponse> =
            listTools(params.toBuilder().missionId(missionId).build(), requestOptions)

        /** @see listTools */
        @MustBeClosed
        fun listTools(
            missionId: String,
            params: ToolListToolsParams = ToolListToolsParams.none(),
        ): HttpResponseFor<ToolListToolsResponse> =
            listTools(missionId, params, RequestOptions.none())

        /** @see listTools */
        @MustBeClosed
        fun listTools(
            params: ToolListToolsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolListToolsResponse>

        /** @see listTools */
        @MustBeClosed
        fun listTools(params: ToolListToolsParams): HttpResponseFor<ToolListToolsResponse> =
            listTools(params, RequestOptions.none())

        /** @see listTools */
        @MustBeClosed
        fun listTools(
            missionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolListToolsResponse> =
            listTools(missionId, ToolListToolsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/missions/{mission_id}/tools/{tool_id}`, but is
         * otherwise the same as [ToolService.updateTool].
         */
        @MustBeClosed
        fun updateTool(
            toolId: String,
            params: ToolUpdateToolParams,
        ): HttpResponseFor<ToolUpdateToolResponse> =
            updateTool(toolId, params, RequestOptions.none())

        /** @see updateTool */
        @MustBeClosed
        fun updateTool(
            toolId: String,
            params: ToolUpdateToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolUpdateToolResponse> =
            updateTool(params.toBuilder().toolId(toolId).build(), requestOptions)

        /** @see updateTool */
        @MustBeClosed
        fun updateTool(params: ToolUpdateToolParams): HttpResponseFor<ToolUpdateToolResponse> =
            updateTool(params, RequestOptions.none())

        /** @see updateTool */
        @MustBeClosed
        fun updateTool(
            params: ToolUpdateToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolUpdateToolResponse>
    }
}
