// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.agentgateways.policyattachments.AgentGatewayPolicyAttachmentResponse
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentCreateParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentDeleteParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentListParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentListResponse
import java.util.function.Consumer

/** Where an instance applies each policy. */
interface PolicyAttachmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PolicyAttachmentService

    /**
     * Applies a policy to every request, or to the requests for the models named. It applies from
     * the next request on.
     */
    fun create(
        instanceId: String,
        params: PolicyAttachmentCreateParams,
    ): AgentGatewayPolicyAttachmentResponse = create(instanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        instanceId: String,
        params: PolicyAttachmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyAttachmentResponse =
        create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see create */
    fun create(params: PolicyAttachmentCreateParams): AgentGatewayPolicyAttachmentResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PolicyAttachmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyAttachmentResponse

    /** Lists where the instance applies each policy. */
    fun list(instanceId: String): PolicyAttachmentListResponse =
        list(instanceId, PolicyAttachmentListParams.none())

    /** @see list */
    fun list(
        instanceId: String,
        params: PolicyAttachmentListParams = PolicyAttachmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PolicyAttachmentListResponse =
        list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

    /** @see list */
    fun list(
        instanceId: String,
        params: PolicyAttachmentListParams = PolicyAttachmentListParams.none(),
    ): PolicyAttachmentListResponse = list(instanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PolicyAttachmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PolicyAttachmentListResponse

    /** @see list */
    fun list(params: PolicyAttachmentListParams): PolicyAttachmentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(instanceId: String, requestOptions: RequestOptions): PolicyAttachmentListResponse =
        list(instanceId, PolicyAttachmentListParams.none(), requestOptions)

    /** Removes an attachment and returns it as it was. The policy stays. */
    fun delete(
        attachmentId: String,
        params: PolicyAttachmentDeleteParams,
    ): AgentGatewayPolicyAttachmentResponse = delete(attachmentId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        attachmentId: String,
        params: PolicyAttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyAttachmentResponse =
        delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PolicyAttachmentDeleteParams): AgentGatewayPolicyAttachmentResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PolicyAttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentGatewayPolicyAttachmentResponse

    /**
     * A view of [PolicyAttachmentService] that provides access to raw HTTP responses for each
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
        ): PolicyAttachmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent_gateways/{instance_id}/policy_attachments`,
         * but is otherwise the same as [PolicyAttachmentService.create].
         */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: PolicyAttachmentCreateParams,
        ): HttpResponseFor<AgentGatewayPolicyAttachmentResponse> =
            create(instanceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            instanceId: String,
            params: PolicyAttachmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyAttachmentResponse> =
            create(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: PolicyAttachmentCreateParams
        ): HttpResponseFor<AgentGatewayPolicyAttachmentResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PolicyAttachmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyAttachmentResponse>

        /**
         * Returns a raw HTTP response for `get /agent_gateways/{instance_id}/policy_attachments`,
         * but is otherwise the same as [PolicyAttachmentService.list].
         */
        @MustBeClosed
        fun list(instanceId: String): HttpResponseFor<PolicyAttachmentListResponse> =
            list(instanceId, PolicyAttachmentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: PolicyAttachmentListParams = PolicyAttachmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PolicyAttachmentListResponse> =
            list(params.toBuilder().instanceId(instanceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            params: PolicyAttachmentListParams = PolicyAttachmentListParams.none(),
        ): HttpResponseFor<PolicyAttachmentListResponse> =
            list(instanceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PolicyAttachmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PolicyAttachmentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PolicyAttachmentListParams
        ): HttpResponseFor<PolicyAttachmentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            instanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PolicyAttachmentListResponse> =
            list(instanceId, PolicyAttachmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /agent_gateways/{instance_id}/policy_attachments/{attachment_id}`, but is otherwise the
         * same as [PolicyAttachmentService.delete].
         */
        @MustBeClosed
        fun delete(
            attachmentId: String,
            params: PolicyAttachmentDeleteParams,
        ): HttpResponseFor<AgentGatewayPolicyAttachmentResponse> =
            delete(attachmentId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            attachmentId: String,
            params: PolicyAttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyAttachmentResponse> =
            delete(params.toBuilder().attachmentId(attachmentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PolicyAttachmentDeleteParams
        ): HttpResponseFor<AgentGatewayPolicyAttachmentResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PolicyAttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentGatewayPolicyAttachmentResponse>
    }
}
