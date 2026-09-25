// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SonioxVoiceSettingsTest {

    @Test
    fun create() {
        val sonioxVoiceSettings =
            SonioxVoiceSettings.builder()
                .type(SonioxVoiceSettings.Type.SONIOX)
                .reduceSilence(true)
                .speed(0.7f)
                .build()

        assertThat(sonioxVoiceSettings.type()).isEqualTo(SonioxVoiceSettings.Type.SONIOX)
        assertThat(sonioxVoiceSettings.reduceSilence()).contains(true)
        assertThat(sonioxVoiceSettings.speed()).contains(0.7f)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sonioxVoiceSettings =
            SonioxVoiceSettings.builder()
                .type(SonioxVoiceSettings.Type.SONIOX)
                .reduceSilence(true)
                .speed(0.7f)
                .build()

        val roundtrippedSonioxVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sonioxVoiceSettings),
                jacksonTypeRef<SonioxVoiceSettings>(),
            )

        assertThat(roundtrippedSonioxVoiceSettings).isEqualTo(sonioxVoiceSettings)
    }
}
