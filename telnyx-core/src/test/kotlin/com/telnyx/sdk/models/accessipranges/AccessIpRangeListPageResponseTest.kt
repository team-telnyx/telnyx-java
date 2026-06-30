// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipranges

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.accessipaddress.CloudflareSyncStatus
import com.telnyx.sdk.models.accessipaddress.PaginationMetaCloudflareIpListSync
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpRangeListPageResponseTest {

    @Test
    fun create() {
        val accessIpRangeListPageResponse =
            AccessIpRangeListPageResponse.builder()
                .addData(
                    AccessIpRange.builder()
                        .id("id")
                        .cidrBlock("cidr_block")
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

        assertThat(accessIpRangeListPageResponse.data())
            .containsExactly(
                AccessIpRange.builder()
                    .id("id")
                    .cidrBlock("cidr_block")
                    .status(CloudflareSyncStatus.PENDING)
                    .userId("user_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(accessIpRangeListPageResponse.meta())
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
        val accessIpRangeListPageResponse =
            AccessIpRangeListPageResponse.builder()
                .addData(
                    AccessIpRange.builder()
                        .id("id")
                        .cidrBlock("cidr_block")
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

        val roundtrippedAccessIpRangeListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accessIpRangeListPageResponse),
                jacksonTypeRef<AccessIpRangeListPageResponse>(),
            )

        assertThat(roundtrippedAccessIpRangeListPageResponse)
            .isEqualTo(accessIpRangeListPageResponse)
    }
}
