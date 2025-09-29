// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.storage.buckets.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginationMetaSimpleTest {

    @Test
    fun create() {
        val paginationMetaSimple =
            PaginationMetaSimple.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        assertThat(paginationMetaSimple.pageNumber()).contains(0L)
        assertThat(paginationMetaSimple.pageSize()).contains(0L)
        assertThat(paginationMetaSimple.totalPages()).contains(0L)
        assertThat(paginationMetaSimple.totalResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginationMetaSimple =
            PaginationMetaSimple.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        val roundtrippedPaginationMetaSimple =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginationMetaSimple),
                jacksonTypeRef<PaginationMetaSimple>(),
            )

        assertThat(roundtrippedPaginationMetaSimple).isEqualTo(paginationMetaSimple)
    }
}
