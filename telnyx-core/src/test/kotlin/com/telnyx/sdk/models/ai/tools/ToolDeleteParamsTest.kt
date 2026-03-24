// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolDeleteParamsTest {

    @Test
    fun create() {
        ToolDeleteParams.builder().toolId("tool_id").build()
    }

    @Test
    fun pathParams() {
        val params = ToolDeleteParams.builder().toolId("tool_id").build()

        assertThat(params._pathParam(0)).isEqualTo("tool_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
