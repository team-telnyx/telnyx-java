// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.teams

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayTeamTest {

    @Test
    fun create() {
        val agentGatewayTeam =
            AgentGatewayTeam.builder()
                .id("id")
                .blocked(true)
                .budgetResetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .budgetResetsEvery("budget_resets_every")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxBudget(0.0)
                .addModel("string")
                .name("name")
                .requestsPerMinute(0L)
                .spend(0.0)
                .tokensPerMinute(0L)
                .build()

        assertThat(agentGatewayTeam.id()).isEqualTo("id")
        assertThat(agentGatewayTeam.blocked()).isEqualTo(true)
        assertThat(agentGatewayTeam.budgetResetsAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayTeam.budgetResetsEvery()).contains("budget_resets_every")
        assertThat(agentGatewayTeam.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayTeam.maxBudget()).contains(0.0)
        assertThat(agentGatewayTeam.models()).containsExactly("string")
        assertThat(agentGatewayTeam.name()).contains("name")
        assertThat(agentGatewayTeam.requestsPerMinute()).contains(0L)
        assertThat(agentGatewayTeam.spend()).isEqualTo(0.0)
        assertThat(agentGatewayTeam.tokensPerMinute()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayTeam =
            AgentGatewayTeam.builder()
                .id("id")
                .blocked(true)
                .budgetResetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .budgetResetsEvery("budget_resets_every")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxBudget(0.0)
                .addModel("string")
                .name("name")
                .requestsPerMinute(0L)
                .spend(0.0)
                .tokensPerMinute(0L)
                .build()

        val roundtrippedAgentGatewayTeam =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayTeam),
                jacksonTypeRef<AgentGatewayTeam>(),
            )

        assertThat(roundtrippedAgentGatewayTeam).isEqualTo(agentGatewayTeam)
    }
}
