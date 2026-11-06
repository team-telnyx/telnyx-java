// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys.toolpermissions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayToolPermissionsResponseTest {

    @Test
    fun create() {
        val agentGatewayToolPermissionsResponse =
            AgentGatewayToolPermissionsResponse.builder()
                .data(
                    AgentGatewayToolPermissions.builder()
                        .addServer(
                            AgentGatewayToolPermissions.Server.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addTool("string")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(agentGatewayToolPermissionsResponse.data())
            .isEqualTo(
                AgentGatewayToolPermissions.builder()
                    .addServer(
                        AgentGatewayToolPermissions.Server.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addTool("string")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayToolPermissionsResponse =
            AgentGatewayToolPermissionsResponse.builder()
                .data(
                    AgentGatewayToolPermissions.builder()
                        .addServer(
                            AgentGatewayToolPermissions.Server.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addTool("string")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedAgentGatewayToolPermissionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayToolPermissionsResponse),
                jacksonTypeRef<AgentGatewayToolPermissionsResponse>(),
            )

        assertThat(roundtrippedAgentGatewayToolPermissionsResponse)
            .isEqualTo(agentGatewayToolPermissionsResponse)
    }
}
