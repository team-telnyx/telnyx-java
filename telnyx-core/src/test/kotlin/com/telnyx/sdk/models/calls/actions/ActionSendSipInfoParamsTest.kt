// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSendSipInfoParamsTest {

    @Test
    fun create() {
        ActionSendSipInfoParams.builder().callControlId("call_control_id").build()
    }

    @Test
    fun pathParams() {
        val params = ActionSendSipInfoParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
