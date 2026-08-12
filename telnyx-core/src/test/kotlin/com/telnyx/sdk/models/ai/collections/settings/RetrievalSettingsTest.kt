// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RetrievalSettingsTest {

    @Test
    fun create() {
        val retrievalSettings =
            RetrievalSettings.builder()
                .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                .topK(5L)
                .build()

        assertThat(retrievalSettings.retrievalType())
            .contains(RetrievalSettings.RetrievalType.VECTOR)
        assertThat(retrievalSettings.topK()).contains(5L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val retrievalSettings =
            RetrievalSettings.builder()
                .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                .topK(5L)
                .build()

        val roundtrippedRetrievalSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(retrievalSettings),
                jacksonTypeRef<RetrievalSettings>(),
            )

        assertThat(roundtrippedRetrievalSettings).isEqualTo(retrievalSettings)
    }
}
