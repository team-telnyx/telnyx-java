// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceSettingsTest {

    @Test
    fun create() {
        val voiceSettings =
            VoiceSettings.builder()
                .voice("voice")
                .apiKeyRef("api_key_ref")
                .backgroundAudio(
                    VoiceSettings.BackgroundAudio.UnionMember0.builder()
                        .type(VoiceSettings.BackgroundAudio.UnionMember0.Type.PREDEFINED_MEDIA)
                        .value(VoiceSettings.BackgroundAudio.UnionMember0.Value_.SILENCE)
                        .build()
                )
                .voiceSpeed(0.0)
                .build()

        assertThat(voiceSettings.voice()).isEqualTo("voice")
        assertThat(voiceSettings.apiKeyRef()).contains("api_key_ref")
        assertThat(voiceSettings.backgroundAudio())
            .contains(
                VoiceSettings.BackgroundAudio.ofUnionMember0(
                    VoiceSettings.BackgroundAudio.UnionMember0.builder()
                        .type(VoiceSettings.BackgroundAudio.UnionMember0.Type.PREDEFINED_MEDIA)
                        .value(VoiceSettings.BackgroundAudio.UnionMember0.Value_.SILENCE)
                        .build()
                )
            )
        assertThat(voiceSettings.voiceSpeed()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceSettings =
            VoiceSettings.builder()
                .voice("voice")
                .apiKeyRef("api_key_ref")
                .backgroundAudio(
                    VoiceSettings.BackgroundAudio.UnionMember0.builder()
                        .type(VoiceSettings.BackgroundAudio.UnionMember0.Type.PREDEFINED_MEDIA)
                        .value(VoiceSettings.BackgroundAudio.UnionMember0.Value_.SILENCE)
                        .build()
                )
                .voiceSpeed(0.0)
                .build()

        val roundtrippedVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceSettings),
                jacksonTypeRef<VoiceSettings>(),
            )

        assertThat(roundtrippedVoiceSettings).isEqualTo(voiceSettings)
    }
}
