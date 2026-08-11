// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = McpServerUpdateParams.builder().mcpServerId("mcp_server_id").build()

        assertThat(params._pathParam(0)).isEqualTo("mcp_server_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.id()).contains("Id")
        assertThat(body.allowedTools().getOrNull()).containsExactly("string")
        assertThat(body.apiKeyRef()).contains("api_key_ref")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2024-01-23T18:10:02.574Z"))
        assertThat(body.name()).contains("Name")
        assertThat(body.type()).contains("Type")
        assertThat(body.url()).contains("Url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = McpServerUpdateParams.builder().mcpServerId("mcp_server_id").build()

        val body = params._body()
    }
}
