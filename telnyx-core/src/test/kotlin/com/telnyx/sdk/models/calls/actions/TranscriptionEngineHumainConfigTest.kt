// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineHumainConfigTest {

    @Test
    fun create() {
        val transcriptionEngineHumainConfig =
            TranscriptionEngineHumainConfig.builder()
                .language(TranscriptionEngineHumainConfig.Language.EN)
                .transcriptionEngine(TranscriptionEngineHumainConfig.TranscriptionEngine.HUMAIN)
                .transcriptionModel(
                    TranscriptionEngineHumainConfig.TranscriptionModel.HUMAIN_REALTIME
                )
                .build()

        assertThat(transcriptionEngineHumainConfig.language())
            .contains(TranscriptionEngineHumainConfig.Language.EN)
        assertThat(transcriptionEngineHumainConfig.transcriptionEngine())
            .contains(TranscriptionEngineHumainConfig.TranscriptionEngine.HUMAIN)
        assertThat(transcriptionEngineHumainConfig.transcriptionModel())
            .contains(TranscriptionEngineHumainConfig.TranscriptionModel.HUMAIN_REALTIME)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineHumainConfig =
            TranscriptionEngineHumainConfig.builder()
                .language(TranscriptionEngineHumainConfig.Language.EN)
                .transcriptionEngine(TranscriptionEngineHumainConfig.TranscriptionEngine.HUMAIN)
                .transcriptionModel(
                    TranscriptionEngineHumainConfig.TranscriptionModel.HUMAIN_REALTIME
                )
                .build()

        val roundtrippedTranscriptionEngineHumainConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineHumainConfig),
                jacksonTypeRef<TranscriptionEngineHumainConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineHumainConfig)
            .isEqualTo(transcriptionEngineHumainConfig)
    }
}
