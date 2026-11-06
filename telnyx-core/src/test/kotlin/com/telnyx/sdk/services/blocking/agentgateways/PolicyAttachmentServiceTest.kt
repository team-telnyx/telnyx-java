// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentCreateParams
import com.telnyx.sdk.models.agentgateways.policyattachments.PolicyAttachmentDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PolicyAttachmentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val policyAttachmentService = client.agentGateways().policyAttachments()

        val agentGatewayPolicyAttachmentResponse =
            policyAttachmentService.create(
                PolicyAttachmentCreateParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .policy("strict")
                    .isDefault(true)
                    .addModel("GLM-5.3*")
                    .priority(10L)
                    .build()
            )

        agentGatewayPolicyAttachmentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val policyAttachmentService = client.agentGateways().policyAttachments()

        val policyAttachments = policyAttachmentService.list("32ce035d-3165-4031-b1a7-a7c0c259590a")

        policyAttachments.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val policyAttachmentService = client.agentGateways().policyAttachments()

        val agentGatewayPolicyAttachmentResponse =
            policyAttachmentService.delete(
                PolicyAttachmentDeleteParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .attachmentId("3394712f-2ad5-428a-8a3d-7a08d4b2906d")
                    .build()
            )

        agentGatewayPolicyAttachmentResponse.validate()
    }
}
