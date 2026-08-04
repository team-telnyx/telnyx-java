// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OffsetPaginationMetaTest {

    @Test
    fun create() {
        val offsetPaginationMeta =
            OffsetPaginationMeta.builder()
                .pageNumber(1L)
                .pageSize(1L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        assertThat(offsetPaginationMeta.pageNumber()).isEqualTo(1L)
        assertThat(offsetPaginationMeta.pageSize()).isEqualTo(1L)
        assertThat(offsetPaginationMeta.totalPages()).isEqualTo(0L)
        assertThat(offsetPaginationMeta.totalResults()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val offsetPaginationMeta =
            OffsetPaginationMeta.builder()
                .pageNumber(1L)
                .pageSize(1L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        val roundtrippedOffsetPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(offsetPaginationMeta),
                jacksonTypeRef<OffsetPaginationMeta>(),
            )

        assertThat(roundtrippedOffsetPaginationMeta).isEqualTo(offsetPaginationMeta)
    }
}
