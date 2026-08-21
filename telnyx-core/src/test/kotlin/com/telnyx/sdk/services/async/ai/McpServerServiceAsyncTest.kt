// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class McpServerServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mcpServerServiceAsync = client.ai().mcpServers()

        val mcpServerFuture =
            mcpServerServiceAsync.create(
                McpServerCreateParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .name("Name")
                    .type("Type")
                    .url("Url")
                    .addAllowedTool("string")
                    .apiKeyRef("api_key_ref")
                    .build()
            )

        val mcpServer = mcpServerFuture.get()
        mcpServer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mcpServerServiceAsync = client.ai().mcpServers()

        val mcpServerFuture = mcpServerServiceAsync.retrieve("mcp_server_id")

        val mcpServer = mcpServerFuture.get()
        mcpServer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mcpServerServiceAsync = client.ai().mcpServers()

        val mcpServerFuture =
            mcpServerServiceAsync.update(
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

        val mcpServer = mcpServerFuture.get()
        mcpServer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mcpServerServiceAsync = client.ai().mcpServers()

        val pageFuture = mcpServerServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val mcpServerServiceAsync = client.ai().mcpServers()

        val future = mcpServerServiceAsync.delete("mcp_server_id")

        val response = future.get()
    }
}
