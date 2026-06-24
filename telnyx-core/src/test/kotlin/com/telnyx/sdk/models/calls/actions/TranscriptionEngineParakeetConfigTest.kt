// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineParakeetConfigTest {

    @Test
    fun create() {
        val transcriptionEngineParakeetConfig =
            TranscriptionEngineParakeetConfig.builder()
                .interimResults(true)
                .transcriptionEngine(TranscriptionEngineParakeetConfig.TranscriptionEngine.PARAKEET)
                .transcriptionModel(
                    TranscriptionEngineParakeetConfig.TranscriptionModel.PARAKEET_TDT_0_6B_V3
                )
                .build()

        assertThat(transcriptionEngineParakeetConfig.interimResults()).contains(true)
        assertThat(transcriptionEngineParakeetConfig.transcriptionEngine())
            .contains(TranscriptionEngineParakeetConfig.TranscriptionEngine.PARAKEET)
        assertThat(transcriptionEngineParakeetConfig.transcriptionModel())
            .contains(TranscriptionEngineParakeetConfig.TranscriptionModel.PARAKEET_TDT_0_6B_V3)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineParakeetConfig =
            TranscriptionEngineParakeetConfig.builder()
                .interimResults(true)
                .transcriptionEngine(TranscriptionEngineParakeetConfig.TranscriptionEngine.PARAKEET)
                .transcriptionModel(
                    TranscriptionEngineParakeetConfig.TranscriptionModel.PARAKEET_TDT_0_6B_V3
                )
                .build()

        val roundtrippedTranscriptionEngineParakeetConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineParakeetConfig),
                jacksonTypeRef<TranscriptionEngineParakeetConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineParakeetConfig)
            .isEqualTo(transcriptionEngineParakeetConfig)
    }
}
