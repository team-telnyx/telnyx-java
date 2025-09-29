// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.migrationsources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationSourceCreateResponseTest {

    @Test
    fun create() {
        val migrationSourceCreateResponse =
            MigrationSourceCreateResponse.builder()
                .data(
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

        assertThat(migrationSourceCreateResponse.data())
            .contains(
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
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationSourceCreateResponse =
            MigrationSourceCreateResponse.builder()
                .data(
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

        val roundtrippedMigrationSourceCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationSourceCreateResponse),
                jacksonTypeRef<MigrationSourceCreateResponse>(),
            )

        assertThat(roundtrippedMigrationSourceCreateResponse)
            .isEqualTo(migrationSourceCreateResponse)
    }
}
