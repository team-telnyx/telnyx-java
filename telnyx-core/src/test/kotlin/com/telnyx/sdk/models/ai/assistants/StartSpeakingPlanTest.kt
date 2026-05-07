// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StartSpeakingPlanTest {

    @Test
    fun create() {
        val startSpeakingPlan =
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

        assertThat(startSpeakingPlan.transcriptionEndpointingPlan())
            .contains(
                TranscriptionEndpointingPlan.builder()
                    .onNoPunctuationSeconds(0.0f)
                    .onNumberSeconds(0.0f)
                    .onPunctuationSeconds(0.0f)
                    .build()
            )
        assertThat(startSpeakingPlan.waitSeconds()).contains(0.0f)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val startSpeakingPlan =
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

        val roundtrippedStartSpeakingPlan =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(startSpeakingPlan),
                jacksonTypeRef<StartSpeakingPlan>(),
            )

        assertThat(roundtrippedStartSpeakingPlan).isEqualTo(startSpeakingPlan)
    }
}
