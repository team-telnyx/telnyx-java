// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tailscalesubnetrouters

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TailscaleSubnetRouterCreateParamsTest {

    @Test
    fun create() {
        TailscaleSubnetRouterCreateParams.builder()
            .addAdvertisedRoute("172.27.0.0/24")
            .authKey("tskey-auth-k1AbCdEfGh2IjKlMnOpQrStUv")
            .name("tailnet-ashburn")
            .networkId("0de011ae-ee53-4df4-ba96-754728eb5aad")
            .regionCode("ashburn-va")
            .build()
    }

    @Test
    fun body() {
        val params =
            TailscaleSubnetRouterCreateParams.builder()
                .addAdvertisedRoute("172.27.0.0/24")
                .authKey("tskey-auth-k1AbCdEfGh2IjKlMnOpQrStUv")
                .name("tailnet-ashburn")
                .networkId("0de011ae-ee53-4df4-ba96-754728eb5aad")
                .regionCode("ashburn-va")
                .build()

        val body = params._body()

        assertThat(body.advertisedRoutes()).containsExactly("172.27.0.0/24")
        assertThat(body.authKey()).isEqualTo("tskey-auth-k1AbCdEfGh2IjKlMnOpQrStUv")
        assertThat(body.name()).isEqualTo("tailnet-ashburn")
        assertThat(body.networkId()).isEqualTo("0de011ae-ee53-4df4-ba96-754728eb5aad")
        assertThat(body.regionCode()).isEqualTo("ashburn-va")
    }
}
