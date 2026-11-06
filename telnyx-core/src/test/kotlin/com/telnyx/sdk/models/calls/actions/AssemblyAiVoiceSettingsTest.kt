// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssemblyAiVoiceSettingsTest {

    @Test
    fun create() {
        val assemblyAiVoiceSettings =
            AssemblyAiVoiceSettings.builder().type(AssemblyAiVoiceSettings.Type.ASSEMBLYAI).build()

        assertThat(assemblyAiVoiceSettings.type())
            .isEqualTo(AssemblyAiVoiceSettings.Type.ASSEMBLYAI)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assemblyAiVoiceSettings =
            AssemblyAiVoiceSettings.builder().type(AssemblyAiVoiceSettings.Type.ASSEMBLYAI).build()

        val roundtrippedAssemblyAiVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assemblyAiVoiceSettings),
                jacksonTypeRef<AssemblyAiVoiceSettings>(),
            )

        assertThat(roundtrippedAssemblyAiVoiceSettings).isEqualTo(assemblyAiVoiceSettings)
    }
}
