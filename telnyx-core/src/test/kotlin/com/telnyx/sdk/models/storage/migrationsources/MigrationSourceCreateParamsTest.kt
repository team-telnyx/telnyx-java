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
                    .bucketName("string")
                    .provider(MigrationSourceParams.Provider.AWS)
                    .providerAuth(
                        MigrationSourceParams.ProviderAuth.builder()
                            .accessKey("string")
                            .secretAccessKey("string")
                            .build()
                    )
                    .id("id")
                    .sourceRegion("string")
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
                        .bucketName("string")
                        .provider(MigrationSourceParams.Provider.AWS)
                        .providerAuth(
                            MigrationSourceParams.ProviderAuth.builder()
                                .accessKey("string")
                                .secretAccessKey("string")
                                .build()
                        )
                        .id("id")
                        .sourceRegion("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MigrationSourceParams.builder()
                    .bucketName("string")
                    .provider(MigrationSourceParams.Provider.AWS)
                    .providerAuth(
                        MigrationSourceParams.ProviderAuth.builder()
                            .accessKey("string")
                            .secretAccessKey("string")
                            .build()
                    )
                    .id("id")
                    .sourceRegion("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MigrationSourceCreateParams.builder()
                .migrationSourceParams(
                    MigrationSourceParams.builder()
                        .bucketName("string")
                        .provider(MigrationSourceParams.Provider.AWS)
                        .providerAuth(MigrationSourceParams.ProviderAuth.builder().build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MigrationSourceParams.builder()
                    .bucketName("string")
                    .provider(MigrationSourceParams.Provider.AWS)
                    .providerAuth(MigrationSourceParams.ProviderAuth.builder().build())
                    .build()
            )
    }
}
