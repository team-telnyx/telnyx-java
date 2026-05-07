// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OpenAIServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listModels() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val openaiServiceAsync = client.ai().openai()

        val responseFuture = openaiServiceAsync.listModels()

        val response = responseFuture.get()
        response.validate()
    }
}
