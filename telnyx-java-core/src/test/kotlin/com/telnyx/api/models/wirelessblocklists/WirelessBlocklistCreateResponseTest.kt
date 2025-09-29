// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wirelessblocklists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistCreateResponseTest {

    @Test
    fun create() {
        val wirelessBlocklistCreateResponse =
            WirelessBlocklistCreateResponse.builder()
                .data(
                    WirelessBlocklist.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .name("North American Wireless Blocklist")
                        .recordType("wireless_blocklist")
                        .type(WirelessBlocklist.Type.COUNTRY)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .values(listOf("CA", "MX", "US"))
                        .build()
                )
                .build()

        assertThat(wirelessBlocklistCreateResponse.data())
            .contains(
                WirelessBlocklist.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .name("North American Wireless Blocklist")
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
        val wirelessBlocklistCreateResponse =
            WirelessBlocklistCreateResponse.builder()
                .data(
                    WirelessBlocklist.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .name("North American Wireless Blocklist")
                        .recordType("wireless_blocklist")
                        .type(WirelessBlocklist.Type.COUNTRY)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .values(listOf("CA", "MX", "US"))
                        .build()
                )
                .build()

        val roundtrippedWirelessBlocklistCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessBlocklistCreateResponse),
                jacksonTypeRef<WirelessBlocklistCreateResponse>(),
            )

        assertThat(roundtrippedWirelessBlocklistCreateResponse)
            .isEqualTo(wirelessBlocklistCreateResponse)
    }
}
