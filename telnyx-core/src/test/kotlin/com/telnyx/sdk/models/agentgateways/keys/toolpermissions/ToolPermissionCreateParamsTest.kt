// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys.toolpermissions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolPermissionCreateParamsTest {

    @Test
    fun create() {
        ToolPermissionCreateParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .keyId("f739ad190d29e2a5e658c3a486111953e6c18d746fd04374962ab150aae17757")
            .agentGatewayToolPermissions(
                AgentGatewayToolPermissions.builder()
                    .addServer(
                        AgentGatewayToolPermissions.Server.builder()
                            .id("88d5a97b-4080-4855-8bac-a39811b1dc24")
                            .addTool("get_order")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ToolPermissionCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .keyId("f739ad190d29e2a5e658c3a486111953e6c18d746fd04374962ab150aae17757")
                .agentGatewayToolPermissions(
                    AgentGatewayToolPermissions.builder()
                        .addServer(
                            AgentGatewayToolPermissions.Server.builder()
                                .id("88d5a97b-4080-4855-8bac-a39811b1dc24")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1))
            .isEqualTo("f739ad190d29e2a5e658c3a486111953e6c18d746fd04374962ab150aae17757")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ToolPermissionCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .keyId("f739ad190d29e2a5e658c3a486111953e6c18d746fd04374962ab150aae17757")
                .agentGatewayToolPermissions(
                    AgentGatewayToolPermissions.builder()
                        .addServer(
                            AgentGatewayToolPermissions.Server.builder()
                                .id("88d5a97b-4080-4855-8bac-a39811b1dc24")
                                .addTool("get_order")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AgentGatewayToolPermissions.builder()
                    .addServer(
                        AgentGatewayToolPermissions.Server.builder()
                            .id("88d5a97b-4080-4855-8bac-a39811b1dc24")
                            .addTool("get_order")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ToolPermissionCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .keyId("f739ad190d29e2a5e658c3a486111953e6c18d746fd04374962ab150aae17757")
                .agentGatewayToolPermissions(
                    AgentGatewayToolPermissions.builder()
                        .addServer(
                            AgentGatewayToolPermissions.Server.builder()
                                .id("88d5a97b-4080-4855-8bac-a39811b1dc24")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AgentGatewayToolPermissions.builder()
                    .addServer(
                        AgentGatewayToolPermissions.Server.builder()
                            .id("88d5a97b-4080-4855-8bac-a39811b1dc24")
                            .build()
                    )
                    .build()
            )
    }
}
