// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthclients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaginationMetaOAuthTest {

    @Test
    fun create() {
        val paginationMetaOAuth =
            PaginationMetaOAuth.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        assertThat(paginationMetaOAuth.pageNumber()).contains(0L)
        assertThat(paginationMetaOAuth.pageSize()).contains(0L)
        assertThat(paginationMetaOAuth.totalPages()).contains(0L)
        assertThat(paginationMetaOAuth.totalResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paginationMetaOAuth =
            PaginationMetaOAuth.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        val roundtrippedPaginationMetaOAuth =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paginationMetaOAuth),
                jacksonTypeRef<PaginationMetaOAuth>(),
            )

        assertThat(roundtrippedPaginationMetaOAuth).isEqualTo(paginationMetaOAuth)
    }
}
