// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.migrationsources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationSourceRetrieveResponseTest {

    @Test
    fun create() {
        val migrationSourceRetrieveResponse =
            MigrationSourceRetrieveResponse.builder()
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

        assertThat(migrationSourceRetrieveResponse.data())
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
        val migrationSourceRetrieveResponse =
            MigrationSourceRetrieveResponse.builder()
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

        val roundtrippedMigrationSourceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationSourceRetrieveResponse),
                jacksonTypeRef<MigrationSourceRetrieveResponse>(),
            )

        assertThat(roundtrippedMigrationSourceRetrieveResponse)
            .isEqualTo(migrationSourceRetrieveResponse)
    }
}
