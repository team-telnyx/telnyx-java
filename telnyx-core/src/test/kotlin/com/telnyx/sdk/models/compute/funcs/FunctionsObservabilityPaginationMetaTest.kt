// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionsObservabilityPaginationMetaTest {

    @Test
    fun create() {
        val functionsObservabilityPaginationMeta =
            FunctionsObservabilityPaginationMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        assertThat(functionsObservabilityPaginationMeta.pageNumber()).contains(0L)
        assertThat(functionsObservabilityPaginationMeta.pageSize()).contains(0L)
        assertThat(functionsObservabilityPaginationMeta.totalPages()).contains(0L)
        assertThat(functionsObservabilityPaginationMeta.totalResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val functionsObservabilityPaginationMeta =
            FunctionsObservabilityPaginationMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        val roundtrippedFunctionsObservabilityPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(functionsObservabilityPaginationMeta),
                jacksonTypeRef<FunctionsObservabilityPaginationMeta>(),
            )

        assertThat(roundtrippedFunctionsObservabilityPaginationMeta)
            .isEqualTo(functionsObservabilityPaginationMeta)
    }
}
