// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalSettingsWrapperTest {

    @Test
    fun create() {
        val retrievalSettingsWrapper =
            RetrievalSettingsWrapper.builder()
                .recordType("ai_collection_settings")
                .retrieval(
                    RetrievalSettings.builder()
                        .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                        .topK(5L)
                        .build()
                )
                .build()

        assertThat(retrievalSettingsWrapper.recordType()).contains("ai_collection_settings")
        assertThat(retrievalSettingsWrapper.retrieval())
            .contains(
                RetrievalSettings.builder()
                    .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                    .topK(5L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrievalSettingsWrapper =
            RetrievalSettingsWrapper.builder()
                .recordType("ai_collection_settings")
                .retrieval(
                    RetrievalSettings.builder()
                        .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                        .topK(5L)
                        .build()
                )
                .build()

        val roundtrippedRetrievalSettingsWrapper =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrievalSettingsWrapper),
                jacksonTypeRef<RetrievalSettingsWrapper>(),
            )

        assertThat(roundtrippedRetrievalSettingsWrapper).isEqualTo(retrievalSettingsWrapper)
    }
}
