// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerDeleteParamsTest {

    @Test
    fun create() {
        McpServerDeleteParams.builder().mcpServerId("mcp_server_id").build()
    }

    @Test
    fun pathParams() {
        val params = McpServerDeleteParams.builder().mcpServerId("mcp_server_id").build()

        assertThat(params._pathParam(0)).isEqualTo("mcp_server_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
