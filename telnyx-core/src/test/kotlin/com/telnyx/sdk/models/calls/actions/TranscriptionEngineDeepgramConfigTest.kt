// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineDeepgramConfigTest {

    @Test
    fun create() {
        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.builder()
                .transcriptionEngine(TranscriptionEngineDeepgramConfig.TranscriptionEngine.DEEPGRAM)
                .transcriptionModel(
                    TranscriptionEngineDeepgramConfig.TranscriptionModel.DEEPGRAM_NOVA_2
                )
                .language(TranscriptionEngineDeepgramConfig.Language.BG)
                .build()

        assertThat(transcriptionEngineDeepgramConfig.transcriptionEngine())
            .isEqualTo(TranscriptionEngineDeepgramConfig.TranscriptionEngine.DEEPGRAM)
        assertThat(transcriptionEngineDeepgramConfig.transcriptionModel())
            .isEqualTo(TranscriptionEngineDeepgramConfig.TranscriptionModel.DEEPGRAM_NOVA_2)
        assertThat(transcriptionEngineDeepgramConfig.language())
            .contains(TranscriptionEngineDeepgramConfig.Language.BG)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.builder()
                .transcriptionEngine(TranscriptionEngineDeepgramConfig.TranscriptionEngine.DEEPGRAM)
                .transcriptionModel(
                    TranscriptionEngineDeepgramConfig.TranscriptionModel.DEEPGRAM_NOVA_2
                )
                .language(TranscriptionEngineDeepgramConfig.Language.BG)
                .build()

        val roundtrippedTranscriptionEngineDeepgramConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig),
                jacksonTypeRef<TranscriptionEngineDeepgramConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineDeepgramConfig)
            .isEqualTo(transcriptionEngineDeepgramConfig)
    }
}
