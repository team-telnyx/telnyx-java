// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XaiVoiceSettingsTest {

    @Test
    fun create() {
        val xaiVoiceSettings =
            XaiVoiceSettings.builder().type(XaiVoiceSettings.Type.XAI).language("language").build()

        assertThat(xaiVoiceSettings.type()).isEqualTo(XaiVoiceSettings.Type.XAI)
        assertThat(xaiVoiceSettings.language()).contains("language")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xaiVoiceSettings =
            XaiVoiceSettings.builder().type(XaiVoiceSettings.Type.XAI).language("language").build()

        val roundtrippedXaiVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xaiVoiceSettings),
                jacksonTypeRef<XaiVoiceSettings>(),
            )

        assertThat(roundtrippedXaiVoiceSettings).isEqualTo(xaiVoiceSettings)
    }
}
