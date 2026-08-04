// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StandardPaginationMetaFfba4faa88Test {

    @Test
    fun create() {
        val standardPaginationMetaFfba4faa88 =
            StandardPaginationMetaFfba4faa88.builder()
                .pageNumber(2)
                .pageSize(25)
                .totalPages(3)
                .totalResults(55)
                .build()

        assertThat(standardPaginationMetaFfba4faa88.pageNumber()).contains(2)
        assertThat(standardPaginationMetaFfba4faa88.pageSize()).contains(25)
        assertThat(standardPaginationMetaFfba4faa88.totalPages()).contains(3)
        assertThat(standardPaginationMetaFfba4faa88.totalResults()).contains(55)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val standardPaginationMetaFfba4faa88 =
            StandardPaginationMetaFfba4faa88.builder()
                .pageNumber(2)
                .pageSize(25)
                .totalPages(3)
                .totalResults(55)
                .build()

        val roundtrippedStandardPaginationMetaFfba4faa88 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(standardPaginationMetaFfba4faa88),
                jacksonTypeRef<StandardPaginationMetaFfba4faa88>(),
            )

        assertThat(roundtrippedStandardPaginationMetaFfba4faa88)
            .isEqualTo(standardPaginationMetaFfba4faa88)
    }
}
