// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardgroups.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSetWirelessBlocklistParamsTest {

    @Test
    fun create() {
        ActionSetWirelessBlocklistParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .wirelessBlocklistId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionSetWirelessBlocklistParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .wirelessBlocklistId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionSetWirelessBlocklistParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .wirelessBlocklistId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()

        assertThat(body.wirelessBlocklistId()).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
    }
}
