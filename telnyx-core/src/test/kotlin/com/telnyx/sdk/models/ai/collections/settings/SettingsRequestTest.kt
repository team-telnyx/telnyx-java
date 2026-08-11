// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingsRequestTest {

    @Test
    fun create() {
        val settingsRequest =
            SettingsRequest.builder()
                .retrieval(
                    RetrievalSettings.builder()
                        .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                        .topK(5L)
                        .build()
                )
                .build()

        assertThat(settingsRequest.retrieval())
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
        val settingsRequest =
            SettingsRequest.builder()
                .retrieval(
                    RetrievalSettings.builder()
                        .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                        .topK(5L)
                        .build()
                )
                .build()

        val roundtrippedSettingsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingsRequest),
                jacksonTypeRef<SettingsRequest>(),
            )

        assertThat(roundtrippedSettingsRequest).isEqualTo(settingsRequest)
    }
}
