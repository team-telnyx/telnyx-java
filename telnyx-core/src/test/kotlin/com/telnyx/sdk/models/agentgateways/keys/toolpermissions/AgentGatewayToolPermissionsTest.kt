// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys.toolpermissions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayToolPermissionsTest {

    @Test
    fun create() {
        val agentGatewayToolPermissions =
            AgentGatewayToolPermissions.builder()
                .addServer(
                    AgentGatewayToolPermissions.Server.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addTool("string")
                        .build()
                )
                .build()

        assertThat(agentGatewayToolPermissions.servers())
            .containsExactly(
                AgentGatewayToolPermissions.Server.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTool("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayToolPermissions =
            AgentGatewayToolPermissions.builder()
                .addServer(
                    AgentGatewayToolPermissions.Server.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addTool("string")
                        .build()
                )
                .build()

        val roundtrippedAgentGatewayToolPermissions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayToolPermissions),
                jacksonTypeRef<AgentGatewayToolPermissions>(),
            )

        assertThat(roundtrippedAgentGatewayToolPermissions).isEqualTo(agentGatewayToolPermissions)
    }
}
