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
                        .numObjects(123456L)
                        .size(123456L)
                        .sizeKb(123456L)
                        .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .build()
                )
                .meta(
                    PaginationMetaSimple.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(usageGetBucketUsageResponse.data().getOrNull())
            .containsExactly(
                UsageGetBucketUsageResponse.Data.builder()
                    .numObjects(123456L)
                    .size(123456L)
                    .sizeKb(123456L)
                    .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .build()
            )
        assertThat(usageGetBucketUsageResponse.meta())
            .contains(
                PaginationMetaSimple.builder()
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
        val usageGetBucketUsageResponse =
            UsageGetBucketUsageResponse.builder()
                .addData(
                    UsageGetBucketUsageResponse.Data.builder()
                        .numObjects(123456L)
                        .size(123456L)
                        .sizeKb(123456L)
                        .timestamp(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .build()
                )
                .meta(
                    PaginationMetaSimple.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
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
