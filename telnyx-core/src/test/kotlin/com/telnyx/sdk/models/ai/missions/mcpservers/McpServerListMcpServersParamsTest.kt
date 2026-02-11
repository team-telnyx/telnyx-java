// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.mcpservers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerListMcpServersParamsTest {

    @Test
    fun create() {
        McpServerListMcpServersParams.builder().missionId("mission_id").build()
    }

    @Test
    fun pathParams() {
        val params = McpServerListMcpServersParams.builder().missionId("mission_id").build()

        assertThat(params._pathParam(0)).isEqualTo("mission_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
