// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ips

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpDeleteResponseTest {

    @Test
    fun create() {
        val ipDeleteResponse =
            IpDeleteResponse.builder()
                .data(
                    Ip.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .connectionId("3456789987654")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .ipAddress("192.168.0.0")
                        .port(5060L)
                        .recordType("ip")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(ipDeleteResponse.data())
            .contains(
                Ip.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
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
        val ipDeleteResponse =
            IpDeleteResponse.builder()
                .data(
                    Ip.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .connectionId("3456789987654")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .ipAddress("192.168.0.0")
                        .port(5060L)
                        .recordType("ip")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedIpDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ipDeleteResponse),
                jacksonTypeRef<IpDeleteResponse>(),
            )

        assertThat(roundtrippedIpDeleteResponse).isEqualTo(ipDeleteResponse)
    }
}
