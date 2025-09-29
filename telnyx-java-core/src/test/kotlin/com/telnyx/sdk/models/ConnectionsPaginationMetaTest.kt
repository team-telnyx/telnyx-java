// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionsPaginationMetaTest {

    @Test
    fun create() {
        val connectionsPaginationMeta =
            ConnectionsPaginationMeta.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        assertThat(connectionsPaginationMeta.pageNumber()).contains(2L)
        assertThat(connectionsPaginationMeta.pageSize()).contains(25L)
        assertThat(connectionsPaginationMeta.totalPages()).contains(3L)
        assertThat(connectionsPaginationMeta.totalResults()).contains(55L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connectionsPaginationMeta =
            ConnectionsPaginationMeta.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        val roundtrippedConnectionsPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connectionsPaginationMeta),
                jacksonTypeRef<ConnectionsPaginationMeta>(),
            )

        assertThat(roundtrippedConnectionsPaginationMeta).isEqualTo(connectionsPaginationMeta)
    }
}
