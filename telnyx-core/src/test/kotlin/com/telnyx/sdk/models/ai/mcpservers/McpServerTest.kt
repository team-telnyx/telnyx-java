// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerTest {

    @Test
    fun create() {
        val mcpServer =
            McpServer.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        assertThat(mcpServer.id()).isEqualTo("id")
        assertThat(mcpServer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mcpServer.name()).isEqualTo("name")
        assertThat(mcpServer.type()).isEqualTo("type")
        assertThat(mcpServer.url()).isEqualTo("url")
        assertThat(mcpServer.allowedTools().getOrNull()).containsExactly("string")
        assertThat(mcpServer.apiKeyRef()).contains("api_key_ref")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServer =
            McpServer.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        val roundtrippedMcpServer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServer),
                jacksonTypeRef<McpServer>(),
            )

        assertThat(roundtrippedMcpServer).isEqualTo(mcpServer)
    }
}
