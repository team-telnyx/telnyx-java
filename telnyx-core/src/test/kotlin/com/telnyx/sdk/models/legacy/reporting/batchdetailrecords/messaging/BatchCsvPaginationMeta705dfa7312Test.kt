// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCsvPaginationMeta705dfa7312Test {

    @Test
    fun create() {
        val batchCsvPaginationMeta705dfa7312 =
            BatchCsvPaginationMeta705dfa7312.builder()
                .pageNumber(2)
                .pageSize(25)
                .totalPages(3)
                .totalResults(55)
                .build()

        assertThat(batchCsvPaginationMeta705dfa7312.pageNumber()).contains(2)
        assertThat(batchCsvPaginationMeta705dfa7312.pageSize()).contains(25)
        assertThat(batchCsvPaginationMeta705dfa7312.totalPages()).contains(3)
        assertThat(batchCsvPaginationMeta705dfa7312.totalResults()).contains(55)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCsvPaginationMeta705dfa7312 =
            BatchCsvPaginationMeta705dfa7312.builder()
                .pageNumber(2)
                .pageSize(25)
                .totalPages(3)
                .totalResults(55)
                .build()

        val roundtrippedBatchCsvPaginationMeta705dfa7312 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCsvPaginationMeta705dfa7312),
                jacksonTypeRef<BatchCsvPaginationMeta705dfa7312>(),
            )

        assertThat(roundtrippedBatchCsvPaginationMeta705dfa7312)
            .isEqualTo(batchCsvPaginationMeta705dfa7312)
    }
}
