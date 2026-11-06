// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.mcpservers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerDeleteParamsTest {

    @Test
    fun create() {
        McpServerDeleteParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .serverId("88d5a97b-4080-4855-8bac-a39811b1dc24")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            McpServerDeleteParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .serverId("88d5a97b-4080-4855-8bac-a39811b1dc24")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1)).isEqualTo("88d5a97b-4080-4855-8bac-a39811b1dc24")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
