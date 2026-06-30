// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tools

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolAddParamsTest {

    @Test
    fun create() {
        ToolAddParams.builder().assistantId("assistant_id").toolId("tool_id").build()
    }

    @Test
    fun pathParams() {
        val params = ToolAddParams.builder().assistantId("assistant_id").toolId("tool_id").build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        assertThat(params._pathParam(1)).isEqualTo("tool_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
