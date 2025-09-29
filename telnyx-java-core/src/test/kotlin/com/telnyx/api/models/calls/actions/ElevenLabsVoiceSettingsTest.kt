// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ElevenLabsVoiceSettingsTest {

    @Test
    fun create() {
        val elevenLabsVoiceSettings =
            ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()

        assertThat(elevenLabsVoiceSettings.apiKeyRef()).contains("my_elevenlabs_api_key")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val elevenLabsVoiceSettings =
            ElevenLabsVoiceSettings.builder().apiKeyRef("my_elevenlabs_api_key").build()

        val roundtrippedElevenLabsVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(elevenLabsVoiceSettings),
                jacksonTypeRef<ElevenLabsVoiceSettings>(),
            )

        assertThat(roundtrippedElevenLabsVoiceSettings).isEqualTo(elevenLabsVoiceSettings)
    }
}
