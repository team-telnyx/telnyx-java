// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.guardrails.AgentGatewayGuardrailResponse
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailCreateParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailDeleteParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailListParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailListResponse
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Checks an instance runs on model and tool requests. */
interface GuardrailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GuardrailServiceAsync

    /**
     * Adds a check the instance runs on model and tool requests. It runs on every request when
     * `always_on`, and otherwise on the requests that name it in `guardrails`. The instance must be
     * `ready`; otherwise the request answers `409`.
     */
    fun create(
        instanceId: String,
        params: GuardrailCreateParams,
    ): CompletableFuture<AgentGatewayGuardrailResponse> =
        create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: GuardrailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayGuardrailResponse> =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(params: GuardrailCreateParams): CompletableFuture<AgentGatewayGuardrailResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GuardrailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayGuardrailResponse>

    /**
     * Changes a guardrail's `name`, `modes`, `always_on`, or `settings`. `settings` is replaced
     * whole, secrets included. The `type` cannot change. The instance must be `ready`; otherwise
     * the request answers `409`.
     */
    fun update(
        guardrailId: String,
        params: GuardrailUpdateParams,
    ): CompletableFuture<AgentGatewayGuardrailResponse> =
        update(guardrailId, params, RequestOptions.none())

    /** @see update */
    fun update(
        guardrailId: String,
        params: GuardrailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayGuardrailResponse> =
        update(params.toBuilder().guardrailId(guardrailId).build(), requestOptions)

    /** @see update */
    fun update(params: GuardrailUpdateParams): CompletableFuture<AgentGatewayGuardrailResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GuardrailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayGuardrailResponse>

    /**
     * Lists the instance's guardrails, without their secrets. The instance must be `ready`;
     * otherwise the request answers `409`.
     */
    fun list(instanceId: String): CompletableFuture<GuardrailListResponse> =
        list(instanceId, GuardrailListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: GuardrailListParams = GuardrailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GuardrailListResponse> =
        list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(
        instanceId: String,
        params: GuardrailListParams = GuardrailListParams.none(),
    ): CompletableFuture<GuardrailListResponse> = list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GuardrailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GuardrailListResponse>

    /** @see list */
    fun list(params: GuardrailListParams): CompletableFuture<GuardrailListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        instanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GuardrailListResponse> =
        list(instanceId, GuardrailListParams.none(), requestOptions)

    /**
     * Removes a guardrail and returns it as it was. The instance must be `ready`; otherwise the
     * request answers `409`.
     */
    fun delete(
        guardrailId: String,
        params: GuardrailDeleteParams,
    ): CompletableFuture<AgentGatewayGuardrailResponse> =
        delete(guardrailId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        guardrailId: String,
        params: GuardrailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayGuardrailResponse> =
        delete(params.toBuilder().guardrailId(guardrailId).build(), requestOptions)

    /** @see delete */
    fun delete(params: GuardrailDeleteParams): CompletableFuture<AgentGatewayGuardrailResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GuardrailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayGuardrailResponse>

    /**
     * A view of [GuardrailServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GuardrailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/guardrails`, but is
         * otherwise the same as [GuardrailServiceAsync.create].
         */
        fun create(
            instanceId: String,
            params: GuardrailCreateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            instanceId: String,
            params: GuardrailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: GuardrailCreateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GuardrailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /agent_gateways/{instance_id}/guardrails/{guardrail_id}`, but is otherwise the same as
         * [GuardrailServiceAsync.update].
         */
        fun update(
            guardrailId: String,
            params: GuardrailUpdateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> =
            update(guardrailId, params, RequestOptions.none())

        /** @see update */
        fun update(
            guardrailId: String,
            params: GuardrailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> =
            update(params.toBuilder().guardrailId(guardrailId).build(), requestOptions)

        /** @see update */
        fun update(
            params: GuardrailUpdateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GuardrailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/guardrails`, but is
         * otherwise the same as [GuardrailServiceAsync.list].
         */
        fun list(instanceId: String): CompletableFuture<HttpResponseFor<GuardrailListResponse>> =
            list(instanceId, GuardrailListParams.none())

        /** @see list */
        fun list(
            instanceId: String,
            params: GuardrailListParams = GuardrailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GuardrailListResponse>> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        fun list(
            instanceId: String,
            params: GuardrailListParams = GuardrailListParams.none(),
        ): CompletableFuture<HttpResponseFor<GuardrailListResponse>> =
            list(instanceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: GuardrailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GuardrailListResponse>>

        /** @see list */
        fun list(
            params: GuardrailListParams
        ): CompletableFuture<HttpResponseFor<GuardrailListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GuardrailListResponse>> =
            list(instanceId, GuardrailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /agent_gateways/{instance_id}/guardrails/{guardrail_id}`, but is otherwise the same as
         * [GuardrailServiceAsync.delete].
         */
        fun delete(
            guardrailId: String,
            params: GuardrailDeleteParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> =
            delete(guardrailId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            guardrailId: String,
            params: GuardrailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> =
            delete(params.toBuilder().guardrailId(guardrailId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: GuardrailDeleteParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GuardrailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayGuardrailResponse>>
    }
}
