// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionSettingsConfigTest {

    @Test
    fun create() {
        val transcriptionSettingsConfig =
            TranscriptionSettingsConfig.builder()
                .eagerEotThreshold(0.3)
                .endOfTurnConfidenceThreshold(0.0)
                .eotThreshold(0.5)
                .eotTimeoutMs(500L)
                .keyterm("keyterm")
                .maxTurnSilence(100L)
                .minTurnSilence(100L)
                .numerals(true)
                .smartFormat(true)
                .build()

        assertThat(transcriptionSettingsConfig.eagerEotThreshold()).contains(0.3)
        assertThat(transcriptionSettingsConfig.endOfTurnConfidenceThreshold()).contains(0.0)
        assertThat(transcriptionSettingsConfig.eotThreshold()).contains(0.5)
        assertThat(transcriptionSettingsConfig.eotTimeoutMs()).contains(500L)
        assertThat(transcriptionSettingsConfig.keyterm()).contains("keyterm")
        assertThat(transcriptionSettingsConfig.maxTurnSilence()).contains(100L)
        assertThat(transcriptionSettingsConfig.minTurnSilence()).contains(100L)
        assertThat(transcriptionSettingsConfig.numerals()).contains(true)
        assertThat(transcriptionSettingsConfig.smartFormat()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionSettingsConfig =
            TranscriptionSettingsConfig.builder()
                .eagerEotThreshold(0.3)
                .endOfTurnConfidenceThreshold(0.0)
                .eotThreshold(0.5)
                .eotTimeoutMs(500L)
                .keyterm("keyterm")
                .maxTurnSilence(100L)
                .minTurnSilence(100L)
                .numerals(true)
                .smartFormat(true)
                .build()

        val roundtrippedTranscriptionSettingsConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionSettingsConfig),
                jacksonTypeRef<TranscriptionSettingsConfig>(),
            )

        assertThat(roundtrippedTranscriptionSettingsConfig).isEqualTo(transcriptionSettingsConfig)
    }
}
