// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardPeerUpdateParamsTest {

    @Test
    fun create() {
        WireguardPeerUpdateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .wireguardPeerPatch(
                WireguardPeerPatch.builder()
                    .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WireguardPeerUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .wireguardPeerPatch(WireguardPeerPatch.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WireguardPeerUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .wireguardPeerPatch(
                    WireguardPeerPatch.builder()
                        .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                WireguardPeerPatch.builder()
                    .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WireguardPeerUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .wireguardPeerPatch(WireguardPeerPatch.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(WireguardPeerPatch.builder().build())
    }
}
