// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.AiRetrieveConversationHistoriesParams
import com.telnyx.sdk.models.ai.AiSummarizeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AiServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveConversationHistories() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiService = client.ai()

        val page =
            aiService.retrieveConversationHistories(
                AiRetrieveConversationHistoriesParams.builder()
                    .q("customer called about billing issue")
                    .build()
            )

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun summarize() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiService = client.ai()

        val response =
            aiService.summarize(
                AiSummarizeParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .bucket("string")
                    .filename("string")
                    .systemPrompt("string")
                    .build()
            )

        response.validate()
    }
}
