// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RimeVoiceSettingsTest {

    @Test
    fun create() {
        val rimeVoiceSettings =
            RimeVoiceSettings.builder().type(RimeVoiceSettings.Type.RIME).voiceSpeed(1.0f).build()

        assertThat(rimeVoiceSettings.type()).isEqualTo(RimeVoiceSettings.Type.RIME)
        assertThat(rimeVoiceSettings.voiceSpeed()).contains(1.0f)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rimeVoiceSettings =
            RimeVoiceSettings.builder().type(RimeVoiceSettings.Type.RIME).voiceSpeed(1.0f).build()

        val roundtrippedRimeVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rimeVoiceSettings),
                jacksonTypeRef<RimeVoiceSettings>(),
            )

        assertThat(roundtrippedRimeVoiceSettings).isEqualTo(rimeVoiceSettings)
    }
}
