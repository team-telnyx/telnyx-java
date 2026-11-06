// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways.keys

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.keys.toolpermissions.AgentGatewayToolPermissionsResponse
import com.telnyx.sdk.models.agentgateways.keys.toolpermissions.ToolPermissionCreateParams
import com.telnyx.sdk.models.agentgateways.keys.toolpermissions.ToolPermissionListParams
import java.util.function.Consumer

/** The MCP servers and tools a key or team may use. */
interface ToolPermissionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ToolPermissionService

    /**
     * Replaces the grant whole and returns it. Every server must be one of the instance's MCP
     * servers or APIs, named once. A key reaches the servers granted to it or to its team, and the
     * servers open to every key; when both grant, only the servers in both. The instance must be
     * `ready`; otherwise the request answers `409`.
     */
    fun create(
        keyId: String,
        params: ToolPermissionCreateParams,
    ): AgentGatewayToolPermissionsResponse = create(keyId, params, RequestOptions.none())

    /** @see create */
    fun create(
        keyId: String,
        params: ToolPermissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayToolPermissionsResponse =
        create(params.toBuilder().keyId(keyId).build(), requestOptions)

    /** @see create */
    fun create(params: ToolPermissionCreateParams): AgentGatewayToolPermissionsResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ToolPermissionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayToolPermissionsResponse

    /**
     * Returns the MCP servers and APIs the key may use, and the tools within each. `servers: []`
     * means none. The instance must be `ready`; otherwise the request answers `409`.
     */
    fun list(keyId: String, params: ToolPermissionListParams): AgentGatewayToolPermissionsResponse =
        list(keyId, params, RequestOptions.none())

    /** @see list */
    fun list(
        keyId: String,
        params: ToolPermissionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayToolPermissionsResponse =
        list(params.toBuilder().keyId(keyId).build(), requestOptions)

    /** @see list */
    fun list(params: ToolPermissionListParams): AgentGatewayToolPermissionsResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ToolPermissionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayToolPermissionsResponse

    /**
     * A view of [ToolPermissionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ToolPermissionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /agent_gateways/{instance_id}/keys/{key_id}/tool_permissions`, but is otherwise the same
         * as [ToolPermissionService.create].
         */
        @MustBeClosed
        fun create(
            keyId: String,
            params: ToolPermissionCreateParams,
        ): HttpResponseFor<AgentGatewayToolPermissionsResponse> =
            create(keyId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            keyId: String,
            params: ToolPermissionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayToolPermissionsResponse> =
            create(params.toBuilder().keyId(keyId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: ToolPermissionCreateParams
        ): HttpResponseFor<AgentGatewayToolPermissionsResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ToolPermissionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayToolPermissionsResponse>

        /**
         * Returns a raw HTTP response for `get
         * /agent_gateways/{instance_id}/keys/{key_id}/tool_permissions`, but is otherwise the same
         * as [ToolPermissionService.list].
         */
        @MustBeClosed
        fun list(
            keyId: String,
            params: ToolPermissionListParams,
        ): HttpResponseFor<AgentGatewayToolPermissionsResponse> =
            list(keyId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            keyId: String,
            params: ToolPermissionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayToolPermissionsResponse> =
            list(params.toBuilder().keyId(keyId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: ToolPermissionListParams
        ): HttpResponseFor<AgentGatewayToolPermissionsResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ToolPermissionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayToolPermissionsResponse>
    }
}
