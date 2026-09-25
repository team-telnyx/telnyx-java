// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferenceEmbeddingVoiceSettingsTest {

    @Test
    fun create() {
        val inferenceEmbeddingVoiceSettings =
            InferenceEmbeddingVoiceSettings.builder()
                .voice("voice")
                .apiKeyRef("api_key_ref")
                .backgroundAudio(
                    InferenceEmbeddingVoiceSettings.BackgroundAudio.UnionMember0.builder()
                        .type(
                            InferenceEmbeddingVoiceSettings.BackgroundAudio.UnionMember0.Type
                                .PREDEFINED_MEDIA
                        )
                        .value(
                            InferenceEmbeddingVoiceSettings.BackgroundAudio.UnionMember0.Value_
                                .SILENCE
                        )
                        .volume(0.1)
                        .build()
                )
                .expressiveMode(true)
                .languageBoost(InferenceEmbeddingVoiceSettings.LanguageBoost.AUTO)
                .similarityBoost(0.0)
                .speed(0.0)
                .style(0.0)
                .temperature(0.0)
                .useSpeakerBoost(true)
                .voiceSpeed(0.0)
                .build()

        assertThat(inferenceEmbeddingVoiceSettings.voice()).isEqualTo("voice")
        assertThat(inferenceEmbeddingVoiceSettings.apiKeyRef()).contains("api_key_ref")
        assertThat(inferenceEmbeddingVoiceSettings.backgroundAudio())
            .contains(
                InferenceEmbeddingVoiceSettings.BackgroundAudio.ofUnionMember0(
                    InferenceEmbeddingVoiceSettings.BackgroundAudio.UnionMember0.builder()
                        .type(
                            InferenceEmbeddingVoiceSettings.BackgroundAudio.UnionMember0.Type
                                .PREDEFINED_MEDIA
                        )
                        .value(
                            InferenceEmbeddingVoiceSettings.BackgroundAudio.UnionMember0.Value_
                                .SILENCE
                        )
                        .volume(0.1)
                        .build()
                )
            )
        assertThat(inferenceEmbeddingVoiceSettings.expressiveMode()).contains(true)
        assertThat(inferenceEmbeddingVoiceSettings.languageBoost())
            .contains(InferenceEmbeddingVoiceSettings.LanguageBoost.AUTO)
        assertThat(inferenceEmbeddingVoiceSettings.similarityBoost()).contains(0.0)
        assertThat(inferenceEmbeddingVoiceSettings.speed()).contains(0.0)
        assertThat(inferenceEmbeddingVoiceSettings.style()).contains(0.0)
        assertThat(inferenceEmbeddingVoiceSettings.temperature()).contains(0.0)
        assertThat(inferenceEmbeddingVoiceSettings.useSpeakerBoost()).contains(true)
        assertThat(inferenceEmbeddingVoiceSettings.voiceSpeed()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inferenceEmbeddingVoiceSettings =
            InferenceEmbeddingVoiceSettings.builder()
                .voice("voice")
                .apiKeyRef("api_key_ref")
                .backgroundAudio(
                    InferenceEmbeddingVoiceSettings.BackgroundAudio.UnionMember0.builder()
                        .type(
                            InferenceEmbeddingVoiceSettings.BackgroundAudio.UnionMember0.Type
                                .PREDEFINED_MEDIA
                        )
                        .value(
                            InferenceEmbeddingVoiceSettings.BackgroundAudio.UnionMember0.Value_
                                .SILENCE
                        )
                        .volume(0.1)
                        .build()
                )
                .expressiveMode(true)
                .languageBoost(InferenceEmbeddingVoiceSettings.LanguageBoost.AUTO)
                .similarityBoost(0.0)
                .speed(0.0)
                .style(0.0)
                .temperature(0.0)
                .useSpeakerBoost(true)
                .voiceSpeed(0.0)
                .build()

        val roundtrippedInferenceEmbeddingVoiceSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inferenceEmbeddingVoiceSettings),
                jacksonTypeRef<InferenceEmbeddingVoiceSettings>(),
            )

        assertThat(roundtrippedInferenceEmbeddingVoiceSettings)
            .isEqualTo(inferenceEmbeddingVoiceSettings)
    }
}
