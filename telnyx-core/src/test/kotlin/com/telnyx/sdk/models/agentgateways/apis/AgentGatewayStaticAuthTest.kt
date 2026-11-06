// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayStaticAuthTest {

    @Test
    fun create() {
        val agentGatewayStaticAuth =
            AgentGatewayStaticAuth.builder()
                .type(AgentGatewayStaticAuth.Type.API_KEY)
                .value("value")
                .header("header")
                .build()

        assertThat(agentGatewayStaticAuth.type()).isEqualTo(AgentGatewayStaticAuth.Type.API_KEY)
        assertThat(agentGatewayStaticAuth.value()).isEqualTo("value")
        assertThat(agentGatewayStaticAuth.header()).contains("header")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayStaticAuth =
            AgentGatewayStaticAuth.builder()
                .type(AgentGatewayStaticAuth.Type.API_KEY)
                .value("value")
                .header("header")
                .build()

        val roundtrippedAgentGatewayStaticAuth =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayStaticAuth),
                jacksonTypeRef<AgentGatewayStaticAuth>(),
            )

        assertThat(roundtrippedAgentGatewayStaticAuth).isEqualTo(agentGatewayStaticAuth)
    }
}
