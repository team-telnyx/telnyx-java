// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.policyattachments.AgentGatewayPolicyAttachmentResponse
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentCreateParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentDeleteParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentListParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Where an instance applies each policy. */
interface PolicyAttachmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolicyAttachmentServiceAsync

    /**
     * Applies a policy to every request, or to the requests for the models named. It applies from
     * the next request on.
     */
    fun create(
        instanceId: String,
        params: PolicyAttachmentCreateParams,
    ): CompletableFuture<AgentGatewayPolicyAttachmentResponse> =
        create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: PolicyAttachmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyAttachmentResponse> =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(
        params: PolicyAttachmentCreateParams
    ): CompletableFuture<AgentGatewayPolicyAttachmentResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PolicyAttachmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyAttachmentResponse>

    /** Lists where the instance applies each policy. */
    fun list(instanceId: String): CompletableFuture<PolicyAttachmentListResponse> =
        list(instanceId, PolicyAttachmentListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: PolicyAttachmentListParams = PolicyAttachmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PolicyAttachmentListResponse> =
        list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(
        instanceId: String,
        params: PolicyAttachmentListParams = PolicyAttachmentListParams.none(),
    ): CompletableFuture<PolicyAttachmentListResponse> =
        list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PolicyAttachmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PolicyAttachmentListResponse>

    /** @see list */
    fun list(params: PolicyAttachmentListParams): CompletableFuture<PolicyAttachmentListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        instanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PolicyAttachmentListResponse> =
        list(instanceId, PolicyAttachmentListParams.none(), requestOptions)

    /** Removes an attachment and returns it as it was. The policy stays. */
    fun delete(
        attachmentId: String,
        params: PolicyAttachmentDeleteParams,
    ): CompletableFuture<AgentGatewayPolicyAttachmentResponse> =
        delete(attachmentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        attachmentId: String,
        params: PolicyAttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyAttachmentResponse> =
        delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: PolicyAttachmentDeleteParams
    ): CompletableFuture<AgentGatewayPolicyAttachmentResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PolicyAttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentGatewayPolicyAttachmentResponse>

    /**
     * A view of [PolicyAttachmentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PolicyAttachmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/policy_attachments`,
         * but is otherwise the same as [PolicyAttachmentServiceAsync.create].
         */
        fun create(
            instanceId: String,
            params: PolicyAttachmentCreateParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyAttachmentResponse>> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            instanceId: String,
            params: PolicyAttachmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyAttachmentResponse>> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: PolicyAttachmentCreateParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyAttachmentResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PolicyAttachmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyAttachmentResponse>>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/policy_attachments`,
         * but is otherwise the same as [PolicyAttachmentServiceAsync.list].
         */
        fun list(
            instanceId: String
        ): CompletableFuture<HttpResponseFor<PolicyAttachmentListResponse>> =
            list(instanceId, PolicyAttachmentListParams.none())

        /** @see list */
        fun list(
            instanceId: String,
            params: PolicyAttachmentListParams = PolicyAttachmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PolicyAttachmentListResponse>> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        fun list(
            instanceId: String,
            params: PolicyAttachmentListParams = PolicyAttachmentListParams.none(),
        ): CompletableFuture<HttpResponseFor<PolicyAttachmentListResponse>> =
            list(instanceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PolicyAttachmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PolicyAttachmentListResponse>>

        /** @see list */
        fun list(
            params: PolicyAttachmentListParams
        ): CompletableFuture<HttpResponseFor<PolicyAttachmentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PolicyAttachmentListResponse>> =
            list(instanceId, PolicyAttachmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /agent_gateways/{instance_id}/policy_attachments/{attachment_id}`, but is otherwise the
         * same as [PolicyAttachmentServiceAsync.delete].
         */
        fun delete(
            attachmentId: String,
            params: PolicyAttachmentDeleteParams,
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyAttachmentResponse>> =
            delete(attachmentId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            attachmentId: String,
            params: PolicyAttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyAttachmentResponse>> =
            delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: PolicyAttachmentDeleteParams
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyAttachmentResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PolicyAttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentGatewayPolicyAttachmentResponse>>
    }
}
