// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingsEnvelopeTest {

    @Test
    fun create() {
        val settingsEnvelope =
            SettingsEnvelope.builder()
                .data(
                    RetrievalSettingsWrapper.builder()
                        .recordType("ai_collection_settings")
                        .retrieval(
                            RetrievalSettings.builder()
                                .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                                .topK(5L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(settingsEnvelope.data())
            .contains(
                RetrievalSettingsWrapper.builder()
                    .recordType("ai_collection_settings")
                    .retrieval(
                        RetrievalSettings.builder()
                            .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                            .topK(5L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingsEnvelope =
            SettingsEnvelope.builder()
                .data(
                    RetrievalSettingsWrapper.builder()
                        .recordType("ai_collection_settings")
                        .retrieval(
                            RetrievalSettings.builder()
                                .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                                .topK(5L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedSettingsEnvelope =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingsEnvelope),
                jacksonTypeRef<SettingsEnvelope>(),
            )

        assertThat(roundtrippedSettingsEnvelope).isEqualTo(settingsEnvelope)
    }
}
