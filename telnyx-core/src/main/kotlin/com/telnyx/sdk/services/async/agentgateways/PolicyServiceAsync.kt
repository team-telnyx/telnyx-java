// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Named sets of guardrails an instance applies to requests. */
interface PolicyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolicyServiceAsync

    /**
     * Creates a named set of guardrails. It applies from the next request on, to the requests that
     * name it in `policies` and to those its
     * [attachments](https://developers.telnyx.com/api-reference/agent-gateway-policy-attachments/attach-a-policy)
     * match.
     */
    fun create(
        instanceId: String,
        params: PolicyCreateParams,
    ): CompletableFuture<AgentGatewayPolicyResponse> =
        create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: PolicyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyResponse> =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(params: PolicyCreateParams): CompletableFuture<AgentGatewayPolicyResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PolicyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyResponse>

    /** Returns one policy, in its current version. */
    fun retrieve(
        name: String,
        params: PolicyRetrieveParams,
    ): CompletableFuture<AgentGatewayPolicyResponse> = retrieve(name, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        name: String,
        params: PolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyResponse> =
        retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: PolicyRetrieveParams): CompletableFuture<AgentGatewayPolicyResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyResponse>

    /**
     * Changes a policy, which publishes a new version of it. A field left out stays as it is;
     * `guardrails` and `pipeline` are replaced whole, and `model: null` removes the condition.
     */
    fun update(
        name: String,
        params: PolicyUpdateParams,
    ): CompletableFuture<AgentGatewayPolicyResponse> = update(name, params, RequestOptions.none())

    /** @see update */
    fun update(
        name: String,
        params: PolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyResponse> =
        update(params.toBuilder().name(name).build(), requestOptions)

    /** @see update */
    fun update(params: PolicyUpdateParams): CompletableFuture<AgentGatewayPolicyResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyResponse>

    /** Lists the instance's policies, each in its current version. */
    fun list(instanceId: String): CompletableFuture<PolicyListResponse> =
        list(instanceId, PolicyListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: PolicyListParams = PolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PolicyListResponse> =
        list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(
        instanceId: String,
        params: PolicyListParams = PolicyListParams.none(),
    ): CompletableFuture<PolicyListResponse> = list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PolicyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PolicyListResponse>

    /** @see list */
    fun list(params: PolicyListParams): CompletableFuture<PolicyListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        instanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PolicyListResponse> =
        list(instanceId, PolicyListParams.none(), requestOptions)

    /**
     * Deletes a policy and every version of it, and returns it as it was. A policy that an
     * attachment names, or that another policy builds on, cannot be deleted.
     */
    fun delete(
        name: String,
        params: PolicyDeleteParams,
    ): CompletableFuture<AgentGatewayPolicyResponse> = delete(name, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        name: String,
        params: PolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyResponse> =
        delete(params.toBuilder().name(name).build(), requestOptions)

    /** @see delete */
    fun delete(params: PolicyDeleteParams): CompletableFuture<AgentGatewayPolicyResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyResponse>

    /**
     * A view of [PolicyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PolicyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/policies`, but is
         * otherwise the same as [PolicyServiceAsync.create].
         */
        fun create(
            instanceId: String,
            params: PolicyCreateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            instanceId: String,
            params: PolicyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: PolicyCreateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PolicyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/policies/{name}`, but
         * is otherwise the same as [PolicyServiceAsync.retrieve].
         */
        fun retrieve(
            name: String,
            params: PolicyRetrieveParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            retrieve(name, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            name: String,
            params: PolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: PolicyRetrieveParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>>

        /**
         * Returns a raw HTTP response for `patch /agent_gateways/{instance_id}/policies/{name}`,
         * but is otherwise the same as [PolicyServiceAsync.update].
         */
        fun update(
            name: String,
            params: PolicyUpdateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            update(name, params, RequestOptions.none())

        /** @see update */
        fun update(
            name: String,
            params: PolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            update(params.toBuilder().name(name).build(), requestOptions)

        /** @see update */
        fun update(
            params: PolicyUpdateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/policies`, but is
         * otherwise the same as [PolicyServiceAsync.list].
         */
        fun list(instanceId: String): CompletableFuture<HttpResponseFor<PolicyListResponse>> =
            list(instanceId, PolicyListParams.none())

        /** @see list */
        fun list(
            instanceId: String,
            params: PolicyListParams = PolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PolicyListResponse>> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        fun list(
            instanceId: String,
            params: PolicyListParams = PolicyListParams.none(),
        ): CompletableFuture<HttpResponseFor<PolicyListResponse>> =
            list(instanceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PolicyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PolicyListResponse>>

        /** @see list */
        fun list(params: PolicyListParams): CompletableFuture<HttpResponseFor<PolicyListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PolicyListResponse>> =
            list(instanceId, PolicyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent_gateways/{instance_id}/policies/{name}`,
         * but is otherwise the same as [PolicyServiceAsync.delete].
         */
        fun delete(
            name: String,
            params: PolicyDeleteParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            delete(name, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            name: String,
            params: PolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            delete(params.toBuilder().name(name).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: PolicyDeleteParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyResponse>>
    }
}
