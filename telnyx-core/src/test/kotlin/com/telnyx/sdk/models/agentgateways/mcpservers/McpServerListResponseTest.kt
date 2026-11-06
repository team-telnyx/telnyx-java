// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayShownAuth
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerListResponseTest {

    @Test
    fun create() {
        val mcpServerListResponse =
            McpServerListResponse.builder()
                .addData(
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
                )
                .build()

        assertThat(mcpServerListResponse.data())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerListResponse =
            McpServerListResponse.builder()
                .addData(
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
                )
                .build()

        val roundtrippedMcpServerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerListResponse),
                jacksonTypeRef<McpServerListResponse>(),
            )

        assertThat(roundtrippedMcpServerListResponse).isEqualTo(mcpServerListResponse)
    }
}
