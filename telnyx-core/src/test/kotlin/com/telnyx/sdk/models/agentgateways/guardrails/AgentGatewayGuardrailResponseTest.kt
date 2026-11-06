// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.guardrails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayGuardrailResponseTest {

    @Test
    fun create() {
        val agentGatewayGuardrailResponse =
            AgentGatewayGuardrailResponse.builder()
                .data(
                    AgentGatewayGuardrail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .alwaysOn(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addMode(AgentGatewayGuardrail.Mode.BEFORE_REQUEST)
                        .name("name")
                        .settings(
                            AgentGatewayGuardrail.Settings.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(AgentGatewayGuardrail.Type.CONTENT_FILTER)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(agentGatewayGuardrailResponse.data())
            .isEqualTo(
                AgentGatewayGuardrail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .alwaysOn(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addMode(AgentGatewayGuardrail.Mode.BEFORE_REQUEST)
                    .name("name")
                    .settings(
                        AgentGatewayGuardrail.Settings.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .type(AgentGatewayGuardrail.Type.CONTENT_FILTER)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayGuardrailResponse =
            AgentGatewayGuardrailResponse.builder()
                .data(
                    AgentGatewayGuardrail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .alwaysOn(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addMode(AgentGatewayGuardrail.Mode.BEFORE_REQUEST)
                        .name("name")
                        .settings(
                            AgentGatewayGuardrail.Settings.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .type(AgentGatewayGuardrail.Type.CONTENT_FILTER)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedAgentGatewayGuardrailResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayGuardrailResponse),
                jacksonTypeRef<AgentGatewayGuardrailResponse>(),
            )

        assertThat(roundtrippedAgentGatewayGuardrailResponse)
            .isEqualTo(agentGatewayGuardrailResponse)
    }
}
