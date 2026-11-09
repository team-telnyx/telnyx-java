// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.guardrails.AgentGatewayGuardrailResponse
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailCreateParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailDeleteParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailListParams
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailListResponse
import com.telnyx.sdk.models.agentgateways.guardrails.GuardrailUpdateParams
import java.util.function.Consumer

/** Checks an instance runs on model and tool requests. */
interface GuardrailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GuardrailService

    /**
     * Adds a check the instance runs on model and tool requests. It runs on every request when
     * `always_on`, and otherwise on the requests that name it in `guardrails`. The instance must be
     * `ready`; otherwise the request answers `409`.
     */
    fun create(instanceId: String, params: GuardrailCreateParams): AgentGatewayGuardrailResponse =
        create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: GuardrailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayGuardrailResponse =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(params: GuardrailCreateParams): AgentGatewayGuardrailResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GuardrailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayGuardrailResponse

    /**
     * Changes a guardrail's `name`, `modes`, `always_on`, or `settings`. `settings` is replaced
     * whole, secrets included. The `type` cannot change. The instance must be `ready`; otherwise
     * the request answers `409`.
     */
    fun update(guardrailId: String, params: GuardrailUpdateParams): AgentGatewayGuardrailResponse =
        update(guardrailId, params, RequestOptions.none())

    /** @see update */
    fun update(
        guardrailId: String,
        params: GuardrailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayGuardrailResponse =
        update(params.toBuilder().guardrailId(guardrailId).build(), requestOptions)

    /** @see update */
    fun update(params: GuardrailUpdateParams): AgentGatewayGuardrailResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GuardrailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayGuardrailResponse

    /**
     * Lists the instance's guardrails, without their secrets. The instance must be `ready`;
     * otherwise the request answers `409`.
     */
    fun list(instanceId: String): GuardrailListResponse =
        list(instanceId, GuardrailListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: GuardrailListParams = GuardrailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GuardrailListResponse =
        list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(
        instanceId: String,
        params: GuardrailListParams = GuardrailListParams.none(),
    ): GuardrailListResponse = list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GuardrailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GuardrailListResponse

    /** @see list */
    fun list(params: GuardrailListParams): GuardrailListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(instanceId: String, requestOptions: RequestOptions): GuardrailListResponse =
        list(instanceId, GuardrailListParams.none(), requestOptions)

    /**
     * Removes a guardrail and returns it as it was. The instance must be `ready`; otherwise the
     * request answers `409`.
     */
    fun delete(guardrailId: String, params: GuardrailDeleteParams): AgentGatewayGuardrailResponse =
        delete(guardrailId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        guardrailId: String,
        params: GuardrailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayGuardrailResponse =
        delete(params.toBuilder().guardrailId(guardrailId).build(), requestOptions)

    /** @see delete */
    fun delete(params: GuardrailDeleteParams): AgentGatewayGuardrailResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GuardrailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayGuardrailResponse

    /** A view of [GuardrailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GuardrailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/guardrails`, but is
         * otherwise the same as [GuardrailService.create].
         */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: GuardrailCreateParams,
        ): HttpResponseFor<AgentGatewayGuardrailResponse> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: GuardrailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayGuardrailResponse> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: GuardrailCreateParams): HttpResponseFor<AgentGatewayGuardrailResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: GuardrailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayGuardrailResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /agent_gateways/{instance_id}/guardrails/{guardrail_id}`, but is otherwise the same as
         * [GuardrailService.update].
         */
        @MustBeClosed
        fun update(
            guardrailId: String,
            params: GuardrailUpdateParams,
        ): HttpResponseFor<AgentGatewayGuardrailResponse> =
            update(guardrailId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            guardrailId: String,
            params: GuardrailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayGuardrailResponse> =
            update(params.toBuilder().guardrailId(guardrailId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: GuardrailUpdateParams): HttpResponseFor<AgentGatewayGuardrailResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: GuardrailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayGuardrailResponse>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/guardrails`, but is
         * otherwise the same as [GuardrailService.list].
         */
        @MustBeClosed
        fun list(instanceId: String): HttpResponseFor<GuardrailListResponse> =
            list(instanceId, GuardrailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: GuardrailListParams = GuardrailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GuardrailListResponse> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: GuardrailListParams = GuardrailListParams.none(),
        ): HttpResponseFor<GuardrailListResponse> = list(instanceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GuardrailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GuardrailListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: GuardrailListParams): HttpResponseFor<GuardrailListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GuardrailListResponse> =
            list(instanceId, GuardrailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /agent_gateways/{instance_id}/guardrails/{guardrail_id}`, but is otherwise the same as
         * [GuardrailService.delete].
         */
        @MustBeClosed
        fun delete(
            guardrailId: String,
            params: GuardrailDeleteParams,
        ): HttpResponseFor<AgentGatewayGuardrailResponse> =
            delete(guardrailId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            guardrailId: String,
            params: GuardrailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayGuardrailResponse> =
            delete(params.toBuilder().guardrailId(guardrailId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: GuardrailDeleteParams): HttpResponseFor<AgentGatewayGuardrailResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: GuardrailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayGuardrailResponse>
    }
}
