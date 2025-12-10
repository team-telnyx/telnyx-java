// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FqdnListPageResponseTest {

    @Test
    fun create() {
        val fqdnListPageResponse =
            FqdnListPageResponse.builder()
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
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(fqdnListPageResponse.data().getOrNull())
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
        assertThat(fqdnListPageResponse.meta())
            .contains(
                ConnectionsPaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fqdnListPageResponse =
            FqdnListPageResponse.builder()
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
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedFqdnListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fqdnListPageResponse),
                jacksonTypeRef<FqdnListPageResponse>(),
            )

        assertThat(roundtrippedFqdnListPageResponse).isEqualTo(fqdnListPageResponse)
    }
}
