// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerRetrieveResponseTest {

    @Test
    fun create() {
        val mcpServerRetrieveResponse =
            McpServerRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        assertThat(mcpServerRetrieveResponse.id()).isEqualTo("id")
        assertThat(mcpServerRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mcpServerRetrieveResponse.name()).isEqualTo("name")
        assertThat(mcpServerRetrieveResponse.type()).isEqualTo("type")
        assertThat(mcpServerRetrieveResponse.url()).isEqualTo("url")
        assertThat(mcpServerRetrieveResponse.allowedTools().getOrNull()).containsExactly("string")
        assertThat(mcpServerRetrieveResponse.apiKeyRef()).contains("api_key_ref")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerRetrieveResponse =
            McpServerRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        val roundtrippedMcpServerRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerRetrieveResponse),
                jacksonTypeRef<McpServerRetrieveResponse>(),
            )

        assertThat(roundtrippedMcpServerRetrieveResponse).isEqualTo(mcpServerRetrieveResponse)
    }
}
