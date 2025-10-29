// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.mcpservers.McpServerCreateParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerListParams
import com.telnyx.sdk.models.ai.mcpservers.McpServerUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class McpServerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mcpServerServiceAsync = client.ai().mcpServers()

        val mcpServerFuture =
            mcpServerServiceAsync.create(
                McpServerCreateParams.builder()
                    .name("name")
                    .type("type")
                    .url("url")
                    .addAllowedTool("string")
                    .apiKeyRef("api_key_ref")
                    .build()
            )

        val mcpServer = mcpServerFuture.get()
        mcpServer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mcpServerServiceAsync = client.ai().mcpServers()

        val mcpServerFuture = mcpServerServiceAsync.retrieve("mcp_server_id")

        val mcpServer = mcpServerFuture.get()
        mcpServer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mcpServerServiceAsync = client.ai().mcpServers()

        val mcpServerFuture =
            mcpServerServiceAsync.update(
                McpServerUpdateParams.builder()
                    .mcpServerId("mcp_server_id")
                    .id("id")
                    .addAllowedTool("string")
                    .apiKeyRef("api_key_ref")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .type("type")
                    .url("url")
                    .build()
            )

        val mcpServer = mcpServerFuture.get()
        mcpServer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mcpServerServiceAsync = client.ai().mcpServers()

        val mcpServersFuture =
            mcpServerServiceAsync.list(
                McpServerListParams.builder()
                    .pageNumber(1L)
                    .pageSize(1L)
                    .type("type")
                    .url("url")
                    .build()
            )

        val mcpServers = mcpServersFuture.get()
        mcpServers.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mcpServerServiceAsync = client.ai().mcpServers()

        val mcpServerFuture = mcpServerServiceAsync.delete("mcp_server_id")

        val mcpServer = mcpServerFuture.get()
        mcpServer.validate()
    }
}
