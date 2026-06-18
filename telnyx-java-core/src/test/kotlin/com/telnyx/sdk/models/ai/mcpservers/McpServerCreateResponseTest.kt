// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerCreateResponseTest {

    @Test
    fun create() {
        val mcpServerCreateResponse =
            McpServerCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        assertThat(mcpServerCreateResponse.id()).isEqualTo("id")
        assertThat(mcpServerCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mcpServerCreateResponse.name()).isEqualTo("name")
        assertThat(mcpServerCreateResponse.type()).isEqualTo("type")
        assertThat(mcpServerCreateResponse.url()).isEqualTo("url")
        assertThat(mcpServerCreateResponse.allowedTools().getOrNull()).containsExactly("string")
        assertThat(mcpServerCreateResponse.apiKeyRef()).contains("api_key_ref")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerCreateResponse =
            McpServerCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        val roundtrippedMcpServerCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerCreateResponse),
                jacksonTypeRef<McpServerCreateResponse>(),
            )

        assertThat(roundtrippedMcpServerCreateResponse).isEqualTo(mcpServerCreateResponse)
    }
}
