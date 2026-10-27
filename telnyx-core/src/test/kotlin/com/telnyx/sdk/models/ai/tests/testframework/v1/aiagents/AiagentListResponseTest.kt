// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiagentListResponseTest {

    @Test
    fun create() {
        val aiagentListResponse =
            AiagentListResponse.builder()
                .count(1L)
                .next(null)
                .previous(null)
                .addResult(
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
                )
                .build()

        assertThat(aiagentListResponse.count()).isEqualTo(1L)
        assertThat(aiagentListResponse.next()).isEmpty
        assertThat(aiagentListResponse.previous()).isEmpty
        assertThat(aiagentListResponse.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiagentListResponse =
            AiagentListResponse.builder()
                .count(1L)
                .next(null)
                .previous(null)
                .addResult(
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
                )
                .build()

        val roundtrippedAiagentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiagentListResponse),
                jacksonTypeRef<AiagentListResponse>(),
            )

        assertThat(roundtrippedAiagentListResponse).isEqualTo(aiagentListResponse)
    }
}
