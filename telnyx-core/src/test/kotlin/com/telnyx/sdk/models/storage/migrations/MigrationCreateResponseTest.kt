// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.migrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationCreateResponseTest {

    @Test
    fun create() {
        val migrationCreateResponse =
            MigrationCreateResponse.builder()
                .data(
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

        assertThat(migrationCreateResponse.data())
            .contains(
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
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationCreateResponse =
            MigrationCreateResponse.builder()
                .data(
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

        val roundtrippedMigrationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationCreateResponse),
                jacksonTypeRef<MigrationCreateResponse>(),
            )

        assertThat(roundtrippedMigrationCreateResponse).isEqualTo(migrationCreateResponse)
    }
}
