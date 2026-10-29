// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionChallengerTest {

    @Test
    fun create() {
        val transcriptionChallenger =
            TranscriptionChallenger.builder()
                .model(TranscriptionChallenger.Model.DEEPGRAM_NOVA_3)
                .language("en")
                .rule(TranscriptionChallenger.Rule.BEST_TURN)
                .settings(
                    TranscriptionSettingsConfig.builder()
                        .context("context")
                        .eagerEotThreshold(0.3)
                        .enableEndpointDetection(true)
                        .endOfTurnConfidenceThreshold(0.0)
                        .eotThreshold(0.5)
                        .eotTimeoutMs(500L)
                        .interimResults(true)
                        .keyterm("keyterm")
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

        assertThat(transcriptionChallenger.model())
            .isEqualTo(TranscriptionChallenger.Model.DEEPGRAM_NOVA_3)
        assertThat(transcriptionChallenger.language()).contains("en")
        assertThat(transcriptionChallenger.rule()).contains(TranscriptionChallenger.Rule.BEST_TURN)
        assertThat(transcriptionChallenger.settings())
            .contains(
                TranscriptionSettingsConfig.builder()
                    .context("context")
                    .eagerEotThreshold(0.3)
                    .enableEndpointDetection(true)
                    .endOfTurnConfidenceThreshold(0.0)
                    .eotThreshold(0.5)
                    .eotTimeoutMs(500L)
                    .interimResults(true)
                    .keyterm("keyterm")
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
        val transcriptionChallenger =
            TranscriptionChallenger.builder()
                .model(TranscriptionChallenger.Model.DEEPGRAM_NOVA_3)
                .language("en")
                .rule(TranscriptionChallenger.Rule.BEST_TURN)
                .settings(
                    TranscriptionSettingsConfig.builder()
                        .context("context")
                        .eagerEotThreshold(0.3)
                        .enableEndpointDetection(true)
                        .endOfTurnConfidenceThreshold(0.0)
                        .eotThreshold(0.5)
                        .eotTimeoutMs(500L)
                        .interimResults(true)
                        .keyterm("keyterm")
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

        val roundtrippedTranscriptionChallenger =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionChallenger),
                jacksonTypeRef<TranscriptionChallenger>(),
            )

        assertThat(roundtrippedTranscriptionChallenger).isEqualTo(transcriptionChallenger)
    }
}
