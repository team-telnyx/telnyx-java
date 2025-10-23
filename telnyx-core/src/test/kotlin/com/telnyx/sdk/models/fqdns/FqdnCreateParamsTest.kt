// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnCreateParamsTest {

    @Test
    fun create() {
        FqdnCreateParams.builder()
            .connectionId("1516447646313612565")
            .dnsRecordType("a")
            .fqdn("example.com")
            .port(8080L)
            .build()
    }

    @Test
    fun body() {
        val params =
            FqdnCreateParams.builder()
                .connectionId("1516447646313612565")
                .dnsRecordType("a")
                .fqdn("example.com")
                .port(8080L)
                .build()

        val body = params._body()

        assertThat(body.connectionId()).isEqualTo("1516447646313612565")
        assertThat(body.dnsRecordType()).isEqualTo("a")
        assertThat(body.fqdn()).isEqualTo("example.com")
        assertThat(body.port()).contains(8080L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FqdnCreateParams.builder()
                .connectionId("1516447646313612565")
                .dnsRecordType("a")
                .fqdn("example.com")
                .build()

        val body = params._body()

        assertThat(body.connectionId()).isEqualTo("1516447646313612565")
        assertThat(body.dnsRecordType()).isEqualTo("a")
        assertThat(body.fqdn()).isEqualTo("example.com")
    }
}
