// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnDeleteParamsTest {

    @Test
    fun create() {
        FqdnDeleteParams.builder().id("1517907029795014409").build()
    }

    @Test
    fun pathParams() {
        val params = FqdnDeleteParams.builder().id("1517907029795014409").build()

        assertThat(params._pathParam(0)).isEqualTo("1517907029795014409")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
