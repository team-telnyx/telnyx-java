// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnUpdateParamsTest {

    @Test
    fun create() {
        FqdnUpdateParams.builder()
            .id("1517907029795014409")
            .connectionId("1516447646313612565")
            .dnsRecordType("a")
            .fqdn("example.com")
            .port(8080L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = FqdnUpdateParams.builder().id("1517907029795014409").build()

        assertThat(params._pathParam(0)).isEqualTo("1517907029795014409")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FqdnUpdateParams.builder()
                .id("1517907029795014409")
                .connectionId("1516447646313612565")
                .dnsRecordType("a")
                .fqdn("example.com")
                .port(8080L)
                .build()

        val body = params._body()

        assertThat(body.connectionId()).contains("1516447646313612565")
        assertThat(body.dnsRecordType()).contains("a")
        assertThat(body.fqdn()).contains("example.com")
        assertThat(body.port()).contains(8080L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FqdnUpdateParams.builder().id("1517907029795014409").build()

        val body = params._body()
    }
}
