// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkCreateParamsTest {

    @Test
    fun create() {
        NetworkCreateParams.builder().networkCreate(NetworkCreate.builder().build()).build()
    }

    @Test
    fun body() {
        val params =
            NetworkCreateParams.builder().networkCreate(NetworkCreate.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(NetworkCreate.builder().build())
    }
}
