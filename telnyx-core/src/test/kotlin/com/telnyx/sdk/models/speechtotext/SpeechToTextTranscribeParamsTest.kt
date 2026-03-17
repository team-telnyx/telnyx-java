// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.speechtotext

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeechToTextTranscribeParamsTest {

    @Test
    fun create() {
        SpeechToTextTranscribeParams.builder()
            .inputFormat(SpeechToTextTranscribeParams.InputFormat.MP3)
            .transcriptionEngine(SpeechToTextTranscribeParams.TranscriptionEngine.AZURE)
            .endpointing(0L)
            .interimResults(true)
            .keyterm("keyterm")
            .keywords("keywords")
            .language("language")
            .model(SpeechToTextTranscribeParams.Model.FAST)
            .redact("redact")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SpeechToTextTranscribeParams.builder()
                .inputFormat(SpeechToTextTranscribeParams.InputFormat.MP3)
                .transcriptionEngine(SpeechToTextTranscribeParams.TranscriptionEngine.AZURE)
                .endpointing(0L)
                .interimResults(true)
                .keyterm("keyterm")
                .keywords("keywords")
                .language("language")
                .model(SpeechToTextTranscribeParams.Model.FAST)
                .redact("redact")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("input_format", "mp3")
                    .put("transcription_engine", "Azure")
                    .put("endpointing", "0")
                    .put("interim_results", "true")
                    .put("keyterm", "keyterm")
                    .put("keywords", "keywords")
                    .put("language", "language")
                    .put("model", "fast")
                    .put("redact", "redact")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SpeechToTextTranscribeParams.builder()
                .inputFormat(SpeechToTextTranscribeParams.InputFormat.MP3)
                .transcriptionEngine(SpeechToTextTranscribeParams.TranscriptionEngine.AZURE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("input_format", "mp3")
                    .put("transcription_engine", "Azure")
                    .build()
            )
    }
}
