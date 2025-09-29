// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipaddress

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpAddressCreateParamsTest {

    @Test
    fun create() {
        AccessIpAddressCreateParams.builder()
            .ipAddress("ip_address")
            .description("description")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccessIpAddressCreateParams.builder()
                .ipAddress("ip_address")
                .description("description")
                .build()

        val body = params._body()

        assertThat(body.ipAddress()).isEqualTo("ip_address")
        assertThat(body.description()).contains("description")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccessIpAddressCreateParams.builder().ipAddress("ip_address").build()

        val body = params._body()

        assertThat(body.ipAddress()).isEqualTo("ip_address")
    }
}
