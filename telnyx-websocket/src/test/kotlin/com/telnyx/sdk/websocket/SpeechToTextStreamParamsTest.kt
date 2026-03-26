// Custom code for WebSocket streaming support - persists across codegen runs.

package com.telnyx.sdk.websocket

import com.telnyx.sdk.models.speechtotext.SpeechToTextStreamParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SpeechToTextStreamParamsTest {

    @Test
    fun `builds params with required fields`() {
        val params = SpeechToTextStreamParams.builder()
            .transcriptionEngine(SpeechToTextStreamParams.TranscriptionEngine.TELNYX)
            .build()

        assertThat(params.transcriptionEngine()).isEqualTo(SpeechToTextStreamParams.TranscriptionEngine.TELNYX)
    }

    @Test
    fun `builds params with all fields`() {
        val params = SpeechToTextStreamParams.builder()
            .transcriptionEngine(SpeechToTextStreamParams.TranscriptionEngine.DEEPGRAM)
            .inputFormat(SpeechToTextStreamParams.InputFormat.WAV)
            .language("en-US")
            .interimResults(true)
            .model("deepgram/nova-2")
            .endpointing(500)
            .keywords("hello,world")
            .build()

        assertThat(params.transcriptionEngine()).isEqualTo(SpeechToTextStreamParams.TranscriptionEngine.DEEPGRAM)
        assertThat(params.inputFormat()).hasValue(SpeechToTextStreamParams.InputFormat.WAV)
        assertThat(params.language()).hasValue("en-US")
        assertThat(params.interimResults()).hasValue(true)
        assertThat(params.model()).hasValue("deepgram/nova-2")
        assertThat(params.endpointing()).hasValue(500)
        assertThat(params.keywords()).hasValue("hello,world")
    }

    @Test
    fun `converts to query params`() {
        val params = SpeechToTextStreamParams.builder()
            .transcriptionEngine(SpeechToTextStreamParams.TranscriptionEngine.TELNYX)
            .inputFormat(SpeechToTextStreamParams.InputFormat.MP3)
            .language("es-ES")
            .interimResults(true)
            .build()

        val queryParams = params.toQueryParams()

        assertThat(queryParams).containsEntry("transcription_engine", "Telnyx")
        assertThat(queryParams).containsEntry("input_format", "mp3")
        assertThat(queryParams).containsEntry("language", "es-ES")
        assertThat(queryParams).containsEntry("interim_results", "true")
    }

    @Test
    fun `transcription engine asString values`() {
        assertThat(SpeechToTextStreamParams.TranscriptionEngine.AZURE.asString()).isEqualTo("Azure")
        assertThat(SpeechToTextStreamParams.TranscriptionEngine.DEEPGRAM.asString()).isEqualTo("Deepgram")
        assertThat(SpeechToTextStreamParams.TranscriptionEngine.GOOGLE.asString()).isEqualTo("Google")
        assertThat(SpeechToTextStreamParams.TranscriptionEngine.TELNYX.asString()).isEqualTo("Telnyx")
    }

    @Test
    fun `input format asString values`() {
        assertThat(SpeechToTextStreamParams.InputFormat.MP3.asString()).isEqualTo("mp3")
        assertThat(SpeechToTextStreamParams.InputFormat.WAV.asString()).isEqualTo("wav")
        assertThat(SpeechToTextStreamParams.InputFormat.RAW.asString()).isEqualTo("raw")
    }
}
