// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MinimaxVoiceSettingsTest {

    @Test
    fun create() {
        val minimaxVoiceSettings =
            MinimaxVoiceSettings.builder()
                .type(MinimaxVoiceSettings.Type.MINIMAX)
                .pitch(0L)
                .speed(1.0f)
                .vol(1.0f)
                .build()

        assertThat(minimaxVoiceSettings.type()).isEqualTo(MinimaxVoiceSettings.Type.MINIMAX)
        assertThat(minimaxVoiceSettings.pitch()).contains(0L)
        assertThat(minimaxVoiceSettings.speed()).contains(1.0f)
        assertThat(minimaxVoiceSettings.vol()).contains(1.0f)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val minimaxVoiceSettings =
            MinimaxVoiceSettings.builder()
                .type(MinimaxVoiceSettings.Type.MINIMAX)
                .pitch(0L)
                .speed(1.0f)
                .vol(1.0f)
                .build()

        val roundtrippedMinimaxVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(minimaxVoiceSettings),
                jacksonTypeRef<MinimaxVoiceSettings>(),
            )

        assertThat(roundtrippedMinimaxVoiceSettings).isEqualTo(minimaxVoiceSettings)
    }
}
