// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.llmtokengateway.tokengroups.BudgetDuration
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenKeyResponseTest {

    @Test
    fun create() {
        val tokenKeyResponse =
            TokenKeyResponse.builder()
                .data(
                    TokenKey.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAllowedModel("J!Q0Ok0bzJb7")
                        .blocked(true)
                        .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                        .budgetStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maxBudget(0.0)
                        .name("name")
                        .requiredEndUserId(true)
                        .reservedSpend(0.0)
                        .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .rpmLimit(0L)
                        .spend(0.0)
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tpmLimit(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .version(1L)
                        .maxParallelRequests(1L)
                        .provisioning(TokenKey.Provisioning.READY)
                        .build()
                )
                .build()

        assertThat(tokenKeyResponse.data())
            .isEqualTo(
                TokenKey.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAllowedModel("J!Q0Ok0bzJb7")
                    .blocked(true)
                    .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                    .budgetStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .maxBudget(0.0)
                    .name("name")
                    .requiredEndUserId(true)
                    .reservedSpend(0.0)
                    .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .rpmLimit(0L)
                    .spend(0.0)
                    .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tpmLimit(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .version(1L)
                    .maxParallelRequests(1L)
                    .provisioning(TokenKey.Provisioning.READY)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenKeyResponse =
            TokenKeyResponse.builder()
                .data(
                    TokenKey.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAllowedModel("J!Q0Ok0bzJb7")
                        .blocked(true)
                        .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                        .budgetStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .maxBudget(0.0)
                        .name("name")
                        .requiredEndUserId(true)
                        .reservedSpend(0.0)
                        .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .rpmLimit(0L)
                        .spend(0.0)
                        .tokenGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .tpmLimit(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .version(1L)
                        .maxParallelRequests(1L)
                        .provisioning(TokenKey.Provisioning.READY)
                        .build()
                )
                .build()

        val roundtrippedTokenKeyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenKeyResponse),
                jacksonTypeRef<TokenKeyResponse>(),
            )

        assertThat(roundtrippedTokenKeyResponse).isEqualTo(tokenKeyResponse)
    }
}
