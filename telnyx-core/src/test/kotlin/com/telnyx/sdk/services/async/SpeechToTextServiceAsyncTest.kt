// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.speechtotext.SpeechToTextTranscribeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SpeechToTextServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun transcribe() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val speechToTextServiceAsync = client.speechToText()

        val future =
            speechToTextServiceAsync.transcribe(
                SpeechToTextTranscribeParams.builder()
                    .inputFormat(SpeechToTextTranscribeParams.InputFormat.MP3)
                    .transcriptionEngine(SpeechToTextTranscribeParams.TranscriptionEngine.AZURE)
                    .interimResults(true)
                    .language("language")
                    .model(SpeechToTextTranscribeParams.Model.FAST)
                    .build()
            )

        val response = future.get()
    }
}
