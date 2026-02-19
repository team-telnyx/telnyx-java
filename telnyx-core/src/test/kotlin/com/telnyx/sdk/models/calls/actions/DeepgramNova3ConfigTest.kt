// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeepgramNova3ConfigTest {

    @Test
    fun create() {
        val deepgramNova3Config =
            DeepgramNova3Config.builder()
                .transcriptionEngine(DeepgramNova3Config.TranscriptionEngine.DEEPGRAM)
                .transcriptionModel(DeepgramNova3Config.TranscriptionModel.DEEPGRAM_NOVA_3)
                .interimResults(true)
                .keywordsBoosting(
                    DeepgramNova3Config.KeywordsBoosting.builder()
                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                        .putAdditionalProperty("systrom", JsonValue.from(2))
                        .putAdditionalProperty("krieger", JsonValue.from(1))
                        .build()
                )
                .language(DeepgramNova3Config.Language.EN_US)
                .utteranceEndMs(800L)
                .build()

        assertThat(deepgramNova3Config.transcriptionEngine())
            .isEqualTo(DeepgramNova3Config.TranscriptionEngine.DEEPGRAM)
        assertThat(deepgramNova3Config.transcriptionModel())
            .isEqualTo(DeepgramNova3Config.TranscriptionModel.DEEPGRAM_NOVA_3)
        assertThat(deepgramNova3Config.interimResults()).contains(true)
        assertThat(deepgramNova3Config.keywordsBoosting())
            .contains(
                DeepgramNova3Config.KeywordsBoosting.builder()
                    .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                    .putAdditionalProperty("systrom", JsonValue.from(2))
                    .putAdditionalProperty("krieger", JsonValue.from(1))
                    .build()
            )
        assertThat(deepgramNova3Config.language()).contains(DeepgramNova3Config.Language.EN_US)
        assertThat(deepgramNova3Config.utteranceEndMs()).contains(800L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deepgramNova3Config =
            DeepgramNova3Config.builder()
                .transcriptionEngine(DeepgramNova3Config.TranscriptionEngine.DEEPGRAM)
                .transcriptionModel(DeepgramNova3Config.TranscriptionModel.DEEPGRAM_NOVA_3)
                .interimResults(true)
                .keywordsBoosting(
                    DeepgramNova3Config.KeywordsBoosting.builder()
                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                        .putAdditionalProperty("systrom", JsonValue.from(2))
                        .putAdditionalProperty("krieger", JsonValue.from(1))
                        .build()
                )
                .language(DeepgramNova3Config.Language.EN_US)
                .utteranceEndMs(800L)
                .build()

        val roundtrippedDeepgramNova3Config =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deepgramNova3Config),
                jacksonTypeRef<DeepgramNova3Config>(),
            )

        assertThat(roundtrippedDeepgramNova3Config).isEqualTo(deepgramNova3Config)
    }
}
