// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistTest {

    @Test
    fun create() {
        val wirelessBlocklist =
            WirelessBlocklist.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .name("My wireless blocklist.")
                .recordType("wireless_blocklist")
                .type(WirelessBlocklist.Type.COUNTRY)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .values(listOf("CA", "MX", "US"))
                .build()

        assertThat(wirelessBlocklist.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wirelessBlocklist.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wirelessBlocklist.name()).contains("My wireless blocklist.")
        assertThat(wirelessBlocklist.recordType()).contains("wireless_blocklist")
        assertThat(wirelessBlocklist.type()).contains(WirelessBlocklist.Type.COUNTRY)
        assertThat(wirelessBlocklist.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wirelessBlocklist.values().getOrNull()).containsExactly("CA", "MX", "US")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wirelessBlocklist =
            WirelessBlocklist.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .name("My wireless blocklist.")
                .recordType("wireless_blocklist")
                .type(WirelessBlocklist.Type.COUNTRY)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .values(listOf("CA", "MX", "US"))
                .build()

        val roundtrippedWirelessBlocklist =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessBlocklist),
                jacksonTypeRef<WirelessBlocklist>(),
            )

        assertThat(roundtrippedWirelessBlocklist).isEqualTo(wirelessBlocklist)
    }
}
