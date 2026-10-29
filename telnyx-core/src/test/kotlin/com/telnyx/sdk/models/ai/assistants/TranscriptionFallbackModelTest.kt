// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionFallbackModelTest {

    @Test
    fun create() {
        val transcriptionFallbackModel =
            TranscriptionFallbackModel.builder()
                .model(TranscriptionFallbackModel.Model.DEEPGRAM_NOVA_3)
                .language("en")
                .settings(
                    TranscriptionSettingsConfig.builder()
                        .context("context")
                        .eagerEotThreshold(0.3)
                        .enableEndpointDetection(true)
                        .endOfTurnConfidenceThreshold(0.0)
                        .eotThreshold(0.5)
                        .eotTimeoutMs(500L)
                        .interimResults(true)
                        .keyterm("Telnyx,VoIP,SIP")
                        .addLanguageHint("string")
                        .maxEndpointDelayMs(500L)
                        .maxTurnSilence(100L)
                        .minTurnSilence(100L)
                        .numerals(true)
                        .prompt("prompt")
                        .removeDisfluencies(true)
                        .smartFormat(true)
                        .build()
                )
                .build()

        assertThat(transcriptionFallbackModel.model())
            .isEqualTo(TranscriptionFallbackModel.Model.DEEPGRAM_NOVA_3)
        assertThat(transcriptionFallbackModel.language()).contains("en")
        assertThat(transcriptionFallbackModel.settings())
            .contains(
                TranscriptionSettingsConfig.builder()
                    .context("context")
                    .eagerEotThreshold(0.3)
                    .enableEndpointDetection(true)
                    .endOfTurnConfidenceThreshold(0.0)
                    .eotThreshold(0.5)
                    .eotTimeoutMs(500L)
                    .interimResults(true)
                    .keyterm("Telnyx,VoIP,SIP")
                    .addLanguageHint("string")
                    .maxEndpointDelayMs(500L)
                    .maxTurnSilence(100L)
                    .minTurnSilence(100L)
                    .numerals(true)
                    .prompt("prompt")
                    .removeDisfluencies(true)
                    .smartFormat(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionFallbackModel =
            TranscriptionFallbackModel.builder()
                .model(TranscriptionFallbackModel.Model.DEEPGRAM_NOVA_3)
                .language("en")
                .settings(
                    TranscriptionSettingsConfig.builder()
                        .context("context")
                        .eagerEotThreshold(0.3)
                        .enableEndpointDetection(true)
                        .endOfTurnConfidenceThreshold(0.0)
                        .eotThreshold(0.5)
                        .eotTimeoutMs(500L)
                        .interimResults(true)
                        .keyterm("Telnyx,VoIP,SIP")
                        .addLanguageHint("string")
                        .maxEndpointDelayMs(500L)
                        .maxTurnSilence(100L)
                        .minTurnSilence(100L)
                        .numerals(true)
                        .prompt("prompt")
                        .removeDisfluencies(true)
                        .smartFormat(true)
                        .build()
                )
                .build()

        val roundtrippedTranscriptionFallbackModel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionFallbackModel),
                jacksonTypeRef<TranscriptionFallbackModel>(),
            )

        assertThat(roundtrippedTranscriptionFallbackModel).isEqualTo(transcriptionFallbackModel)
    }
}
