// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayAwsSigV4AuthTest {

    @Test
    fun create() {
        val agentGatewayAwsSigV4Auth =
            AgentGatewayAwsSigV4Auth.builder()
                .region("region")
                .accessKeyId("access_key_id")
                .roleName("role_name")
                .secretAccessKey("secret_access_key")
                .service("service")
                .sessionToken("session_token")
                .build()

        assertThat(agentGatewayAwsSigV4Auth.region()).isEqualTo("region")
        assertThat(agentGatewayAwsSigV4Auth.accessKeyId()).contains("access_key_id")
        assertThat(agentGatewayAwsSigV4Auth.roleName()).contains("role_name")
        assertThat(agentGatewayAwsSigV4Auth.secretAccessKey()).contains("secret_access_key")
        assertThat(agentGatewayAwsSigV4Auth.service()).contains("service")
        assertThat(agentGatewayAwsSigV4Auth.sessionToken()).contains("session_token")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentGatewayAwsSigV4Auth =
            AgentGatewayAwsSigV4Auth.builder()
                .region("region")
                .accessKeyId("access_key_id")
                .roleName("role_name")
                .secretAccessKey("secret_access_key")
                .service("service")
                .sessionToken("session_token")
                .build()

        val roundtrippedAgentGatewayAwsSigV4Auth =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentGatewayAwsSigV4Auth),
                jacksonTypeRef<AgentGatewayAwsSigV4Auth>(),
            )

        assertThat(roundtrippedAgentGatewayAwsSigV4Auth).isEqualTo(agentGatewayAwsSigV4Auth)
    }
}
