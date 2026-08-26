// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessWirelessBlocklistTest {

    @Test
    fun create() {
        val wirelessWirelessBlocklist =
            WirelessWirelessBlocklist.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .name("My wireless blocklist.")
                .type(WirelessWirelessBlocklist.Type.COUNTRY)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .values(listOf("CA", "MX", "US"))
                .build()

        assertThat(wirelessWirelessBlocklist.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wirelessWirelessBlocklist.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wirelessWirelessBlocklist.name()).contains("My wireless blocklist.")
        assertThat(wirelessWirelessBlocklist.type())
            .contains(WirelessWirelessBlocklist.Type.COUNTRY)
        assertThat(wirelessWirelessBlocklist.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wirelessWirelessBlocklist.values().getOrNull()).containsExactly("CA", "MX", "US")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wirelessWirelessBlocklist =
            WirelessWirelessBlocklist.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .name("My wireless blocklist.")
                .type(WirelessWirelessBlocklist.Type.COUNTRY)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .values(listOf("CA", "MX", "US"))
                .build()

        val roundtrippedWirelessWirelessBlocklist =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessWirelessBlocklist),
                jacksonTypeRef<WirelessWirelessBlocklist>(),
            )

        assertThat(roundtrippedWirelessWirelessBlocklist).isEqualTo(wirelessWirelessBlocklist)
    }
}
