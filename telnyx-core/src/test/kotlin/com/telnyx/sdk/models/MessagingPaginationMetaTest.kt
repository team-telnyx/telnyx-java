// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingPaginationMetaTest {

    @Test
    fun create() {
        val messagingPaginationMeta =
            MessagingPaginationMeta.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        assertThat(messagingPaginationMeta.pageNumber()).isEqualTo(2L)
        assertThat(messagingPaginationMeta.pageSize()).isEqualTo(25L)
        assertThat(messagingPaginationMeta.totalPages()).isEqualTo(3L)
        assertThat(messagingPaginationMeta.totalResults()).isEqualTo(55L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingPaginationMeta =
            MessagingPaginationMeta.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        val roundtrippedMessagingPaginationMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingPaginationMeta),
                jacksonTypeRef<MessagingPaginationMeta>(),
            )

        assertThat(roundtrippedMessagingPaginationMeta).isEqualTo(messagingPaginationMeta)
    }
}
