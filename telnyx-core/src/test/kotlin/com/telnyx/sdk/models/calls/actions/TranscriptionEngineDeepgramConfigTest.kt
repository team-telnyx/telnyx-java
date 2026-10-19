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
                .transcriptionEngine(DeepgramNova2Config.TranscriptionEngine.DEEPGRAM_NOVA_2)
                .transcriptionModel(DeepgramNova2Config.TranscriptionModel.DEEPGRAM_NOVA_2)
                .hints(listOf("Telnyx", "LiveKit", "VoIP"))
                .interimResults(true)
                .keywordsBoosting(
                    DeepgramNova2Config.KeywordsBoosting.builder()
                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                        .putAdditionalProperty("systrom", JsonValue.from(2))
                        .putAdditionalProperty("krieger", JsonValue.from(1))
                        .build()
                )
                .language(DeepgramNova2Config.Language.BG)
                .smartFormat(false)
                .utteranceEndMs(800L)
                .build()

        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova2(deepgramNova2)

        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2()).contains(deepgramNova2)
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2Specialty()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3Medical()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramFlux()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramFluxMulti()).isEmpty
    }

    @Test
    fun ofDeepgramNova2Roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova2(
                DeepgramNova2Config.builder()
                    .transcriptionEngine(DeepgramNova2Config.TranscriptionEngine.DEEPGRAM_NOVA_2)
                    .transcriptionModel(DeepgramNova2Config.TranscriptionModel.DEEPGRAM_NOVA_2)
                    .hints(listOf("Telnyx", "LiveKit", "VoIP"))
                    .interimResults(true)
                    .keywordsBoosting(
                        DeepgramNova2Config.KeywordsBoosting.builder()
                            .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                            .putAdditionalProperty("systrom", JsonValue.from(2))
                            .putAdditionalProperty("krieger", JsonValue.from(1))
                            .build()
                    )
                    .language(DeepgramNova2Config.Language.BG)
                    .smartFormat(false)
                    .utteranceEndMs(800L)
                    .build()
            )

        val roundtrippedTranscriptionEngineDeepgramConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig),
                jacksonTypeRef<TranscriptionEngineDeepgramConfig>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedTranscriptionEngineDeepgramConfig))
            .isEqualTo(jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig))
    }

    @Test
    fun ofDeepgramNova2Specialty() {
        val deepgramNova2Specialty =
            TranscriptionEngineDeepgramConfig.DeepgramNova2SpecialtyConfig.builder()
                .transcriptionEngine(
                    TranscriptionEngineDeepgramConfig.DeepgramNova2SpecialtyConfig
                        .TranscriptionEngine
                        .DEEPGRAM
                )
                .transcriptionModel(
                    TranscriptionEngineDeepgramConfig.DeepgramNova2SpecialtyConfig
                        .TranscriptionModel
                        .DEEPGRAM_NOVA_2_MEDICAL
                )
                .hints(listOf("Telnyx", "LiveKit", "VoIP"))
                .interimResults(true)
                .keywordsBoosting(
                    TranscriptionEngineDeepgramConfig.DeepgramNova2SpecialtyConfig.KeywordsBoosting
                        .builder()
                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                        .putAdditionalProperty("systrom", JsonValue.from(2))
                        .putAdditionalProperty("krieger", JsonValue.from(1))
                        .build()
                )
                .language(DeepgramEnglishTranscriptionLanguage.EN_US)
                .smartFormat(false)
                .utteranceEndMs(800L)
                .build()

        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova2Specialty(deepgramNova2Specialty)

        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2Specialty())
            .contains(deepgramNova2Specialty)
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3Medical()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramFlux()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramFluxMulti()).isEmpty
    }

    @Test
    fun ofDeepgramNova2SpecialtyRoundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova2Specialty(
                TranscriptionEngineDeepgramConfig.DeepgramNova2SpecialtyConfig.builder()
                    .transcriptionEngine(
                        TranscriptionEngineDeepgramConfig.DeepgramNova2SpecialtyConfig
                            .TranscriptionEngine
                            .DEEPGRAM
                    )
                    .transcriptionModel(
                        TranscriptionEngineDeepgramConfig.DeepgramNova2SpecialtyConfig
                            .TranscriptionModel
                            .DEEPGRAM_NOVA_2_MEDICAL
                    )
                    .hints(listOf("Telnyx", "LiveKit", "VoIP"))
                    .interimResults(true)
                    .keywordsBoosting(
                        TranscriptionEngineDeepgramConfig.DeepgramNova2SpecialtyConfig
                            .KeywordsBoosting
                            .builder()
                            .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                            .putAdditionalProperty("systrom", JsonValue.from(2))
                            .putAdditionalProperty("krieger", JsonValue.from(1))
                            .build()
                    )
                    .language(DeepgramEnglishTranscriptionLanguage.EN_US)
                    .smartFormat(false)
                    .utteranceEndMs(800L)
                    .build()
            )

        val roundtrippedTranscriptionEngineDeepgramConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig),
                jacksonTypeRef<TranscriptionEngineDeepgramConfig>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedTranscriptionEngineDeepgramConfig))
            .isEqualTo(jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig))
    }

    @Test
    fun ofDeepgramNova3() {
        val deepgramNova3 =
            DeepgramNova3Config.builder()
                .transcriptionEngine(DeepgramNova3Config.TranscriptionEngine.DEEPGRAM_NOVA_3)
                .transcriptionModel(DeepgramNova3Config.TranscriptionModel.DEEPGRAM_NOVA_3)
                .interimResults(true)
                .keyterms(listOf("Telnyx", "LiveKit", "VoIP"))
                .keywordsBoosting(
                    DeepgramNova3Config.KeywordsBoosting.builder()
                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                        .putAdditionalProperty("systrom", JsonValue.from(2))
                        .putAdditionalProperty("krieger", JsonValue.from(1))
                        .build()
                )
                .language(DeepgramNova3Config.Language.EN_US)
                .smartFormat(false)
                .utteranceEndMs(800L)
                .build()

        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova3(deepgramNova3)

        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2Specialty()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3()).contains(deepgramNova3)
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3Medical()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramFlux()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramFluxMulti()).isEmpty
    }

    @Test
    fun ofDeepgramNova3Roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova3(
                DeepgramNova3Config.builder()
                    .transcriptionEngine(DeepgramNova3Config.TranscriptionEngine.DEEPGRAM_NOVA_3)
                    .transcriptionModel(DeepgramNova3Config.TranscriptionModel.DEEPGRAM_NOVA_3)
                    .interimResults(true)
                    .keyterms(listOf("Telnyx", "LiveKit", "VoIP"))
                    .keywordsBoosting(
                        DeepgramNova3Config.KeywordsBoosting.builder()
                            .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                            .putAdditionalProperty("systrom", JsonValue.from(2))
                            .putAdditionalProperty("krieger", JsonValue.from(1))
                            .build()
                    )
                    .language(DeepgramNova3Config.Language.EN_US)
                    .smartFormat(false)
                    .utteranceEndMs(800L)
                    .build()
            )

        val roundtrippedTranscriptionEngineDeepgramConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig),
                jacksonTypeRef<TranscriptionEngineDeepgramConfig>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedTranscriptionEngineDeepgramConfig))
            .isEqualTo(jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig))
    }

    @Test
    fun ofDeepgramNova3Medical() {
        val deepgramNova3Medical =
            TranscriptionEngineDeepgramConfig.DeepgramNova3Medical.builder()
                .transcriptionEngine(
                    TranscriptionEngineDeepgramConfig.DeepgramNova3Medical.TranscriptionEngine
                        .DEEPGRAM
                )
                .interimResults(true)
                .keyterms(listOf("Telnyx", "LiveKit", "VoIP"))
                .keywordsBoosting(
                    TranscriptionEngineDeepgramConfig.DeepgramNova3Medical.KeywordsBoosting
                        .builder()
                        .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                        .putAdditionalProperty("systrom", JsonValue.from(2))
                        .putAdditionalProperty("krieger", JsonValue.from(1))
                        .build()
                )
                .language(DeepgramEnglishTranscriptionLanguage.EN_US)
                .smartFormat(false)
                .utteranceEndMs(800L)
                .build()

        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova3Medical(deepgramNova3Medical)

        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2Specialty()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3Medical())
            .contains(deepgramNova3Medical)
        assertThat(transcriptionEngineDeepgramConfig.deepgramFlux()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramFluxMulti()).isEmpty
    }

    @Test
    fun ofDeepgramNova3MedicalRoundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramNova3Medical(
                TranscriptionEngineDeepgramConfig.DeepgramNova3Medical.builder()
                    .transcriptionEngine(
                        TranscriptionEngineDeepgramConfig.DeepgramNova3Medical.TranscriptionEngine
                            .DEEPGRAM
                    )
                    .interimResults(true)
                    .keyterms(listOf("Telnyx", "LiveKit", "VoIP"))
                    .keywordsBoosting(
                        TranscriptionEngineDeepgramConfig.DeepgramNova3Medical.KeywordsBoosting
                            .builder()
                            .putAdditionalProperty("snuffleupagus", JsonValue.from(5))
                            .putAdditionalProperty("systrom", JsonValue.from(2))
                            .putAdditionalProperty("krieger", JsonValue.from(1))
                            .build()
                    )
                    .language(DeepgramEnglishTranscriptionLanguage.EN_US)
                    .smartFormat(false)
                    .utteranceEndMs(800L)
                    .build()
            )

        val roundtrippedTranscriptionEngineDeepgramConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig),
                jacksonTypeRef<TranscriptionEngineDeepgramConfig>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedTranscriptionEngineDeepgramConfig))
            .isEqualTo(jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig))
    }

    @Test
    fun ofDeepgramFlux() {
        val deepgramFlux =
            TranscriptionEngineDeepgramConfig.DeepgramFlux.builder()
                .transcriptionEngine(
                    TranscriptionEngineDeepgramConfig.DeepgramFlux.TranscriptionEngine.DEEPGRAM
                )
                .interimResults(true)
                .keyterms(listOf("Telnyx", "LiveKit", "VoIP"))
                .language(TranscriptionEngineDeepgramConfig.DeepgramFlux.Language.EN)
                .build()

        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramFlux(deepgramFlux)

        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2Specialty()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3Medical()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramFlux()).contains(deepgramFlux)
        assertThat(transcriptionEngineDeepgramConfig.deepgramFluxMulti()).isEmpty
    }

    @Test
    fun ofDeepgramFluxRoundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramFlux(
                TranscriptionEngineDeepgramConfig.DeepgramFlux.builder()
                    .transcriptionEngine(
                        TranscriptionEngineDeepgramConfig.DeepgramFlux.TranscriptionEngine.DEEPGRAM
                    )
                    .interimResults(true)
                    .keyterms(listOf("Telnyx", "LiveKit", "VoIP"))
                    .language(TranscriptionEngineDeepgramConfig.DeepgramFlux.Language.EN)
                    .build()
            )

        val roundtrippedTranscriptionEngineDeepgramConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig),
                jacksonTypeRef<TranscriptionEngineDeepgramConfig>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedTranscriptionEngineDeepgramConfig))
            .isEqualTo(jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig))
    }

    @Test
    fun ofDeepgramFluxMulti() {
        val deepgramFluxMulti =
            TranscriptionEngineDeepgramConfig.DeepgramFluxMulti.builder()
                .transcriptionEngine(
                    TranscriptionEngineDeepgramConfig.DeepgramFluxMulti.TranscriptionEngine.DEEPGRAM
                )
                .interimResults(true)
                .keyterms(listOf("Telnyx", "LiveKit", "VoIP"))
                .language(TranscriptionEngineDeepgramConfig.DeepgramFluxMulti.Language.ES)
                .build()

        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramFluxMulti(deepgramFluxMulti)

        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova2Specialty()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramNova3Medical()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramFlux()).isEmpty
        assertThat(transcriptionEngineDeepgramConfig.deepgramFluxMulti())
            .contains(deepgramFluxMulti)
    }

    @Test
    fun ofDeepgramFluxMultiRoundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEngineDeepgramConfig =
            TranscriptionEngineDeepgramConfig.ofDeepgramFluxMulti(
                TranscriptionEngineDeepgramConfig.DeepgramFluxMulti.builder()
                    .transcriptionEngine(
                        TranscriptionEngineDeepgramConfig.DeepgramFluxMulti.TranscriptionEngine
                            .DEEPGRAM
                    )
                    .interimResults(true)
                    .keyterms(listOf("Telnyx", "LiveKit", "VoIP"))
                    .language(TranscriptionEngineDeepgramConfig.DeepgramFluxMulti.Language.ES)
                    .build()
            )

        val roundtrippedTranscriptionEngineDeepgramConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig),
                jacksonTypeRef<TranscriptionEngineDeepgramConfig>(),
            )

        assertThat(jsonMapper.writeValueAsString(roundtrippedTranscriptionEngineDeepgramConfig))
            .isEqualTo(jsonMapper.writeValueAsString(transcriptionEngineDeepgramConfig))
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
