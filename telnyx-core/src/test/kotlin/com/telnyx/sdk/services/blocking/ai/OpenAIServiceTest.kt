// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.openai.OpenAICreateResponseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OpenAIServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createResponse() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val openaiService = client.ai().openai()

        val response =
            openaiService.createResponse(
                OpenAICreateResponseParams.builder()
                    .conversation("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .input(
                        JsonValue.from(
                            listOf(
                                mapOf(
                                    "role" to "user",
                                    "content" to
                                        listOf(
                                            mapOf("type" to "input_text", "text" to "Hello, world!")
                                        ),
                                )
                            )
                        )
                    )
                    .instructions("You are a friendly chatbot.")
                    .model("zai-org/GLM-5.1-FP8")
                    .stream(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listModels() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val openaiService = client.ai().openai()

        val response = openaiService.listModels()

        response.validate()
    }
}
