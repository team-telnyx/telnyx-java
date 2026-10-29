// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokengroups

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenGroupCreateParamsTest {

    @Test
    fun create() {
        TokenGroupCreateParams.builder()
            .idempotencyKey("Idempotency-Key")
            .addAllowedModel("Kimi-K3")
            .addAllowedModel("GLM-5.3-Flash")
            .name("support-backend")
            .blocked(true)
            .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
            .cacheTtl(1L)
            .fallbacks(
                TokenGroupCreateParams.Fallbacks.builder()
                    .putAdditionalProperty("Kimi-K3", JsonValue.from(listOf("GLM-5.3-Flash")))
                    .build()
            )
            .guardrails(
                TokenGroupCreateParams.Guardrails.builder()
                    .dlp(
                        TokenGroupCreateParams.Guardrails.Dlp.builder()
                            .addProfile(TokenGroupCreateParams.Guardrails.Dlp.Profile.FINANCIAL)
                            .prompt(TokenGroupCreateParams.Guardrails.Dlp.Prompt.IGNORE)
                            .response(TokenGroupCreateParams.Guardrails.Dlp.Response.IGNORE)
                            .build()
                    )
                    .secrets(
                        TokenGroupCreateParams.Guardrails.Secrets.builder()
                            .prompt(TokenGroupCreateParams.Guardrails.Secrets.Prompt.IGNORE)
                            .response(TokenGroupCreateParams.Guardrails.Secrets.Response.IGNORE)
                            .build()
                    )
                    .streaming(TokenGroupCreateParams.Guardrails.Streaming.BUFFERED)
                    .build()
            )
            .maxBudget(0.0)
            .maxParallelRequests(20L)
            .addProviderKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .retries(
                TokenGroupCreateParams.Retries.builder()
                    .maxAttempts(2L)
                    .backoff(TokenGroupCreateParams.Retries.Backoff.EXPONENTIAL)
                    .requestTimeoutMs(10000L)
                    .retryDelayMs(250L)
                    .build()
            )
            .rpmLimit(0L)
            .tpmLimit(0L)
            .build()
    }

    @Test
    fun headers() {
        val params =
            TokenGroupCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .addAllowedModel("Kimi-K3")
                .addAllowedModel("GLM-5.3-Flash")
                .name("support-backend")
                .blocked(true)
                .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                .cacheTtl(1L)
                .fallbacks(
                    TokenGroupCreateParams.Fallbacks.builder()
                        .putAdditionalProperty("Kimi-K3", JsonValue.from(listOf("GLM-5.3-Flash")))
                        .build()
                )
                .guardrails(
                    TokenGroupCreateParams.Guardrails.builder()
                        .dlp(
                            TokenGroupCreateParams.Guardrails.Dlp.builder()
                                .addProfile(TokenGroupCreateParams.Guardrails.Dlp.Profile.FINANCIAL)
                                .prompt(TokenGroupCreateParams.Guardrails.Dlp.Prompt.IGNORE)
                                .response(TokenGroupCreateParams.Guardrails.Dlp.Response.IGNORE)
                                .build()
                        )
                        .secrets(
                            TokenGroupCreateParams.Guardrails.Secrets.builder()
                                .prompt(TokenGroupCreateParams.Guardrails.Secrets.Prompt.IGNORE)
                                .response(TokenGroupCreateParams.Guardrails.Secrets.Response.IGNORE)
                                .build()
                        )
                        .streaming(TokenGroupCreateParams.Guardrails.Streaming.BUFFERED)
                        .build()
                )
                .maxBudget(0.0)
                .maxParallelRequests(20L)
                .addProviderKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .retries(
                    TokenGroupCreateParams.Retries.builder()
                        .maxAttempts(2L)
                        .backoff(TokenGroupCreateParams.Retries.Backoff.EXPONENTIAL)
                        .requestTimeoutMs(10000L)
                        .retryDelayMs(250L)
                        .build()
                )
                .rpmLimit(0L)
                .tpmLimit(0L)
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
            TokenGroupCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .addAllowedModel("Kimi-K3")
                .addAllowedModel("GLM-5.3-Flash")
                .name("support-backend")
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
            TokenGroupCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .addAllowedModel("Kimi-K3")
                .addAllowedModel("GLM-5.3-Flash")
                .name("support-backend")
                .blocked(true)
                .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                .cacheTtl(1L)
                .fallbacks(
                    TokenGroupCreateParams.Fallbacks.builder()
                        .putAdditionalProperty("Kimi-K3", JsonValue.from(listOf("GLM-5.3-Flash")))
                        .build()
                )
                .guardrails(
                    TokenGroupCreateParams.Guardrails.builder()
                        .dlp(
                            TokenGroupCreateParams.Guardrails.Dlp.builder()
                                .addProfile(TokenGroupCreateParams.Guardrails.Dlp.Profile.FINANCIAL)
                                .prompt(TokenGroupCreateParams.Guardrails.Dlp.Prompt.IGNORE)
                                .response(TokenGroupCreateParams.Guardrails.Dlp.Response.IGNORE)
                                .build()
                        )
                        .secrets(
                            TokenGroupCreateParams.Guardrails.Secrets.builder()
                                .prompt(TokenGroupCreateParams.Guardrails.Secrets.Prompt.IGNORE)
                                .response(TokenGroupCreateParams.Guardrails.Secrets.Response.IGNORE)
                                .build()
                        )
                        .streaming(TokenGroupCreateParams.Guardrails.Streaming.BUFFERED)
                        .build()
                )
                .maxBudget(0.0)
                .maxParallelRequests(20L)
                .addProviderKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .retries(
                    TokenGroupCreateParams.Retries.builder()
                        .maxAttempts(2L)
                        .backoff(TokenGroupCreateParams.Retries.Backoff.EXPONENTIAL)
                        .requestTimeoutMs(10000L)
                        .retryDelayMs(250L)
                        .build()
                )
                .rpmLimit(0L)
                .tpmLimit(0L)
                .build()

        val body = params._body()

        assertThat(body.allowedModels()).containsExactly("Kimi-K3", "GLM-5.3-Flash")
        assertThat(body.name()).isEqualTo("support-backend")
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains(BudgetDuration.BUDGET_DURATION_1_D)
        assertThat(body.cacheTtl()).contains(1L)
        assertThat(body.fallbacks())
            .contains(
                TokenGroupCreateParams.Fallbacks.builder()
                    .putAdditionalProperty("Kimi-K3", JsonValue.from(listOf("GLM-5.3-Flash")))
                    .build()
            )
        assertThat(body.guardrails())
            .contains(
                TokenGroupCreateParams.Guardrails.builder()
                    .dlp(
                        TokenGroupCreateParams.Guardrails.Dlp.builder()
                            .addProfile(TokenGroupCreateParams.Guardrails.Dlp.Profile.FINANCIAL)
                            .prompt(TokenGroupCreateParams.Guardrails.Dlp.Prompt.IGNORE)
                            .response(TokenGroupCreateParams.Guardrails.Dlp.Response.IGNORE)
                            .build()
                    )
                    .secrets(
                        TokenGroupCreateParams.Guardrails.Secrets.builder()
                            .prompt(TokenGroupCreateParams.Guardrails.Secrets.Prompt.IGNORE)
                            .response(TokenGroupCreateParams.Guardrails.Secrets.Response.IGNORE)
                            .build()
                    )
                    .streaming(TokenGroupCreateParams.Guardrails.Streaming.BUFFERED)
                    .build()
            )
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.maxParallelRequests()).contains(20L)
        assertThat(body.providerKeyIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.retries())
            .contains(
                TokenGroupCreateParams.Retries.builder()
                    .maxAttempts(2L)
                    .backoff(TokenGroupCreateParams.Retries.Backoff.EXPONENTIAL)
                    .requestTimeoutMs(10000L)
                    .retryDelayMs(250L)
                    .build()
            )
        assertThat(body.rpmLimit()).contains(0L)
        assertThat(body.tpmLimit()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TokenGroupCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .addAllowedModel("Kimi-K3")
                .addAllowedModel("GLM-5.3-Flash")
                .name("support-backend")
                .build()

        val body = params._body()

        assertThat(body.allowedModels()).containsExactly("Kimi-K3", "GLM-5.3-Flash")
        assertThat(body.name()).isEqualTo("support-backend")
    }
}
