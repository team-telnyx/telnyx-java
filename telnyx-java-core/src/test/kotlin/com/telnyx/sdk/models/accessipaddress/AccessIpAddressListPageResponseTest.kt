// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipaddress

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpAddressListPageResponseTest {

    @Test
    fun create() {
        val accessIpAddressListPageResponse =
            AccessIpAddressListPageResponse.builder()
                .addData(
                    AccessIpAddressResponse.builder()
                        .id("id")
                        .ipAddress("ip_address")
                        .source("source")
                        .status(CloudflareSyncStatus.PENDING)
                        .userId("user_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    PaginationMetaCloudflareIpListSync.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(accessIpAddressListPageResponse.data())
            .containsExactly(
                AccessIpAddressResponse.builder()
                    .id("id")
                    .ipAddress("ip_address")
                    .source("source")
                    .status(CloudflareSyncStatus.PENDING)
                    .userId("user_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(accessIpAddressListPageResponse.meta())
            .isEqualTo(
                PaginationMetaCloudflareIpListSync.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accessIpAddressListPageResponse =
            AccessIpAddressListPageResponse.builder()
                .addData(
                    AccessIpAddressResponse.builder()
                        .id("id")
                        .ipAddress("ip_address")
                        .source("source")
                        .status(CloudflareSyncStatus.PENDING)
                        .userId("user_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    PaginationMetaCloudflareIpListSync.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedAccessIpAddressListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accessIpAddressListPageResponse),
                jacksonTypeRef<AccessIpAddressListPageResponse>(),
            )

        assertThat(roundtrippedAccessIpAddressListPageResponse)
            .isEqualTo(accessIpAddressListPageResponse)
    }
}
