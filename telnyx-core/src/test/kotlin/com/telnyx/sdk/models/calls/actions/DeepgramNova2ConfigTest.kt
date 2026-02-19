// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeepgramNova2ConfigTest {

    @Test
    fun create() {
        val deepgramNova2Config =
            DeepgramNova2Config.builder()
                .transcriptionEngine(DeepgramNova2Config.TranscriptionEngine.DEEPGRAM)
                .transcriptionModel(DeepgramNova2Config.TranscriptionModel.DEEPGRAM_NOVA_2)
                .interimResults(true)
                .keywordsBoosting(
                    DeepgramNova2Config.KeywordsBoosting.builder()
                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                        .putAdditionalProperty("systrom", JsonValue.from(2))
                        .putAdditionalProperty("krieger", JsonValue.from(1))
                        .build()
                )
                .language(DeepgramNova2Config.Language.BG)
                .utteranceEndMs(800L)
                .build()

        assertThat(deepgramNova2Config.transcriptionEngine())
            .isEqualTo(DeepgramNova2Config.TranscriptionEngine.DEEPGRAM)
        assertThat(deepgramNova2Config.transcriptionModel())
            .isEqualTo(DeepgramNova2Config.TranscriptionModel.DEEPGRAM_NOVA_2)
        assertThat(deepgramNova2Config.interimResults()).contains(true)
        assertThat(deepgramNova2Config.keywordsBoosting())
            .contains(
                DeepgramNova2Config.KeywordsBoosting.builder()
                    .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                    .putAdditionalProperty("systrom", JsonValue.from(2))
                    .putAdditionalProperty("krieger", JsonValue.from(1))
                    .build()
            )
        assertThat(deepgramNova2Config.language()).contains(DeepgramNova2Config.Language.BG)
        assertThat(deepgramNova2Config.utteranceEndMs()).contains(800L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val deepgramNova2Config =
            DeepgramNova2Config.builder()
                .transcriptionEngine(DeepgramNova2Config.TranscriptionEngine.DEEPGRAM)
                .transcriptionModel(DeepgramNova2Config.TranscriptionModel.DEEPGRAM_NOVA_2)
                .interimResults(true)
                .keywordsBoosting(
                    DeepgramNova2Config.KeywordsBoosting.builder()
                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                        .putAdditionalProperty("systrom", JsonValue.from(2))
                        .putAdditionalProperty("krieger", JsonValue.from(1))
                        .build()
                )
                .language(DeepgramNova2Config.Language.BG)
                .utteranceEndMs(800L)
                .build()

        val roundtrippedDeepgramNova2Config =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(deepgramNova2Config),
                jacksonTypeRef<DeepgramNova2Config>(),
            )

        assertThat(roundtrippedDeepgramNova2Config).isEqualTo(deepgramNova2Config)
    }
}
