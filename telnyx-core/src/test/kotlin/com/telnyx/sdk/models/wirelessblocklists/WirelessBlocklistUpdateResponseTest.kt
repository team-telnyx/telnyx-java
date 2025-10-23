// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistUpdateResponseTest {

    @Test
    fun create() {
        val wirelessBlocklistUpdateResponse =
            WirelessBlocklistUpdateResponse.builder()
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

        assertThat(wirelessBlocklistUpdateResponse.data())
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
        val wirelessBlocklistUpdateResponse =
            WirelessBlocklistUpdateResponse.builder()
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

        val roundtrippedWirelessBlocklistUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessBlocklistUpdateResponse),
                jacksonTypeRef<WirelessBlocklistUpdateResponse>(),
            )

        assertThat(roundtrippedWirelessBlocklistUpdateResponse)
            .isEqualTo(wirelessBlocklistUpdateResponse)
    }
}
