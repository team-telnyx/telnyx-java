// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.oauthclients

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthOAuthPaginationMetaTest {

    @Test
    fun create() {
        val oauthOAuthPaginationMeta =
            OAuthOAuthPaginationMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        assertThat(oauthOAuthPaginationMeta.pageNumber()).contains(0L)
        assertThat(oauthOAuthPaginationMeta.pageSize()).contains(0L)
        assertThat(oauthOAuthPaginationMeta.totalPages()).contains(0L)
        assertThat(oauthOAuthPaginationMeta.totalResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthOAuthPaginationMeta =
            OAuthOAuthPaginationMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        val roundtrippedOAuthOAuthPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthOAuthPaginationMeta),
                jacksonTypeRef<OAuthOAuthPaginationMeta>(),
            )

        assertThat(roundtrippedOAuthOAuthPaginationMeta).isEqualTo(oauthOAuthPaginationMeta)
    }
}
