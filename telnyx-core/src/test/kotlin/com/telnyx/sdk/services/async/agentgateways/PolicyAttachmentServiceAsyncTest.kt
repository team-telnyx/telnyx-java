// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentCreateParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PolicyAttachmentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val policyAttachmentServiceAsync = client.agentGateways().policyAttachments()

        val agentGatewayPolicyAttachmentResponseFuture =
            policyAttachmentServiceAsync.create(
                PolicyAttachmentCreateParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .policy("strict")
                    .default_(true)
                    .addModel("GLM-5.3*")
                    .priority(10L)
                    .build()
            )

        val agentGatewayPolicyAttachmentResponse = agentGatewayPolicyAttachmentResponseFuture.get()
        agentGatewayPolicyAttachmentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val policyAttachmentServiceAsync = client.agentGateways().policyAttachments()

        val policyAttachmentsFuture =
            policyAttachmentServiceAsync.list("32ce035d-3165-4031-b1a7-a7c0c259590a")

        val policyAttachments = policyAttachmentsFuture.get()
        policyAttachments.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val policyAttachmentServiceAsync = client.agentGateways().policyAttachments()

        val agentGatewayPolicyAttachmentResponseFuture =
            policyAttachmentServiceAsync.delete(
                PolicyAttachmentDeleteParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .attachmentId("3394712f-2ad5-428a-8a3d-7a08d4b2906d")
                    .build()
            )

        val agentGatewayPolicyAttachmentResponse = agentGatewayPolicyAttachmentResponseFuture.get()
        agentGatewayPolicyAttachmentResponse.validate()
    }
}
