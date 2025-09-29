// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.migrations.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopParamsTest {

    @Test
    fun create() {
        ActionStopParams.builder().id("").build()
    }

    @Test
    fun pathParams() {
        val params = ActionStopParams.builder().id("").build()

        assertThat(params._pathParam(0)).isEqualTo("")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
