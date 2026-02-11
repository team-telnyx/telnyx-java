// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerCreateMcpServerResponseTest {

    @Test
    fun create() {
        val mcpServerCreateMcpServerResponse = McpServerCreateMcpServerResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerCreateMcpServerResponse = McpServerCreateMcpServerResponse.builder().build()

        val roundtrippedMcpServerCreateMcpServerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerCreateMcpServerResponse),
                jacksonTypeRef<McpServerCreateMcpServerResponse>(),
            )

        assertThat(roundtrippedMcpServerCreateMcpServerResponse)
            .isEqualTo(mcpServerCreateMcpServerResponse)
    }
}
