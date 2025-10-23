// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports.mdrusagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginationMetaReportingTest {

    @Test
    fun create() {
        val paginationMetaReporting =
            PaginationMetaReporting.builder()
                .pageNumber(2)
                .pageSize(25)
                .totalPages(3)
                .totalResults(55)
                .build()

        assertThat(paginationMetaReporting.pageNumber()).contains(2)
        assertThat(paginationMetaReporting.pageSize()).contains(25)
        assertThat(paginationMetaReporting.totalPages()).contains(3)
        assertThat(paginationMetaReporting.totalResults()).contains(55)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginationMetaReporting =
            PaginationMetaReporting.builder()
                .pageNumber(2)
                .pageSize(25)
                .totalPages(3)
                .totalResults(55)
                .build()

        val roundtrippedPaginationMetaReporting =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginationMetaReporting),
                jacksonTypeRef<PaginationMetaReporting>(),
            )

        assertThat(roundtrippedPaginationMetaReporting).isEqualTo(paginationMetaReporting)
    }
}
