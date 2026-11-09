// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayShownAuthTest {

    @Test
    fun create() {
        val agentGatewayShownAuth = AgentGatewayShownAuth.builder().type("type").build()

        assertThat(agentGatewayShownAuth.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayShownAuth = AgentGatewayShownAuth.builder().type("type").build()

        val roundtrippedAgentGatewayShownAuth =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayShownAuth),
                jacksonTypeRef<AgentGatewayShownAuth>(),
            )

        assertThat(roundtrippedAgentGatewayShownAuth).isEqualTo(agentGatewayShownAuth)
    }
}
