// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways.keys

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.agentgateways.keys.toolpermissions.AgentGatewayToolPermissions
import com.telnyx.sdk.models.agentgateways.keys.toolpermissions.ToolPermissionCreateParams
import com.telnyx.sdk.models.agentgateways.keys.toolpermissions.ToolPermissionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ToolPermissionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val toolPermissionService = client.agentGateways().keys().toolPermissions()

        val agentGatewayToolPermissionsResponse =
            toolPermissionService.create(
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
            )

        agentGatewayToolPermissionsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val toolPermissionService = client.agentGateways().keys().toolPermissions()

        val agentGatewayToolPermissionsResponse =
            toolPermissionService.list(
                ToolPermissionListParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .keyId("f739ad190d29e2a5e658c3a486111953e6c18d746fd04374962ab150aae17757")
                    .build()
            )

        agentGatewayToolPermissionsResponse.validate()
    }
}
