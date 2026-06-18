// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerListResponseTest {

    @Test
    fun create() {
        val mcpServerListResponse =
            McpServerListResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        assertThat(mcpServerListResponse.id()).isEqualTo("id")
        assertThat(mcpServerListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mcpServerListResponse.name()).isEqualTo("name")
        assertThat(mcpServerListResponse.type()).isEqualTo("type")
        assertThat(mcpServerListResponse.url()).isEqualTo("url")
        assertThat(mcpServerListResponse.allowedTools().getOrNull()).containsExactly("string")
        assertThat(mcpServerListResponse.apiKeyRef()).contains("api_key_ref")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerListResponse =
            McpServerListResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        val roundtrippedMcpServerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerListResponse),
                jacksonTypeRef<McpServerListResponse>(),
            )

        assertThat(roundtrippedMcpServerListResponse).isEqualTo(mcpServerListResponse)
    }
}
