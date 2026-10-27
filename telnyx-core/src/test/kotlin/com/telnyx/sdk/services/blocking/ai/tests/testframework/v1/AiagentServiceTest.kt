// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework.v1

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentCreateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentListParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AiagentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiagentService = client.ai().tests().testFramework().v1().aiagents()

        val testAgent =
            aiagentService.create(
                AiagentCreateParams.builder()
                    .agentName("Support Bot Under Test")
                    .assistantId("e1a2b3c4-d5e6-f7a8-b9c0-d1e2f3a4b5c6")
                    .autoFetchCallsEnabled(true)
                    .autoSyncPromptEnabled(true)
                    .autoUpdateDropoffNodes(false)
                    .autoUpdateTopicNodes(false)
                    .contactNumber("contact_number")
                    .description("Evaluates the support assistant against generated callers.")
                    .inbound(false)
                    .language("en")
                    .llmMaxTokens(512L)
                    .llmModel("openai/gpt-oss-120b")
                    .llmSystemPrompt("llm_system_prompt")
                    .llmTemperature(0.7)
                    .outboundAutoCall(false)
                    .sipEndpoint("")
                    .build()
            )

        testAgent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiagentService = client.ai().tests().testFramework().v1().aiagents()

        val testAgent = aiagentService.retrieve(0L)

        testAgent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiagentService = client.ai().tests().testFramework().v1().aiagents()

        val testAgent =
            aiagentService.update(
                AiagentUpdateParams.builder()
                    .id(0L)
                    .agentName("Support Bot Under Test - renamed")
                    .assistantId("assistant_id")
                    .autoFetchCallsEnabled(true)
                    .autoSyncPromptEnabled(true)
                    .autoUpdateDropoffNodes(true)
                    .autoUpdateTopicNodes(true)
                    .contactNumber("contact_number")
                    .description("description")
                    .inbound(true)
                    .language("language")
                    .llmMaxTokens(256L)
                    .llmModel("llm_model")
                    .llmSystemPrompt("llm_system_prompt")
                    .llmTemperature(0.5)
                    .outboundAutoCall(true)
                    .sipEndpoint("sip_endpoint")
                    .build()
            )

        testAgent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiagentService = client.ai().tests().testFramework().v1().aiagents()

        val aiagents =
            aiagentService.list(AiagentListParams.builder().page(1L).pageSize(1L).build())

        aiagents.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val aiagentService = client.ai().tests().testFramework().v1().aiagents()

        val aiagent = aiagentService.delete(0L)

        aiagent.validate()
    }
}
