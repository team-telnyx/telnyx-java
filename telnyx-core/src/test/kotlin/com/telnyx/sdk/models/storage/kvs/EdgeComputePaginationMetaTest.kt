// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.kvs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EdgeComputePaginationMetaTest {

    @Test
    fun create() {
        val edgeComputePaginationMeta =
            EdgeComputePaginationMeta.builder()
                .pageNumber(1L)
                .pageSize(20L)
                .totalPages(3L)
                .totalResults(52L)
                .build()

        assertThat(edgeComputePaginationMeta.pageNumber()).contains(1L)
        assertThat(edgeComputePaginationMeta.pageSize()).contains(20L)
        assertThat(edgeComputePaginationMeta.totalPages()).contains(3L)
        assertThat(edgeComputePaginationMeta.totalResults()).contains(52L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val edgeComputePaginationMeta =
            EdgeComputePaginationMeta.builder()
                .pageNumber(1L)
                .pageSize(20L)
                .totalPages(3L)
                .totalResults(52L)
                .build()

        val roundtrippedEdgeComputePaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(edgeComputePaginationMeta),
                jacksonTypeRef<EdgeComputePaginationMeta>(),
            )

        assertThat(roundtrippedEdgeComputePaginationMeta).isEqualTo(edgeComputePaginationMeta)
    }
}
