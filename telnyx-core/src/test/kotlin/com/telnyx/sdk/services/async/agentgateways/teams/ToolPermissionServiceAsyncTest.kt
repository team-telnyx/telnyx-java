// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways.teams

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.agentgateways.keys.toolpermissions.AgentGatewayToolPermissions
import com.telnyx.sdk.models.agentgateways.teams.toolpermissions.ToolPermissionCreateParams
import com.telnyx.sdk.models.agentgateways.teams.toolpermissions.ToolPermissionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ToolPermissionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolPermissionServiceAsync = client.agentGateways().teams().toolPermissions()

        val agentGatewayToolPermissionsResponseFuture =
            toolPermissionServiceAsync.create(
                ToolPermissionCreateParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .teamId("d7b21324-a2bf-406c-ba49-c6ec4d23d476")
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

        val agentGatewayToolPermissionsResponse = agentGatewayToolPermissionsResponseFuture.get()
        agentGatewayToolPermissionsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val toolPermissionServiceAsync = client.agentGateways().teams().toolPermissions()

        val agentGatewayToolPermissionsResponseFuture =
            toolPermissionServiceAsync.list(
                ToolPermissionListParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .teamId("d7b21324-a2bf-406c-ba49-c6ec4d23d476")
                    .build()
            )

        val agentGatewayToolPermissionsResponse = agentGatewayToolPermissionsResponseFuture.get()
        agentGatewayToolPermissionsResponse.validate()
    }
}
