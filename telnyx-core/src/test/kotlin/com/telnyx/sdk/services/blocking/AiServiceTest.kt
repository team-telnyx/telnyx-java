// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.AiSummarizeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AiServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveModels() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiService = client.ai()

        val response = aiService.retrieveModels()

        response.validate()
    }

    @Disabled("Prism tests are disabled")
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
