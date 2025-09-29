// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wirelessblocklists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistListResponseTest {

    @Test
    fun create() {
        val wirelessBlocklistListResponse =
            WirelessBlocklistListResponse.builder()
                .addData(
                    WirelessBlocklist.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .name("My wireless blocklist.")
                        .recordType("wireless_blocklist")
                        .type(WirelessBlocklist.Type.COUNTRY)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .values(listOf("CA", "MX", "US"))
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

        assertThat(wirelessBlocklistListResponse.data().getOrNull())
            .containsExactly(
                WirelessBlocklist.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .name("My wireless blocklist.")
                    .recordType("wireless_blocklist")
                    .type(WirelessBlocklist.Type.COUNTRY)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .values(listOf("CA", "MX", "US"))
                    .build()
            )
        assertThat(wirelessBlocklistListResponse.meta())
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
        val wirelessBlocklistListResponse =
            WirelessBlocklistListResponse.builder()
                .addData(
                    WirelessBlocklist.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .name("My wireless blocklist.")
                        .recordType("wireless_blocklist")
                        .type(WirelessBlocklist.Type.COUNTRY)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .values(listOf("CA", "MX", "US"))
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

        val roundtrippedWirelessBlocklistListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessBlocklistListResponse),
                jacksonTypeRef<WirelessBlocklistListResponse>(),
            )

        assertThat(roundtrippedWirelessBlocklistListResponse)
            .isEqualTo(wirelessBlocklistListResponse)
    }
}
