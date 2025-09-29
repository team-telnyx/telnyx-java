// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.migrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationParamsTest {

    @Test
    fun create() {
        val migrationParams =
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

        assertThat(migrationParams.sourceId()).isEqualTo("source_id")
        assertThat(migrationParams.targetBucketName()).isEqualTo("target_bucket_name")
        assertThat(migrationParams.targetRegion()).isEqualTo("target_region")
        assertThat(migrationParams.id()).contains("id")
        assertThat(migrationParams.bytesMigrated()).contains(0L)
        assertThat(migrationParams.bytesToMigrate()).contains(0L)
        assertThat(migrationParams.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationParams.eta()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationParams.lastCopy())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(migrationParams.refresh()).contains(true)
        assertThat(migrationParams.speed()).contains(0L)
        assertThat(migrationParams.status()).contains(MigrationParams.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationParams =
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

        val roundtrippedMigrationParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationParams),
                jacksonTypeRef<MigrationParams>(),
            )

        assertThat(roundtrippedMigrationParams).isEqualTo(migrationParams)
    }
}
