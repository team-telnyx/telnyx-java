// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioCreateParamsTest {

    @Test
    fun create() {
        ScenarioCreateParams.builder()
            .name("Refund escalation flow")
            .personality(4643L)
            .agent(1259L)
            .expectedOutcomePrompt(
                "The assistant explains the refund policy and offers escalation."
            )
            .firstMessage("Hi, I want a refund.")
            .folderPath("folder_path")
            .instructions("Call the support line and demand a refund for a damaged product.")
            .addMetric(266881L)
            .addTag("support")
            .testProfile(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            ScenarioCreateParams.builder()
                .name("Refund escalation flow")
                .personality(4643L)
                .agent(1259L)
                .expectedOutcomePrompt(
                    "The assistant explains the refund policy and offers escalation."
                )
                .firstMessage("Hi, I want a refund.")
                .folderPath("folder_path")
                .instructions("Call the support line and demand a refund for a damaged product.")
                .addMetric(266881L)
                .addTag("support")
                .testProfile(0L)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Refund escalation flow")
        assertThat(body.personality()).isEqualTo(4643L)
        assertThat(body.agent()).contains(1259L)
        assertThat(body.expectedOutcomePrompt())
            .contains("The assistant explains the refund policy and offers escalation.")
        assertThat(body.firstMessage()).contains("Hi, I want a refund.")
        assertThat(body.folderPath()).contains("folder_path")
        assertThat(body.instructions())
            .contains("Call the support line and demand a refund for a damaged product.")
        assertThat(body.metrics().getOrNull()).containsExactly(266881L)
        assertThat(body.tags().getOrNull()).containsExactly("support")
        assertThat(body.testProfile()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ScenarioCreateParams.builder().name("Refund escalation flow").personality(4643L).build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Refund escalation flow")
        assertThat(body.personality()).isEqualTo(4643L)
    }
}
