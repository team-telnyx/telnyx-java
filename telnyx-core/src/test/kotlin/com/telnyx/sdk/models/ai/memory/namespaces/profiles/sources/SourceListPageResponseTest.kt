// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.sources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.collections.sources.Source
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.PageMeta
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceListPageResponseTest {

    @Test
    fun create() {
        val sourceListPageResponse =
            SourceListPageResponse.builder()
                .addData(
                    Source.builder()
                        .id("id")
                        .memoryCount(0L)
                        .sessionId("session_id")
                        .createdAt("created_at")
                        .updatedAt("updated_at")
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

        assertThat(sourceListPageResponse.data())
            .containsExactly(
                Source.builder()
                    .id("id")
                    .memoryCount(0L)
                    .sessionId("session_id")
                    .createdAt("created_at")
                    .updatedAt("updated_at")
                    .build()
            )
        assertThat(sourceListPageResponse.meta())
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
        val sourceListPageResponse =
            SourceListPageResponse.builder()
                .addData(
                    Source.builder()
                        .id("id")
                        .memoryCount(0L)
                        .sessionId("session_id")
                        .createdAt("created_at")
                        .updatedAt("updated_at")
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

        val roundtrippedSourceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sourceListPageResponse),
                jacksonTypeRef<SourceListPageResponse>(),
            )

        assertThat(roundtrippedSourceListPageResponse).isEqualTo(sourceListPageResponse)
    }
}
