// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tailscalesubnetrouters

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TailscaleSubnetRouterUpdateParamsTest {

    @Test
    fun create() {
        TailscaleSubnetRouterUpdateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .addAdvertisedRoute("172.27.0.0/24")
            .addAdvertisedRoute("172.27.1.0/24")
            .authKey("tskey-auth-k1AbCdEfGh2IjKlMnOpQrStUv")
            .name("tailnet-ashburn")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TailscaleSubnetRouterUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TailscaleSubnetRouterUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .addAdvertisedRoute("172.27.0.0/24")
                .addAdvertisedRoute("172.27.1.0/24")
                .authKey("tskey-auth-k1AbCdEfGh2IjKlMnOpQrStUv")
                .name("tailnet-ashburn")
                .build()

        val body = params._body()

        assertThat(body.advertisedRoutes().getOrNull())
            .containsExactly("172.27.0.0/24", "172.27.1.0/24")
        assertThat(body.authKey()).contains("tskey-auth-k1AbCdEfGh2IjKlMnOpQrStUv")
        assertThat(body.name()).contains("tailnet-ashburn")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TailscaleSubnetRouterUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()
    }
}
