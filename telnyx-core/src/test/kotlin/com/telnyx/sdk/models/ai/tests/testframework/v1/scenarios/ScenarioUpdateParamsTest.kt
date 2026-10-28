// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioUpdateParamsTest {

    @Test
    fun create() {
        ScenarioUpdateParams.builder()
            .id(0L)
            .agent(0L)
            .expectedOutcomePrompt("expected_outcome_prompt")
            .firstMessage("first_message")
            .folderPath("folder_path")
            .inboundPhoneNumber(0L)
            .instructions(
                "Call the support line, demand a refund, and mention the damaged packaging."
            )
            .maxDuration(0L)
            .addMetric(266881L)
            .addMetric(266882L)
            .name("Refund escalation flow - updated")
            .personality(0L)
            .phoneNumber(0L)
            .scenarioLanguage("scenario_language")
            .addTag("string")
            .testProfile(0L)
            .addToolId("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ScenarioUpdateParams.builder().id(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ScenarioUpdateParams.builder()
                .id(0L)
                .agent(0L)
                .expectedOutcomePrompt("expected_outcome_prompt")
                .firstMessage("first_message")
                .folderPath("folder_path")
                .inboundPhoneNumber(0L)
                .instructions(
                    "Call the support line, demand a refund, and mention the damaged packaging."
                )
                .maxDuration(0L)
                .addMetric(266881L)
                .addMetric(266882L)
                .name("Refund escalation flow - updated")
                .personality(0L)
                .phoneNumber(0L)
                .scenarioLanguage("scenario_language")
                .addTag("string")
                .testProfile(0L)
                .addToolId("string")
                .build()

        val body = params._body()

        assertThat(body.agent()).contains(0L)
        assertThat(body.expectedOutcomePrompt()).contains("expected_outcome_prompt")
        assertThat(body.firstMessage()).contains("first_message")
        assertThat(body.folderPath()).contains("folder_path")
        assertThat(body.inboundPhoneNumber()).contains(0L)
        assertThat(body.instructions())
            .contains("Call the support line, demand a refund, and mention the damaged packaging.")
        assertThat(body.maxDuration()).contains(0L)
        assertThat(body.metrics().getOrNull()).containsExactly(266881L, 266882L)
        assertThat(body.name()).contains("Refund escalation flow - updated")
        assertThat(body.personality()).contains(0L)
        assertThat(body.phoneNumber()).contains(0L)
        assertThat(body.scenarioLanguage()).contains("scenario_language")
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.testProfile()).contains(0L)
        assertThat(body.toolIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ScenarioUpdateParams.builder().id(0L).build()

        val body = params._body()
    }
}
