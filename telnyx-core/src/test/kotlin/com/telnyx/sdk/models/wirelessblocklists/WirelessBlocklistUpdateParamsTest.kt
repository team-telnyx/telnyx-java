// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistUpdateParamsTest {

    @Test
    fun create() {
        WirelessBlocklistUpdateParams.builder()
            .name("My Wireless Blocklist")
            .type(WirelessBlocklistUpdateParams.Type.COUNTRY)
            .addValue("CA")
            .addValue("US")
            .build()
    }

    @Test
    fun body() {
        val params =
            WirelessBlocklistUpdateParams.builder()
                .name("My Wireless Blocklist")
                .type(WirelessBlocklistUpdateParams.Type.COUNTRY)
                .addValue("CA")
                .addValue("US")
                .build()

        val body = params._body()

        assertThat(body.name()).contains("My Wireless Blocklist")
        assertThat(body.type()).contains(WirelessBlocklistUpdateParams.Type.COUNTRY)
        assertThat(body.values().getOrNull()).containsExactly("CA", "US")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WirelessBlocklistUpdateParams.builder().build()

        val body = params._body()
    }
}
