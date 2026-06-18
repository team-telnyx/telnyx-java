// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerGetMcpServerResponseTest {

    @Test
    fun create() {
        val mcpServerGetMcpServerResponse = McpServerGetMcpServerResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerGetMcpServerResponse = McpServerGetMcpServerResponse.builder().build()

        val roundtrippedMcpServerGetMcpServerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerGetMcpServerResponse),
                jacksonTypeRef<McpServerGetMcpServerResponse>(),
            )

        assertThat(roundtrippedMcpServerGetMcpServerResponse)
            .isEqualTo(mcpServerGetMcpServerResponse)
    }
}
