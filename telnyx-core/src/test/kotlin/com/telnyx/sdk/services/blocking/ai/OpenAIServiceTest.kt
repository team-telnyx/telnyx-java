// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OpenAIServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listModels() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val openaiService = client.ai().openai()

        val response = openaiService.listModels()

        response.validate()
    }
}
