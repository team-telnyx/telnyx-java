// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEngineXaiConfigTest {

    @Test
    fun create() {
        val transcriptionEngineXaiConfig =
            TranscriptionEngineXaiConfig.builder()
                .interimResults(true)
                .language(TranscriptionEngineXaiConfig.Language.EN)
                .transcriptionEngine(TranscriptionEngineXaiConfig.TranscriptionEngine.X_AI)
                .transcriptionModel(TranscriptionEngineXaiConfig.TranscriptionModel.XAI_GROK_STT)
                .build()

        assertThat(transcriptionEngineXaiConfig.interimResults()).contains(true)
        assertThat(transcriptionEngineXaiConfig.language())
            .contains(TranscriptionEngineXaiConfig.Language.EN)
        assertThat(transcriptionEngineXaiConfig.transcriptionEngine())
            .contains(TranscriptionEngineXaiConfig.TranscriptionEngine.X_AI)
        assertThat(transcriptionEngineXaiConfig.transcriptionModel())
            .contains(TranscriptionEngineXaiConfig.TranscriptionModel.XAI_GROK_STT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineXaiConfig =
            TranscriptionEngineXaiConfig.builder()
                .interimResults(true)
                .language(TranscriptionEngineXaiConfig.Language.EN)
                .transcriptionEngine(TranscriptionEngineXaiConfig.TranscriptionEngine.X_AI)
                .transcriptionModel(TranscriptionEngineXaiConfig.TranscriptionModel.XAI_GROK_STT)
                .build()

        val roundtrippedTranscriptionEngineXaiConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineXaiConfig),
                jacksonTypeRef<TranscriptionEngineXaiConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineXaiConfig).isEqualTo(transcriptionEngineXaiConfig)
    }
}
