// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports.mdrusagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportingPaginationMeta77109e5d17Test {

    @Test
    fun create() {
        val reportingPaginationMeta77109e5d17 =
            ReportingPaginationMeta77109e5d17.builder()
                .pageNumber(2)
                .pageSize(25)
                .totalPages(3)
                .totalResults(55)
                .build()

        assertThat(reportingPaginationMeta77109e5d17.pageNumber()).contains(2)
        assertThat(reportingPaginationMeta77109e5d17.pageSize()).contains(25)
        assertThat(reportingPaginationMeta77109e5d17.totalPages()).contains(3)
        assertThat(reportingPaginationMeta77109e5d17.totalResults()).contains(55)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val reportingPaginationMeta77109e5d17 =
            ReportingPaginationMeta77109e5d17.builder()
                .pageNumber(2)
                .pageSize(25)
                .totalPages(3)
                .totalResults(55)
                .build()

        val roundtrippedReportingPaginationMeta77109e5d17 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(reportingPaginationMeta77109e5d17),
                jacksonTypeRef<ReportingPaginationMeta77109e5d17>(),
            )

        assertThat(roundtrippedReportingPaginationMeta77109e5d17)
            .isEqualTo(reportingPaginationMeta77109e5d17)
    }
}
