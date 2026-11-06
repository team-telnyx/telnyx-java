// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayNoAuthTest {

    @Test
    fun create() {
        val agentGatewayNoAuth =
            AgentGatewayNoAuth.builder().type(AgentGatewayNoAuth.Type.NONE).build()

        assertThat(agentGatewayNoAuth.type()).contains(AgentGatewayNoAuth.Type.NONE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayNoAuth =
            AgentGatewayNoAuth.builder().type(AgentGatewayNoAuth.Type.NONE).build()

        val roundtrippedAgentGatewayNoAuth =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayNoAuth),
                jacksonTypeRef<AgentGatewayNoAuth>(),
            )

        assertThat(roundtrippedAgentGatewayNoAuth).isEqualTo(agentGatewayNoAuth)
    }
}
