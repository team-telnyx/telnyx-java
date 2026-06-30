// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.AiCreateResponseDeprecatedParams
import com.telnyx.sdk.models.ai.AiSearchConversationHistoriesParams
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
    fun retrieveModels() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiService = client.ai()

        val modelsResponse = aiService.retrieveModels()

        modelsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun searchConversationHistories() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiService = client.ai()

        val response =
            aiService.searchConversationHistories(
                AiSearchConversationHistoriesParams.builder()
                    .q("customer called about billing issue")
                    .recordType(AiSearchConversationHistoriesParams.RecordType.VOICE)
                    .filterDocumentId("doc-789")
                    .filterIngestedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                    .filterIngestedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                    .filterRecordCreatedAtGte(OffsetDateTime.parse("2026-01-01T00:00:00Z"))
                    .filterRecordCreatedAtLte(OffsetDateTime.parse("2026-12-31T23:59:59Z"))
                    .filterRecordId("rec-001")
                    .filterRegionIn("USA,DEU")
                    .filterRetention("filter[retention]")
                    .filterUserId("user-123")
                    .minScore(0.5f)
                    .region(AiSearchConversationHistoriesParams.Region.USA)
                    .topK(10L)
                    .build()
            )

        response.validate()
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
