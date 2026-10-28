// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioScenarioAgentParamsTest {

    @Test
    fun create() {
        ScenarioScenarioAgentParams.builder()
            .scenarios("all")
            .userMessage("Make the callers ask about damaged packaging too.")
            .agentId(1259L)
            .agentResolutionResponse("agent_resolution_response")
            .applyChanges(true)
            .addContext(
                ScenarioScenarioAgentParams.Context.builder()
                    .content("content")
                    .role("role")
                    .timestamp("timestamp")
                    .build()
            )
            .addKnowledgeBase(0L)
            .numScenarios(0L)
            .addPendingToolCall(
                ScenarioScenarioAgentParams.PendingToolCall.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addScenariosNeedingAgent(0L)
            .sessionId(0L)
            .addUpdatedScenario(
                ScenarioScenarioAgentParams.UpdatedScenario.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ScenarioScenarioAgentParams.builder()
                .scenarios("all")
                .userMessage("Make the callers ask about damaged packaging too.")
                .agentId(1259L)
                .agentResolutionResponse("agent_resolution_response")
                .applyChanges(true)
                .addContext(
                    ScenarioScenarioAgentParams.Context.builder()
                        .content("content")
                        .role("role")
                        .timestamp("timestamp")
                        .build()
                )
                .addKnowledgeBase(0L)
                .numScenarios(0L)
                .addPendingToolCall(
                    ScenarioScenarioAgentParams.PendingToolCall.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addScenariosNeedingAgent(0L)
                .sessionId(0L)
                .addUpdatedScenario(
                    ScenarioScenarioAgentParams.UpdatedScenario.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.scenarios())
            .isEqualTo(ScenarioScenarioAgentParams.Scenarios.ofString("all"))
        assertThat(body.userMessage())
            .isEqualTo("Make the callers ask about damaged packaging too.")
        assertThat(body.agentId()).contains(1259L)
        assertThat(body.agentResolutionResponse()).contains("agent_resolution_response")
        assertThat(body.applyChanges()).contains(true)
        assertThat(body.context().getOrNull())
            .containsExactly(
                ScenarioScenarioAgentParams.Context.builder()
                    .content("content")
                    .role("role")
                    .timestamp("timestamp")
                    .build()
            )
        assertThat(body.knowledgeBase().getOrNull()).containsExactly(0L)
        assertThat(body.numScenarios()).contains(0L)
        assertThat(body.pendingToolCalls().getOrNull())
            .containsExactly(
                ScenarioScenarioAgentParams.PendingToolCall.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.scenariosNeedingAgent().getOrNull()).containsExactly(0L)
        assertThat(body.sessionId()).contains(0L)
        assertThat(body.updatedScenarios().getOrNull())
            .containsExactly(
                ScenarioScenarioAgentParams.UpdatedScenario.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ScenarioScenarioAgentParams.builder()
                .scenarios("all")
                .userMessage("Make the callers ask about damaged packaging too.")
                .build()

        val body = params._body()

        assertThat(body.scenarios())
            .isEqualTo(ScenarioScenarioAgentParams.Scenarios.ofString("all"))
        assertThat(body.userMessage())
            .isEqualTo("Make the callers ask about damaged packaging too.")
    }
}
