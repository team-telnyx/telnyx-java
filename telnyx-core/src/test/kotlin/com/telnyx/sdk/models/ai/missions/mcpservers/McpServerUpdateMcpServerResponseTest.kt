// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerUpdateMcpServerResponseTest {

    @Test
    fun create() {
        val mcpServerUpdateMcpServerResponse = McpServerUpdateMcpServerResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerUpdateMcpServerResponse = McpServerUpdateMcpServerResponse.builder().build()

        val roundtrippedMcpServerUpdateMcpServerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerUpdateMcpServerResponse),
                jacksonTypeRef<McpServerUpdateMcpServerResponse>(),
            )

        assertThat(roundtrippedMcpServerUpdateMcpServerResponse)
            .isEqualTo(mcpServerUpdateMcpServerResponse)
    }
}
