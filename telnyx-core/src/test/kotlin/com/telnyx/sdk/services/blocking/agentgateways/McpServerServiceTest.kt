// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayNoAuth
import com.telnyx.sdk.models.agentgateways.apis.AgentGatewayStaticAuth
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerDeleteParams
import com.telnyx.sdk.models.agentgateways.mcpservers.McpServerUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class McpServerServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mcpServerService = client.agentGateways().mcpServers()

        val agentGatewayMcpServerResponse =
            mcpServerService.create(
                McpServerCreateParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .name("orders")
                    .url("http://10.40.3.7:9000/mcp")
                    .auth(
                        AgentGatewayStaticAuth.builder()
                            .type(AgentGatewayStaticAuth.Type.API_KEY)
                            .value("example-orders-key")
                            .header("header")
                            .build()
                    )
                    .addForwardedHeader("X-Request-Id")
                    .openToEveryKey(true)
                    .staticHeaders(
                        McpServerCreateParams.StaticHeaders.builder()
                            .putAdditionalProperty("X-Env", JsonValue.from("prod"))
                            .build()
                    )
                    .addTool("string")
                    .transport(McpServerCreateParams.Transport.HTTP)
                    .build()
            )

        agentGatewayMcpServerResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mcpServerService = client.agentGateways().mcpServers()

        val agentGatewayMcpServerResponse =
            mcpServerService.update(
                McpServerUpdateParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .serverId("88d5a97b-4080-4855-8bac-a39811b1dc24")
                    .auth(AgentGatewayNoAuth.builder().type(AgentGatewayNoAuth.Type.NONE).build())
                    .addForwardedHeader("string")
                    .name("name")
                    .openToEveryKey(true)
                    .staticHeaders(
                        McpServerUpdateParams.StaticHeaders.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addTool("get_order")
                    .addTool("create_ticket")
                    .transport(McpServerUpdateParams.Transport.HTTP)
                    .url("url")
                    .build()
            )

        agentGatewayMcpServerResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mcpServerService = client.agentGateways().mcpServers()

        val mcpServers = mcpServerService.list("32ce035d-3165-4031-b1a7-a7c0c259590a")

        mcpServers.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mcpServerService = client.agentGateways().mcpServers()

        val agentGatewayMcpServerResponse =
            mcpServerService.delete(
                McpServerDeleteParams.builder()
                    .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                    .serverId("88d5a97b-4080-4855-8bac-a39811b1dc24")
                    .build()
            )

        agentGatewayMcpServerResponse.validate()
    }
}
