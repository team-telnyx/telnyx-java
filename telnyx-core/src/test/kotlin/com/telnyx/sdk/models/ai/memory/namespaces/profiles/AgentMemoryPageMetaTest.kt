// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentMemoryPageMetaTest {

    @Test
    fun create() {
        val agentMemoryPageMeta =
            AgentMemoryPageMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        assertThat(agentMemoryPageMeta.pageNumber()).isEqualTo(0L)
        assertThat(agentMemoryPageMeta.pageSize()).isEqualTo(0L)
        assertThat(agentMemoryPageMeta.totalPages()).isEqualTo(0L)
        assertThat(agentMemoryPageMeta.totalResults()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentMemoryPageMeta =
            AgentMemoryPageMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        val roundtrippedAgentMemoryPageMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentMemoryPageMeta),
                jacksonTypeRef<AgentMemoryPageMeta>(),
            )

        assertThat(roundtrippedAgentMemoryPageMeta).isEqualTo(agentMemoryPageMeta)
    }
}
