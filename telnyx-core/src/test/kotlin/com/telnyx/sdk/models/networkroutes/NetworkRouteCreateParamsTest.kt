// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkroutes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkRouteCreateParamsTest {

    @Test
    fun create() {
        NetworkRouteCreateParams.builder()
            .cidr("10.20.0.0/16")
            .networkId("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
            .nextHop(
                NetworkRouteCreateParams.NextHop.builder()
                    .id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
                    .type(NetworkRouteCreateParams.NextHop.Type.TUNNEL)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            NetworkRouteCreateParams.builder()
                .cidr("10.20.0.0/16")
                .networkId("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                .nextHop(
                    NetworkRouteCreateParams.NextHop.builder()
                        .id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
                        .type(NetworkRouteCreateParams.NextHop.Type.TUNNEL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.cidr()).isEqualTo("10.20.0.0/16")
        assertThat(body.networkId()).isEqualTo("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
        assertThat(body.nextHop())
            .isEqualTo(
                NetworkRouteCreateParams.NextHop.builder()
                    .id("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")
                    .type(NetworkRouteCreateParams.NextHop.Type.TUNNEL)
                    .build()
            )
    }
}
