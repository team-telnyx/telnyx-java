// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardPeerListPageResponseTest {

    @Test
    fun create() {
        val wireguardPeerListPageResponse =
            WireguardPeerListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(wireguardPeerListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(wireguardPeerListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireguardPeerListPageResponse =
            WireguardPeerListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedWireguardPeerListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardPeerListPageResponse),
                jacksonTypeRef<WireguardPeerListPageResponse>(),
            )

        assertThat(roundtrippedWireguardPeerListPageResponse)
            .isEqualTo(wireguardPeerListPageResponse)
    }
}
