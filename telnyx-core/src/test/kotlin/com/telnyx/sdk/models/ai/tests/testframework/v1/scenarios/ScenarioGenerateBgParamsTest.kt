// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioGenerateBgParamsTest {

    @Test
    fun create() {
        ScenarioGenerateBgParams.builder()
            .numScenarios(5L)
            .agentId(1259L)
            .extraInstructions("Focus on angry customers asking about refunds.")
            .firstMessage("first_message")
            .folderPath("folder_path")
            .generateExpectedOutcomes(true)
            .inboundPhoneNumber(0L)
            .addPersonality(0L)
            .scenarioType(ScenarioGenerateBgParams.ScenarioType.WORKFLOW)
            .addTag("string")
            .testProfile(0L)
            .addToolId("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            ScenarioGenerateBgParams.builder()
                .numScenarios(5L)
                .agentId(1259L)
                .extraInstructions("Focus on angry customers asking about refunds.")
                .firstMessage("first_message")
                .folderPath("folder_path")
                .generateExpectedOutcomes(true)
                .inboundPhoneNumber(0L)
                .addPersonality(0L)
                .scenarioType(ScenarioGenerateBgParams.ScenarioType.WORKFLOW)
                .addTag("string")
                .testProfile(0L)
                .addToolId("string")
                .build()

        val body = params._body()

        assertThat(body.numScenarios()).isEqualTo(5L)
        assertThat(body.agentId()).contains(1259L)
        assertThat(body.extraInstructions())
            .contains("Focus on angry customers asking about refunds.")
        assertThat(body.firstMessage()).contains("first_message")
        assertThat(body.folderPath()).contains("folder_path")
        assertThat(body.generateExpectedOutcomes()).contains(true)
        assertThat(body.inboundPhoneNumber()).contains(0L)
        assertThat(body.personalities().getOrNull()).containsExactly(0L)
        assertThat(body.scenarioType()).contains(ScenarioGenerateBgParams.ScenarioType.WORKFLOW)
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.testProfile()).contains(0L)
        assertThat(body.toolIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ScenarioGenerateBgParams.builder().numScenarios(5L).build()

        val body = params._body()

        assertThat(body.numScenarios()).isEqualTo(5L)
    }
}
