// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemoryListResponseTest {

    @Test
    fun create() {
        val memoryListResponse =
            MemoryListResponse.builder()
                .id("id")
                .sourceId("source_id")
                .text("text")
                .recordedAt("recorded_at")
                .build()

        assertThat(memoryListResponse.id()).isEqualTo("id")
        assertThat(memoryListResponse.sourceId()).contains("source_id")
        assertThat(memoryListResponse.text()).isEqualTo("text")
        assertThat(memoryListResponse.recordedAt()).contains("recorded_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memoryListResponse =
            MemoryListResponse.builder()
                .id("id")
                .sourceId("source_id")
                .text("text")
                .recordedAt("recorded_at")
                .build()

        val roundtrippedMemoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memoryListResponse),
                jacksonTypeRef<MemoryListResponse>(),
            )

        assertThat(roundtrippedMemoryListResponse).isEqualTo(memoryListResponse)
    }
}
