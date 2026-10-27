// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioGenerationResponseTest {

    @Test
    fun create() {
        val scenarioGenerationResponse =
            ScenarioGenerationResponse.builder()
                .progressId("b7e4c1a2-3d4f-5a6b-8c9d-0e1f2a3b4c5d")
                .build()

        assertThat(scenarioGenerationResponse.progressId())
            .isEqualTo("b7e4c1a2-3d4f-5a6b-8c9d-0e1f2a3b4c5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scenarioGenerationResponse =
            ScenarioGenerationResponse.builder()
                .progressId("b7e4c1a2-3d4f-5a6b-8c9d-0e1f2a3b4c5d")
                .build()

        val roundtrippedScenarioGenerationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scenarioGenerationResponse),
                jacksonTypeRef<ScenarioGenerationResponse>(),
            )

        assertThat(roundtrippedScenarioGenerationResponse).isEqualTo(scenarioGenerationResponse)
    }
}
