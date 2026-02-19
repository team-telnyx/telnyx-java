// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TranscriptionEngineDeepgramConfigTest {

    @Test
    fun ofDeepgramNova2() {
        val deepgramNova2 =
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

        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova2(deepgramNova2)

        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2()).contains(deepgramNova2)
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3()).isEmpty
    }

    @Test
    fun ofDeepgramNova2Roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova2(
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
            )

        val roundtrippedTranscriptionEngineDeepgramConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig),
                jacksonTypeRef<TranscriptionEngineDeepgramConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineDeepgramConfig)
            .isEqualTo(transcriptionEngineDeepgramConfig)
    }

    @Test
    fun ofDeepgramNova3() {
        val deepgramNova3 =
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

        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova3(deepgramNova3)

        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3()).contains(deepgramNova3)
    }

    @Test
    fun ofDeepgramNova3Roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova3(
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
            )

        val roundtrippedTranscriptionEngineDeepgramConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig),
                jacksonTypeRef<TranscriptionEngineDeepgramConfig>(),
            )

        assertThat(roundtrippedTranscriptionEngineDeepgramConfig)
            .isEqualTo(transcriptionEngineDeepgramConfig)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val transcriptionEngineDeepgramConfig =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<TranscriptionEngineDeepgramConfig>())

        val e =
            assertThrows<TelnyxInvalidDataException> {
                transcriptionEngineDeepgramConfig.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
