// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.teams

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamListResponseTest {

    @Test
    fun create() {
        val teamListResponse =
            TeamListResponse.builder()
                .addData(
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
                )
                .build()

        assertThat(teamListResponse.data())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val teamListResponse =
            TeamListResponse.builder()
                .addData(
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
                )
                .build()

        val roundtrippedTeamListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(teamListResponse),
                jacksonTypeRef<TeamListResponse>(),
            )

        assertThat(roundtrippedTeamListResponse).isEqualTo(teamListResponse)
    }
}
