// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResembleVoiceSettingsTest {

    @Test
    fun create() {
        val resembleVoiceSettings =
            ResembleVoiceSettings.builder()
                .type(ResembleVoiceSettings.Type.RESEMBLE)
                .format(ResembleVoiceSettings.Format.WAV)
                .precision(ResembleVoiceSettings.Precision.PCM_16)
                .sampleRate(ResembleVoiceSettings.SampleRate._8000)
                .build()

        assertThat(resembleVoiceSettings.type()).isEqualTo(ResembleVoiceSettings.Type.RESEMBLE)
        assertThat(resembleVoiceSettings.format()).contains(ResembleVoiceSettings.Format.WAV)
        assertThat(resembleVoiceSettings.precision())
            .contains(ResembleVoiceSettings.Precision.PCM_16)
        assertThat(resembleVoiceSettings.sampleRate())
            .contains(ResembleVoiceSettings.SampleRate._8000)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val resembleVoiceSettings =
            ResembleVoiceSettings.builder()
                .type(ResembleVoiceSettings.Type.RESEMBLE)
                .format(ResembleVoiceSettings.Format.WAV)
                .precision(ResembleVoiceSettings.Precision.PCM_16)
                .sampleRate(ResembleVoiceSettings.SampleRate._8000)
                .build()

        val roundtrippedResembleVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(resembleVoiceSettings),
                jacksonTypeRef<ResembleVoiceSettings>(),
            )

        assertThat(roundtrippedResembleVoiceSettings).isEqualTo(resembleVoiceSettings)
    }
}
