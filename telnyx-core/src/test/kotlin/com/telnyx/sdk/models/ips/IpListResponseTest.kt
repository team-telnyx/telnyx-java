// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ips

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpListResponseTest {

    @Test
    fun create() {
        val ipListResponse =
            IpListResponse.builder()
                .addData(
                    Ip.builder()
                        .id("id")
                        .connectionId("3456789987654")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .ipAddress("192.168.0.0")
                        .port(5060L)
                        .recordType("ip")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(ipListResponse.data().getOrNull())
            .containsExactly(
                Ip.builder()
                    .id("id")
                    .connectionId("3456789987654")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .ipAddress("192.168.0.0")
                    .port(5060L)
                    .recordType("ip")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ipListResponse =
            IpListResponse.builder()
                .addData(
                    Ip.builder()
                        .id("id")
                        .connectionId("3456789987654")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .ipAddress("192.168.0.0")
                        .port(5060L)
                        .recordType("ip")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedIpListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ipListResponse),
                jacksonTypeRef<IpListResponse>(),
            )

        assertThat(roundtrippedIpListResponse).isEqualTo(ipListResponse)
    }
}
