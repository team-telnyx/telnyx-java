// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InworldVoiceSettingsTest {

    @Test
    fun create() {
        val inworldVoiceSettings =
            InworldVoiceSettings.builder().type(InworldVoiceSettings.Type.INWORLD).build()

        assertThat(inworldVoiceSettings.type()).isEqualTo(InworldVoiceSettings.Type.INWORLD)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inworldVoiceSettings =
            InworldVoiceSettings.builder().type(InworldVoiceSettings.Type.INWORLD).build()

        val roundtrippedInworldVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inworldVoiceSettings),
                jacksonTypeRef<InworldVoiceSettings>(),
            )

        assertThat(roundtrippedInworldVoiceSettings).isEqualTo(inworldVoiceSettings)
    }
}
