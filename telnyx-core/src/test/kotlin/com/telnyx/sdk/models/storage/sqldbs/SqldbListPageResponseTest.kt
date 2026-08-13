// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.sqldbs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.storage.kvs.EdgeComputePaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SqldbListPageResponseTest {

    @Test
    fun create() {
        val sqldbListPageResponse =
            SqldbListPageResponse.builder()
                .addData(
                    SqlDatabase.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .name("my-database")
                        .recordType("storage_sqldb")
                        .status(SqlDatabase.Status.PROVISION_OK)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .meta(
                    EdgeComputePaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(52L)
                        .build()
                )
                .build()

        assertThat(sqldbListPageResponse.data().getOrNull())
            .containsExactly(
                SqlDatabase.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                    .name("my-database")
                    .recordType("storage_sqldb")
                    .status(SqlDatabase.Status.PROVISION_OK)
                    .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                    .build()
            )
        assertThat(sqldbListPageResponse.meta())
            .contains(
                EdgeComputePaginationMeta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(52L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sqldbListPageResponse =
            SqldbListPageResponse.builder()
                .addData(
                    SqlDatabase.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .name("my-database")
                        .recordType("storage_sqldb")
                        .status(SqlDatabase.Status.PROVISION_OK)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .meta(
                    EdgeComputePaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(52L)
                        .build()
                )
                .build()

        val roundtrippedSqldbListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sqldbListPageResponse),
                jacksonTypeRef<SqldbListPageResponse>(),
            )

        assertThat(roundtrippedSqldbListPageResponse).isEqualTo(sqldbListPageResponse)
    }
}
