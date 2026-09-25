// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.sources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceTest {

    @Test
    fun create() {
        val source =
            Source.builder()
                .id("id")
                .memoryCount(0L)
                .sessionId("session_id")
                .createdAt("created_at")
                .updatedAt("updated_at")
                .build()

        assertThat(source.id()).isEqualTo("id")
        assertThat(source.memoryCount()).isEqualTo(0L)
        assertThat(source.sessionId()).contains("session_id")
        assertThat(source.createdAt()).contains("created_at")
        assertThat(source.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val source =
            Source.builder()
                .id("id")
                .memoryCount(0L)
                .sessionId("session_id")
                .createdAt("created_at")
                .updatedAt("updated_at")
                .build()

        val roundtrippedSource =
            jsonMapper.readValue(jsonMapper.writeValueAsString(source), jacksonTypeRef<Source>())

        assertThat(roundtrippedSource).isEqualTo(source)
    }
}
