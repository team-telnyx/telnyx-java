// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

import com.telnyx.sdk.models.llmtokengateway.tokengroups.BudgetDuration
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenKeyCreateParamsTest {

    @Test
    fun create() {
        TokenKeyCreateParams.builder()
            .idempotencyKey("Idempotency-Key")
            .name("support-service")
            .tokenGroupId("11111111-1111-4111-8111-111111111111")
            .addAllowedModel("J!Q0Ok0bzJb7")
            .blocked(true)
            .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .maxBudget(0.000001)
            .maxParallelRequests(5L)
            .requiredEndUserId(true)
            .rpmLimit(1L)
            .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tpmLimit(1L)
            .build()
    }

    @Test
    fun headers() {
        val params =
            TokenKeyCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .name("support-service")
                .tokenGroupId("11111111-1111-4111-8111-111111111111")
                .addAllowedModel("J!Q0Ok0bzJb7")
                .blocked(true)
                .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxBudget(0.000001)
                .maxParallelRequests(5L)
                .requiredEndUserId(true)
                .rpmLimit(1L)
                .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tpmLimit(1L)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "Idempotency-Key")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            TokenKeyCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .name("support-service")
                .tokenGroupId("11111111-1111-4111-8111-111111111111")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "Idempotency-Key")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            TokenKeyCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .name("support-service")
                .tokenGroupId("11111111-1111-4111-8111-111111111111")
                .addAllowedModel("J!Q0Ok0bzJb7")
                .blocked(true)
                .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxBudget(0.000001)
                .maxParallelRequests(5L)
                .requiredEndUserId(true)
                .rpmLimit(1L)
                .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tpmLimit(1L)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("support-service")
        assertThat(body.tokenGroupId()).isEqualTo("11111111-1111-4111-8111-111111111111")
        assertThat(body.allowedModels().getOrNull()).containsExactly("J!Q0Ok0bzJb7")
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains(BudgetDuration.BUDGET_DURATION_1_D)
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.maxBudget()).contains(0.000001)
        assertThat(body.maxParallelRequests()).contains(5L)
        assertThat(body.requiredEndUserId()).contains(true)
        assertThat(body.rpmLimit()).contains(1L)
        assertThat(body.tokenUserId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.tpmLimit()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenKeyCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .name("support-service")
                .tokenGroupId("11111111-1111-4111-8111-111111111111")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("support-service")
        assertThat(body.tokenGroupId()).isEqualTo("11111111-1111-4111-8111-111111111111")
    }
}
