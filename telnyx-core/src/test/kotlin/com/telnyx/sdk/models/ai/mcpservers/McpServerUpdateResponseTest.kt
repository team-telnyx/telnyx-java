// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerUpdateResponseTest {

    @Test
    fun create() {
        val mcpServerUpdateResponse =
            McpServerUpdateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        assertThat(mcpServerUpdateResponse.id()).isEqualTo("id")
        assertThat(mcpServerUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(mcpServerUpdateResponse.name()).isEqualTo("name")
        assertThat(mcpServerUpdateResponse.type()).isEqualTo("type")
        assertThat(mcpServerUpdateResponse.url()).isEqualTo("url")
        assertThat(mcpServerUpdateResponse.allowedTools().getOrNull()).containsExactly("string")
        assertThat(mcpServerUpdateResponse.apiKeyRef()).contains("api_key_ref")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerUpdateResponse =
            McpServerUpdateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .url("url")
                .addAllowedTool("string")
                .apiKeyRef("api_key_ref")
                .build()

        val roundtrippedMcpServerUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerUpdateResponse),
                jacksonTypeRef<McpServerUpdateResponse>(),
            )

        assertThat(roundtrippedMcpServerUpdateResponse).isEqualTo(mcpServerUpdateResponse)
    }
}
