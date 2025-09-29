// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ips

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpTest {

    @Test
    fun create() {
        val ip =
            Ip.builder()
                .id("id")
                .connectionId("3456789987654")
                .createdAt("2018-02-02T22:25:27.521Z")
                .ipAddress("192.168.0.0")
                .port(5060L)
                .recordType("ip")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(ip.id()).contains("id")
        assertThat(ip.connectionId()).contains("3456789987654")
        assertThat(ip.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(ip.ipAddress()).contains("192.168.0.0")
        assertThat(ip.port()).contains(5060L)
        assertThat(ip.recordType()).contains("ip")
        assertThat(ip.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ip =
            Ip.builder()
                .id("id")
                .connectionId("3456789987654")
                .createdAt("2018-02-02T22:25:27.521Z")
                .ipAddress("192.168.0.0")
                .port(5060L)
                .recordType("ip")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedIp =
            jsonMapper.readValue(jsonMapper.writeValueAsString(ip), jacksonTypeRef<Ip>())

        assertThat(roundtrippedIp).isEqualTo(ip)
    }
}
