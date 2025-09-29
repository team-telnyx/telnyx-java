// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.ai.audio.AudioTranscribeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AudioServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun transcribe() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val audioService = client.ai().audio()

        val response =
            audioService.transcribe(
                AudioTranscribeParams.builder()
                    .model(AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
                    .file("some content".byteInputStream())
                    .fileUrl("https://example.com/file.mp3")
                    .responseFormat(AudioTranscribeParams.ResponseFormat.JSON)
                    .timestampGranularities(AudioTranscribeParams.TimestampGranularities.SEGMENT)
                    .build()
            )

        response.validate()
    }
}
