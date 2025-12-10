// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginationMetaSimpleTest {

    @Test
    fun create() {
        val paginationMetaSimple =
            PaginationMetaSimple.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        assertThat(paginationMetaSimple.pageNumber()).contains(2L)
        assertThat(paginationMetaSimple.pageSize()).contains(25L)
        assertThat(paginationMetaSimple.totalPages()).contains(3L)
        assertThat(paginationMetaSimple.totalResults()).contains(55L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginationMetaSimple =
            PaginationMetaSimple.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        val roundtrippedPaginationMetaSimple =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginationMetaSimple),
                jacksonTypeRef<PaginationMetaSimple>(),
            )

        assertThat(roundtrippedPaginationMetaSimple).isEqualTo(paginationMetaSimple)
    }
}
