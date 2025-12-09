// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging.rcs.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.rcsagents.RcsAgent
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListResponseTest {

    @Test
    fun create() {
        val agentListResponse =
            AgentListResponse.builder()
                .addData(
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
                .meta(
                    AgentListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(agentListResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(agentListResponse.meta())
            .contains(
                AgentListResponse.Meta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentListResponse =
            AgentListResponse.builder()
                .addData(
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
                .meta(
                    AgentListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedAgentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentListResponse),
                jacksonTypeRef<AgentListResponse>(),
            )

        assertThat(roundtrippedAgentListResponse).isEqualTo(agentListResponse)
    }
}
