// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerDeleteResponseTest {

    @Test
    fun create() {
        val mcpServerDeleteResponse = McpServerDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mcpServerDeleteResponse = McpServerDeleteResponse.builder().build()

        val roundtrippedMcpServerDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mcpServerDeleteResponse),
                jacksonTypeRef<McpServerDeleteResponse>(),
            )

        assertThat(roundtrippedMcpServerDeleteResponse).isEqualTo(mcpServerDeleteResponse)
    }
}
