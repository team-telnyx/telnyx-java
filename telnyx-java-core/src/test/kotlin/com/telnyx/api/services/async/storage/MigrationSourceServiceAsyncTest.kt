// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.storage

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.storage.migrationsources.MigrationSourceParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MigrationSourceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationSourceServiceAsync = client.storage().migrationSources()

        val migrationSourceFuture =
            migrationSourceServiceAsync.create(
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

        val migrationSource = migrationSourceFuture.get()
        migrationSource.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationSourceServiceAsync = client.storage().migrationSources()

        val migrationSourceFuture = migrationSourceServiceAsync.retrieve("")

        val migrationSource = migrationSourceFuture.get()
        migrationSource.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationSourceServiceAsync = client.storage().migrationSources()

        val migrationSourcesFuture = migrationSourceServiceAsync.list()

        val migrationSources = migrationSourcesFuture.get()
        migrationSources.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val migrationSourceServiceAsync = client.storage().migrationSources()

        val migrationSourceFuture = migrationSourceServiceAsync.delete("")

        val migrationSource = migrationSourceFuture.get()
        migrationSource.validate()
    }
}
