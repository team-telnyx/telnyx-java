// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework.v1

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentCreateParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentListParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents.AiagentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AiagentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val aiagentServiceAsync = client.ai().tests().testFramework().v1().aiagents()

        val testAgentFuture =
            aiagentServiceAsync.create(
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

        val testAgent = testAgentFuture.get()
        testAgent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val aiagentServiceAsync = client.ai().tests().testFramework().v1().aiagents()

        val testAgentFuture = aiagentServiceAsync.retrieve(0L)

        val testAgent = testAgentFuture.get()
        testAgent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val aiagentServiceAsync = client.ai().tests().testFramework().v1().aiagents()

        val testAgentFuture =
            aiagentServiceAsync.update(
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

        val testAgent = testAgentFuture.get()
        testAgent.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val aiagentServiceAsync = client.ai().tests().testFramework().v1().aiagents()

        val aiagentsFuture =
            aiagentServiceAsync.list(AiagentListParams.builder().page(1L).pageSize(1L).build())

        val aiagents = aiagentsFuture.get()
        aiagents.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val aiagentServiceAsync = client.ai().tests().testFramework().v1().aiagents()

        val aiagentFuture = aiagentServiceAsync.delete(0L)

        val aiagent = aiagentFuture.get()
        aiagent.validate()
    }
}
