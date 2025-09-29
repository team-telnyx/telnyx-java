// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.ai.AiSummarizeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AiServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveModels() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val aiServiceAsync = client.ai()

        val responseFuture = aiServiceAsync.retrieveModels()

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun summarize() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
