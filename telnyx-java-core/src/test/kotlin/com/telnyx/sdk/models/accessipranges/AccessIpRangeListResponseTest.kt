// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipranges

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.accessipaddress.CloudflareSyncStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpRangeListResponseTest {

    @Test
    fun create() {
        val accessIpRangeListResponse =
            AccessIpRangeListResponse.builder()
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
                    AccessIpRangeListResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(accessIpRangeListResponse.data())
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
        assertThat(accessIpRangeListResponse.meta())
            .isEqualTo(
                AccessIpRangeListResponse.Meta.builder()
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
        val accessIpRangeListResponse =
            AccessIpRangeListResponse.builder()
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
                    AccessIpRangeListResponse.Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedAccessIpRangeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accessIpRangeListResponse),
                jacksonTypeRef<AccessIpRangeListResponse>(),
            )

        assertThat(roundtrippedAccessIpRangeListResponse).isEqualTo(accessIpRangeListResponse)
    }
}
