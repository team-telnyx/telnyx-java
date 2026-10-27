// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TestAgentTest {

    @Test
    fun create() {
        val testAgent =
            TestAgent.builder()
                .id(1259L)
                .agentName("Support Bot Under Test")
                .assistantId("e1a2b3c4-d5e6-f7a8-b9c0-d1e2f3a4b5c6")
                .createdAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                .updatedAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                .autoUpdateDropoffNodes(false)
                .autoUpdateTopicNodes(false)
                .chatAssistantId("")
                .contactNumber("+13125550123")
                .description("Evaluates the support assistant against generated callers.")
                .addEnabledPersonality(4567L)
                .addHallucinationMetricKbFile(0L)
                .inbound(false)
                .addKnowledgeBaseFile(JsonValue.from(mapOf<String, Any>()))
                .language("en")
                .llmMaxTokens(512L)
                .llmModel("openai/gpt-oss-120b")
                .llmSystemPrompt("You are calling a customer support line.")
                .llmTemperature(0.7)
                .outboundAutoCall(false)
                .addOutboundNumber(JsonValue.from(mapOf<String, Any>()))
                .sipAuth(
                    TestAgent.SipAuth.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .sipEndpoint("")
                .build()

        assertThat(testAgent.id()).isEqualTo(1259L)
        assertThat(testAgent.agentName()).isEqualTo("Support Bot Under Test")
        assertThat(testAgent.assistantId()).isEqualTo("e1a2b3c4-d5e6-f7a8-b9c0-d1e2f3a4b5c6")
        assertThat(testAgent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
        assertThat(testAgent.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
        assertThat(testAgent.autoUpdateDropoffNodes()).contains(false)
        assertThat(testAgent.autoUpdateTopicNodes()).contains(false)
        assertThat(testAgent.chatAssistantId()).contains("")
        assertThat(testAgent.contactNumber()).contains("+13125550123")
        assertThat(testAgent.description())
            .contains("Evaluates the support assistant against generated callers.")
        assertThat(testAgent.enabledPersonalities().getOrNull()).containsExactly(4567L)
        assertThat(testAgent.hallucinationMetricKbFiles().getOrNull()).containsExactly(0L)
        assertThat(testAgent.inbound()).contains(false)
        assertThat(testAgent.knowledgeBaseFiles().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(testAgent.language()).contains("en")
        assertThat(testAgent.llmMaxTokens()).contains(512L)
        assertThat(testAgent.llmModel()).contains("openai/gpt-oss-120b")
        assertThat(testAgent.llmSystemPrompt()).contains("You are calling a customer support line.")
        assertThat(testAgent.llmTemperature()).contains(0.7)
        assertThat(testAgent.outboundAutoCall()).contains(false)
        assertThat(testAgent.outboundNumbers().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(testAgent.sipAuth())
            .contains(
                TestAgent.SipAuth.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(testAgent.sipEndpoint()).contains("")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val testAgent =
            TestAgent.builder()
                .id(1259L)
                .agentName("Support Bot Under Test")
                .assistantId("e1a2b3c4-d5e6-f7a8-b9c0-d1e2f3a4b5c6")
                .createdAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                .updatedAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                .autoUpdateDropoffNodes(false)
                .autoUpdateTopicNodes(false)
                .chatAssistantId("")
                .contactNumber("+13125550123")
                .description("Evaluates the support assistant against generated callers.")
                .addEnabledPersonality(4567L)
                .addHallucinationMetricKbFile(0L)
                .inbound(false)
                .addKnowledgeBaseFile(JsonValue.from(mapOf<String, Any>()))
                .language("en")
                .llmMaxTokens(512L)
                .llmModel("openai/gpt-oss-120b")
                .llmSystemPrompt("You are calling a customer support line.")
                .llmTemperature(0.7)
                .outboundAutoCall(false)
                .addOutboundNumber(JsonValue.from(mapOf<String, Any>()))
                .sipAuth(
                    TestAgent.SipAuth.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .sipEndpoint("")
                .build()

        val roundtrippedTestAgent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(testAgent),
                jacksonTypeRef<TestAgent>(),
            )

        assertThat(roundtrippedTestAgent).isEqualTo(testAgent)
    }
}
