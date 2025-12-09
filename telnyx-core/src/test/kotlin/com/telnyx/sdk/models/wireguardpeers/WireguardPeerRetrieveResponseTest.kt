// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardPeerRetrieveResponseTest {

    @Test
    fun create() {
        val wireguardPeerRetrieveResponse =
            WireguardPeerRetrieveResponse.builder()
                .data(
                    WireguardPeerRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .lastSeen("2018-02-02T22:25:27.521Z")
                        .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .build()

        assertThat(wireguardPeerRetrieveResponse.data())
            .contains(
                WireguardPeerRetrieveResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
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
        val wireguardPeerRetrieveResponse =
            WireguardPeerRetrieveResponse.builder()
                .data(
                    WireguardPeerRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .lastSeen("2018-02-02T22:25:27.521Z")
                        .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                        .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .build()

        val roundtrippedWireguardPeerRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardPeerRetrieveResponse),
                jacksonTypeRef<WireguardPeerRetrieveResponse>(),
            )

        assertThat(roundtrippedWireguardPeerRetrieveResponse)
            .isEqualTo(wireguardPeerRetrieveResponse)
    }
}
