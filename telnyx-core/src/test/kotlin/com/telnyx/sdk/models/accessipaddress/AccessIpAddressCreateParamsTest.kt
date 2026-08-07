// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipaddress

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpAddressCreateParamsTest {

    @Test
    fun create() {
        AccessIpAddressCreateParams.builder()
            .ipAddress("Ip Address")
            .description("Description")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccessIpAddressCreateParams.builder()
                .ipAddress("Ip Address")
                .description("Description")
                .build()

        val body = params._body()

        assertThat(body.ipAddress()).isEqualTo("Ip Address")
        assertThat(body.description()).contains("Description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccessIpAddressCreateParams.builder().ipAddress("Ip Address").build()

        val body = params._body()

        assertThat(body.ipAddress()).isEqualTo("Ip Address")
    }
}
