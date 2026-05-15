// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineSpeechmaticsConfigTest {

    @Test
    fun create() {
        val transcriptionEngineSpeechmaticsConfig =
            TranscriptionEngineSpeechmaticsConfig.builder()
                .interimResults(true)
                .language(TranscriptionEngineSpeechmaticsConfig.Language.EN)
                .transcriptionEngine(
                    TranscriptionEngineSpeechmaticsConfig.TranscriptionEngine.SPEECHMATICS
                )
                .transcriptionModel(
                    TranscriptionEngineSpeechmaticsConfig.TranscriptionModel.SPEECHMATICS_STANDARD
                )
                .build()

        assertThat(transcriptionEngineSpeechmaticsConfig.interimResults()).contains(true)
        assertThat(transcriptionEngineSpeechmaticsConfig.language())
            .contains(TranscriptionEngineSpeechmaticsConfig.Language.EN)
        assertThat(transcriptionEngineSpeechmaticsConfig.transcriptionEngine())
            .contains(TranscriptionEngineSpeechmaticsConfig.TranscriptionEngine.SPEECHMATICS)
        assertThat(transcriptionEngineSpeechmaticsConfig.transcriptionModel())
            .contains(
                TranscriptionEngineSpeechmaticsConfig.TranscriptionModel.SPEECHMATICS_STANDARD
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineSpeechmaticsConfig =
            TranscriptionEngineSpeechmaticsConfig.builder()
                .interimResults(true)
                .language(TranscriptionEngineSpeechmaticsConfig.Language.EN)
                .transcriptionEngine(
                    TranscriptionEngineSpeechmaticsConfig.TranscriptionEngine.SPEECHMATICS
                )
                .transcriptionModel(
                    TranscriptionEngineSpeechmaticsConfig.TranscriptionModel.SPEECHMATICS_STANDARD
                )
                .build()

        val roundtrippedTranscriptionEngineSpeechmaticsConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineSpeechmaticsConfig),
                jacksonTypeRef<TranscriptionEngineSpeechmaticsConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineSpeechmaticsConfig)
            .isEqualTo(transcriptionEngineSpeechmaticsConfig)
    }
}
