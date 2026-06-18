// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerDeleteMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerGetMcpServerParams
import com.telnyx.sdk.models.ai.missions.mcpservers.McpServerUpdateMcpServerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class McpServerServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createMcpServer() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mcpServerServiceAsync = client.ai().missions().mcpServers()

        val responseFuture = mcpServerServiceAsync.createMcpServer("mission_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteMcpServer() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mcpServerServiceAsync = client.ai().missions().mcpServers()

        val future =
            mcpServerServiceAsync.deleteMcpServer(
                McpServerDeleteMcpServerParams.builder()
                    .missionId("mission_id")
                    .mcpServerId("mcp_server_id")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMcpServer() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mcpServerServiceAsync = client.ai().missions().mcpServers()

        val responseFuture =
            mcpServerServiceAsync.getMcpServer(
                McpServerGetMcpServerParams.builder()
                    .missionId("mission_id")
                    .mcpServerId("mcp_server_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMcpServers() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mcpServerServiceAsync = client.ai().missions().mcpServers()

        val responseFuture = mcpServerServiceAsync.listMcpServers("mission_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateMcpServer() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mcpServerServiceAsync = client.ai().missions().mcpServers()

        val responseFuture =
            mcpServerServiceAsync.updateMcpServer(
                McpServerUpdateMcpServerParams.builder()
                    .missionId("mission_id")
                    .mcpServerId("mcp_server_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
