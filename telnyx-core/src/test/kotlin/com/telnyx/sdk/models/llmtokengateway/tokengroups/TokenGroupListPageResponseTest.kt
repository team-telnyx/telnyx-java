// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokengroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenGroupListPageResponseTest {

    @Test
    fun create() {
        val tokenGroupListPageResponse =
            TokenGroupListPageResponse.builder()
                .addData(
                    TokenGroup.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAllowedModel("J!Q0Ok0bzJb7")
                        .blocked(true)
                        .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                        .budgetStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cacheTtl(1L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fallbacks(
                            TokenGroup.Fallbacks.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(listOf("J!Q0Ok0bzJb7")),
                                )
                                .build()
                        )
                        .guardrails(
                            TokenGroup.Guardrails.builder()
                                .dlp(
                                    TokenGroup.Guardrails.Dlp.builder()
                                        .addProfile(TokenGroup.Guardrails.Dlp.Profile.FINANCIAL)
                                        .prompt(TokenGroup.Guardrails.Dlp.Prompt.IGNORE)
                                        .response(TokenGroup.Guardrails.Dlp.Response.IGNORE)
                                        .build()
                                )
                                .secrets(
                                    TokenGroup.Guardrails.Secrets.builder()
                                        .prompt(TokenGroup.Guardrails.Secrets.Prompt.IGNORE)
                                        .response(TokenGroup.Guardrails.Secrets.Response.IGNORE)
                                        .build()
                                )
                                .streaming(TokenGroup.Guardrails.Streaming.BUFFERED)
                                .build()
                        )
                        .maxBudget(0.0)
                        .name("name")
                        .addProviderKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .reservedSpend(0.0)
                        .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .retries(
                            TokenGroup.Retries.builder()
                                .maxAttempts(1L)
                                .backoff(TokenGroup.Retries.Backoff.CONSTANT)
                                .requestTimeoutMs(1000L)
                                .retryDelayMs(0L)
                                .build()
                        )
                        .rpmLimit(0L)
                        .spend(0.0)
                        .tpmLimit(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .version(1L)
                        .maxParallelRequests(1L)
                        .build()
                )
                .meta(
                    AiGatewayResourcesPageMeta.builder()
                        .hasMore(true)
                        .pageNumber(1L)
                        .pageSize(1L)
                        .snapshot("snapshot")
                        .build()
                )
                .build()

        assertThat(tokenGroupListPageResponse.data())
            .containsExactly(
                TokenGroup.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addAllowedModel("J!Q0Ok0bzJb7")
                    .blocked(true)
                    .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                    .budgetStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cacheTtl(1L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fallbacks(
                        TokenGroup.Fallbacks.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("J!Q0Ok0bzJb7")))
                            .build()
                    )
                    .guardrails(
                        TokenGroup.Guardrails.builder()
                            .dlp(
                                TokenGroup.Guardrails.Dlp.builder()
                                    .addProfile(TokenGroup.Guardrails.Dlp.Profile.FINANCIAL)
                                    .prompt(TokenGroup.Guardrails.Dlp.Prompt.IGNORE)
                                    .response(TokenGroup.Guardrails.Dlp.Response.IGNORE)
                                    .build()
                            )
                            .secrets(
                                TokenGroup.Guardrails.Secrets.builder()
                                    .prompt(TokenGroup.Guardrails.Secrets.Prompt.IGNORE)
                                    .response(TokenGroup.Guardrails.Secrets.Response.IGNORE)
                                    .build()
                            )
                            .streaming(TokenGroup.Guardrails.Streaming.BUFFERED)
                            .build()
                    )
                    .maxBudget(0.0)
                    .name("name")
                    .addProviderKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reservedSpend(0.0)
                    .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .retries(
                        TokenGroup.Retries.builder()
                            .maxAttempts(1L)
                            .backoff(TokenGroup.Retries.Backoff.CONSTANT)
                            .requestTimeoutMs(1000L)
                            .retryDelayMs(0L)
                            .build()
                    )
                    .rpmLimit(0L)
                    .spend(0.0)
                    .tpmLimit(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .version(1L)
                    .maxParallelRequests(1L)
                    .build()
            )
        assertThat(tokenGroupListPageResponse.meta())
            .isEqualTo(
                AiGatewayResourcesPageMeta.builder()
                    .hasMore(true)
                    .pageNumber(1L)
                    .pageSize(1L)
                    .snapshot("snapshot")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenGroupListPageResponse =
            TokenGroupListPageResponse.builder()
                .addData(
                    TokenGroup.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAllowedModel("J!Q0Ok0bzJb7")
                        .blocked(true)
                        .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                        .budgetStartedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cacheTtl(1L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fallbacks(
                            TokenGroup.Fallbacks.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(listOf("J!Q0Ok0bzJb7")),
                                )
                                .build()
                        )
                        .guardrails(
                            TokenGroup.Guardrails.builder()
                                .dlp(
                                    TokenGroup.Guardrails.Dlp.builder()
                                        .addProfile(TokenGroup.Guardrails.Dlp.Profile.FINANCIAL)
                                        .prompt(TokenGroup.Guardrails.Dlp.Prompt.IGNORE)
                                        .response(TokenGroup.Guardrails.Dlp.Response.IGNORE)
                                        .build()
                                )
                                .secrets(
                                    TokenGroup.Guardrails.Secrets.builder()
                                        .prompt(TokenGroup.Guardrails.Secrets.Prompt.IGNORE)
                                        .response(TokenGroup.Guardrails.Secrets.Response.IGNORE)
                                        .build()
                                )
                                .streaming(TokenGroup.Guardrails.Streaming.BUFFERED)
                                .build()
                        )
                        .maxBudget(0.0)
                        .name("name")
                        .addProviderKeyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .reservedSpend(0.0)
                        .resetsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .retries(
                            TokenGroup.Retries.builder()
                                .maxAttempts(1L)
                                .backoff(TokenGroup.Retries.Backoff.CONSTANT)
                                .requestTimeoutMs(1000L)
                                .retryDelayMs(0L)
                                .build()
                        )
                        .rpmLimit(0L)
                        .spend(0.0)
                        .tpmLimit(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .version(1L)
                        .maxParallelRequests(1L)
                        .build()
                )
                .meta(
                    AiGatewayResourcesPageMeta.builder()
                        .hasMore(true)
                        .pageNumber(1L)
                        .pageSize(1L)
                        .snapshot("snapshot")
                        .build()
                )
                .build()

        val roundtrippedTokenGroupListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenGroupListPageResponse),
                jacksonTypeRef<TokenGroupListPageResponse>(),
            )

        assertThat(roundtrippedTokenGroupListPageResponse).isEqualTo(tokenGroupListPageResponse)
    }
}
