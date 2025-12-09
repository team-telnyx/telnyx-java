// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardPeerListResponseTest {

    @Test
    fun create() {
        val wireguardPeerListResponse =
            WireguardPeerListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .lastSeen("2018-02-02T22:25:27.521Z")
                .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(wireguardPeerListResponse.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wireguardPeerListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wireguardPeerListResponse.recordType()).contains("sample_record_type")
        assertThat(wireguardPeerListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wireguardPeerListResponse.publicKey())
            .contains("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
        assertThat(wireguardPeerListResponse.lastSeen()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wireguardPeerListResponse.privateKey())
            .contains("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
        assertThat(wireguardPeerListResponse.wireguardInterfaceId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireguardPeerListResponse =
            WireguardPeerListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .lastSeen("2018-02-02T22:25:27.521Z")
                .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val roundtrippedWireguardPeerListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardPeerListResponse),
                jacksonTypeRef<WireguardPeerListResponse>(),
            )

        assertThat(roundtrippedWireguardPeerListResponse).isEqualTo(wireguardPeerListResponse)
    }
}
