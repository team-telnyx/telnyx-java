// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayShownAuth
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayMcpServerTest {

    @Test
    fun create() {
        val agentGatewayMcpServer =
            AgentGatewayMcpServer.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .auth(AgentGatewayShownAuth.builder().type("type").build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addForwardedHeader("string")
                .name("name")
                .openToEveryKey(true)
                .staticHeaders(
                    AgentGatewayMcpServer.StaticHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addTool("string")
                .transport(AgentGatewayMcpServer.Transport.HTTP)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        assertThat(agentGatewayMcpServer.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(agentGatewayMcpServer.auth())
            .isEqualTo(AgentGatewayShownAuth.builder().type("type").build())
        assertThat(agentGatewayMcpServer.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayMcpServer.forwardedHeaders()).containsExactly("string")
        assertThat(agentGatewayMcpServer.name()).isEqualTo("name")
        assertThat(agentGatewayMcpServer.openToEveryKey()).isEqualTo(true)
        assertThat(agentGatewayMcpServer.staticHeaders())
            .isEqualTo(
                AgentGatewayMcpServer.StaticHeaders.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(agentGatewayMcpServer.tools()).containsExactly("string")
        assertThat(agentGatewayMcpServer.transport())
            .isEqualTo(AgentGatewayMcpServer.Transport.HTTP)
        assertThat(agentGatewayMcpServer.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentGatewayMcpServer.url()).isEqualTo("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayMcpServer =
            AgentGatewayMcpServer.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .auth(AgentGatewayShownAuth.builder().type("type").build())
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addForwardedHeader("string")
                .name("name")
                .openToEveryKey(true)
                .staticHeaders(
                    AgentGatewayMcpServer.StaticHeaders.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addTool("string")
                .transport(AgentGatewayMcpServer.Transport.HTTP)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .build()

        val roundtrippedAgentGatewayMcpServer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayMcpServer),
                jacksonTypeRef<AgentGatewayMcpServer>(),
            )

        assertThat(roundtrippedAgentGatewayMcpServer).isEqualTo(agentGatewayMcpServer)
    }
}
