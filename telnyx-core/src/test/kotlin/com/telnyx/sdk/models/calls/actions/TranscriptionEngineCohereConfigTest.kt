// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineCohereConfigTest {

    @Test
    fun create() {
        val transcriptionEngineCohereConfig =
            TranscriptionEngineCohereConfig.builder()
                .language(TranscriptionEngineCohereConfig.Language.AR)
                .transcriptionEngine(TranscriptionEngineCohereConfig.TranscriptionEngine.COHERE)
                .transcriptionModel(
                    TranscriptionEngineCohereConfig.TranscriptionModel.COHERE_AR_STT
                )
                .build()

        assertThat(transcriptionEngineCohereConfig.language())
            .contains(TranscriptionEngineCohereConfig.Language.AR)
        assertThat(transcriptionEngineCohereConfig.transcriptionEngine())
            .contains(TranscriptionEngineCohereConfig.TranscriptionEngine.COHERE)
        assertThat(transcriptionEngineCohereConfig.transcriptionModel())
            .contains(TranscriptionEngineCohereConfig.TranscriptionModel.COHERE_AR_STT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineCohereConfig =
            TranscriptionEngineCohereConfig.builder()
                .language(TranscriptionEngineCohereConfig.Language.AR)
                .transcriptionEngine(TranscriptionEngineCohereConfig.TranscriptionEngine.COHERE)
                .transcriptionModel(
                    TranscriptionEngineCohereConfig.TranscriptionModel.COHERE_AR_STT
                )
                .build()

        val roundtrippedTranscriptionEngineCohereConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineCohereConfig),
                jacksonTypeRef<TranscriptionEngineCohereConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineCohereConfig)
            .isEqualTo(transcriptionEngineCohereConfig)
    }
}
