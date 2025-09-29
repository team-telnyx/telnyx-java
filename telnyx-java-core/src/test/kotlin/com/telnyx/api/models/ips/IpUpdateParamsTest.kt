// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ips

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpUpdateParamsTest {

    @Test
    fun create() {
        IpUpdateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .ipAddress("192.168.0.0")
            .connectionId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .port(5060L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IpUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .ipAddress("192.168.0.0")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            IpUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
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
        val params =
            IpUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .ipAddress("192.168.0.0")
                .build()

        val body = params._body()

        assertThat(body.ipAddress()).isEqualTo("192.168.0.0")
    }
}
