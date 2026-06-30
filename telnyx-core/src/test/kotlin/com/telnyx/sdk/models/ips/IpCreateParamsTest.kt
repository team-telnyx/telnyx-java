// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ips

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpCreateParamsTest {

    @Test
    fun create() {
        IpCreateParams.builder()
            .ipAddress("192.168.0.0")
            .connectionId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .port(5060L)
            .build()
    }

    @Test
    fun body() {
        val params =
            IpCreateParams.builder()
                .ipAddress("192.168.0.0")
                .connectionId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .port(5060L)
                .build()

        val body = params._body()

        assertThat(body.ipAddress()).isEqualTo("192.168.0.0")
        assertThat(body.connectionId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.port()).contains(5060L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = IpCreateParams.builder().ipAddress("192.168.0.0").build()

        val body = params._body()

        assertThat(body.ipAddress()).isEqualTo("192.168.0.0")
    }
}
