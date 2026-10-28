// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tunnels

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TunnelDeleteParamsTest {

    @Test
    fun create() {
        TunnelDeleteParams.builder().id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39").build()
    }

    @Test
    fun pathParams() {
        val params = TunnelDeleteParams.builder().id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39").build()

        assertThat(params._pathParam(0)).isEqualTo("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
