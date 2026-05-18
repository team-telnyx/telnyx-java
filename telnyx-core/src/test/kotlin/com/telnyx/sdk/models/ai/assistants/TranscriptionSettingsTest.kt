// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionSettingsTest {

    @Test
    fun create() {
        val transcriptionSettings =
            TranscriptionSettings.builder()
                .apiKeyRef("api_key_ref")
                .language("language")
                .model(TranscriptionSettings.Model.DEEPGRAM_FLUX)
                .region("region")
                .settings(
                    TranscriptionSettingsConfig.builder()
                        .eagerEotThreshold(0.3)
                        .enableEndpointDetection(true)
                        .endOfTurnConfidenceThreshold(0.0)
                        .eotThreshold(0.5)
                        .eotTimeoutMs(500L)
                        .interimResults(true)
                        .keyterm("keyterm")
                        .maxEndpointDelayMs(500L)
                        .maxTurnSilence(100L)
                        .minTurnSilence(100L)
                        .numerals(true)
                        .smartFormat(true)
                        .build()
                )
                .build()

        assertThat(transcriptionSettings.apiKeyRef()).contains("api_key_ref")
        assertThat(transcriptionSettings.language()).contains("language")
        assertThat(transcriptionSettings.model())
            .contains(TranscriptionSettings.Model.DEEPGRAM_FLUX)
        assertThat(transcriptionSettings.region()).contains("region")
        assertThat(transcriptionSettings.settings())
            .contains(
                TranscriptionSettingsConfig.builder()
                    .eagerEotThreshold(0.3)
                    .enableEndpointDetection(true)
                    .endOfTurnConfidenceThreshold(0.0)
                    .eotThreshold(0.5)
                    .eotTimeoutMs(500L)
                    .interimResults(true)
                    .keyterm("keyterm")
                    .maxEndpointDelayMs(500L)
                    .maxTurnSilence(100L)
                    .minTurnSilence(100L)
                    .numerals(true)
                    .smartFormat(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionSettings =
            TranscriptionSettings.builder()
                .apiKeyRef("api_key_ref")
                .language("language")
                .model(TranscriptionSettings.Model.DEEPGRAM_FLUX)
                .region("region")
                .settings(
                    TranscriptionSettingsConfig.builder()
                        .eagerEotThreshold(0.3)
                        .enableEndpointDetection(true)
                        .endOfTurnConfidenceThreshold(0.0)
                        .eotThreshold(0.5)
                        .eotTimeoutMs(500L)
                        .interimResults(true)
                        .keyterm("keyterm")
                        .maxEndpointDelayMs(500L)
                        .maxTurnSilence(100L)
                        .minTurnSilence(100L)
                        .numerals(true)
                        .smartFormat(true)
                        .build()
                )
                .build()

        val roundtrippedTranscriptionSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionSettings),
                jacksonTypeRef<TranscriptionSettings>(),
            )

        assertThat(roundtrippedTranscriptionSettings).isEqualTo(transcriptionSettings)
    }
}
