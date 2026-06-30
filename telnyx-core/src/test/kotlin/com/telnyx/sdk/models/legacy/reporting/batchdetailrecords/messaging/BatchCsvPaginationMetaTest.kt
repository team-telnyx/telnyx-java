// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCsvPaginationMetaTest {

    @Test
    fun create() {
        val batchCsvPaginationMeta =
            BatchCsvPaginationMeta.builder()
                .pageNumber(2)
                .totalPages(3)
                .pageSize(25)
                .totalResults(55)
                .build()

        assertThat(batchCsvPaginationMeta.pageNumber()).isEqualTo(2)
        assertThat(batchCsvPaginationMeta.totalPages()).isEqualTo(3)
        assertThat(batchCsvPaginationMeta.pageSize()).contains(25)
        assertThat(batchCsvPaginationMeta.totalResults()).contains(55)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCsvPaginationMeta =
            BatchCsvPaginationMeta.builder()
                .pageNumber(2)
                .totalPages(3)
                .pageSize(25)
                .totalResults(55)
                .build()

        val roundtrippedBatchCsvPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCsvPaginationMeta),
                jacksonTypeRef<BatchCsvPaginationMeta>(),
            )

        assertThat(roundtrippedBatchCsvPaginationMeta).isEqualTo(batchCsvPaginationMeta)
    }
}
