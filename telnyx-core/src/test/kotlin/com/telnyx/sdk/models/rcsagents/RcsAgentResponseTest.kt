// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcsagents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcsAgentResponseTest {

    @Test
    fun create() {
        val rcsAgentResponse =
            RcsAgentResponse.builder()
                .data(
                    RcsAgent.builder()
                        .agentId("TestAgent")
                        .agentName("Test Agent")
                        .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00.000Z"))
                        .enabled(true)
                        .profileId("4001932a-b8a3-42fc-9389-021be6388909")
                        .updatedAt(OffsetDateTime.parse("2024-01-01T12:00:00.000Z"))
                        .userId("2ecf295b-36c6-4d43-ad05-71eb1e560518")
                        .webhookFailoverUrl("http://example.com")
                        .webhookUrl("http://example.com")
                        .build()
                )
                .build()

        assertThat(rcsAgentResponse.data())
            .contains(
                RcsAgent.builder()
                    .agentId("TestAgent")
                    .agentName("Test Agent")
                    .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00.000Z"))
                    .enabled(true)
                    .profileId("4001932a-b8a3-42fc-9389-021be6388909")
                    .updatedAt(OffsetDateTime.parse("2024-01-01T12:00:00.000Z"))
                    .userId("2ecf295b-36c6-4d43-ad05-71eb1e560518")
                    .webhookFailoverUrl("http://example.com")
                    .webhookUrl("http://example.com")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rcsAgentResponse =
            RcsAgentResponse.builder()
                .data(
                    RcsAgent.builder()
                        .agentId("TestAgent")
                        .agentName("Test Agent")
                        .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00.000Z"))
                        .enabled(true)
                        .profileId("4001932a-b8a3-42fc-9389-021be6388909")
                        .updatedAt(OffsetDateTime.parse("2024-01-01T12:00:00.000Z"))
                        .userId("2ecf295b-36c6-4d43-ad05-71eb1e560518")
                        .webhookFailoverUrl("http://example.com")
                        .webhookUrl("http://example.com")
                        .build()
                )
                .build()

        val roundtrippedRcsAgentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcsAgentResponse),
                jacksonTypeRef<RcsAgentResponse>(),
            )

        assertThat(roundtrippedRcsAgentResponse).isEqualTo(rcsAgentResponse)
    }
}
