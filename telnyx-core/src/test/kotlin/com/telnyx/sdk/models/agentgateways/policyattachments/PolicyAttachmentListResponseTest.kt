// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policyattachments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolicyAttachmentListResponseTest {

    @Test
    fun create() {
        val policyAttachmentListResponse =
            PolicyAttachmentListResponse.builder()
                .addData(
                    AgentGatewayPolicyAttachment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isDefault(true)
                        .addModel("string")
                        .policy("policy")
                        .priority(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(policyAttachmentListResponse.data())
            .containsExactly(
                AgentGatewayPolicyAttachment.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isDefault(true)
                    .addModel("string")
                    .policy("policy")
                    .priority(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val policyAttachmentListResponse =
            PolicyAttachmentListResponse.builder()
                .addData(
                    AgentGatewayPolicyAttachment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isDefault(true)
                        .addModel("string")
                        .policy("policy")
                        .priority(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedPolicyAttachmentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(policyAttachmentListResponse),
                jacksonTypeRef<PolicyAttachmentListResponse>(),
            )

        assertThat(roundtrippedPolicyAttachmentListResponse).isEqualTo(policyAttachmentListResponse)
    }
}
