// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.policies.AgentGatewayPolicyResponse
import com.telnyx.sdk.models.agentgateways.policies.PolicyCreateParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyDeleteParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyListParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyListResponse
import com.telnyx.sdk.models.agentgateways.policies.PolicyRetrieveParams
import com.telnyx.sdk.models.agentgateways.policies.PolicyUpdateParams
import java.util.function.Consumer

/** Named sets of guardrails an instance applies to requests. */
interface PolicyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolicyService

    /**
     * Creates a named set of guardrails. It applies from the next request on, to the requests that
     * name it in `policies` and to those its
     * [attachments](https://developers.telnyx.com/api-reference/agent-gateway-policy-attachments/attach-a-policy)
     * match.
     */
    fun create(instanceId: String, params: PolicyCreateParams): AgentGatewayPolicyResponse =
        create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: PolicyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyResponse =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(params: PolicyCreateParams): AgentGatewayPolicyResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PolicyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyResponse

    /** Returns one policy, in its current version. */
    fun retrieve(name: String, params: PolicyRetrieveParams): AgentGatewayPolicyResponse =
        retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: PolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyResponse = retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: PolicyRetrieveParams): AgentGatewayPolicyResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyResponse

    /**
     * Changes a policy, which publishes a new version of it. A field left out stays as it is;
     * `guardrails` and `pipeline` are replaced whole, and `model: null` removes the condition.
     */
    fun update(name: String, params: PolicyUpdateParams): AgentGatewayPolicyResponse =
        update(name, params, RequestOptions.none())

    /** @see update */
    fun update(
        name: String,
        params: PolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyResponse = update(params.toBuilder().name(name).build(), requestOptions)

    /** @see update */
    fun update(params: PolicyUpdateParams): AgentGatewayPolicyResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyResponse

    /** Lists the instance's policies, each in its current version. */
    fun list(instanceId: String): PolicyListResponse = list(instanceId, PolicyListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: PolicyListParams = PolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PolicyListResponse = list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(
        instanceId: String,
        params: PolicyListParams = PolicyListParams.none(),
    ): PolicyListResponse = list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PolicyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PolicyListResponse

    /** @see list */
    fun list(params: PolicyListParams): PolicyListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(instanceId: String, requestOptions: RequestOptions): PolicyListResponse =
        list(instanceId, PolicyListParams.none(), requestOptions)

    /**
     * Deletes a policy and every version of it, and returns it as it was. A policy that an
     * attachment names, or that another policy builds on, cannot be deleted.
     */
    fun delete(name: String, params: PolicyDeleteParams): AgentGatewayPolicyResponse =
        delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        name: String,
        params: PolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyResponse = delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(params: PolicyDeleteParams): AgentGatewayPolicyResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyResponse

    /** A view of [PolicyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolicyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/policies`, but is
         * otherwise the same as [PolicyService.create].
         */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: PolicyCreateParams,
        ): HttpResponseFor<AgentGatewayPolicyResponse> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: PolicyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyResponse> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: PolicyCreateParams): HttpResponseFor<AgentGatewayPolicyResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PolicyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyResponse>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/policies/{name}`, but
         * is otherwise the same as [PolicyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: PolicyRetrieveParams,
        ): HttpResponseFor<AgentGatewayPolicyResponse> =
            retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: PolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyResponse> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PolicyRetrieveParams): HttpResponseFor<AgentGatewayPolicyResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyResponse>

        /**
         * Returns a raw HTTP response for `patch /agent_gateways/{instance_id}/policies/{name}`,
         * but is otherwise the same as [PolicyService.update].
         */
        @MustBeClosed
        fun update(
            name: String,
            params: PolicyUpdateParams,
        ): HttpResponseFor<AgentGatewayPolicyResponse> = update(name, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            name: String,
            params: PolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyResponse> =
            update(params.toBuilder().name(name).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PolicyUpdateParams): HttpResponseFor<AgentGatewayPolicyResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyResponse>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/policies`, but is
         * otherwise the same as [PolicyService.list].
         */
        @MustBeClosed
        fun list(instanceId: String): HttpResponseFor<PolicyListResponse> =
            list(instanceId, PolicyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: PolicyListParams = PolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PolicyListResponse> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: PolicyListParams = PolicyListParams.none(),
        ): HttpResponseFor<PolicyListResponse> = list(instanceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PolicyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PolicyListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: PolicyListParams): HttpResponseFor<PolicyListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PolicyListResponse> =
            list(instanceId, PolicyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent_gateways/{instance_id}/policies/{name}`,
         * but is otherwise the same as [PolicyService.delete].
         */
        @MustBeClosed
        fun delete(
            name: String,
            params: PolicyDeleteParams,
        ): HttpResponseFor<AgentGatewayPolicyResponse> = delete(name, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            name: String,
            params: PolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyResponse> =
            delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: PolicyDeleteParams): HttpResponseFor<AgentGatewayPolicyResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyResponse>
    }
}
