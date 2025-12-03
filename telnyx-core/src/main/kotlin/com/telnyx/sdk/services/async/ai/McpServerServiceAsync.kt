// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerCreateResponse
import com.telnyx.sdk.models.ai.mcpservers.McpServerDeleteParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerListParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerListResponse
import com.telnyx.sdk.models.ai.mcpservers.McpServerRetrieveParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerRetrieveResponse
import com.telnyx.sdk.models.ai.mcpservers.McpServerUpdateParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerUpdateResponse
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

    /** Create a new MCP server. */
    fun create(params: McpServerCreateParams): CompletableFuture<McpServerCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: McpServerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerCreateResponse>

    /** Retrieve details for a specific MCP server. */
    fun retrieve(mcpServerId: String): CompletableFuture<McpServerRetrieveResponse> =
        retrieve(mcpServerId, McpServerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        mcpServerId: String,
        params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerRetrieveResponse> =
        retrieve(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        mcpServerId: String,
        params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
    ): CompletableFuture<McpServerRetrieveResponse> =
        retrieve(mcpServerId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: McpServerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: McpServerRetrieveParams): CompletableFuture<McpServerRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        mcpServerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerRetrieveResponse> =
        retrieve(mcpServerId, McpServerRetrieveParams.none(), requestOptions)

    /** Update an existing MCP server. */
    fun update(mcpServerId: String): CompletableFuture<McpServerUpdateResponse> =
        update(mcpServerId, McpServerUpdateParams.none())

    /** @see update */
    fun update(
        mcpServerId: String,
        params: McpServerUpdateParams = McpServerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerUpdateResponse> =
        update(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see update */
    fun update(
        mcpServerId: String,
        params: McpServerUpdateParams = McpServerUpdateParams.none(),
    ): CompletableFuture<McpServerUpdateResponse> =
        update(mcpServerId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: McpServerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<McpServerUpdateResponse>

    /** @see update */
    fun update(params: McpServerUpdateParams): CompletableFuture<McpServerUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        mcpServerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<McpServerUpdateResponse> =
        update(mcpServerId, McpServerUpdateParams.none(), requestOptions)

    /** Retrieve a list of MCP servers. */
    fun list(): CompletableFuture<List<McpServerListResponse>> = list(McpServerListParams.none())

    /** @see list */
    fun list(
        params: McpServerListParams = McpServerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<McpServerListResponse>>

    /** @see list */
    fun list(
        params: McpServerListParams = McpServerListParams.none()
    ): CompletableFuture<List<McpServerListResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<McpServerListResponse>> =
        list(McpServerListParams.none(), requestOptions)

    /** Delete a specific MCP server. */
    fun delete(mcpServerId: String): CompletableFuture<Void?> =
        delete(mcpServerId, McpServerDeleteParams.none())

    /** @see delete */
    fun delete(
        mcpServerId: String,
        params: McpServerDeleteParams = McpServerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

    /** @see delete */
    fun delete(
        mcpServerId: String,
        params: McpServerDeleteParams = McpServerDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(mcpServerId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: McpServerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: McpServerDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(mcpServerId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(mcpServerId, McpServerDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /ai/mcp_servers`, but is otherwise the same as
         * [McpServerServiceAsync.create].
         */
        fun create(
            params: McpServerCreateParams
        ): CompletableFuture<HttpResponseFor<McpServerCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: McpServerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/mcp_servers/{mcp_server_id}`, but is otherwise
         * the same as [McpServerServiceAsync.retrieve].
         */
        fun retrieve(
            mcpServerId: String
        ): CompletableFuture<HttpResponseFor<McpServerRetrieveResponse>> =
            retrieve(mcpServerId, McpServerRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            mcpServerId: String,
            params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerRetrieveResponse>> =
            retrieve(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            mcpServerId: String,
            params: McpServerRetrieveParams = McpServerRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<McpServerRetrieveResponse>> =
            retrieve(mcpServerId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: McpServerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: McpServerRetrieveParams
        ): CompletableFuture<HttpResponseFor<McpServerRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            mcpServerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerRetrieveResponse>> =
            retrieve(mcpServerId, McpServerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/mcp_servers/{mcp_server_id}`, but is otherwise
         * the same as [McpServerServiceAsync.update].
         */
        fun update(
            mcpServerId: String
        ): CompletableFuture<HttpResponseFor<McpServerUpdateResponse>> =
            update(mcpServerId, McpServerUpdateParams.none())

        /** @see update */
        fun update(
            mcpServerId: String,
            params: McpServerUpdateParams = McpServerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerUpdateResponse>> =
            update(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see update */
        fun update(
            mcpServerId: String,
            params: McpServerUpdateParams = McpServerUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<McpServerUpdateResponse>> =
            update(mcpServerId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: McpServerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<McpServerUpdateResponse>>

        /** @see update */
        fun update(
            params: McpServerUpdateParams
        ): CompletableFuture<HttpResponseFor<McpServerUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            mcpServerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<McpServerUpdateResponse>> =
            update(mcpServerId, McpServerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/mcp_servers`, but is otherwise the same as
         * [McpServerServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<McpServerListResponse>>> =
            list(McpServerListParams.none())

        /** @see list */
        fun list(
            params: McpServerListParams = McpServerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<McpServerListResponse>>>

        /** @see list */
        fun list(
            params: McpServerListParams = McpServerListParams.none()
        ): CompletableFuture<HttpResponseFor<List<McpServerListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<McpServerListResponse>>> =
            list(McpServerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/mcp_servers/{mcp_server_id}`, but is
         * otherwise the same as [McpServerServiceAsync.delete].
         */
        fun delete(mcpServerId: String): CompletableFuture<HttpResponse> =
            delete(mcpServerId, McpServerDeleteParams.none())

        /** @see delete */
        fun delete(
            mcpServerId: String,
            params: McpServerDeleteParams = McpServerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().mcpServerId(mcpServerId).build(), requestOptions)

        /** @see delete */
        fun delete(
            mcpServerId: String,
            params: McpServerDeleteParams = McpServerDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(mcpServerId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: McpServerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: McpServerDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            mcpServerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(mcpServerId, McpServerDeleteParams.none(), requestOptions)
    }
}
