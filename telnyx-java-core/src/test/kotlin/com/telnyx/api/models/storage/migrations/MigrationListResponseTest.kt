// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.migrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.storage.buckets.usage.PaginationMetaSimple
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationListResponseTest {

    @Test
    fun create() {
        val migrationListResponse =
            MigrationListResponse.builder()
                .addData(
                    MigrationParams.builder()
                        .sourceId("source_id")
                        .targetBucketName("target_bucket_name")
                        .targetRegion("target_region")
                        .id("id")
                        .bytesMigrated(0L)
                        .bytesToMigrate(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eta(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastCopy(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .refresh(true)
                        .speed(0L)
                        .status(MigrationParams.Status.PENDING)
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

        assertThat(migrationListResponse.data().getOrNull())
            .containsExactly(
                MigrationParams.builder()
                    .sourceId("source_id")
                    .targetBucketName("target_bucket_name")
                    .targetRegion("target_region")
                    .id("id")
                    .bytesMigrated(0L)
                    .bytesToMigrate(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eta(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastCopy(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .refresh(true)
                    .speed(0L)
                    .status(MigrationParams.Status.PENDING)
                    .build()
            )
        assertThat(migrationListResponse.meta())
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
        val migrationListResponse =
            MigrationListResponse.builder()
                .addData(
                    MigrationParams.builder()
                        .sourceId("source_id")
                        .targetBucketName("target_bucket_name")
                        .targetRegion("target_region")
                        .id("id")
                        .bytesMigrated(0L)
                        .bytesToMigrate(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eta(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastCopy(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .refresh(true)
                        .speed(0L)
                        .status(MigrationParams.Status.PENDING)
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

        val roundtrippedMigrationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationListResponse),
                jacksonTypeRef<MigrationListResponse>(),
            )

        assertThat(roundtrippedMigrationListResponse).isEqualTo(migrationListResponse)
    }
}
