// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberReputationPaginationMetaTest {

    @Test
    fun create() {
        val numberReputationPaginationMeta =
            NumberReputationPaginationMeta.builder()
                .pageNumber(1L)
                .pageSize(20L)
                .totalPages(3L)
                .totalResults(42L)
                .build()

        assertThat(numberReputationPaginationMeta.pageNumber()).isEqualTo(1L)
        assertThat(numberReputationPaginationMeta.pageSize()).isEqualTo(20L)
        assertThat(numberReputationPaginationMeta.totalPages()).isEqualTo(3L)
        assertThat(numberReputationPaginationMeta.totalResults()).isEqualTo(42L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberReputationPaginationMeta =
            NumberReputationPaginationMeta.builder()
                .pageNumber(1L)
                .pageSize(20L)
                .totalPages(3L)
                .totalResults(42L)
                .build()

        val roundtrippedNumberReputationPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberReputationPaginationMeta),
                jacksonTypeRef<NumberReputationPaginationMeta>(),
            )

        assertThat(roundtrippedNumberReputationPaginationMeta)
            .isEqualTo(numberReputationPaginationMeta)
    }
}
