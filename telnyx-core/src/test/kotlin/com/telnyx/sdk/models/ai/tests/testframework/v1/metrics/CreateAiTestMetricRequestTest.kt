// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateAiTestMetricRequestTest {

    @Test
    fun create() {
        val createAiTestMetricRequest =
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

        assertThat(createAiTestMetricRequest.name()).isEqualTo("Escalates on refund denial")
        assertThat(createAiTestMetricRequest.addToNewAgents()).contains(false)
        assertThat(createAiTestMetricRequest.agents().getOrNull()).containsExactly(1259L)
        assertThat(createAiTestMetricRequest.assistantId()).contains("assistant_id")
        assertThat(createAiTestMetricRequest.audioEnabled()).contains(true)
        assertThat(createAiTestMetricRequest.description())
            .contains(
                "Returns a score for whether the assistant escalates when the caller's refund is denied."
            )
        assertThat(createAiTestMetricRequest.displayOrder()).contains(0L)
        assertThat(createAiTestMetricRequest.enumValues().getOrNull()).containsExactly("string")
        assertThat(createAiTestMetricRequest.evalType()).contains("continuous_qualitative")
        assertThat(createAiTestMetricRequest.observabilityEnabled()).contains(true)
        assertThat(createAiTestMetricRequest.prompt())
            .contains("Score the assistant's escalation behaviour between 0.0 and 1.0.")
        assertThat(createAiTestMetricRequest.samplingEnabled()).contains(true)
        assertThat(createAiTestMetricRequest.simulationEnabled()).contains(true)
        assertThat(createAiTestMetricRequest.type()).contains("llm_judge")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createAiTestMetricRequest =
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

        val roundtrippedCreateAiTestMetricRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createAiTestMetricRequest),
                jacksonTypeRef<CreateAiTestMetricRequest>(),
            )

        assertThat(roundtrippedCreateAiTestMetricRequest).isEqualTo(createAiTestMetricRequest)
    }
}
