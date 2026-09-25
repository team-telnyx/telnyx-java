// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemoryRetrieveResponseTest {

    @Test
    fun create() {
        val memoryRetrieveResponse =
            MemoryRetrieveResponse.builder()
                .data(
                    MemoryRetrieveResponse.Data.builder()
                        .id("id")
                        .addDerivedFrom("string")
                        .sourceId("source_id")
                        .text("text")
                        .recordedAt("recorded_at")
                        .build()
                )
                .build()

        assertThat(memoryRetrieveResponse.data())
            .isEqualTo(
                MemoryRetrieveResponse.Data.builder()
                    .id("id")
                    .addDerivedFrom("string")
                    .sourceId("source_id")
                    .text("text")
                    .recordedAt("recorded_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memoryRetrieveResponse =
            MemoryRetrieveResponse.builder()
                .data(
                    MemoryRetrieveResponse.Data.builder()
                        .id("id")
                        .addDerivedFrom("string")
                        .sourceId("source_id")
                        .text("text")
                        .recordedAt("recorded_at")
                        .build()
                )
                .build()

        val roundtrippedMemoryRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memoryRetrieveResponse),
                jacksonTypeRef<MemoryRetrieveResponse>(),
            )

        assertThat(roundtrippedMemoryRetrieveResponse).isEqualTo(memoryRetrieveResponse)
    }
}
