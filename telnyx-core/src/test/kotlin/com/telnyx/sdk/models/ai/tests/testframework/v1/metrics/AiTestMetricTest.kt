// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiTestMetricTest {

    @Test
    fun create() {
        val aiTestMetric =
            AiTestMetric.builder()
                .id(266881L)
                .evalType("numeric")
                .name("AI interrupting user")
                .type("custom_code")
                .addToNewAgents(true)
                .agent(null)
                .addAgentName("string")
                .addAgent(0L)
                .alertFilters(AiTestMetric.AlertFilters.builder().build())
                .alertType("disabled")
                .audioEnabled(false)
                .configuration(AiTestMetric.Configuration.builder().build())
                .description(
                    "Tells if the AI (main agent) interrupted user (testing agent) during the interaction."
                )
                .displayOrder(1L)
                .addEnumValue("string")
                .evaluationTrigger("always")
                .evaluationTriggerCustomCode("")
                .evaluationTriggerPrompt("")
                .ewmaAlpha(0.1)
                .functionName("get_main_agent_interruption")
                .addKbFileId(0L)
                .addKnowledgeBaseFile("string")
                .metricCost(0.0)
                .observabilityEnabled(true)
                .overallScore(0.0)
                .priorityAssignmentPrompt("")
                .project(16003L)
                .prompt("")
                .sampleRate(null)
                .samplingEnabled(false)
                .significantChangeAlertDirection("")
                .significantChangeAlertStatus("disabled")
                .simulationEnabled(true)
                .slug("ai_interrupting_user")
                .stdMultiplier(2.0)
                .totalScore(0.0)
                .triggerType("llm_judge")
                .userDefined(false)
                .usesLlmJudge(false)
                .windowSize(50L)
                .build()

        assertThat(aiTestMetric.id()).isEqualTo(266881L)
        assertThat(aiTestMetric.evalType()).isEqualTo("numeric")
        assertThat(aiTestMetric.name()).isEqualTo("AI interrupting user")
        assertThat(aiTestMetric.type()).isEqualTo("custom_code")
        assertThat(aiTestMetric.addToNewAgents()).contains(true)
        assertThat(aiTestMetric.agent()).isEmpty
        assertThat(aiTestMetric.agentNames().getOrNull()).containsExactly("string")
        assertThat(aiTestMetric.agents().getOrNull()).containsExactly(0L)
        assertThat(aiTestMetric.alertFilters())
            .contains(AiTestMetric.AlertFilters.builder().build())
        assertThat(aiTestMetric.alertType()).contains("disabled")
        assertThat(aiTestMetric.audioEnabled()).contains(false)
        assertThat(aiTestMetric.configuration())
            .contains(AiTestMetric.Configuration.builder().build())
        assertThat(aiTestMetric.description())
            .contains(
                "Tells if the AI (main agent) interrupted user (testing agent) during the interaction."
            )
        assertThat(aiTestMetric.displayOrder()).contains(1L)
        assertThat(aiTestMetric.enumValues().getOrNull()).containsExactly("string")
        assertThat(aiTestMetric.evaluationTrigger()).contains("always")
        assertThat(aiTestMetric.evaluationTriggerCustomCode()).contains("")
        assertThat(aiTestMetric.evaluationTriggerPrompt()).contains("")
        assertThat(aiTestMetric.ewmaAlpha()).contains(0.1)
        assertThat(aiTestMetric.functionName()).contains("get_main_agent_interruption")
        assertThat(aiTestMetric.kbFileIds().getOrNull()).containsExactly(0L)
        assertThat(aiTestMetric.knowledgeBaseFiles().getOrNull()).containsExactly("string")
        assertThat(aiTestMetric.metricCost()).contains(0.0)
        assertThat(aiTestMetric.observabilityEnabled()).contains(true)
        assertThat(aiTestMetric.overallScore()).contains(AiTestMetric.OverallScore.ofNumber(0.0))
        assertThat(aiTestMetric.priorityAssignmentPrompt()).contains("")
        assertThat(aiTestMetric.project()).contains(16003L)
        assertThat(aiTestMetric.prompt()).contains("")
        assertThat(aiTestMetric.sampleRate()).isEmpty
        assertThat(aiTestMetric.samplingEnabled()).contains(false)
        assertThat(aiTestMetric.significantChangeAlertDirection()).contains("")
        assertThat(aiTestMetric.significantChangeAlertStatus()).contains("disabled")
        assertThat(aiTestMetric.simulationEnabled()).contains(true)
        assertThat(aiTestMetric.slug()).contains("ai_interrupting_user")
        assertThat(aiTestMetric.stdMultiplier()).contains(2.0)
        assertThat(aiTestMetric.totalScore()).contains(AiTestMetric.TotalScore.ofNumber(0.0))
        assertThat(aiTestMetric.triggerType()).contains("llm_judge")
        assertThat(aiTestMetric.userDefined()).contains(false)
        assertThat(aiTestMetric.usesLlmJudge()).contains(false)
        assertThat(aiTestMetric.windowSize()).contains(50L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiTestMetric =
            AiTestMetric.builder()
                .id(266881L)
                .evalType("numeric")
                .name("AI interrupting user")
                .type("custom_code")
                .addToNewAgents(true)
                .agent(null)
                .addAgentName("string")
                .addAgent(0L)
                .alertFilters(AiTestMetric.AlertFilters.builder().build())
                .alertType("disabled")
                .audioEnabled(false)
                .configuration(AiTestMetric.Configuration.builder().build())
                .description(
                    "Tells if the AI (main agent) interrupted user (testing agent) during the interaction."
                )
                .displayOrder(1L)
                .addEnumValue("string")
                .evaluationTrigger("always")
                .evaluationTriggerCustomCode("")
                .evaluationTriggerPrompt("")
                .ewmaAlpha(0.1)
                .functionName("get_main_agent_interruption")
                .addKbFileId(0L)
                .addKnowledgeBaseFile("string")
                .metricCost(0.0)
                .observabilityEnabled(true)
                .overallScore(0.0)
                .priorityAssignmentPrompt("")
                .project(16003L)
                .prompt("")
                .sampleRate(null)
                .samplingEnabled(false)
                .significantChangeAlertDirection("")
                .significantChangeAlertStatus("disabled")
                .simulationEnabled(true)
                .slug("ai_interrupting_user")
                .stdMultiplier(2.0)
                .totalScore(0.0)
                .triggerType("llm_judge")
                .userDefined(false)
                .usesLlmJudge(false)
                .windowSize(50L)
                .build()

        val roundtrippedAiTestMetric =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiTestMetric),
                jacksonTypeRef<AiTestMetric>(),
            )

        assertThat(roundtrippedAiTestMetric).isEqualTo(aiTestMetric)
    }
}
