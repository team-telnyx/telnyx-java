// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policyattachments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayPolicyAttachmentTest {

    @Test
    fun create() {
        val agentGatewayPolicyAttachment =
            AgentGatewayPolicyAttachment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .default_(true)
                .addModel("string")
                .policy("policy")
                .priority(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(agentGatewayPolicyAttachment.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(agentGatewayPolicyAttachment.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayPolicyAttachment.default_()).isEqualTo(true)
        assertThat(agentGatewayPolicyAttachment.models()).containsExactly("string")
        assertThat(agentGatewayPolicyAttachment.policy()).isEqualTo("policy")
        assertThat(agentGatewayPolicyAttachment.priority()).contains(0L)
        assertThat(agentGatewayPolicyAttachment.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayPolicyAttachment =
            AgentGatewayPolicyAttachment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .default_(true)
                .addModel("string")
                .policy("policy")
                .priority(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAgentGatewayPolicyAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayPolicyAttachment),
                jacksonTypeRef<AgentGatewayPolicyAttachment>(),
            )

        assertThat(roundtrippedAgentGatewayPolicyAttachment).isEqualTo(agentGatewayPolicyAttachment)
    }
}
