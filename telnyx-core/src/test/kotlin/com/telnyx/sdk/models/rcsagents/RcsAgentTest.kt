// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcsagents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RcsAgentTest {

    @Test
    fun create() {
        val rcsAgent =
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

        assertThat(rcsAgent.agentId()).contains("TestAgent")
        assertThat(rcsAgent.agentName()).contains("Test Agent")
        assertThat(rcsAgent.createdAt()).contains(OffsetDateTime.parse("2024-01-01T12:00:00.000Z"))
        assertThat(rcsAgent.enabled()).contains(true)
        assertThat(rcsAgent.profileId()).contains("4001932a-b8a3-42fc-9389-021be6388909")
        assertThat(rcsAgent.updatedAt()).contains(OffsetDateTime.parse("2024-01-01T12:00:00.000Z"))
        assertThat(rcsAgent.userId()).contains("2ecf295b-36c6-4d43-ad05-71eb1e560518")
        assertThat(rcsAgent.webhookFailoverUrl()).contains("http://example.com")
        assertThat(rcsAgent.webhookUrl()).contains("http://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rcsAgent =
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

        val roundtrippedRcsAgent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rcsAgent),
                jacksonTypeRef<RcsAgent>(),
            )

        assertThat(roundtrippedRcsAgent).isEqualTo(rcsAgent)
    }
}
