// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.storage.migrations.MigrationParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MigrationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.storage().migrations()

        val migrationFuture =
            migrationServiceAsync.create(
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

        val migration = migrationFuture.get()
        migration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.storage().migrations()

        val migrationFuture = migrationServiceAsync.retrieve("")

        val migration = migrationFuture.get()
        migration.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationServiceAsync = client.storage().migrations()

        val migrationsFuture = migrationServiceAsync.list()

        val migrations = migrationsFuture.get()
        migrations.validate()
    }
}
