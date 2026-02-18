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
            TranscriptionEngineDeepgramConfig.DeepgramNova2.builder()
                .transcriptionEngine(
                    TranscriptionEngineDeepgramConfig.DeepgramNova2.TranscriptionEngine.DEEPGRAM
                )
                .keywordsBoosting(
                    TranscriptionEngineDeepgramConfig.DeepgramNova2.KeywordsBoosting.builder()
                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                        .putAdditionalProperty("systrom", JsonValue.from(2))
                        .putAdditionalProperty("krieger", JsonValue.from(1))
                        .build()
                )
                .language(TranscriptionEngineDeepgramConfig.DeepgramNova2.Language.BG)
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
                TranscriptionEngineDeepgramConfig.DeepgramNova2.builder()
                    .transcriptionEngine(
                        TranscriptionEngineDeepgramConfig.DeepgramNova2.TranscriptionEngine.DEEPGRAM
                    )
                    .keywordsBoosting(
                        TranscriptionEngineDeepgramConfig.DeepgramNova2.KeywordsBoosting.builder()
                            .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                            .putAdditionalProperty("systrom", JsonValue.from(2))
                            .putAdditionalProperty("krieger", JsonValue.from(1))
                            .build()
                    )
                    .language(TranscriptionEngineDeepgramConfig.DeepgramNova2.Language.BG)
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
            TranscriptionEngineDeepgramConfig.DeepgramNova3.builder()
                .transcriptionEngine(
                    TranscriptionEngineDeepgramConfig.DeepgramNova3.TranscriptionEngine.DEEPGRAM
                )
                .keywordsBoosting(
                    TranscriptionEngineDeepgramConfig.DeepgramNova3.KeywordsBoosting.builder()
                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                        .putAdditionalProperty("systrom", JsonValue.from(2))
                        .putAdditionalProperty("krieger", JsonValue.from(1))
                        .build()
                )
                .language(TranscriptionEngineDeepgramConfig.DeepgramNova3.Language.EN_US)
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
                TranscriptionEngineDeepgramConfig.DeepgramNova3.builder()
                    .transcriptionEngine(
                        TranscriptionEngineDeepgramConfig.DeepgramNova3.TranscriptionEngine.DEEPGRAM
                    )
                    .keywordsBoosting(
                        TranscriptionEngineDeepgramConfig.DeepgramNova3.KeywordsBoosting.builder()
                            .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                            .putAdditionalProperty("systrom", JsonValue.from(2))
                            .putAdditionalProperty("krieger", JsonValue.from(1))
                            .build()
                    )
                    .language(TranscriptionEngineDeepgramConfig.DeepgramNova3.Language.EN_US)
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
