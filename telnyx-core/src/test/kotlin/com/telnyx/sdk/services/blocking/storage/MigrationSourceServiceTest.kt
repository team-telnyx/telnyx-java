// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MigrationSourceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val migrationSourceService = client.storage().migrationSources()

        val migrationSource =
            migrationSourceService.create(
                MigrationSourceParams.builder()
                    .bucketName("bucket_name")
                    .provider(MigrationSourceParams.Provider.AWS)
                    .providerAuth(
                        MigrationSourceParams.ProviderAuth.builder()
                            .accessKey("access_key")
                            .secretAccessKey("secret_access_key")
                            .build()
                    )
                    .id("id")
                    .sourceRegion("source_region")
                    .build()
            )

        migrationSource.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val migrationSourceService = client.storage().migrationSources()

        val migrationSource = migrationSourceService.retrieve("")

        migrationSource.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val migrationSourceService = client.storage().migrationSources()

        val migrationSources = migrationSourceService.list()

        migrationSources.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val migrationSourceService = client.storage().migrationSources()

        val migrationSource = migrationSourceService.delete("")

        migrationSource.validate()
    }
}
