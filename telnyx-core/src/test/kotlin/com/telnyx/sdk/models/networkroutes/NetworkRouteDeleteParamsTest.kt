// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkroutes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkRouteDeleteParamsTest {

    @Test
    fun create() {
        NetworkRouteDeleteParams.builder().id("e8a2c5d0-3f7b-4a19-b6d2-9c1e0f8a7b53").build()
    }

    @Test
    fun pathParams() {
        val params =
            NetworkRouteDeleteParams.builder().id("e8a2c5d0-3f7b-4a19-b6d2-9c1e0f8a7b53").build()

        assertThat(params._pathParam(0)).isEqualTo("e8a2c5d0-3f7b-4a19-b6d2-9c1e0f8a7b53")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
