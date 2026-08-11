// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.alphanumericsenderids

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingPaginationMeta0b38e7044bTest {

    @Test
    fun create() {
        val messagingPaginationMeta0b38e7044b =
            MessagingPaginationMeta0b38e7044b.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        assertThat(messagingPaginationMeta0b38e7044b.pageNumber()).isEqualTo(2L)
        assertThat(messagingPaginationMeta0b38e7044b.pageSize()).isEqualTo(25L)
        assertThat(messagingPaginationMeta0b38e7044b.totalPages()).isEqualTo(3L)
        assertThat(messagingPaginationMeta0b38e7044b.totalResults()).isEqualTo(55L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingPaginationMeta0b38e7044b =
            MessagingPaginationMeta0b38e7044b.builder()
                .pageNumber(2L)
                .pageSize(25L)
                .totalPages(3L)
                .totalResults(55L)
                .build()

        val roundtrippedMessagingPaginationMeta0b38e7044b =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingPaginationMeta0b38e7044b),
                jacksonTypeRef<MessagingPaginationMeta0b38e7044b>(),
            )

        assertThat(roundtrippedMessagingPaginationMeta0b38e7044b)
            .isEqualTo(messagingPaginationMeta0b38e7044b)
    }
}
