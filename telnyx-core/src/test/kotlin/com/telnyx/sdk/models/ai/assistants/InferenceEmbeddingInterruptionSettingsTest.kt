// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferenceEmbeddingInterruptionSettingsTest {

    @Test
    fun create() {
        val inferenceEmbeddingInterruptionSettings =
            InferenceEmbeddingInterruptionSettings.builder()
                .disableGreetingInterruption(true)
                .enable(true)
                .startSpeakingPlan(
                    StartSpeakingPlan.builder()
                        .transcriptionEndpointingPlan(
                            TranscriptionEndpointingPlan.builder()
                                .onNoPunctuationSeconds(0.0f)
                                .onNumberSeconds(0.0f)
                                .onPunctuationSeconds(0.0f)
                                .build()
                        )
                        .waitSeconds(0.0f)
                        .build()
                )
                .build()

        assertThat(inferenceEmbeddingInterruptionSettings.disableGreetingInterruption())
            .contains(true)
        assertThat(inferenceEmbeddingInterruptionSettings.enable()).contains(true)
        assertThat(inferenceEmbeddingInterruptionSettings.startSpeakingPlan())
            .contains(
                StartSpeakingPlan.builder()
                    .transcriptionEndpointingPlan(
                        TranscriptionEndpointingPlan.builder()
                            .onNoPunctuationSeconds(0.0f)
                            .onNumberSeconds(0.0f)
                            .onPunctuationSeconds(0.0f)
                            .build()
                    )
                    .waitSeconds(0.0f)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inferenceEmbeddingInterruptionSettings =
            InferenceEmbeddingInterruptionSettings.builder()
                .disableGreetingInterruption(true)
                .enable(true)
                .startSpeakingPlan(
                    StartSpeakingPlan.builder()
                        .transcriptionEndpointingPlan(
                            TranscriptionEndpointingPlan.builder()
                                .onNoPunctuationSeconds(0.0f)
                                .onNumberSeconds(0.0f)
                                .onPunctuationSeconds(0.0f)
                                .build()
                        )
                        .waitSeconds(0.0f)
                        .build()
                )
                .build()

        val roundtrippedInferenceEmbeddingInterruptionSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inferenceEmbeddingInterruptionSettings),
                jacksonTypeRef<InferenceEmbeddingInterruptionSettings>(),
            )

        assertThat(roundtrippedInferenceEmbeddingInterruptionSettings)
            .isEqualTo(inferenceEmbeddingInterruptionSettings)
    }
}
