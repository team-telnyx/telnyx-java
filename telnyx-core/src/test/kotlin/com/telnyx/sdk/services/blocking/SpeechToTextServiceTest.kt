// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.speechtotext.SpeechToTextTranscribeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpeechToTextServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun transcribe() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val speechToTextService = client.speechToText()

        speechToTextService.transcribe(
            SpeechToTextTranscribeParams.builder()
                .inputFormat(SpeechToTextTranscribeParams.InputFormat.MP3)
                .transcriptionEngine(SpeechToTextTranscribeParams.TranscriptionEngine.AZURE)
                .interimResults(true)
                .language("language")
                .model(SpeechToTextTranscribeParams.Model.FAST)
                .build()
        )
    }
}
