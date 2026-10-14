// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokenkeys

import com.telnyx.sdk.models.llmtokengateway.tokengroups.BudgetDuration
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenKeyUpdateParamsTest {

    @Test
    fun create() {
        TokenKeyUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .idempotencyKey("Idempotency-Key")
            .ifMatch("If-Match")
            .addAllowedModel("J!Q0Ok0bzJb7")
            .blocked(true)
            .budgetDuration(BudgetDuration._1D)
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .maxBudget(0.000001)
            .maxParallelRequests(5L)
            .name("name")
            .requiredEndUserId(true)
            .rpmLimit(1L)
            .tpmLimit(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenKeyUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            TokenKeyUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .addAllowedModel("J!Q0Ok0bzJb7")
                .blocked(true)
                .budgetDuration(BudgetDuration._1D)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxBudget(0.000001)
                .maxParallelRequests(5L)
                .name("name")
                .requiredEndUserId(true)
                .rpmLimit(1L)
                .tpmLimit(1L)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "Idempotency-Key")
                    .put("If-Match", "If-Match")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            TokenKeyUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "Idempotency-Key")
                    .put("If-Match", "If-Match")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            TokenKeyUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .addAllowedModel("J!Q0Ok0bzJb7")
                .blocked(true)
                .budgetDuration(BudgetDuration._1D)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .maxBudget(0.000001)
                .maxParallelRequests(5L)
                .name("name")
                .requiredEndUserId(true)
                .rpmLimit(1L)
                .tpmLimit(1L)
                .build()

        val body = params._body()

        assertThat(body.allowedModels().getOrNull()).containsExactly("J!Q0Ok0bzJb7")
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains(BudgetDuration._1D)
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.maxBudget()).contains(0.000001)
        assertThat(body.maxParallelRequests()).contains(5L)
        assertThat(body.name()).contains("name")
        assertThat(body.requiredEndUserId()).contains(true)
        assertThat(body.rpmLimit()).contains(1L)
        assertThat(body.tpmLimit()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenKeyUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .build()

        val body = params._body()
    }
}
