// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricUpdateParamsTest {

    @Test
    fun create() {
        MetricUpdateParams.builder()
            .id(0L)
            .addToNewAgents(true)
            .addAgent(0L)
            .audioEnabled(true)
            .description("description")
            .displayOrder(0L)
            .addEnumValue("string")
            .evalType("eval_type")
            .name("Escalates on refund denial")
            .observabilityEnabled(true)
            .prompt(
                "Score the assistant's escalation behaviour between 0.0 and 1.0, considering tone."
            )
            .samplingEnabled(true)
            .simulationEnabled(true)
            .type("type")
            .build()
    }

    @Test
    fun pathParams() {
        val params = MetricUpdateParams.builder().id(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MetricUpdateParams.builder()
                .id(0L)
                .addToNewAgents(true)
                .addAgent(0L)
                .audioEnabled(true)
                .description("description")
                .displayOrder(0L)
                .addEnumValue("string")
                .evalType("eval_type")
                .name("Escalates on refund denial")
                .observabilityEnabled(true)
                .prompt(
                    "Score the assistant's escalation behaviour between 0.0 and 1.0, considering tone."
                )
                .samplingEnabled(true)
                .simulationEnabled(true)
                .type("type")
                .build()

        val body = params._body()

        assertThat(body.addToNewAgents()).contains(true)
        assertThat(body.agents().getOrNull()).containsExactly(0L)
        assertThat(body.audioEnabled()).contains(true)
        assertThat(body.description()).contains("description")
        assertThat(body.displayOrder()).contains(0L)
        assertThat(body.enumValues().getOrNull()).containsExactly("string")
        assertThat(body.evalType()).contains("eval_type")
        assertThat(body.name()).contains("Escalates on refund denial")
        assertThat(body.observabilityEnabled()).contains(true)
        assertThat(body.prompt())
            .contains(
                "Score the assistant's escalation behaviour between 0.0 and 1.0, considering tone."
            )
        assertThat(body.samplingEnabled()).contains(true)
        assertThat(body.simulationEnabled()).contains(true)
        assertThat(body.type()).contains("type")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MetricUpdateParams.builder().id(0L).build()

        val body = params._body()
    }
}
