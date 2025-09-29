// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.storage.buckets.usage.PaginationMetaSimple
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StorageListMigrationSourceCoverageResponseTest {

    @Test
    fun create() {
        val storageListMigrationSourceCoverageResponse =
            StorageListMigrationSourceCoverageResponse.builder()
                .addData(
                    StorageListMigrationSourceCoverageResponse.Data.builder()
                        .provider(StorageListMigrationSourceCoverageResponse.Data.Provider.AWS)
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

        assertThat(storageListMigrationSourceCoverageResponse.data().getOrNull())
            .containsExactly(
                StorageListMigrationSourceCoverageResponse.Data.builder()
                    .provider(StorageListMigrationSourceCoverageResponse.Data.Provider.AWS)
                    .sourceRegion("source_region")
                    .build()
            )
        assertThat(storageListMigrationSourceCoverageResponse.meta())
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
        val storageListMigrationSourceCoverageResponse =
            StorageListMigrationSourceCoverageResponse.builder()
                .addData(
                    StorageListMigrationSourceCoverageResponse.Data.builder()
                        .provider(StorageListMigrationSourceCoverageResponse.Data.Provider.AWS)
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

        val roundtrippedStorageListMigrationSourceCoverageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(storageListMigrationSourceCoverageResponse),
                jacksonTypeRef<StorageListMigrationSourceCoverageResponse>(),
            )

        assertThat(roundtrippedStorageListMigrationSourceCoverageResponse)
            .isEqualTo(storageListMigrationSourceCoverageResponse)
    }
}
