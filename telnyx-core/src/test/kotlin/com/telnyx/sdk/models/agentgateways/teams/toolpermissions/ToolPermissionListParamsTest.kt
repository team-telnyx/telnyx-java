// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.teams.toolpermissions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolPermissionListParamsTest {

    @Test
    fun create() {
        ToolPermissionListParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .teamId("d7b21324-a2bf-406c-ba49-c6ec4d23d476")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ToolPermissionListParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .teamId("d7b21324-a2bf-406c-ba49-c6ec4d23d476")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1)).isEqualTo("d7b21324-a2bf-406c-ba49-c6ec4d23d476")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
