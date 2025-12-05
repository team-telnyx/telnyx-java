// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelnyxVoiceSettingsTest {

    @Test
    fun create() {
        val telnyxVoiceSettings =
            TelnyxVoiceSettings.builder()
                .type(TelnyxVoiceSettings.Type.TELNYX)
                .voiceSpeed(1.0f)
                .build()

        assertThat(telnyxVoiceSettings.type()).isEqualTo(TelnyxVoiceSettings.Type.TELNYX)
        assertThat(telnyxVoiceSettings.voiceSpeed()).contains(1.0f)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telnyxVoiceSettings =
            TelnyxVoiceSettings.builder()
                .type(TelnyxVoiceSettings.Type.TELNYX)
                .voiceSpeed(1.0f)
                .build()

        val roundtrippedTelnyxVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telnyxVoiceSettings),
                jacksonTypeRef<TelnyxVoiceSettings>(),
            )

        assertThat(roundtrippedTelnyxVoiceSettings).isEqualTo(telnyxVoiceSettings)
    }
}
