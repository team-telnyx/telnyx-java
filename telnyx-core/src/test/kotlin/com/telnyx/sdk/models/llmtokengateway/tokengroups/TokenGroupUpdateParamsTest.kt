// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokengroups

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenGroupUpdateParamsTest {

    @Test
    fun create() {
        TokenGroupUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .idempotencyKey("Idempotency-Key")
            .ifMatch("If-Match")
            .addAllowedModel("Kimi-K3")
            .addAllowedModel("GLM-5.3-Flash")
            .blocked(true)
            .budgetDuration(BudgetDuration._1D)
            .cacheTtl(1L)
            .fallbacks(
                TokenGroupUpdateParams.Fallbacks.builder()
                    .putAdditionalProperty("Kimi-K3", JsonValue.from(listOf("GLM-5.3-Flash")))
                    .build()
            )
            .guardrails(
                TokenGroupUpdateParams.Guardrails.builder()
                    .dlp(
                        TokenGroupUpdateParams.Guardrails.Dlp.builder()
                            .addProfile(TokenGroupUpdateParams.Guardrails.Dlp.Profile.FINANCIAL)
                            .prompt(TokenGroupUpdateParams.Guardrails.Dlp.Prompt.IGNORE)
                            .response(TokenGroupUpdateParams.Guardrails.Dlp.Response.IGNORE)
                            .build()
                    )
                    .secrets(
                        TokenGroupUpdateParams.Guardrails.Secrets.builder()
                            .prompt(TokenGroupUpdateParams.Guardrails.Secrets.Prompt.IGNORE)
                            .response(TokenGroupUpdateParams.Guardrails.Secrets.Response.IGNORE)
                            .build()
                    )
                    .streaming(TokenGroupUpdateParams.Guardrails.Streaming.BUFFERED)
                    .build()
            )
            .maxBudget(0.0)
            .maxParallelRequests(20L)
            .name("support-backend")
            .addProviderKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .retries(
                TokenGroupUpdateParams.Retries.builder()
                    .maxAttempts(2L)
                    .backoff(TokenGroupUpdateParams.Retries.Backoff.EXPONENTIAL)
                    .requestTimeoutMs(10000L)
                    .retryDelayMs(250L)
                    .build()
            )
            .rpmLimit(0L)
            .tpmLimit(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TokenGroupUpdateParams.builder()
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
            TokenGroupUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .addAllowedModel("Kimi-K3")
                .addAllowedModel("GLM-5.3-Flash")
                .blocked(true)
                .budgetDuration(BudgetDuration._1D)
                .cacheTtl(1L)
                .fallbacks(
                    TokenGroupUpdateParams.Fallbacks.builder()
                        .putAdditionalProperty("Kimi-K3", JsonValue.from(listOf("GLM-5.3-Flash")))
                        .build()
                )
                .guardrails(
                    TokenGroupUpdateParams.Guardrails.builder()
                        .dlp(
                            TokenGroupUpdateParams.Guardrails.Dlp.builder()
                                .addProfile(TokenGroupUpdateParams.Guardrails.Dlp.Profile.FINANCIAL)
                                .prompt(TokenGroupUpdateParams.Guardrails.Dlp.Prompt.IGNORE)
                                .response(TokenGroupUpdateParams.Guardrails.Dlp.Response.IGNORE)
                                .build()
                        )
                        .secrets(
                            TokenGroupUpdateParams.Guardrails.Secrets.builder()
                                .prompt(TokenGroupUpdateParams.Guardrails.Secrets.Prompt.IGNORE)
                                .response(TokenGroupUpdateParams.Guardrails.Secrets.Response.IGNORE)
                                .build()
                        )
                        .streaming(TokenGroupUpdateParams.Guardrails.Streaming.BUFFERED)
                        .build()
                )
                .maxBudget(0.0)
                .maxParallelRequests(20L)
                .name("support-backend")
                .addProviderKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .retries(
                    TokenGroupUpdateParams.Retries.builder()
                        .maxAttempts(2L)
                        .backoff(TokenGroupUpdateParams.Retries.Backoff.EXPONENTIAL)
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
                    .put("If-Match", "If-Match")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            TokenGroupUpdateParams.builder()
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
            TokenGroupUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .addAllowedModel("Kimi-K3")
                .addAllowedModel("GLM-5.3-Flash")
                .blocked(true)
                .budgetDuration(BudgetDuration._1D)
                .cacheTtl(1L)
                .fallbacks(
                    TokenGroupUpdateParams.Fallbacks.builder()
                        .putAdditionalProperty("Kimi-K3", JsonValue.from(listOf("GLM-5.3-Flash")))
                        .build()
                )
                .guardrails(
                    TokenGroupUpdateParams.Guardrails.builder()
                        .dlp(
                            TokenGroupUpdateParams.Guardrails.Dlp.builder()
                                .addProfile(TokenGroupUpdateParams.Guardrails.Dlp.Profile.FINANCIAL)
                                .prompt(TokenGroupUpdateParams.Guardrails.Dlp.Prompt.IGNORE)
                                .response(TokenGroupUpdateParams.Guardrails.Dlp.Response.IGNORE)
                                .build()
                        )
                        .secrets(
                            TokenGroupUpdateParams.Guardrails.Secrets.builder()
                                .prompt(TokenGroupUpdateParams.Guardrails.Secrets.Prompt.IGNORE)
                                .response(TokenGroupUpdateParams.Guardrails.Secrets.Response.IGNORE)
                                .build()
                        )
                        .streaming(TokenGroupUpdateParams.Guardrails.Streaming.BUFFERED)
                        .build()
                )
                .maxBudget(0.0)
                .maxParallelRequests(20L)
                .name("support-backend")
                .addProviderKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .retries(
                    TokenGroupUpdateParams.Retries.builder()
                        .maxAttempts(2L)
                        .backoff(TokenGroupUpdateParams.Retries.Backoff.EXPONENTIAL)
                        .requestTimeoutMs(10000L)
                        .retryDelayMs(250L)
                        .build()
                )
                .rpmLimit(0L)
                .tpmLimit(0L)
                .build()

        val body = params._body()

        assertThat(body.allowedModels().getOrNull()).containsExactly("Kimi-K3", "GLM-5.3-Flash")
        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetDuration()).contains(BudgetDuration._1D)
        assertThat(body.cacheTtl()).contains(1L)
        assertThat(body.fallbacks())
            .contains(
                TokenGroupUpdateParams.Fallbacks.builder()
                    .putAdditionalProperty("Kimi-K3", JsonValue.from(listOf("GLM-5.3-Flash")))
                    .build()
            )
        assertThat(body.guardrails())
            .contains(
                TokenGroupUpdateParams.Guardrails.builder()
                    .dlp(
                        TokenGroupUpdateParams.Guardrails.Dlp.builder()
                            .addProfile(TokenGroupUpdateParams.Guardrails.Dlp.Profile.FINANCIAL)
                            .prompt(TokenGroupUpdateParams.Guardrails.Dlp.Prompt.IGNORE)
                            .response(TokenGroupUpdateParams.Guardrails.Dlp.Response.IGNORE)
                            .build()
                    )
                    .secrets(
                        TokenGroupUpdateParams.Guardrails.Secrets.builder()
                            .prompt(TokenGroupUpdateParams.Guardrails.Secrets.Prompt.IGNORE)
                            .response(TokenGroupUpdateParams.Guardrails.Secrets.Response.IGNORE)
                            .build()
                    )
                    .streaming(TokenGroupUpdateParams.Guardrails.Streaming.BUFFERED)
                    .build()
            )
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.maxParallelRequests()).contains(20L)
        assertThat(body.name()).contains("support-backend")
        assertThat(body.providerKeyIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.retries())
            .contains(
                TokenGroupUpdateParams.Retries.builder()
                    .maxAttempts(2L)
                    .backoff(TokenGroupUpdateParams.Retries.Backoff.EXPONENTIAL)
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
            TokenGroupUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .build()

        val body = params._body()
    }
}
