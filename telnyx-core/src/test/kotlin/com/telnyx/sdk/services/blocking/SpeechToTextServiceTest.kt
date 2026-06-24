// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.speechtotext.SpeechToTextListProvidersParams
import com.telnyx.sdk.models.speechtotext.SpeechToTextRetrieveTranscriptionParams
import com.telnyx.sdk.models.speechtotext.SttServiceType
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
                    .serviceType(SttServiceType.STREAMING)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveTranscription() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val speechToTextService = client.speechToText()

        speechToTextService.retrieveTranscription(
            SpeechToTextRetrieveTranscriptionParams.builder()
                .inputFormat(SpeechToTextRetrieveTranscriptionParams.InputFormat.MP3)
                .transcriptionEngine(
                    SpeechToTextRetrieveTranscriptionParams.TranscriptionEngine.AZURE
                )
                .endpointing(0L)
                .interimResults(true)
                .keyterm("keyterm")
                .keywords("keywords")
                .language("language")
                .model(SpeechToTextRetrieveTranscriptionParams.Model.FAST)
                .redact("redact")
                .build()
        )
    }
}
