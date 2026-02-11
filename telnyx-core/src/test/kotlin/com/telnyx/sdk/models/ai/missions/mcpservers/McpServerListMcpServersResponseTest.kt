// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerListMcpServersResponseTest {

    @Test
    fun create() {
        val mcpServerListMcpServersResponse = McpServerListMcpServersResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerListMcpServersResponse = McpServerListMcpServersResponse.builder().build()

        val roundtrippedMcpServerListMcpServersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerListMcpServersResponse),
                jacksonTypeRef<McpServerListMcpServersResponse>(),
            )

        assertThat(roundtrippedMcpServerListMcpServersResponse)
            .isEqualTo(mcpServerListMcpServersResponse)
    }
}
