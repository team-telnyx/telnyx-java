// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.sqldbs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SqlDatabaseTest {

    @Test
    fun create() {
        val sqlDatabase =
            SqlDatabase.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                .name("my-database")
                .recordType("storage_sqldb")
                .status(SqlDatabase.Status.PROVISION_OK)
                .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                .build()

        assertThat(sqlDatabase.id()).contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(sqlDatabase.createdAt()).contains(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
        assertThat(sqlDatabase.name()).contains("my-database")
        assertThat(sqlDatabase.recordType()).contains("storage_sqldb")
        assertThat(sqlDatabase.status()).contains(SqlDatabase.Status.PROVISION_OK)
        assertThat(sqlDatabase.updatedAt()).contains(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sqlDatabase =
            SqlDatabase.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .createdAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                .name("my-database")
                .recordType("storage_sqldb")
                .status(SqlDatabase.Status.PROVISION_OK)
                .updatedAt(OffsetDateTime.parse("2026-06-18T14:48:17Z"))
                .build()

        val roundtrippedSqlDatabase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sqlDatabase),
                jacksonTypeRef<SqlDatabase>(),
            )

        assertThat(roundtrippedSqlDatabase).isEqualTo(sqlDatabase)
    }
}
