// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayRetrieveSpendLogsResponseTest {

    @Test
    fun create() {
        val agentGatewayRetrieveSpendLogsResponse =
            AgentGatewayRetrieveSpendLogsResponse.builder()
                .addData(
                    AgentGatewayRetrieveSpendLogsResponse.Data.builder()
                        .id("id")
                        .completionTokens(0L)
                        .durationMs(0L)
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .keyId("key_id")
                        .model("model")
                        .operation("operation")
                        .promptTokens(0L)
                        .spend(0.0)
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status("status")
                        .teamId("team_id")
                        .totalTokens(0L)
                        .build()
                )
                .meta(
                    AgentGatewayRetrieveSpendLogsResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .totalResultsCapped(true)
                        .build()
                )
                .build()

        assertThat(agentGatewayRetrieveSpendLogsResponse.data())
            .containsExactly(
                AgentGatewayRetrieveSpendLogsResponse.Data.builder()
                    .id("id")
                    .completionTokens(0L)
                    .durationMs(0L)
                    .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .keyId("key_id")
                    .model("model")
                    .operation("operation")
                    .promptTokens(0L)
                    .spend(0.0)
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status("status")
                    .teamId("team_id")
                    .totalTokens(0L)
                    .build()
            )
        assertThat(agentGatewayRetrieveSpendLogsResponse.meta())
            .isEqualTo(
                AgentGatewayRetrieveSpendLogsResponse.Meta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .totalResultsCapped(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayRetrieveSpendLogsResponse =
            AgentGatewayRetrieveSpendLogsResponse.builder()
                .addData(
                    AgentGatewayRetrieveSpendLogsResponse.Data.builder()
                        .id("id")
                        .completionTokens(0L)
                        .durationMs(0L)
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .keyId("key_id")
                        .model("model")
                        .operation("operation")
                        .promptTokens(0L)
                        .spend(0.0)
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status("status")
                        .teamId("team_id")
                        .totalTokens(0L)
                        .build()
                )
                .meta(
                    AgentGatewayRetrieveSpendLogsResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .totalResultsCapped(true)
                        .build()
                )
                .build()

        val roundtrippedAgentGatewayRetrieveSpendLogsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayRetrieveSpendLogsResponse),
                jacksonTypeRef<AgentGatewayRetrieveSpendLogsResponse>(),
            )

        assertThat(roundtrippedAgentGatewayRetrieveSpendLogsResponse)
            .isEqualTo(agentGatewayRetrieveSpendLogsResponse)
    }
}
