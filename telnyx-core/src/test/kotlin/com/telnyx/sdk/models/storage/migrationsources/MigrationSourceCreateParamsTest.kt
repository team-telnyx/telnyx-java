// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.migrationsources

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationSourceCreateParamsTest {

    @Test
    fun create() {
        MigrationSourceCreateParams.builder()
            .migrationSourceParams(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            MigrationSourceCreateParams.builder()
                .migrationSourceParams(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MigrationSourceCreateParams.builder()
                .migrationSourceParams(
                    MigrationSourceParams.builder()
                        .bucketName("bucket_name")
                        .provider(MigrationSourceParams.Provider.AWS)
                        .providerAuth(MigrationSourceParams.ProviderAuth.builder().build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MigrationSourceParams.builder()
                    .bucketName("bucket_name")
                    .provider(MigrationSourceParams.Provider.AWS)
                    .providerAuth(MigrationSourceParams.ProviderAuth.builder().build())
                    .build()
            )
    }
}
