// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.authenticationproviders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginationMetaTest {

    @Test
    fun create() {
        val paginationMeta =
            PaginationMeta.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        assertThat(paginationMeta.pageNumber()).contains(2L)
        assertThat(paginationMeta.pageSize()).contains(25L)
        assertThat(paginationMeta.totalPages()).contains(3L)
        assertThat(paginationMeta.totalResults()).contains(55L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginationMeta =
            PaginationMeta.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        val roundtrippedPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginationMeta),
                jacksonTypeRef<PaginationMeta>(),
            )

        assertThat(roundtrippedPaginationMeta).isEqualTo(paginationMeta)
    }
}
