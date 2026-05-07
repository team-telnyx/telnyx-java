// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionEndpointingPlanTest {

    @Test
    fun create() {
        val transcriptionEndpointingPlan =
            TranscriptionEndpointingPlan.builder()
                .onNoPunctuationSeconds(0.0f)
                .onNumberSeconds(0.0f)
                .onPunctuationSeconds(0.0f)
                .build()

        assertThat(transcriptionEndpointingPlan.onNoPunctuationSeconds()).contains(0.0f)
        assertThat(transcriptionEndpointingPlan.onNumberSeconds()).contains(0.0f)
        assertThat(transcriptionEndpointingPlan.onPunctuationSeconds()).contains(0.0f)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionEndpointingPlan =
            TranscriptionEndpointingPlan.builder()
                .onNoPunctuationSeconds(0.0f)
                .onNumberSeconds(0.0f)
                .onPunctuationSeconds(0.0f)
                .build()

        val roundtrippedTranscriptionEndpointingPlan =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionEndpointingPlan),
                jacksonTypeRef<TranscriptionEndpointingPlan>(),
            )

        assertThat(roundtrippedTranscriptionEndpointingPlan).isEqualTo(transcriptionEndpointingPlan)
    }
}
