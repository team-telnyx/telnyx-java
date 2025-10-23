// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.migrations

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationCreateParamsTest {

    @Test
    fun create() {
        MigrationCreateParams.builder()
            .migrationParams(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            MigrationCreateParams.builder()
                .migrationParams(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MigrationCreateParams.builder()
                .migrationParams(
                    MigrationParams.builder()
                        .sourceId("source_id")
                        .targetBucketName("target_bucket_name")
                        .targetRegion("target_region")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MigrationParams.builder()
                    .sourceId("source_id")
                    .targetBucketName("target_bucket_name")
                    .targetRegion("target_region")
                    .build()
            )
    }
}
