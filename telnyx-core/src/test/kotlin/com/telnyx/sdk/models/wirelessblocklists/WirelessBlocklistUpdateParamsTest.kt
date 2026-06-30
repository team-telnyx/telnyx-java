// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistUpdateParamsTest {

    @Test
    fun create() {
        WirelessBlocklistUpdateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .name("My Wireless Blocklist")
            .addValue("CA")
            .addValue("US")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WirelessBlocklistUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WirelessBlocklistUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .name("My Wireless Blocklist")
                .addValue("CA")
                .addValue("US")
                .build()

        val body = params._body()

        assertThat(body.name()).contains("My Wireless Blocklist")
        assertThat(body.values().getOrNull()).containsExactly("CA", "US")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WirelessBlocklistUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()
    }
}
