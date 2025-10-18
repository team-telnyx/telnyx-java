// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StandardPaginationMetaTest {

    @Test
    fun create() {
        val standardPaginationMeta =
            StandardPaginationMeta.builder()
                .pageNumber(2)
                .pageSize(25)
                .totalPages(3)
                .totalResults(55)
                .build()

        assertThat(standardPaginationMeta.pageNumber()).contains(2)
        assertThat(standardPaginationMeta.pageSize()).contains(25)
        assertThat(standardPaginationMeta.totalPages()).contains(3)
        assertThat(standardPaginationMeta.totalResults()).contains(55)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val standardPaginationMeta =
            StandardPaginationMeta.builder()
                .pageNumber(2)
                .pageSize(25)
                .totalPages(3)
                .totalResults(55)
                .build()

        val roundtrippedStandardPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(standardPaginationMeta),
                jacksonTypeRef<StandardPaginationMeta>(),
            )

        assertThat(roundtrippedStandardPaginationMeta).isEqualTo(standardPaginationMeta)
    }
}
