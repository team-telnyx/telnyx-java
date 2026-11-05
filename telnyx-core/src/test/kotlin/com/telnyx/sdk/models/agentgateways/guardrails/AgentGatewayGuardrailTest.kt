// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.guardrails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayGuardrailTest {

    @Test
    fun create() {
        val agentGatewayGuardrail =
            AgentGatewayGuardrail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .alwaysOn(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMode(AgentGatewayGuardrail.Mode.BEFORE_REQUEST)
                .name("name")
                .settings(JsonValue.from(mapOf<String, Any>()))
                .type(AgentGatewayGuardrail.Type.CONTENT_FILTER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(agentGatewayGuardrail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(agentGatewayGuardrail.alwaysOn()).isEqualTo(true)
        assertThat(agentGatewayGuardrail.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayGuardrail.modes())
            .containsExactly(AgentGatewayGuardrail.Mode.BEFORE_REQUEST)
        assertThat(agentGatewayGuardrail.name()).isEqualTo("name")
        assertThat(agentGatewayGuardrail._settings())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(agentGatewayGuardrail.type())
            .isEqualTo(AgentGatewayGuardrail.Type.CONTENT_FILTER)
        assertThat(agentGatewayGuardrail.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayGuardrail =
            AgentGatewayGuardrail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .alwaysOn(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addMode(AgentGatewayGuardrail.Mode.BEFORE_REQUEST)
                .name("name")
                .settings(JsonValue.from(mapOf<String, Any>()))
                .type(AgentGatewayGuardrail.Type.CONTENT_FILTER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAgentGatewayGuardrail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayGuardrail),
                jacksonTypeRef<AgentGatewayGuardrail>(),
            )

        assertThat(roundtrippedAgentGatewayGuardrail).isEqualTo(agentGatewayGuardrail)
    }
}
