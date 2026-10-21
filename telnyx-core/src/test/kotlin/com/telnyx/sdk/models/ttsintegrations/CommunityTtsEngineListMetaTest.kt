// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommunityTtsEngineListMetaTest {

    @Test
    fun create() {
        val communityTtsEngineListMeta =
            CommunityTtsEngineListMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        assertThat(communityTtsEngineListMeta.pageNumber()).isEqualTo(0L)
        assertThat(communityTtsEngineListMeta.pageSize()).isEqualTo(0L)
        assertThat(communityTtsEngineListMeta.totalPages()).isEqualTo(0L)
        assertThat(communityTtsEngineListMeta.totalResults()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val communityTtsEngineListMeta =
            CommunityTtsEngineListMeta.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .totalPages(0L)
                .totalResults(0L)
                .build()

        val roundtrippedCommunityTtsEngineListMeta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(communityTtsEngineListMeta),
                jacksonTypeRef<CommunityTtsEngineListMeta>(),
            )

        assertThat(roundtrippedCommunityTtsEngineListMeta).isEqualTo(communityTtsEngineListMeta)
    }
}
