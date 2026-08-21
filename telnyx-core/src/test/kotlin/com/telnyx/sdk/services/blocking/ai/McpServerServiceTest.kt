// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class McpServerServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mcpServerService = client.ai().mcpServers()

        val mcpServer =
            mcpServerService.create(
                McpServerCreateParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .name("Name")
                    .type("Type")
                    .url("Url")
                    .addAllowedTool("string")
                    .apiKeyRef("api_key_ref")
                    .build()
            )

        mcpServer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mcpServerService = client.ai().mcpServers()

        val mcpServer = mcpServerService.retrieve("mcp_server_id")

        mcpServer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mcpServerService = client.ai().mcpServers()

        val mcpServer =
            mcpServerService.update(
                McpServerUpdateParams.builder()
                    .mcpServerId("mcp_server_id")
                    .id("Id")
                    .addAllowedTool("string")
                    .apiKeyRef("api_key_ref")
                    .createdAt(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
                    .name("Name")
                    .type("Type")
                    .url("Url")
                    .build()
            )

        mcpServer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mcpServerService = client.ai().mcpServers()

        val page = mcpServerService.list()

        page.items().forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val mcpServerService = client.ai().mcpServers()

        mcpServerService.delete("mcp_server_id")
    }
}
