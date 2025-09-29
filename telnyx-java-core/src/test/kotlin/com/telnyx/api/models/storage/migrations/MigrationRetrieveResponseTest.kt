// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.migrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationRetrieveResponseTest {

    @Test
    fun create() {
        val migrationRetrieveResponse =
            MigrationRetrieveResponse.builder()
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

        assertThat(migrationRetrieveResponse.data())
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
        val migrationRetrieveResponse =
            MigrationRetrieveResponse.builder()
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

        val roundtrippedMigrationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationRetrieveResponse),
                jacksonTypeRef<MigrationRetrieveResponse>(),
            )

        assertThat(roundtrippedMigrationRetrieveResponse).isEqualTo(migrationRetrieveResponse)
    }
}
