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
                .eotThreshold(0.0)
                .eotTimeoutMs(0L)
                .numerals(true)
                .smartFormat(true)
                .build()

        assertThat(transcriptionSettingsConfig.eagerEotThreshold()).contains(0.3)
        assertThat(transcriptionSettingsConfig.eotThreshold()).contains(0.0)
        assertThat(transcriptionSettingsConfig.eotTimeoutMs()).contains(0L)
        assertThat(transcriptionSettingsConfig.numerals()).contains(true)
        assertThat(transcriptionSettingsConfig.smartFormat()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionSettingsConfig =
            TranscriptionSettingsConfig.builder()
                .eagerEotThreshold(0.3)
                .eotThreshold(0.0)
                .eotTimeoutMs(0L)
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
