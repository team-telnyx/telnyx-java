// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wireguardpeers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardPeerCreateResponseTest {

    @Test
    fun create() {
        val wireguardPeerCreateResponse =
            WireguardPeerCreateResponse.builder()
                .data(
                    WireguardPeerCreateResponse.Data.builder()
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

        assertThat(wireguardPeerCreateResponse.data())
            .contains(
                WireguardPeerCreateResponse.Data.builder()
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
        val wireguardPeerCreateResponse =
            WireguardPeerCreateResponse.builder()
                .data(
                    WireguardPeerCreateResponse.Data.builder()
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

        val roundtrippedWireguardPeerCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardPeerCreateResponse),
                jacksonTypeRef<WireguardPeerCreateResponse>(),
            )

        assertThat(roundtrippedWireguardPeerCreateResponse).isEqualTo(wireguardPeerCreateResponse)
    }
}
