// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.migrationsources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.storage.buckets.usage.PaginationMetaSimple
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MigrationSourceListResponseTest {

    @Test
    fun create() {
        val migrationSourceListResponse =
            MigrationSourceListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMetaSimple.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(migrationSourceListResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(migrationSourceListResponse.meta())
            .contains(
                PaginationMetaSimple.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val migrationSourceListResponse =
            MigrationSourceListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMetaSimple.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedMigrationSourceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(migrationSourceListResponse),
                jacksonTypeRef<MigrationSourceListResponse>(),
            )

        assertThat(roundtrippedMigrationSourceListResponse).isEqualTo(migrationSourceListResponse)
    }
}
