// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wirelessblocklists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistRetrieveResponseTest {

    @Test
    fun create() {
        val wirelessBlocklistRetrieveResponse =
            WirelessBlocklistRetrieveResponse.builder()
                .data(
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
                .build()

        assertThat(wirelessBlocklistRetrieveResponse.data())
            .contains(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wirelessBlocklistRetrieveResponse =
            WirelessBlocklistRetrieveResponse.builder()
                .data(
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
                .build()

        val roundtrippedWirelessBlocklistRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessBlocklistRetrieveResponse),
                jacksonTypeRef<WirelessBlocklistRetrieveResponse>(),
            )

        assertThat(roundtrippedWirelessBlocklistRetrieveResponse)
            .isEqualTo(wirelessBlocklistRetrieveResponse)
    }
}
