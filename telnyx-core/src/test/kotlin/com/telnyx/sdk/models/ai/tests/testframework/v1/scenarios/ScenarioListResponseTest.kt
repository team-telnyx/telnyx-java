// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioListResponseTest {

    @Test
    fun create() {
        val scenarioListResponse =
            ScenarioListResponse.builder()
                .count(1L)
                .next(null)
                .previous(null)
                .addResult(
                    ScenarioListResponse.Result.builder()
                        .id(9512L)
                        .agent(1259L)
                        .createdAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                        .name("Refund escalation flow")
                        .updatedAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                        .dynamicVariableValues(
                            ScenarioListResponse.Result.DynamicVariableValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .expectedOutcomePrompt(
                            "The assistant explains the refund policy and offers escalation."
                        )
                        .firstMessage("Hi, I want a refund.")
                        .folderPath(null)
                        .inboundPhoneNumber(null)
                        .inboundPhoneNumberData(null)
                        .instructions(
                            "Call the support line and demand a refund for a damaged product."
                        )
                        .lastUpdatedBy(1L)
                        .addMetricName("Greeting quality")
                        .addMetricName("Escalation quality")
                        .addMetric(266881L)
                        .addMetric(266882L)
                        .personality(4643L)
                        .personalityName("Interruptive (High)")
                        .phoneNumber("+13125550188")
                        .scenarioLanguage("en")
                        .scenarioType("workflow")
                        .addTag("support")
                        .addTag("regression")
                        .testProfile(null)
                        .testProfileData(
                            ScenarioListResponse.Result.TestProfileData.builder()
                                .id(0L)
                                .agent(0L)
                                .information(
                                    ScenarioListResponse.Result.TestProfileData.Information
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .name("name")
                                .project(0L)
                                .build()
                        )
                        .addToolId("string")
                        .build()
                )
                .build()

        assertThat(scenarioListResponse.count()).isEqualTo(1L)
        assertThat(scenarioListResponse.next()).isEmpty
        assertThat(scenarioListResponse.previous()).isEmpty
        assertThat(scenarioListResponse.results())
            .containsExactly(
                ScenarioListResponse.Result.builder()
                    .id(9512L)
                    .agent(1259L)
                    .createdAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                    .name("Refund escalation flow")
                    .updatedAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                    .dynamicVariableValues(
                        ScenarioListResponse.Result.DynamicVariableValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .expectedOutcomePrompt(
                        "The assistant explains the refund policy and offers escalation."
                    )
                    .firstMessage("Hi, I want a refund.")
                    .folderPath(null)
                    .inboundPhoneNumber(null)
                    .inboundPhoneNumberData(null)
                    .instructions(
                        "Call the support line and demand a refund for a damaged product."
                    )
                    .lastUpdatedBy(1L)
                    .addMetricName("Greeting quality")
                    .addMetricName("Escalation quality")
                    .addMetric(266881L)
                    .addMetric(266882L)
                    .personality(4643L)
                    .personalityName("Interruptive (High)")
                    .phoneNumber("+13125550188")
                    .scenarioLanguage("en")
                    .scenarioType("workflow")
                    .addTag("support")
                    .addTag("regression")
                    .testProfile(null)
                    .testProfileData(
                        ScenarioListResponse.Result.TestProfileData.builder()
                            .id(0L)
                            .agent(0L)
                            .information(
                                ScenarioListResponse.Result.TestProfileData.Information.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .name("name")
                            .project(0L)
                            .build()
                    )
                    .addToolId("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scenarioListResponse =
            ScenarioListResponse.builder()
                .count(1L)
                .next(null)
                .previous(null)
                .addResult(
                    ScenarioListResponse.Result.builder()
                        .id(9512L)
                        .agent(1259L)
                        .createdAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                        .name("Refund escalation flow")
                        .updatedAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                        .dynamicVariableValues(
                            ScenarioListResponse.Result.DynamicVariableValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .expectedOutcomePrompt(
                            "The assistant explains the refund policy and offers escalation."
                        )
                        .firstMessage("Hi, I want a refund.")
                        .folderPath(null)
                        .inboundPhoneNumber(null)
                        .inboundPhoneNumberData(null)
                        .instructions(
                            "Call the support line and demand a refund for a damaged product."
                        )
                        .lastUpdatedBy(1L)
                        .addMetricName("Greeting quality")
                        .addMetricName("Escalation quality")
                        .addMetric(266881L)
                        .addMetric(266882L)
                        .personality(4643L)
                        .personalityName("Interruptive (High)")
                        .phoneNumber("+13125550188")
                        .scenarioLanguage("en")
                        .scenarioType("workflow")
                        .addTag("support")
                        .addTag("regression")
                        .testProfile(null)
                        .testProfileData(
                            ScenarioListResponse.Result.TestProfileData.builder()
                                .id(0L)
                                .agent(0L)
                                .information(
                                    ScenarioListResponse.Result.TestProfileData.Information
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .name("name")
                                .project(0L)
                                .build()
                        )
                        .addToolId("string")
                        .build()
                )
                .build()

        val roundtrippedScenarioListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scenarioListResponse),
                jacksonTypeRef<ScenarioListResponse>(),
            )

        assertThat(roundtrippedScenarioListResponse).isEqualTo(scenarioListResponse)
    }
}
