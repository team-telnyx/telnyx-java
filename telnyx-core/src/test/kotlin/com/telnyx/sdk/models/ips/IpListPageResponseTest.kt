// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ips

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IpListPageResponseTest {

    @Test
    fun create() {
        val ipListPageResponse =
            IpListPageResponse.builder()
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
                .meta(
                    ConnectionsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(ipListPageResponse.data().getOrNull())
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
        assertThat(ipListPageResponse.meta())
            .contains(
                ConnectionsPaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ipListPageResponse =
            IpListPageResponse.builder()
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
                .meta(
                    ConnectionsPaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedIpListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ipListPageResponse),
                jacksonTypeRef<IpListPageResponse>(),
            )

        assertThat(roundtrippedIpListPageResponse).isEqualTo(ipListPageResponse)
    }
}
