// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.AiCreateResponseDeprecatedParams
import com.telnyx.sdk.models.ai.AiSummarizeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AiServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createResponseDeprecated() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val aiServiceAsync = client.ai()

        val responseFuture =
            aiServiceAsync.createResponseDeprecated(
                AiCreateResponseDeprecatedParams.ResponseRequest.builder()
                    .putAdditionalProperty("model", JsonValue.from("bar"))
                    .putAdditionalProperty("input", JsonValue.from("bar"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveModels() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val aiServiceAsync = client.ai()

        val modelsResponseFuture = aiServiceAsync.retrieveModels()

        val modelsResponse = modelsResponseFuture.get()
        modelsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun summarize() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val aiServiceAsync = client.ai()

        val responseFuture =
            aiServiceAsync.summarize(
                AiSummarizeParams.builder()
                    .bucket("bucket")
                    .filename("filename")
                    .systemPrompt("system_prompt")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
