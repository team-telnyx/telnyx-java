// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.AiCreateResponseParams
import com.telnyx.sdk.models.ai.AiSummarizeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AiServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createResponse() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiService = client.ai()

        val response =
            aiService.createResponse(
                AiCreateResponseParams.Params.builder()
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

        val response = aiService.retrieveModels()

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
