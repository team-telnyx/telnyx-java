// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FlowEdgeTest {

    @Test
    fun create() {
        val flowEdge =
            FlowEdge.builder()
                .id("e_age_gate")
                .llmCondition("The user has confirmed their booking details.")
                .startNodeId("start_node_id")
                .nodeTarget("n_billing")
                .build()

        assertThat(flowEdge.id()).isEqualTo("e_age_gate")
        assertThat(flowEdge.condition())
            .isEqualTo(
                FlowEdge.Condition.ofLlm(
                    FlowEdge.Condition.Llm.builder()
                        .prompt("The user has confirmed their booking details.")
                        .build()
                )
            )
        assertThat(flowEdge.startNodeId()).isEqualTo("start_node_id")
        assertThat(flowEdge.target())
            .isEqualTo(
                FlowEdge.Target.ofNode(FlowEdge.Target.Node.builder().nodeId("n_billing").build())
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val flowEdge =
            FlowEdge.builder()
                .id("e_age_gate")
                .llmCondition("The user has confirmed their booking details.")
                .startNodeId("start_node_id")
                .nodeTarget("n_billing")
                .build()

        val roundtrippedFlowEdge =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(flowEdge),
                jacksonTypeRef<FlowEdge>(),
            )

        assertThat(roundtrippedFlowEdge).isEqualTo(flowEdge)
    }
}
