// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistDeleteResponseTest {

    @Test
    fun create() {
        val wirelessBlocklistDeleteResponse =
            WirelessBlocklistDeleteResponse.builder()
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

        assertThat(wirelessBlocklistDeleteResponse.data())
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
        val wirelessBlocklistDeleteResponse =
            WirelessBlocklistDeleteResponse.builder()
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

        val roundtrippedWirelessBlocklistDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessBlocklistDeleteResponse),
                jacksonTypeRef<WirelessBlocklistDeleteResponse>(),
            )

        assertThat(roundtrippedWirelessBlocklistDeleteResponse)
            .isEqualTo(wirelessBlocklistDeleteResponse)
    }
}
