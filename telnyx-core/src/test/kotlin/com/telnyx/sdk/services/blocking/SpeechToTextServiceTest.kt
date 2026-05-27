// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.speechtotext.SpeechToTextListProvidersParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpeechToTextServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listProviders() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val speechToTextService = client.speechToText()

        val response =
            speechToTextService.listProviders(
                SpeechToTextListProvidersParams.builder()
                    .provider(SpeechToTextListProvidersParams.Provider.DEEPGRAM)
                    .serviceType(SpeechToTextListProvidersParams.ServiceType.STREAMING)
                    .build()
            )

        response.validate()
    }
}
