// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.migrationsources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationSourceDeleteResponseTest {

    @Test
    fun create() {
        val migrationSourceDeleteResponse =
            MigrationSourceDeleteResponse.builder()
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

        assertThat(migrationSourceDeleteResponse.data())
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
        val migrationSourceDeleteResponse =
            MigrationSourceDeleteResponse.builder()
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

        val roundtrippedMigrationSourceDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationSourceDeleteResponse),
                jacksonTypeRef<MigrationSourceDeleteResponse>(),
            )

        assertThat(roundtrippedMigrationSourceDeleteResponse)
            .isEqualTo(migrationSourceDeleteResponse)
    }
}
