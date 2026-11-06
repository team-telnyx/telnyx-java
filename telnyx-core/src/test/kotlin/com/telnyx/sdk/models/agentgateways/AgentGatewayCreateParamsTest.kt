// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayCreateParamsTest {

    @Test
    fun create() {
        AgentGatewayCreateParams.builder()
            .wireguardInterfaceId("c788eb40-a4c0-4bf5-8f84-976027960f8e")
            .name("support-gw")
            .build()
    }

    @Test
    fun body() {
        val params =
            AgentGatewayCreateParams.builder()
                .wireguardInterfaceId("c788eb40-a4c0-4bf5-8f84-976027960f8e")
                .name("support-gw")
                .build()

        val body = params._body()

        assertThat(body.wireguardInterfaceId()).isEqualTo("c788eb40-a4c0-4bf5-8f84-976027960f8e")
        assertThat(body.name()).contains("support-gw")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentGatewayCreateParams.builder()
                .wireguardInterfaceId("c788eb40-a4c0-4bf5-8f84-976027960f8e")
                .build()

        val body = params._body()

        assertThat(body.wireguardInterfaceId()).isEqualTo("c788eb40-a4c0-4bf5-8f84-976027960f8e")
    }
}
