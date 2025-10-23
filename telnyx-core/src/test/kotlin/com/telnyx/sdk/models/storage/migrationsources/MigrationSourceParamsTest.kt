// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.migrationsources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationSourceParamsTest {

    @Test
    fun create() {
        val migrationSourceParams =
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

        assertThat(migrationSourceParams.bucketName()).isEqualTo("bucket_name")
        assertThat(migrationSourceParams.provider()).isEqualTo(MigrationSourceParams.Provider.AWS)
        assertThat(migrationSourceParams.providerAuth())
            .isEqualTo(
                MigrationSourceParams.ProviderAuth.builder()
                    .accessKey("access_key")
                    .secretAccessKey("secret_access_key")
                    .build()
            )
        assertThat(migrationSourceParams.id()).contains("id")
        assertThat(migrationSourceParams.sourceRegion()).contains("source_region")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationSourceParams =
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

        val roundtrippedMigrationSourceParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationSourceParams),
                jacksonTypeRef<MigrationSourceParams>(),
            )

        assertThat(roundtrippedMigrationSourceParams).isEqualTo(migrationSourceParams)
    }
}
