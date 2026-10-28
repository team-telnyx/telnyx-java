// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricCreateParamsTest {

    @Test
    fun create() {
        MetricCreateParams.builder()
            .createAiTestMetricRequest(
                CreateAiTestMetricRequest.builder()
                    .name("Escalates on refund denial")
                    .addToNewAgents(false)
                    .addAgent(1259L)
                    .assistantId("assistant_id")
                    .audioEnabled(true)
                    .description(
                        "Returns a score for whether the assistant escalates when the caller's refund is denied."
                    )
                    .displayOrder(0L)
                    .addEnumValue("string")
                    .evalType("continuous_qualitative")
                    .observabilityEnabled(true)
                    .prompt("Score the assistant's escalation behaviour between 0.0 and 1.0.")
                    .samplingEnabled(true)
                    .simulationEnabled(true)
                    .type("llm_judge")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            MetricCreateParams.builder()
                .createAiTestMetricRequest(
                    CreateAiTestMetricRequest.builder()
                        .name("Escalates on refund denial")
                        .addToNewAgents(false)
                        .addAgent(1259L)
                        .assistantId("assistant_id")
                        .audioEnabled(true)
                        .description(
                            "Returns a score for whether the assistant escalates when the caller's refund is denied."
                        )
                        .displayOrder(0L)
                        .addEnumValue("string")
                        .evalType("continuous_qualitative")
                        .observabilityEnabled(true)
                        .prompt("Score the assistant's escalation behaviour between 0.0 and 1.0.")
                        .samplingEnabled(true)
                        .simulationEnabled(true)
                        .type("llm_judge")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateAiTestMetricRequest.builder()
                    .name("Escalates on refund denial")
                    .addToNewAgents(false)
                    .addAgent(1259L)
                    .assistantId("assistant_id")
                    .audioEnabled(true)
                    .description(
                        "Returns a score for whether the assistant escalates when the caller's refund is denied."
                    )
                    .displayOrder(0L)
                    .addEnumValue("string")
                    .evalType("continuous_qualitative")
                    .observabilityEnabled(true)
                    .prompt("Score the assistant's escalation behaviour between 0.0 and 1.0.")
                    .samplingEnabled(true)
                    .simulationEnabled(true)
                    .type("llm_judge")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MetricCreateParams.builder()
                .createAiTestMetricRequest(
                    CreateAiTestMetricRequest.builder().name("Escalates on refund denial").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CreateAiTestMetricRequest.builder().name("Escalates on refund denial").build()
            )
    }
}
