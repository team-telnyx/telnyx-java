// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.keys.AgentGatewayKeyResponse
import com.telnyx.sdk.models.agentgateways.keys.KeyCreateParams
import com.telnyx.sdk.models.agentgateways.keys.KeyCreateResponse
import com.telnyx.sdk.models.agentgateways.keys.KeyDeleteParams
import com.telnyx.sdk.models.agentgateways.keys.KeyListParams
import com.telnyx.sdk.models.agentgateways.keys.KeyListResponse
import com.telnyx.sdk.models.agentgateways.keys.KeyUpdateParams
import com.telnyx.sdk.services.blocking.agentgateways.keys.ToolPermissionService
import java.util.function.Consumer

/** Keys on an instance. */
interface KeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyService

    /** The MCP servers and tools a key or team may use. */
    fun toolPermissions(): ToolPermissionService

    /**
     * Issues a key on the instance. The key's value is in this response only. Every field is
     * optional; a key without `models` may use every model the instance serves. The instance must
     * be `ready`; otherwise the request answers `409`.
     */
    fun create(instanceId: String): KeyCreateResponse = create(instanceId, KeyCreateParams.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: KeyCreateParams = KeyCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyCreateResponse = create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(
        instanceId: String,
        params: KeyCreateParams = KeyCreateParams.none(),
    ): KeyCreateResponse = create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: KeyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyCreateResponse

    /** @see create */
    fun create(params: KeyCreateParams): KeyCreateResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(instanceId: String, requestOptions: RequestOptions): KeyCreateResponse =
        create(instanceId, KeyCreateParams.none(), requestOptions)

    /**
     * Changes a key's settings without reissuing it. A field left out stays as it is, and `null`
     * clears it. `models: []` lifts the model restriction. `expires_in` counts from now. Setting
     * `blocked` to `true` makes the instance refuse the key with `401` while keeping its settings
     * and spend; `false` lets it through again. The instance must be `ready`; otherwise the request
     * answers `409`.
     */
    fun update(keyId: String, params: KeyUpdateParams): AgentGatewayKeyResponse =
        update(keyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        keyId: String,
        params: KeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayKeyResponse = update(params.toBuilder().keyId(keyId).build(), requestOptions)

    /** @see update */
    fun update(params: KeyUpdateParams): AgentGatewayKeyResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: KeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayKeyResponse

    /**
     * Lists the instance's keys, without their values. Returns the first 100. The instance must be
     * `ready`; otherwise the request answers `409`.
     */
    fun list(instanceId: String): KeyListResponse = list(instanceId, KeyListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: KeyListParams = KeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyListResponse = list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(instanceId: String, params: KeyListParams = KeyListParams.none()): KeyListResponse =
        list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: KeyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): KeyListResponse

    /** @see list */
    fun list(params: KeyListParams): KeyListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(instanceId: String, requestOptions: RequestOptions): KeyListResponse =
        list(instanceId, KeyListParams.none(), requestOptions)

    /**
     * Revokes a key and returns it as it was, without its value. The instance must be `ready`;
     * otherwise the request answers `409`.
     */
    fun delete(keyId: String, params: KeyDeleteParams): AgentGatewayKeyResponse =
        delete(keyId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        keyId: String,
        params: KeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayKeyResponse = delete(params.toBuilder().keyId(keyId).build(), requestOptions)

    /** @see delete */
    fun delete(params: KeyDeleteParams): AgentGatewayKeyResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: KeyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayKeyResponse

    /** A view of [KeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): KeyService.WithRawResponse

        /** The MCP servers and tools a key or team may use. */
        fun toolPermissions(): ToolPermissionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/keys`, but is
         * otherwise the same as [KeyService.create].
         */
        @MustBeClosed
        fun create(instanceId: String): HttpResponseFor<KeyCreateResponse> =
            create(instanceId, KeyCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: KeyCreateParams = KeyCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyCreateResponse> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: KeyCreateParams = KeyCreateParams.none(),
        ): HttpResponseFor<KeyCreateResponse> = create(instanceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: KeyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(params: KeyCreateParams): HttpResponseFor<KeyCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyCreateResponse> =
            create(instanceId, KeyCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /agent_gateways/{instance_id}/keys/{key_id}`, but
         * is otherwise the same as [KeyService.update].
         */
        @MustBeClosed
        fun update(
            keyId: String,
            params: KeyUpdateParams,
        ): HttpResponseFor<AgentGatewayKeyResponse> = update(keyId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            keyId: String,
            params: KeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayKeyResponse> =
            update(params.toBuilder().keyId(keyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: KeyUpdateParams): HttpResponseFor<AgentGatewayKeyResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: KeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayKeyResponse>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/keys`, but is
         * otherwise the same as [KeyService.list].
         */
        @MustBeClosed
        fun list(instanceId: String): HttpResponseFor<KeyListResponse> =
            list(instanceId, KeyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: KeyListParams = KeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyListResponse> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: KeyListParams = KeyListParams.none(),
        ): HttpResponseFor<KeyListResponse> = list(instanceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: KeyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<KeyListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: KeyListParams): HttpResponseFor<KeyListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<KeyListResponse> = list(instanceId, KeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent_gateways/{instance_id}/keys/{key_id}`, but
         * is otherwise the same as [KeyService.delete].
         */
        @MustBeClosed
        fun delete(
            keyId: String,
            params: KeyDeleteParams,
        ): HttpResponseFor<AgentGatewayKeyResponse> = delete(keyId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            keyId: String,
            params: KeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayKeyResponse> =
            delete(params.toBuilder().keyId(keyId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: KeyDeleteParams): HttpResponseFor<AgentGatewayKeyResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: KeyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayKeyResponse>
    }
}
