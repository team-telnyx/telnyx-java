// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.llmtokengateway.tokengroups.BudgetDuration
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenKeyTest {

    @Test
    fun create() {
        val tokenKey =
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

        assertThat(tokenKey.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenKey.allowedModels().getOrNull()).containsExactly("J!Q0Ok0bzJb7")
        assertThat(tokenKey.blocked()).isEqualTo(true)
        assertThat(tokenKey.budgetDuration()).contains(BudgetDuration.BUDGET_DURATION_1_D)
        assertThat(tokenKey.budgetStartedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tokenKey.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tokenKey.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tokenKey.maxBudget()).contains(0.0)
        assertThat(tokenKey.name()).isEqualTo("name")
        assertThat(tokenKey.requiredEndUserId()).isEqualTo(true)
        assertThat(tokenKey.reservedSpend()).isEqualTo(0.0)
        assertThat(tokenKey.resetsAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tokenKey.rpmLimit()).contains(0L)
        assertThat(tokenKey.spend()).isEqualTo(0.0)
        assertThat(tokenKey.tokenGroupId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenKey.tokenUserId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tokenKey.tpmLimit()).contains(0L)
        assertThat(tokenKey.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tokenKey.version()).isEqualTo(1L)
        assertThat(tokenKey.maxParallelRequests()).contains(1L)
        assertThat(tokenKey.provisioning()).contains(TokenKey.Provisioning.READY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenKey =
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

        val roundtrippedTokenKey =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenKey),
                jacksonTypeRef<TokenKey>(),
            )

        assertThat(roundtrippedTokenKey).isEqualTo(tokenKey)
    }
}
