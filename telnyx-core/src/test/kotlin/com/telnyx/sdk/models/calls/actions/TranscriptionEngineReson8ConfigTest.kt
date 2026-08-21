// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineReson8ConfigTest {

    @Test
    fun create() {
        val transcriptionEngineReson8Config =
            TranscriptionEngineReson8Config.builder()
                .language(TranscriptionEngineReson8Config.Language.AUTO)
                .transcriptionEngine(TranscriptionEngineReson8Config.TranscriptionEngine.RESON8)
                .transcriptionModel(TranscriptionEngineReson8Config.TranscriptionModel.RESON8_TURNS)
                .build()

        assertThat(transcriptionEngineReson8Config.language())
            .contains(TranscriptionEngineReson8Config.Language.AUTO)
        assertThat(transcriptionEngineReson8Config.transcriptionEngine())
            .contains(TranscriptionEngineReson8Config.TranscriptionEngine.RESON8)
        assertThat(transcriptionEngineReson8Config.transcriptionModel())
            .contains(TranscriptionEngineReson8Config.TranscriptionModel.RESON8_TURNS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineReson8Config =
            TranscriptionEngineReson8Config.builder()
                .language(TranscriptionEngineReson8Config.Language.AUTO)
                .transcriptionEngine(TranscriptionEngineReson8Config.TranscriptionEngine.RESON8)
                .transcriptionModel(TranscriptionEngineReson8Config.TranscriptionModel.RESON8_TURNS)
                .build()

        val roundtrippedTranscriptionEngineReson8Config =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineReson8Config),
                jacksonTypeRef<TranscriptionEngineReson8Config>(),
            )

        assertThat(roundtrippedTranscriptionEngineReson8Config)
            .isEqualTo(transcriptionEngineReson8Config)
    }
}
