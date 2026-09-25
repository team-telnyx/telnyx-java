// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.PageMeta
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemoryListPageResponseTest {

    @Test
    fun create() {
        val memoryListPageResponse =
            MemoryListPageResponse.builder()
                .addData(
                    MemoryListResponse.builder()
                        .id("id")
                        .sourceId("source_id")
                        .text("text")
                        .recordedAt("recorded_at")
                        .build()
                )
                .meta(
                    PageMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(memoryListPageResponse.data())
            .containsExactly(
                MemoryListResponse.builder()
                    .id("id")
                    .sourceId("source_id")
                    .text("text")
                    .recordedAt("recorded_at")
                    .build()
            )
        assertThat(memoryListPageResponse.meta())
            .isEqualTo(
                PageMeta.builder()
                    .pageNumber(0L)
                    .pageSize(0L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memoryListPageResponse =
            MemoryListPageResponse.builder()
                .addData(
                    MemoryListResponse.builder()
                        .id("id")
                        .sourceId("source_id")
                        .text("text")
                        .recordedAt("recorded_at")
                        .build()
                )
                .meta(
                    PageMeta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedMemoryListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memoryListPageResponse),
                jacksonTypeRef<MemoryListPageResponse>(),
            )

        assertThat(roundtrippedMemoryListPageResponse).isEqualTo(memoryListPageResponse)
    }
}
