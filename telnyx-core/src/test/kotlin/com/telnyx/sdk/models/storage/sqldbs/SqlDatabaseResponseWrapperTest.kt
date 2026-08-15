// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.sqldbs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SqlDatabaseResponseWrapperTest {

    @Test
    fun create() {
        val sqlDatabaseResponseWrapper =
            SqlDatabaseResponseWrapper.builder()
                .data(
                    SqlDatabase.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .name("my-database")
                        .recordType("storage_sqldb")
                        .status(SqlDatabase.Status.PROVISION_OK)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .build()

        assertThat(sqlDatabaseResponseWrapper.data())
            .contains(
                SqlDatabase.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                    .name("my-database")
                    .recordType("storage_sqldb")
                    .status(SqlDatabase.Status.PROVISION_OK)
                    .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sqlDatabaseResponseWrapper =
            SqlDatabaseResponseWrapper.builder()
                .data(
                    SqlDatabase.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .name("my-database")
                        .recordType("storage_sqldb")
                        .status(SqlDatabase.Status.PROVISION_OK)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                        .build()
                )
                .build()

        val roundtrippedSqlDatabaseResponseWrapper =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sqlDatabaseResponseWrapper),
                jacksonTypeRef<SqlDatabaseResponseWrapper>(),
            )

        assertThat(roundtrippedSqlDatabaseResponseWrapper).isEqualTo(sqlDatabaseResponseWrapper)
    }
}
