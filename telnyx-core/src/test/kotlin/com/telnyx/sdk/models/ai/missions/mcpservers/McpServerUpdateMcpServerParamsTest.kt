// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.mcpservers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerUpdateMcpServerParamsTest {

    @Test
    fun create() {
        McpServerUpdateMcpServerParams.builder()
            .missionId("mission_id")
            .mcpServerId("mcp_server_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            McpServerUpdateMcpServerParams.builder()
                .missionId("mission_id")
                .mcpServerId("mcp_server_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("mission_id")
        assertThat(params._pathParam(1)).isEqualTo("mcp_server_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
