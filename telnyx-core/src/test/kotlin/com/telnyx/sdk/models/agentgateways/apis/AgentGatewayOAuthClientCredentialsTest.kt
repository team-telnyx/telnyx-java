// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayOAuthClientCredentialsTest {

    @Test
    fun create() {
        val agentGatewayOAuthClientCredentials =
            AgentGatewayOAuthClientCredentials.builder()
                .clientId("client_id")
                .clientSecret("client_secret")
                .tokenUrl("token_url")
                .audience("audience")
                .credentialsIn(AgentGatewayOAuthClientCredentials.CredentialsIn.BODY)
                .resource("resource")
                .addScope("string")
                .build()

        assertThat(agentGatewayOAuthClientCredentials.clientId()).isEqualTo("client_id")
        assertThat(agentGatewayOAuthClientCredentials.clientSecret()).isEqualTo("client_secret")
        assertThat(agentGatewayOAuthClientCredentials.tokenUrl()).isEqualTo("token_url")
        assertThat(agentGatewayOAuthClientCredentials.audience()).contains("audience")
        assertThat(agentGatewayOAuthClientCredentials.credentialsIn())
            .contains(AgentGatewayOAuthClientCredentials.CredentialsIn.BODY)
        assertThat(agentGatewayOAuthClientCredentials.resource()).contains("resource")
        assertThat(agentGatewayOAuthClientCredentials.scopes().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayOAuthClientCredentials =
            AgentGatewayOAuthClientCredentials.builder()
                .clientId("client_id")
                .clientSecret("client_secret")
                .tokenUrl("token_url")
                .audience("audience")
                .credentialsIn(AgentGatewayOAuthClientCredentials.CredentialsIn.BODY)
                .resource("resource")
                .addScope("string")
                .build()

        val roundtrippedAgentGatewayOAuthClientCredentials =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayOAuthClientCredentials),
                jacksonTypeRef<AgentGatewayOAuthClientCredentials>(),
            )

        assertThat(roundtrippedAgentGatewayOAuthClientCredentials)
            .isEqualTo(agentGatewayOAuthClientCredentials)
    }
}
