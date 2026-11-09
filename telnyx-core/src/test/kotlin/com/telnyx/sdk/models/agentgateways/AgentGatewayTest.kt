// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayTest {

    @Test
    fun create() {
        val agentGateway =
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

        assertThat(agentGateway.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(agentGateway.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGateway.engineVersion()).isEqualTo("engine_version")
        assertThat(agentGateway.gatewayUrl()).contains("gateway_url")
        assertThat(agentGateway.name()).contains("name")
        assertThat(agentGateway.networkId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(agentGateway.status()).isEqualTo(AgentGateway.Status.PENDING)
        assertThat(agentGateway.wireguardInterfaceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGateway =
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

        val roundtrippedAgentGateway =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGateway),
                jacksonTypeRef<AgentGateway>(),
            )

        assertThat(roundtrippedAgentGateway).isEqualTo(agentGateway)
    }
}
