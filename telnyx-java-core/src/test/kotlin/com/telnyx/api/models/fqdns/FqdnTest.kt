// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.fqdns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnTest {

    @Test
    fun create() {
        val fqdn =
            Fqdn.builder()
                .id("id")
                .connectionId("1516447646313612565")
                .createdAt("2018-02-02T22:25:27.521Z")
                .dnsRecordType("a")
                .fqdn("example.com")
                .port(5060L)
                .recordType("fqdn")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(fqdn.id()).contains("id")
        assertThat(fqdn.connectionId()).contains("1516447646313612565")
        assertThat(fqdn.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(fqdn.dnsRecordType()).contains("a")
        assertThat(fqdn.fqdn()).contains("example.com")
        assertThat(fqdn.port()).contains(5060L)
        assertThat(fqdn.recordType()).contains("fqdn")
        assertThat(fqdn.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fqdn =
            Fqdn.builder()
                .id("id")
                .connectionId("1516447646313612565")
                .createdAt("2018-02-02T22:25:27.521Z")
                .dnsRecordType("a")
                .fqdn("example.com")
                .port(5060L)
                .recordType("fqdn")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedFqdn =
            jsonMapper.readValue(jsonMapper.writeValueAsString(fqdn), jacksonTypeRef<Fqdn>())

        assertThat(roundtrippedFqdn).isEqualTo(fqdn)
    }
}
