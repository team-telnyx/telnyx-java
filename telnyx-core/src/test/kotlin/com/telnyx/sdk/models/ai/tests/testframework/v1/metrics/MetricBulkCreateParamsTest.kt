// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricBulkCreateParamsTest {

    @Test
    fun create() {
        MetricBulkCreateParams.builder()
            .addBody(
                CreateAiTestMetricRequest.builder()
                    .name("Greets within 5 seconds")
                    .addToNewAgents(false)
                    .addAgent(1259L)
                    .assistantId("assistant_id")
                    .audioEnabled(true)
                    .description(
                        "Returns whether the assistant greeted the caller within five seconds."
                    )
                    .displayOrder(0L)
                    .addEnumValue("string")
                    .evalType("continuous_qualitative")
                    .observabilityEnabled(true)
                    .prompt("Score whether the greeting was timely and natural.")
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
            MetricBulkCreateParams.builder()
                .addBody(
                    CreateAiTestMetricRequest.builder()
                        .name("Greets within 5 seconds")
                        .addToNewAgents(false)
                        .addAgent(1259L)
                        .assistantId("assistant_id")
                        .audioEnabled(true)
                        .description(
                            "Returns whether the assistant greeted the caller within five seconds."
                        )
                        .displayOrder(0L)
                        .addEnumValue("string")
                        .evalType("continuous_qualitative")
                        .observabilityEnabled(true)
                        .prompt("Score whether the greeting was timely and natural.")
                        .samplingEnabled(true)
                        .simulationEnabled(true)
                        .type("llm_judge")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                CreateAiTestMetricRequest.builder()
                    .name("Greets within 5 seconds")
                    .addToNewAgents(false)
                    .addAgent(1259L)
                    .assistantId("assistant_id")
                    .audioEnabled(true)
                    .description(
                        "Returns whether the assistant greeted the caller within five seconds."
                    )
                    .displayOrder(0L)
                    .addEnumValue("string")
                    .evalType("continuous_qualitative")
                    .observabilityEnabled(true)
                    .prompt("Score whether the greeting was timely and natural.")
                    .samplingEnabled(true)
                    .simulationEnabled(true)
                    .type("llm_judge")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MetricBulkCreateParams.builder()
                .addBody(
                    CreateAiTestMetricRequest.builder().name("Greets within 5 seconds").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                CreateAiTestMetricRequest.builder().name("Greets within 5 seconds").build()
            )
    }
}
