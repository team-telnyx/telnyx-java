// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyListResponseTest {

    @Test
    fun create() {
        val keyListResponse =
            KeyListResponse.builder()
                .addData(
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
                )
                .build()

        assertThat(keyListResponse.data())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val keyListResponse =
            KeyListResponse.builder()
                .addData(
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
                )
                .build()

        val roundtrippedKeyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(keyListResponse),
                jacksonTypeRef<KeyListResponse>(),
            )

        assertThat(roundtrippedKeyListResponse).isEqualTo(keyListResponse)
    }
}
