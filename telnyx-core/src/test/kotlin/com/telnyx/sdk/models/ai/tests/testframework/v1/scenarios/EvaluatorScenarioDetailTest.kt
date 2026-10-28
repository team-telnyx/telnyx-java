// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluatorScenarioDetailTest {

    @Test
    fun create() {
        val evaluatorScenarioDetail =
            EvaluatorScenarioDetail.builder()
                .id(9512L)
                .agent(1259L)
                .name("Refund escalation flow")
                .dynamicVariableValues(
                    EvaluatorScenarioDetail.DynamicVariableValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .expectedOutcomePrompt(
                    "The assistant explains the refund policy and offers escalation."
                )
                .firstMessage("Hi, I want a refund.")
                .folderPath(null)
                .inboundPhoneNumber(null)
                .inboundPhoneNumberData(
                    EvaluatorScenarioDetail.InboundPhoneNumberData.builder()
                        .id(0L)
                        .number("number")
                        .phoneNumberId("phone_number_id")
                        .build()
                )
                .informationFields(
                    EvaluatorScenarioDetail.InformationFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .instructions("Call the support line and demand a refund for a damaged product.")
                .isPredefined(false)
                .maxDuration(null)
                .addMetricName("AI interrupting user")
                .addMetricName("Average Pitch (in Hz)")
                .addMetric(266881L)
                .addMetric(266882L)
                .outboundPhoneNumberData(
                    EvaluatorScenarioDetail.OutboundPhoneNumberData.builder()
                        .id(0L)
                        .number("number")
                        .phoneNumberId("phone_number_id")
                        .build()
                )
                .personality(4643L)
                .personalityName("Interruptive (High)")
                .phoneNumber("+13125550188")
                .project(null)
                .addRun(0L)
                .scenarioLanguage("en")
                .scenarioType("workflow")
                .simulationDescription("Simulates an impatient customer demanding a refund.")
                .suiteType("predefined")
                .addTag("support")
                .addTag("regression")
                .testProfile(null)
                .testProfileData(
                    EvaluatorScenarioDetail.TestProfileData.builder()
                        .id(0L)
                        .agent(0L)
                        .information(
                            EvaluatorScenarioDetail.TestProfileData.Information.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .project(0L)
                        .build()
                )
                .addToolId("string")
                .build()

        assertThat(evaluatorScenarioDetail.id()).isEqualTo(9512L)
        assertThat(evaluatorScenarioDetail.agent()).contains(1259L)
        assertThat(evaluatorScenarioDetail.name()).isEqualTo("Refund escalation flow")
        assertThat(evaluatorScenarioDetail.dynamicVariableValues())
            .contains(
                EvaluatorScenarioDetail.DynamicVariableValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(evaluatorScenarioDetail.expectedOutcomePrompt())
            .contains("The assistant explains the refund policy and offers escalation.")
        assertThat(evaluatorScenarioDetail.firstMessage()).contains("Hi, I want a refund.")
        assertThat(evaluatorScenarioDetail.folderPath()).isEmpty
        assertThat(evaluatorScenarioDetail.inboundPhoneNumber()).isEmpty
        assertThat(evaluatorScenarioDetail.inboundPhoneNumberData())
            .contains(
                EvaluatorScenarioDetail.InboundPhoneNumberData.builder()
                    .id(0L)
                    .number("number")
                    .phoneNumberId("phone_number_id")
                    .build()
            )
        assertThat(evaluatorScenarioDetail.informationFields())
            .contains(
                EvaluatorScenarioDetail.InformationFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(evaluatorScenarioDetail.instructions())
            .contains("Call the support line and demand a refund for a damaged product.")
        assertThat(evaluatorScenarioDetail.isPredefined()).contains(false)
        assertThat(evaluatorScenarioDetail.maxDuration()).isEmpty
        assertThat(evaluatorScenarioDetail.metricNames().getOrNull())
            .containsExactly("AI interrupting user", "Average Pitch (in Hz)")
        assertThat(evaluatorScenarioDetail.metrics().getOrNull()).containsExactly(266881L, 266882L)
        assertThat(evaluatorScenarioDetail.outboundPhoneNumberData())
            .contains(
                EvaluatorScenarioDetail.OutboundPhoneNumberData.builder()
                    .id(0L)
                    .number("number")
                    .phoneNumberId("phone_number_id")
                    .build()
            )
        assertThat(evaluatorScenarioDetail.personality()).contains(4643L)
        assertThat(evaluatorScenarioDetail.personalityName()).contains("Interruptive (High)")
        assertThat(evaluatorScenarioDetail.phoneNumber()).contains("+13125550188")
        assertThat(evaluatorScenarioDetail.project()).isEmpty
        assertThat(evaluatorScenarioDetail.runs().getOrNull()).containsExactly(0L)
        assertThat(evaluatorScenarioDetail.scenarioLanguage()).contains("en")
        assertThat(evaluatorScenarioDetail.scenarioType()).contains("workflow")
        assertThat(evaluatorScenarioDetail.simulationDescription())
            .contains("Simulates an impatient customer demanding a refund.")
        assertThat(evaluatorScenarioDetail.suiteType()).contains("predefined")
        assertThat(evaluatorScenarioDetail.tags().getOrNull())
            .containsExactly("support", "regression")
        assertThat(evaluatorScenarioDetail.testProfile()).isEmpty
        assertThat(evaluatorScenarioDetail.testProfileData())
            .contains(
                EvaluatorScenarioDetail.TestProfileData.builder()
                    .id(0L)
                    .agent(0L)
                    .information(
                        EvaluatorScenarioDetail.TestProfileData.Information.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .project(0L)
                    .build()
            )
        assertThat(evaluatorScenarioDetail.toolIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val evaluatorScenarioDetail =
            EvaluatorScenarioDetail.builder()
                .id(9512L)
                .agent(1259L)
                .name("Refund escalation flow")
                .dynamicVariableValues(
                    EvaluatorScenarioDetail.DynamicVariableValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .expectedOutcomePrompt(
                    "The assistant explains the refund policy and offers escalation."
                )
                .firstMessage("Hi, I want a refund.")
                .folderPath(null)
                .inboundPhoneNumber(null)
                .inboundPhoneNumberData(
                    EvaluatorScenarioDetail.InboundPhoneNumberData.builder()
                        .id(0L)
                        .number("number")
                        .phoneNumberId("phone_number_id")
                        .build()
                )
                .informationFields(
                    EvaluatorScenarioDetail.InformationFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .instructions("Call the support line and demand a refund for a damaged product.")
                .isPredefined(false)
                .maxDuration(null)
                .addMetricName("AI interrupting user")
                .addMetricName("Average Pitch (in Hz)")
                .addMetric(266881L)
                .addMetric(266882L)
                .outboundPhoneNumberData(
                    EvaluatorScenarioDetail.OutboundPhoneNumberData.builder()
                        .id(0L)
                        .number("number")
                        .phoneNumberId("phone_number_id")
                        .build()
                )
                .personality(4643L)
                .personalityName("Interruptive (High)")
                .phoneNumber("+13125550188")
                .project(null)
                .addRun(0L)
                .scenarioLanguage("en")
                .scenarioType("workflow")
                .simulationDescription("Simulates an impatient customer demanding a refund.")
                .suiteType("predefined")
                .addTag("support")
                .addTag("regression")
                .testProfile(null)
                .testProfileData(
                    EvaluatorScenarioDetail.TestProfileData.builder()
                        .id(0L)
                        .agent(0L)
                        .information(
                            EvaluatorScenarioDetail.TestProfileData.Information.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .name("name")
                        .project(0L)
                        .build()
                )
                .addToolId("string")
                .build()

        val roundtrippedEvaluatorScenarioDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evaluatorScenarioDetail),
                jacksonTypeRef<EvaluatorScenarioDetail>(),
            )

        assertThat(roundtrippedEvaluatorScenarioDetail).isEqualTo(evaluatorScenarioDetail)
    }
}
