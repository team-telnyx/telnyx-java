// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerCreateResponse
import com.telnyx.sdk.models.ai.mcpservers.McpServerDeleteParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerDeleteResponse
import com.telnyx.sdk.models.ai.mcpservers.McpServerListParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerListResponse
import com.telnyx.sdk.models.ai.mcpservers.McpServerRetrieveParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerRetrieveResponse
import com.telnyx.sdk.models.ai.mcpservers.McpServerUpdateParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerUpdateResponse
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

    /** Create a new MCP server. */
    fun create(params: McpServerCreateParams): McpServerCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: McpServerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerCreateResponse

    /** Retrieve details for a specific MCP server. */
    fun retrieve(mcpServerId: String): McpServerRetrieveResponse =
        retrieve(mcpServerId, McpServerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        mcpServerId: String,
        params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerRetrieveResponse =
        retrieve(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        mcpServerId: String,
        params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
    ): McpServerRetrieveResponse = retrieve(mcpServerId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: McpServerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: McpServerRetrieveParams): McpServerRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(mcpServerId: String, requestOptions: RequestOptions): McpServerRetrieveResponse =
        retrieve(mcpServerId, McpServerRetrieveParams.none(), requestOptions)

    /** Update an existing MCP server. */
    fun update(mcpServerId: String): McpServerUpdateResponse =
        update(mcpServerId, McpServerUpdateParams.none())

    /** @see update */
    fun update(
        mcpServerId: String,
        params: McpServerUpdateParams = McpServerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerUpdateResponse =
        update(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see update */
    fun update(
        mcpServerId: String,
        params: McpServerUpdateParams = McpServerUpdateParams.none(),
    ): McpServerUpdateResponse = update(mcpServerId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: McpServerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerUpdateResponse

    /** @see update */
    fun update(params: McpServerUpdateParams): McpServerUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(mcpServerId: String, requestOptions: RequestOptions): McpServerUpdateResponse =
        update(mcpServerId, McpServerUpdateParams.none(), requestOptions)

    /** Retrieve a list of MCP servers. */
    fun list(): List<McpServerListResponse> = list(McpServerListParams.none())

    /** @see list */
    fun list(
        params: McpServerListParams = McpServerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<McpServerListResponse>

    /** @see list */
    fun list(
        params: McpServerListParams = McpServerListParams.none()
    ): List<McpServerListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<McpServerListResponse> =
        list(McpServerListParams.none(), requestOptions)

    /** Delete a specific MCP server. */
    fun delete(mcpServerId: String): McpServerDeleteResponse =
        delete(mcpServerId, McpServerDeleteParams.none())

    /** @see delete */
    fun delete(
        mcpServerId: String,
        params: McpServerDeleteParams = McpServerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerDeleteResponse =
        delete(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see delete */
    fun delete(
        mcpServerId: String,
        params: McpServerDeleteParams = McpServerDeleteParams.none(),
    ): McpServerDeleteResponse = delete(mcpServerId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: McpServerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerDeleteResponse

    /** @see delete */
    fun delete(params: McpServerDeleteParams): McpServerDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(mcpServerId: String, requestOptions: RequestOptions): McpServerDeleteResponse =
        delete(mcpServerId, McpServerDeleteParams.none(), requestOptions)

    /** A view of [McpServerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): McpServerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/mcp_servers`, but is otherwise the same as
         * [McpServerService.create].
         */
        @MustBeClosed
        fun create(params: McpServerCreateParams): HttpResponseFor<McpServerCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: McpServerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerCreateResponse>

        /**
         * Returns a raw HTTP response for `get /ai/mcp_servers/{mcp_server_id}`, but is otherwise
         * the same as [McpServerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(mcpServerId: String): HttpResponseFor<McpServerRetrieveResponse> =
            retrieve(mcpServerId, McpServerRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            mcpServerId: String,
            params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerRetrieveResponse> =
            retrieve(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            mcpServerId: String,
            params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
        ): HttpResponseFor<McpServerRetrieveResponse> =
            retrieve(mcpServerId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: McpServerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: McpServerRetrieveParams): HttpResponseFor<McpServerRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            mcpServerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<McpServerRetrieveResponse> =
            retrieve(mcpServerId, McpServerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/mcp_servers/{mcp_server_id}`, but is otherwise
         * the same as [McpServerService.update].
         */
        @MustBeClosed
        fun update(mcpServerId: String): HttpResponseFor<McpServerUpdateResponse> =
            update(mcpServerId, McpServerUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            mcpServerId: String,
            params: McpServerUpdateParams = McpServerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerUpdateResponse> =
            update(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            mcpServerId: String,
            params: McpServerUpdateParams = McpServerUpdateParams.none(),
        ): HttpResponseFor<McpServerUpdateResponse> =
            update(mcpServerId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: McpServerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: McpServerUpdateParams): HttpResponseFor<McpServerUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            mcpServerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<McpServerUpdateResponse> =
            update(mcpServerId, McpServerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/mcp_servers`, but is otherwise the same as
         * [McpServerService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<McpServerListResponse>> = list(McpServerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: McpServerListParams = McpServerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<McpServerListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: McpServerListParams = McpServerListParams.none()
        ): HttpResponseFor<List<McpServerListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<McpServerListResponse>> =
            list(McpServerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/mcp_servers/{mcp_server_id}`, but is
         * otherwise the same as [McpServerService.delete].
         */
        @MustBeClosed
        fun delete(mcpServerId: String): HttpResponseFor<McpServerDeleteResponse> =
            delete(mcpServerId, McpServerDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            mcpServerId: String,
            params: McpServerDeleteParams = McpServerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerDeleteResponse> =
            delete(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            mcpServerId: String,
            params: McpServerDeleteParams = McpServerDeleteParams.none(),
        ): HttpResponseFor<McpServerDeleteResponse> =
            delete(mcpServerId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: McpServerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: McpServerDeleteParams): HttpResponseFor<McpServerDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            mcpServerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<McpServerDeleteResponse> =
            delete(mcpServerId, McpServerDeleteParams.none(), requestOptions)
    }
}
