// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioScenarioAgentResponseTest {

    @Test
    fun create() {
        val scenarioScenarioAgentResponse =
            ScenarioScenarioAgentResponse.builder()
                .progressId("c8f5d2b3-4e5f-6a7b-9c0d-1f2a3b4c5d6e")
                .sessionId(417L)
                .build()

        assertThat(scenarioScenarioAgentResponse.progressId())
            .isEqualTo("c8f5d2b3-4e5f-6a7b-9c0d-1f2a3b4c5d6e")
        assertThat(scenarioScenarioAgentResponse.sessionId()).contains(417L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scenarioScenarioAgentResponse =
            ScenarioScenarioAgentResponse.builder()
                .progressId("c8f5d2b3-4e5f-6a7b-9c0d-1f2a3b4c5d6e")
                .sessionId(417L)
                .build()

        val roundtrippedScenarioScenarioAgentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scenarioScenarioAgentResponse),
                jacksonTypeRef<ScenarioScenarioAgentResponse>(),
            )

        assertThat(roundtrippedScenarioScenarioAgentResponse)
            .isEqualTo(scenarioScenarioAgentResponse)
    }
}
