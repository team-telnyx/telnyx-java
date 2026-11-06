// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayPassthroughAuthTest {

    @Test
    fun create() {
        val agentGatewayPassthroughAuth =
            AgentGatewayPassthroughAuth.builder()
                .type(AgentGatewayPassthroughAuth.Type.PASSTHROUGH)
                .build()

        assertThat(agentGatewayPassthroughAuth.type())
            .contains(AgentGatewayPassthroughAuth.Type.PASSTHROUGH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayPassthroughAuth =
            AgentGatewayPassthroughAuth.builder()
                .type(AgentGatewayPassthroughAuth.Type.PASSTHROUGH)
                .build()

        val roundtrippedAgentGatewayPassthroughAuth =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayPassthroughAuth),
                jacksonTypeRef<AgentGatewayPassthroughAuth>(),
            )

        assertThat(roundtrippedAgentGatewayPassthroughAuth).isEqualTo(agentGatewayPassthroughAuth)
    }
}
