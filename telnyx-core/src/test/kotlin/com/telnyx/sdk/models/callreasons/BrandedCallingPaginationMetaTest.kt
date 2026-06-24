// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callreasons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandedCallingPaginationMetaTest {

    @Test
    fun create() {
        val brandedCallingPaginationMeta =
            BrandedCallingPaginationMeta.builder()
                .pageNumber(1L)
                .pageSize(20L)
                .totalPages(3L)
                .totalResults(42L)
                .build()

        assertThat(brandedCallingPaginationMeta.pageNumber()).isEqualTo(1L)
        assertThat(brandedCallingPaginationMeta.pageSize()).isEqualTo(20L)
        assertThat(brandedCallingPaginationMeta.totalPages()).isEqualTo(3L)
        assertThat(brandedCallingPaginationMeta.totalResults()).isEqualTo(42L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandedCallingPaginationMeta =
            BrandedCallingPaginationMeta.builder()
                .pageNumber(1L)
                .pageSize(20L)
                .totalPages(3L)
                .totalResults(42L)
                .build()

        val roundtrippedBrandedCallingPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandedCallingPaginationMeta),
                jacksonTypeRef<BrandedCallingPaginationMeta>(),
            )

        assertThat(roundtrippedBrandedCallingPaginationMeta).isEqualTo(brandedCallingPaginationMeta)
    }
}
