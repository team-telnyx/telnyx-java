// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardPeerTest {

    @Test
    fun create() {
        val wireguardPeer =
            WireguardPeer.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .lastSeen("2018-02-02T22:25:27.521Z")
                .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(wireguardPeer.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wireguardPeer.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wireguardPeer.recordType()).contains("sample_record_type")
        assertThat(wireguardPeer.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wireguardPeer.lastSeen()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wireguardPeer.privateKey())
            .contains("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
        assertThat(wireguardPeer.wireguardInterfaceId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireguardPeer =
            WireguardPeer.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .lastSeen("2018-02-02T22:25:27.521Z")
                .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val roundtrippedWireguardPeer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardPeer),
                jacksonTypeRef<WireguardPeer>(),
            )

        assertThat(roundtrippedWireguardPeer).isEqualTo(wireguardPeer)
    }
}
