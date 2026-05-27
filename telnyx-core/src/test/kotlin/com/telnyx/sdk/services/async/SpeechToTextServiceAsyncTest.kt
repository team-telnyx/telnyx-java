// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.speechtotext.SpeechToTextListProvidersParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpeechToTextServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listProviders() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val speechToTextServiceAsync = client.speechToText()

        val responseFuture =
            speechToTextServiceAsync.listProviders(
                SpeechToTextListProvidersParams.builder()
                    .provider(SpeechToTextListProvidersParams.Provider.DEEPGRAM)
                    .serviceType(SpeechToTextListProvidersParams.ServiceType.STREAMING)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
