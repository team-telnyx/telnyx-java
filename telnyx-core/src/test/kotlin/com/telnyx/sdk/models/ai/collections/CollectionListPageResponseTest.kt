// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettings
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettingsWrapper
import com.telnyx.sdk.models.ai.collections.sources.Source
import com.telnyx.sdk.models.ai.collections.sources.SourceType
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionListPageResponseTest {

    @Test
    fun create() {
        val collectionListPageResponse =
            CollectionListPageResponse.builder()
                .addData(
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
                .meta(
                    CollectionListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(collectionListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(collectionListPageResponse.meta())
            .contains(
                CollectionListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(42L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionListPageResponse =
            CollectionListPageResponse.builder()
                .addData(
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
                .meta(
                    CollectionListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedCollectionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionListPageResponse),
                jacksonTypeRef<CollectionListPageResponse>(),
            )

        assertThat(roundtrippedCollectionListPageResponse).isEqualTo(collectionListPageResponse)
    }
}
