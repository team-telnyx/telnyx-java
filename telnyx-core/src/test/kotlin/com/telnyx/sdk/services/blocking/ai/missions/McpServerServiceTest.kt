// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerDeleteMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerGetMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerUpdateMcpServerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class McpServerServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createMcpServer() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mcpServerService = client.ai().missions().mcpServers()

        val response = mcpServerService.createMcpServer("mission_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteMcpServer() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mcpServerService = client.ai().missions().mcpServers()

        mcpServerService.deleteMcpServer(
            McpServerDeleteMcpServerParams.builder()
                .missionId("mission_id")
                .mcpServerId("mcp_server_id")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getMcpServer() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mcpServerService = client.ai().missions().mcpServers()

        val response =
            mcpServerService.getMcpServer(
                McpServerGetMcpServerParams.builder()
                    .missionId("mission_id")
                    .mcpServerId("mcp_server_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listMcpServers() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mcpServerService = client.ai().missions().mcpServers()

        val response = mcpServerService.listMcpServers("mission_id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateMcpServer() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mcpServerService = client.ai().missions().mcpServers()

        val response =
            mcpServerService.updateMcpServer(
                McpServerUpdateMcpServerParams.builder()
                    .missionId("mission_id")
                    .mcpServerId("mcp_server_id")
                    .build()
            )

        response.validate()
    }
}
