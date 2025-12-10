// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnListResponseTest {

    @Test
    fun create() {
        val fqdnListResponse =
            FqdnListResponse.builder()
                .addData(
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

        assertThat(fqdnListResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(fqdnListResponse.meta())
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
        val fqdnListResponse =
            FqdnListResponse.builder()
                .addData(
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

        val roundtrippedFqdnListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fqdnListResponse),
                jacksonTypeRef<FqdnListResponse>(),
            )

        assertThat(roundtrippedFqdnListResponse).isEqualTo(fqdnListResponse)
    }
}
