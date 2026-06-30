// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineBConfigTest {

    @Test
    fun create() {
        val transcriptionEngineBConfig =
            TranscriptionEngineBConfig.builder()
                .language(TelnyxTranscriptionLanguage.EN)
                .transcriptionEngine(TranscriptionEngineBConfig.TranscriptionEngine.B)
                .transcriptionModel(
                    TranscriptionEngineBConfig.TranscriptionModel.OPENAI_WHISPER_TINY
                )
                .build()

        assertThat(transcriptionEngineBConfig.language()).contains(TelnyxTranscriptionLanguage.EN)
        assertThat(transcriptionEngineBConfig.transcriptionEngine())
            .contains(TranscriptionEngineBConfig.TranscriptionEngine.B)
        assertThat(transcriptionEngineBConfig.transcriptionModel())
            .contains(TranscriptionEngineBConfig.TranscriptionModel.OPENAI_WHISPER_TINY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineBConfig =
            TranscriptionEngineBConfig.builder()
                .language(TelnyxTranscriptionLanguage.EN)
                .transcriptionEngine(TranscriptionEngineBConfig.TranscriptionEngine.B)
                .transcriptionModel(
                    TranscriptionEngineBConfig.TranscriptionModel.OPENAI_WHISPER_TINY
                )
                .build()

        val roundtrippedTranscriptionEngineBConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineBConfig),
                jacksonTypeRef<TranscriptionEngineBConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineBConfig).isEqualTo(transcriptionEngineBConfig)
    }
}
