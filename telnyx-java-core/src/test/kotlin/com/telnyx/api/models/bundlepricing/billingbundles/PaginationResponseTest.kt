// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.billingbundles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginationResponseTest {

    @Test
    fun create() {
        val paginationResponse =
            PaginationResponse.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        assertThat(paginationResponse.pageNumber()).isEqualTo(2L)
        assertThat(paginationResponse.pageSize()).isEqualTo(25L)
        assertThat(paginationResponse.totalPages()).isEqualTo(3L)
        assertThat(paginationResponse.totalResults()).isEqualTo(55L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginationResponse =
            PaginationResponse.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        val roundtrippedPaginationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginationResponse),
                jacksonTypeRef<PaginationResponse>(),
            )

        assertThat(roundtrippedPaginationResponse).isEqualTo(paginationResponse)
    }
}
