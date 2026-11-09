// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys.toolpermissions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolPermissionListParamsTest {

    @Test
    fun create() {
        ToolPermissionListParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .keyId("f739ad190d29e2a5e658c3a486111953e6c18d746fd04374962ab150aae17757")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ToolPermissionListParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .keyId("f739ad190d29e2a5e658c3a486111953e6c18d746fd04374962ab150aae17757")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1))
            .isEqualTo("f739ad190d29e2a5e658c3a486111953e6c18d746fd04374962ab150aae17757")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
