// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tunnels

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TunnelCreateParamsTest {

    @Test
    fun create() {
        TunnelCreateParams.builder().name("chicago-dc").build()
    }

    @Test
    fun body() {
        val params = TunnelCreateParams.builder().name("chicago-dc").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("chicago-dc")
    }
}
