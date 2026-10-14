// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.llmtokengateway

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.llmtokengateway.tokengroups.BudgetDuration
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyCreateParams
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyDeleteParams
import com.telnyx.sdk.models.llmtokengateway.tokenkeys.TokenKeyUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TokenKeyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tokenKeyService = client.llmTokenGateway().tokenKeys()

        val tokenKeyResponse =
            tokenKeyService.create(
                TokenKeyCreateParams.builder()
                    .idempotencyKey("Idempotency-Key")
                    .name("support-service")
                    .tokenGroupId("11111111-1111-4111-8111-111111111111")
                    .addAllowedModel("J!Q0Ok0bzJb7")
                    .blocked(true)
                    .budgetDuration(BudgetDuration._1D)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .maxBudget(0.000001)
                    .maxParallelRequests(5L)
                    .requiredEndUserId(true)
                    .rpmLimit(1L)
                    .tokenUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tpmLimit(1L)
                    .build()
            )

        tokenKeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tokenKeyService = client.llmTokenGateway().tokenKeys()

        val tokenKeyResponse = tokenKeyService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        tokenKeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tokenKeyService = client.llmTokenGateway().tokenKeys()

        val tokenKeyResponse =
            tokenKeyService.update(
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
            )

        tokenKeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tokenKeyService = client.llmTokenGateway().tokenKeys()

        val page = tokenKeyService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val tokenKeyService = client.llmTokenGateway().tokenKeys()

        tokenKeyService.delete(
            TokenKeyDeleteParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .idempotencyKey("Idempotency-Key")
                .ifMatch("If-Match")
                .build()
        )
    }
}
