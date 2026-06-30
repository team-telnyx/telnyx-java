// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.AiCreateResponseDeprecatedParams
import com.telnyx.sdk.models.ai.AiRetrieveConversationHistoriesParams
import com.telnyx.sdk.models.ai.AiSummarizeParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AiServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createResponseDeprecated() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiService = client.ai()

        val response =
            aiService.createResponseDeprecated(
                AiCreateResponseDeprecatedParams.ResponseRequest.builder()
                    .putAdditionalProperty("model", JsonValue.from("bar"))
                    .putAdditionalProperty("input", JsonValue.from("bar"))
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveConversationHistories() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiService = client.ai()

        val response =
            aiService.retrieveConversationHistories(
                AiRetrieveConversationHistoriesParams.builder()
                    .q("customer called about billing issue")
                    .filterIngestedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                    .filterIngestedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                    .filterRecordCreatedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                    .filterRecordCreatedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                    .filterRecordId("rec-001")
                    .filterRegionIn("USA,DEU")
                    .filterRetention("filter[retention]")
                    .filterUserId("user-123")
                    .minScore(0.5f)
                    .pageNumber(1L)
                    .pageSize(10L)
                    .region(AiRetrieveConversationHistoriesParams.Region.USA)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveModels() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiService = client.ai()

        val modelsResponse = aiService.retrieveModels()

        modelsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun summarize() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiService = client.ai()

        val response =
            aiService.summarize(
                AiSummarizeParams.builder()
                    .bucket("bucket")
                    .filename("filename")
                    .systemPrompt("system_prompt")
                    .build()
            )

        response.validate()
    }
}
