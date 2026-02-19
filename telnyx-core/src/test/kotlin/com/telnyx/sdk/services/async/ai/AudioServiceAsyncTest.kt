// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.audio.AudioTranscribeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AudioServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun transcribe() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val audioServiceAsync = client.ai().audio()

        val responseFuture =
            audioServiceAsync.transcribe(
                AudioTranscribeParams.builder()
                    .model(AudioTranscribeParams.Model.DISTIL_WHISPER_DISTIL_LARGE_V2)
                    .file("some content".byteInputStream())
                    .fileUrl("https://example.com/file.mp3")
                    .language("en-US")
                    .modelConfig(
                        AudioTranscribeParams.ModelConfig.builder()
                            .putAdditionalProperty("smart_format", JsonValue.from("bar"))
                            .putAdditionalProperty("punctuate", JsonValue.from("bar"))
                            .build()
                    )
                    .responseFormat(AudioTranscribeParams.ResponseFormat.JSON)
                    .timestampGranularities(AudioTranscribeParams.TimestampGranularities.SEGMENT)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
