// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayKeyTest {

    @Test
    fun create() {
        val agentGatewayKey =
            AgentGatewayKey.builder()
                .id("id")
                .blocked(true)
                .budgetResetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .budgetResetsEvery("budget_resets_every")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .addModel("string")
                .name("name")
                .requestsPerMinute(0L)
                .spend(0.0)
                .teamId("team_id")
                .tokensPerMinute(0L)
                .build()

        assertThat(agentGatewayKey.id()).isEqualTo("id")
        assertThat(agentGatewayKey.blocked()).isEqualTo(true)
        assertThat(agentGatewayKey.budgetResetsAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayKey.budgetResetsEvery()).contains("budget_resets_every")
        assertThat(agentGatewayKey.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayKey.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayKey.maxBudget()).contains(0.0)
        assertThat(agentGatewayKey.maxParallelRequests()).contains(0L)
        assertThat(agentGatewayKey.models()).containsExactly("string")
        assertThat(agentGatewayKey.name()).contains("name")
        assertThat(agentGatewayKey.requestsPerMinute()).contains(0L)
        assertThat(agentGatewayKey.spend()).isEqualTo(0.0)
        assertThat(agentGatewayKey.teamId()).contains("team_id")
        assertThat(agentGatewayKey.tokensPerMinute()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayKey =
            AgentGatewayKey.builder()
                .id("id")
                .blocked(true)
                .budgetResetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .budgetResetsEvery("budget_resets_every")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxBudget(0.0)
                .maxParallelRequests(0L)
                .addModel("string")
                .name("name")
                .requestsPerMinute(0L)
                .spend(0.0)
                .teamId("team_id")
                .tokensPerMinute(0L)
                .build()

        val roundtrippedAgentGatewayKey =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayKey),
                jacksonTypeRef<AgentGatewayKey>(),
            )

        assertThat(roundtrippedAgentGatewayKey).isEqualTo(agentGatewayKey)
    }
}
