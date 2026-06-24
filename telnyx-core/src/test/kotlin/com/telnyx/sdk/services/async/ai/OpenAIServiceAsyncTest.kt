// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.openai.OpenAICreateResponseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OpenAIServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createResponse() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val openaiServiceAsync = client.ai().openai()

        val responseFuture =
            openaiServiceAsync.createResponse(
                OpenAICreateResponseParams.builder()
                    .conversation("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .input(
                        OpenAICreateResponseParams.Input.builder()
                            .putAdditionalProperty("0", JsonValue.from("bar"))
                            .build()
                    )
                    .instructions("You are a friendly chatbot.")
                    .model("zai-org/GLM-5.1-FP8")
                    .stream(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listModels() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val openaiServiceAsync = client.ai().openai()

        val modelsResponseFuture = openaiServiceAsync.listModels()

        val modelsResponse = modelsResponseFuture.get()
        modelsResponse.validate()
    }
}
