// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistCreateParamsTest {

    @Test
    fun create() {
        WirelessBlocklistCreateParams.builder()
            .name("My Wireless Blocklist")
            .type(WirelessBlocklistCreateParams.Type.COUNTRY)
            .addValue("CA")
            .addValue("US")
            .build()
    }

    @Test
    fun body() {
        val params =
            WirelessBlocklistCreateParams.builder()
                .name("My Wireless Blocklist")
                .type(WirelessBlocklistCreateParams.Type.COUNTRY)
                .addValue("CA")
                .addValue("US")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My Wireless Blocklist")
        assertThat(body.type()).isEqualTo(WirelessBlocklistCreateParams.Type.COUNTRY)
        assertThat(body.values()).containsExactly("CA", "US")
    }
}
