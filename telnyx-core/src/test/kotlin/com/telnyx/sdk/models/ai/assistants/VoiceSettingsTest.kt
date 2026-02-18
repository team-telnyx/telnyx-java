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
                .predefinedMediaBackgroundAudio(
                    VoiceSettings.BackgroundAudio.PredefinedMedia.PredefinedMediaValue.SILENCE
                )
                .languageBoost(VoiceSettings.LanguageBoost.AUTO)
                .similarityBoost(0.0)
                .speed(0.0)
                .style(0.0)
                .temperature(0.0)
                .useSpeakerBoost(true)
                .voiceSpeed(0.0)
                .build()

        assertThat(voiceSettings.voice()).isEqualTo("voice")
        assertThat(voiceSettings.apiKeyRef()).contains("api_key_ref")
        assertThat(voiceSettings.backgroundAudio())
            .contains(
                VoiceSettings.BackgroundAudio.ofPredefinedMedia(
                    VoiceSettings.BackgroundAudio.PredefinedMedia.builder()
                        .value(
                            VoiceSettings.BackgroundAudio.PredefinedMedia.PredefinedMediaValue
                                .SILENCE
                        )
                        .build()
                )
            )
        assertThat(voiceSettings.languageBoost()).contains(VoiceSettings.LanguageBoost.AUTO)
        assertThat(voiceSettings.similarityBoost()).contains(0.0)
        assertThat(voiceSettings.speed()).contains(0.0)
        assertThat(voiceSettings.style()).contains(0.0)
        assertThat(voiceSettings.temperature()).contains(0.0)
        assertThat(voiceSettings.useSpeakerBoost()).contains(true)
        assertThat(voiceSettings.voiceSpeed()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceSettings =
            VoiceSettings.builder()
                .voice("voice")
                .apiKeyRef("api_key_ref")
                .predefinedMediaBackgroundAudio(
                    VoiceSettings.BackgroundAudio.PredefinedMedia.PredefinedMediaValue.SILENCE
                )
                .languageBoost(VoiceSettings.LanguageBoost.AUTO)
                .similarityBoost(0.0)
                .speed(0.0)
                .style(0.0)
                .temperature(0.0)
                .useSpeakerBoost(true)
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
