// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayResponseTest {

    @Test
    fun create() {
        val agentGatewayResponse =
            AgentGatewayResponse.builder()
                .data(
                    AgentGateway.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .engineVersion("engine_version")
                        .gatewayUrl("gateway_url")
                        .name("name")
                        .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(AgentGateway.Status.PENDING)
                        .wireguardInterfaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(agentGatewayResponse.data())
            .isEqualTo(
                AgentGateway.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .engineVersion("engine_version")
                    .gatewayUrl("gateway_url")
                    .name("name")
                    .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(AgentGateway.Status.PENDING)
                    .wireguardInterfaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayResponse =
            AgentGatewayResponse.builder()
                .data(
                    AgentGateway.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .engineVersion("engine_version")
                        .gatewayUrl("gateway_url")
                        .name("name")
                        .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .status(AgentGateway.Status.PENDING)
                        .wireguardInterfaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedAgentGatewayResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayResponse),
                jacksonTypeRef<AgentGatewayResponse>(),
            )

        assertThat(roundtrippedAgentGatewayResponse).isEqualTo(agentGatewayResponse)
    }
}
