// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.storage.migrations.MigrationParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MigrationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val migrationService = client.storage().migrations()

        val migration =
            migrationService.create(
                MigrationParams.builder()
                    .sourceId("source_id")
                    .targetBucketName("target_bucket_name")
                    .targetRegion("target_region")
                    .id("id")
                    .bytesMigrated(0L)
                    .bytesToMigrate(0L)
                    .createdAt(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .eta(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .lastCopy(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .refresh(true)
                    .speed(0L)
                    .status(MigrationParams.Status.PENDING)
                    .build()
            )

        migration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val migrationService = client.storage().migrations()

        val migration = migrationService.retrieve("")

        migration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val migrationService = client.storage().migrations()

        val migrations = migrationService.list()

        migrations.validate()
    }
}
