// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettings
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettingsWrapper
import com.telnyx.sdk.models.ai.collections.sources.Source
import com.telnyx.sdk.models.ai.collections.sources.SourceType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionEnvelopeTest {

    @Test
    fun create() {
        val collectionEnvelope =
            CollectionEnvelope.builder()
                .data(
                    Collection.builder()
                        .createdAt(OffsetDateTime.parse("2026-08-04T12:00:00Z"))
                        .description("All customer support voice transcripts.")
                        .name("Support Transcripts")
                        .recordType("ai_collection")
                        .settings(
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
                        .slug("support-transcripts")
                        .addSource(
                            Source.builder()
                                .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                                .bucketId("policy-docs")
                                .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                                .recordType("ai_collection_source")
                                .sourceType(SourceType.VOICE)
                                .status("ready")
                                .build()
                        )
                        .status("ready")
                        .updatedAt(OffsetDateTime.parse("2026-08-04T12:00:00Z"))
                        .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                        .build()
                )
                .build()

        assertThat(collectionEnvelope.data())
            .contains(
                Collection.builder()
                    .createdAt(OffsetDateTime.parse("2026-08-04T12:00:00Z"))
                    .description("All customer support voice transcripts.")
                    .name("Support Transcripts")
                    .recordType("ai_collection")
                    .settings(
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
                    .slug("support-transcripts")
                    .addSource(
                        Source.builder()
                            .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                            .bucketId("policy-docs")
                            .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                            .recordType("ai_collection_source")
                            .sourceType(SourceType.VOICE)
                            .status("ready")
                            .build()
                    )
                    .status("ready")
                    .updatedAt(OffsetDateTime.parse("2026-08-04T12:00:00Z"))
                    .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionEnvelope =
            CollectionEnvelope.builder()
                .data(
                    Collection.builder()
                        .createdAt(OffsetDateTime.parse("2026-08-04T12:00:00Z"))
                        .description("All customer support voice transcripts.")
                        .name("Support Transcripts")
                        .recordType("ai_collection")
                        .settings(
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
                        .slug("support-transcripts")
                        .addSource(
                            Source.builder()
                                .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                                .bucketId("policy-docs")
                                .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                                .recordType("ai_collection_source")
                                .sourceType(SourceType.VOICE)
                                .status("ready")
                                .build()
                        )
                        .status("ready")
                        .updatedAt(OffsetDateTime.parse("2026-08-04T12:00:00Z"))
                        .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                        .build()
                )
                .build()

        val roundtrippedCollectionEnvelope =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionEnvelope),
                jacksonTypeRef<CollectionEnvelope>(),
            )

        assertThat(roundtrippedCollectionEnvelope).isEqualTo(collectionEnvelope)
    }
}
