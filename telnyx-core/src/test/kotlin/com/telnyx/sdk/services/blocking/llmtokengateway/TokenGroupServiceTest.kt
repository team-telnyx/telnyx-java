// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.llmtokengateway

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.llmtokengateway.tokengroups.BudgetDuration
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupCreateParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupDeleteParams
import com.telnyx.sdk.models.llmtokengateway.tokengroups.TokenGroupUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TokenGroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tokenGroupService = client.llmTokenGateway().tokenGroups()

        val tokenGroupResponse =
            tokenGroupService.create(
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
                            .putAdditionalProperty(
                                "Kimi-K3",
                                JsonValue.from(listOf("GLM-5.3-Flash")),
                            )
                            .build()
                    )
                    .guardrails(
                        TokenGroupCreateParams.Guardrails.builder()
                            .dlp(
                                TokenGroupCreateParams.Guardrails.Dlp.builder()
                                    .addProfile(
                                        TokenGroupCreateParams.Guardrails.Dlp.Profile.FINANCIAL
                                    )
                                    .prompt(TokenGroupCreateParams.Guardrails.Dlp.Prompt.IGNORE)
                                    .response(TokenGroupCreateParams.Guardrails.Dlp.Response.IGNORE)
                                    .build()
                            )
                            .secrets(
                                TokenGroupCreateParams.Guardrails.Secrets.builder()
                                    .prompt(TokenGroupCreateParams.Guardrails.Secrets.Prompt.IGNORE)
                                    .response(
                                        TokenGroupCreateParams.Guardrails.Secrets.Response.IGNORE
                                    )
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
            )

        tokenGroupResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tokenGroupService = client.llmTokenGateway().tokenGroups()

        val tokenGroupResponse = tokenGroupService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        tokenGroupResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tokenGroupService = client.llmTokenGateway().tokenGroups()

        val tokenGroupResponse =
            tokenGroupService.update(
                TokenGroupUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .idempotencyKey("Idempotency-Key")
                    .ifMatch("If-Match")
                    .addAllowedModel("Kimi-K3")
                    .addAllowedModel("GLM-5.3-Flash")
                    .blocked(true)
                    .budgetDuration(BudgetDuration.BUDGET_DURATION_1_D)
                    .cacheTtl(1L)
                    .fallbacks(
                        TokenGroupUpdateParams.Fallbacks.builder()
                            .putAdditionalProperty(
                                "Kimi-K3",
                                JsonValue.from(listOf("GLM-5.3-Flash")),
                            )
                            .build()
                    )
                    .guardrails(
                        TokenGroupUpdateParams.Guardrails.builder()
                            .dlp(
                                TokenGroupUpdateParams.Guardrails.Dlp.builder()
                                    .addProfile(
                                        TokenGroupUpdateParams.Guardrails.Dlp.Profile.FINANCIAL
                                    )
                                    .prompt(TokenGroupUpdateParams.Guardrails.Dlp.Prompt.IGNORE)
                                    .response(TokenGroupUpdateParams.Guardrails.Dlp.Response.IGNORE)
                                    .build()
                            )
                            .secrets(
                                TokenGroupUpdateParams.Guardrails.Secrets.builder()
                                    .prompt(TokenGroupUpdateParams.Guardrails.Secrets.Prompt.IGNORE)
                                    .response(
                                        TokenGroupUpdateParams.Guardrails.Secrets.Response.IGNORE
                                    )
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
            )

        tokenGroupResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tokenGroupService = client.llmTokenGateway().tokenGroups()

        val page = tokenGroupService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tokenGroupService = client.llmTokenGateway().tokenGroups()

        tokenGroupService.delete(
            TokenGroupDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .build()
        )
    }
}
