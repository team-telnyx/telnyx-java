// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.speechtotext.SpeechToTextListProvidersParams
import com.telnyx.sdk.models.speechtotext.SpeechToTextRetrieveTranscriptionParams
import com.telnyx.sdk.models.speechtotext.SttServiceType
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
                    .serviceType(SttServiceType.STREAMING)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveTranscription() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val speechToTextServiceAsync = client.speechToText()

        val future =
            speechToTextServiceAsync.retrieveTranscription(
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

        val response = future.get()
    }
}
