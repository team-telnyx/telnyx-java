// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.mcpservers.McpServer
import com.telnyx.sdk.models.ai.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerDeleteParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerListPage
import com.telnyx.sdk.models.ai.mcpservers.McpServerListParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerRetrieveParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerUpdateParams
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
    fun create(params: McpServerCreateParams): McpServer = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: McpServerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServer

    /** Retrieve details for a specific MCP server. */
    fun retrieve(mcpServerId: String): McpServer =
        retrieve(mcpServerId, McpServerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        mcpServerId: String,
        params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServer = retrieve(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        mcpServerId: String,
        params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
    ): McpServer = retrieve(mcpServerId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: McpServerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServer

    /** @see retrieve */
    fun retrieve(params: McpServerRetrieveParams): McpServer =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(mcpServerId: String, requestOptions: RequestOptions): McpServer =
        retrieve(mcpServerId, McpServerRetrieveParams.none(), requestOptions)

    /** Update an existing MCP server. */
    fun update(mcpServerId: String): McpServer = update(mcpServerId, McpServerUpdateParams.none())

    /** @see update */
    fun update(
        mcpServerId: String,
        params: McpServerUpdateParams = McpServerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServer = update(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see update */
    fun update(
        mcpServerId: String,
        params: McpServerUpdateParams = McpServerUpdateParams.none(),
    ): McpServer = update(mcpServerId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: McpServerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServer

    /** @see update */
    fun update(params: McpServerUpdateParams): McpServer = update(params, RequestOptions.none())

    /** @see update */
    fun update(mcpServerId: String, requestOptions: RequestOptions): McpServer =
        update(mcpServerId, McpServerUpdateParams.none(), requestOptions)

    /** Retrieve a list of MCP servers. */
    fun list(): McpServerListPage = list(McpServerListParams.none())

    /** @see list */
    fun list(
        params: McpServerListParams = McpServerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): McpServerListPage

    /** @see list */
    fun list(params: McpServerListParams = McpServerListParams.none()): McpServerListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): McpServerListPage =
        list(McpServerListParams.none(), requestOptions)

    /** Delete a specific MCP server. */
    fun delete(mcpServerId: String) = delete(mcpServerId, McpServerDeleteParams.none())

    /** @see delete */
    fun delete(
        mcpServerId: String,
        params: McpServerDeleteParams = McpServerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see delete */
    fun delete(mcpServerId: String, params: McpServerDeleteParams = McpServerDeleteParams.none()) =
        delete(mcpServerId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: McpServerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: McpServerDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(mcpServerId: String, requestOptions: RequestOptions) =
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
        fun create(params: McpServerCreateParams): HttpResponseFor<McpServer> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: McpServerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServer>

        /**
         * Returns a raw HTTP response for `get /ai/mcp_servers/{mcp_server_id}`, but is otherwise
         * the same as [McpServerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(mcpServerId: String): HttpResponseFor<McpServer> =
            retrieve(mcpServerId, McpServerRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            mcpServerId: String,
            params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServer> =
            retrieve(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            mcpServerId: String,
            params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
        ): HttpResponseFor<McpServer> = retrieve(mcpServerId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: McpServerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: McpServerRetrieveParams): HttpResponseFor<McpServer> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            mcpServerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<McpServer> =
            retrieve(mcpServerId, McpServerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/mcp_servers/{mcp_server_id}`, but is otherwise
         * the same as [McpServerService.update].
         */
        @MustBeClosed
        fun update(mcpServerId: String): HttpResponseFor<McpServer> =
            update(mcpServerId, McpServerUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            mcpServerId: String,
            params: McpServerUpdateParams = McpServerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServer> =
            update(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            mcpServerId: String,
            params: McpServerUpdateParams = McpServerUpdateParams.none(),
        ): HttpResponseFor<McpServer> = update(mcpServerId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: McpServerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServer>

        /** @see update */
        @MustBeClosed
        fun update(params: McpServerUpdateParams): HttpResponseFor<McpServer> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            mcpServerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<McpServer> =
            update(mcpServerId, McpServerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/mcp_servers`, but is otherwise the same as
         * [McpServerService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<McpServerListPage> = list(McpServerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: McpServerListParams = McpServerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<McpServerListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: McpServerListParams = McpServerListParams.none()
        ): HttpResponseFor<McpServerListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<McpServerListPage> =
            list(McpServerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/mcp_servers/{mcp_server_id}`, but is
         * otherwise the same as [McpServerService.delete].
         */
        @MustBeClosed
        fun delete(mcpServerId: String): HttpResponse =
            delete(mcpServerId, McpServerDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            mcpServerId: String,
            params: McpServerDeleteParams = McpServerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            mcpServerId: String,
            params: McpServerDeleteParams = McpServerDeleteParams.none(),
        ): HttpResponse = delete(mcpServerId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: McpServerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: McpServerDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(mcpServerId: String, requestOptions: RequestOptions): HttpResponse =
            delete(mcpServerId, McpServerDeleteParams.none(), requestOptions)
    }
}
