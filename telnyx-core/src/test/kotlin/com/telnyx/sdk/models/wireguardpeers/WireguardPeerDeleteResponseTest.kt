// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardPeerDeleteResponseTest {

    @Test
    fun create() {
        val wireguardPeerDeleteResponse =
            WireguardPeerDeleteResponse.builder()
                .data(
                    WireguardPeerDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("wireguard_peer")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .lastSeen("2018-02-02T22:25:27.521Z")
                        .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .build()

        assertThat(wireguardPeerDeleteResponse.data())
            .contains(
                WireguardPeerDeleteResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("wireguard_peer")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                    .lastSeen("2018-02-02T22:25:27.521Z")
                    .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                    .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireguardPeerDeleteResponse =
            WireguardPeerDeleteResponse.builder()
                .data(
                    WireguardPeerDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("wireguard_peer")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .lastSeen("2018-02-02T22:25:27.521Z")
                        .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .build()

        val roundtrippedWireguardPeerDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardPeerDeleteResponse),
                jacksonTypeRef<WireguardPeerDeleteResponse>(),
            )

        assertThat(roundtrippedWireguardPeerDeleteResponse).isEqualTo(wireguardPeerDeleteResponse)
    }
}
