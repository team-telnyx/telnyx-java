// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework.v1

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioCreateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioGenerateBgParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioListParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveExportScenariosParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveGenerateProgressParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRetrieveScenarioAgentProgressParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioRunScenariosParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioScenarioAgentParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios.ScenarioUpdateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ScenarioServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()

        val evaluatorScenarioDetail =
            scenarioService.create(
                ScenarioCreateParams.builder()
                    .name("Refund escalation flow")
                    .personality(4643L)
                    .agent(1259L)
                    .expectedOutcomePrompt(
                        "The assistant explains the refund policy and offers escalation."
                    )
                    .firstMessage("Hi, I want a refund.")
                    .folderPath("folder_path")
                    .instructions(
                        "Call the support line and demand a refund for a damaged product."
                    )
                    .addMetric(266881L)
                    .addTag("support")
                    .testProfile(0L)
                    .build()
            )

        evaluatorScenarioDetail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()

        val evaluatorScenarioDetail = scenarioService.retrieve(0L)

        evaluatorScenarioDetail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()

        val evaluatorScenarioDetail =
            scenarioService.update(
                ScenarioUpdateParams.builder()
                    .id(0L)
                    .agent(0L)
                    .expectedOutcomePrompt("expected_outcome_prompt")
                    .firstMessage("first_message")
                    .folderPath("folder_path")
                    .inboundPhoneNumber(0L)
                    .instructions(
                        "Call the support line, demand a refund, and mention the damaged packaging."
                    )
                    .maxDuration(0L)
                    .addMetric(266881L)
                    .addMetric(266882L)
                    .name("Refund escalation flow - updated")
                    .personality(0L)
                    .phoneNumber(0L)
                    .scenarioLanguage("scenario_language")
                    .addTag("string")
                    .testProfile(0L)
                    .addToolId("string")
                    .build()
            )

        evaluatorScenarioDetail.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()

        val scenarios =
            scenarioService.list(
                ScenarioListParams.builder()
                    .agentId(0L)
                    .assistantId("assistant_id")
                    .page(1L)
                    .pageSize(1L)
                    .tags("tags")
                    .build()
            )

        scenarios.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()

        val scenario = scenarioService.delete(0L)

        scenario.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateBg() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()

        val scenarioGenerationResponse =
            scenarioService.generateBg(
                ScenarioGenerateBgParams.builder()
                    .numScenarios(5L)
                    .agentId(1259L)
                    .extraInstructions("Focus on angry customers asking about refunds.")
                    .firstMessage("first_message")
                    .folderPath("folder_path")
                    .generateExpectedOutcomes(true)
                    .inboundPhoneNumber(0L)
                    .addPersonality(0L)
                    .scenarioType(ScenarioGenerateBgParams.ScenarioType.WORKFLOW)
                    .addTag("string")
                    .testProfile(0L)
                    .addToolId("string")
                    .build()
            )

        scenarioGenerationResponse.validate()
    }

    @Test
    fun retrieveExportScenarios(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            scenarioService.retrieveExportScenarios(
                ScenarioRetrieveExportScenariosParams.builder()
                    .exportType(ScenarioRetrieveExportScenariosParams.ExportType.CSV)
                    .scenarioIds("scenario_ids")
                    .agentId(0L)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveGenerateProgress() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()

        val response =
            scenarioService.retrieveGenerateProgress(
                ScenarioRetrieveGenerateProgressParams.builder().progressId("progress_id").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveScenarioAgentProgress() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()

        val response =
            scenarioService.retrieveScenarioAgentProgress(
                ScenarioRetrieveScenarioAgentProgressParams.builder()
                    .progressId("progress_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun runScenarios() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()

        val response =
            scenarioService.runScenarios(
                ScenarioRunScenariosParams.builder()
                    .agentId(1259L)
                    .agentNumber("agent_number")
                    .assistantId("assistant_id")
                    .concurrencyLimit(3L)
                    .frequency(0L)
                    .mode(ScenarioRunScenariosParams.Mode.SAME_NUMBER)
                    .name("name")
                    .outboundPhoneNumber("outbound_phone_number")
                    .addPersonalityId(0L)
                    .scenariosOfJsonValues(listOf(JsonValue.from(9512)))
                    .addTag("regression")
                    .addTestProfileId(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun scenarioAgent() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val scenarioService = client.ai().tests().testFramework().v1().scenarios()

        val response =
            scenarioService.scenarioAgent(
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
            )

        response.validate()
    }
}
