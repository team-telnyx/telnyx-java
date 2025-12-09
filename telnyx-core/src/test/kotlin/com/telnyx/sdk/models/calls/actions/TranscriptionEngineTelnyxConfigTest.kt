// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineTelnyxConfigTest {

    @Test
    fun create() {
        val transcriptionEngineTelnyxConfig =
            TranscriptionEngineTelnyxConfig.builder()
                .language(TelnyxTranscriptionLanguage.EN)
                .transcriptionEngine(TranscriptionEngineTelnyxConfig.TranscriptionEngine.TELNYX)
                .transcriptionModel(
                    TranscriptionEngineTelnyxConfig.TranscriptionModel.OPENAI_WHISPER_TINY
                )
                .build()

        assertThat(transcriptionEngineTelnyxConfig.language())
            .contains(TelnyxTranscriptionLanguage.EN)
        assertThat(transcriptionEngineTelnyxConfig.transcriptionEngine())
            .contains(TranscriptionEngineTelnyxConfig.TranscriptionEngine.TELNYX)
        assertThat(transcriptionEngineTelnyxConfig.transcriptionModel())
            .contains(TranscriptionEngineTelnyxConfig.TranscriptionModel.OPENAI_WHISPER_TINY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineTelnyxConfig =
            TranscriptionEngineTelnyxConfig.builder()
                .language(TelnyxTranscriptionLanguage.EN)
                .transcriptionEngine(TranscriptionEngineTelnyxConfig.TranscriptionEngine.TELNYX)
                .transcriptionModel(
                    TranscriptionEngineTelnyxConfig.TranscriptionModel.OPENAI_WHISPER_TINY
                )
                .build()

        val roundtrippedTranscriptionEngineTelnyxConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineTelnyxConfig),
                jacksonTypeRef<TranscriptionEngineTelnyxConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineTelnyxConfig)
            .isEqualTo(transcriptionEngineTelnyxConfig)
    }
}
