// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageGetBucketUsageResponseTest {

    @Test
    fun create() {
        val usageGetBucketUsageResponse =
            UsageGetBucketUsageResponse.builder()
                .addData(
                    UsageGetBucketUsageResponse.Data.builder()
                        .numObjects(0L)
                        .size(0L)
                        .sizeKb(0L)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    PaginationMetaSimple.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(usageGetBucketUsageResponse.data().getOrNull())
            .containsExactly(
                UsageGetBucketUsageResponse.Data.builder()
                    .numObjects(0L)
                    .size(0L)
                    .sizeKb(0L)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(usageGetBucketUsageResponse.meta())
            .contains(
                PaginationMetaSimple.builder()
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
        val usageGetBucketUsageResponse =
            UsageGetBucketUsageResponse.builder()
                .addData(
                    UsageGetBucketUsageResponse.Data.builder()
                        .numObjects(0L)
                        .size(0L)
                        .sizeKb(0L)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    PaginationMetaSimple.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedUsageGetBucketUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageGetBucketUsageResponse),
                jacksonTypeRef<UsageGetBucketUsageResponse>(),
            )

        assertThat(roundtrippedUsageGetBucketUsageResponse).isEqualTo(usageGetBucketUsageResponse)
    }
}
