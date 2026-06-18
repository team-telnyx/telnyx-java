// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiSearchConversationHistoriesResponseTest {

    @Test
    fun create() {
        val aiSearchConversationHistoriesResponse =
            AiSearchConversationHistoriesResponse.builder()
                .addData(
                    AiSearchConversationHistoriesResponse.Data.builder()
                        .id("rec-001_chunk_0")
                        .chunkIndex(0L)
                        .chunkTotal(3L)
                        .documentId(null)
                        .ingestedAt(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
                        .organizationId("org-456")
                        .recordCreatedAt(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
                        .recordId("rec-001")
                        .recordType(AiSearchConversationHistoriesResponse.Data.RecordType.VOICE)
                        .region(AiSearchConversationHistoriesResponse.Data.Region.USA)
                        .score(0.92f)
                        .text(
                            "Customer called regarding a billing discrepancy on their latest invoice."
                        )
                        .userId("user-123")
                        .metadata(
                            AiSearchConversationHistoriesResponse.Data.Metadata.builder()
                                .putAdditionalProperty("source", JsonValue.from("bar"))
                                .putAdditionalProperty("language", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .meta(
                    AiSearchConversationHistoriesResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(1L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(aiSearchConversationHistoriesResponse.data())
            .containsExactly(
                AiSearchConversationHistoriesResponse.Data.builder()
                    .id("rec-001_chunk_0")
                    .chunkIndex(0L)
                    .chunkTotal(3L)
                    .documentId(null)
                    .ingestedAt(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
                    .organizationId("org-456")
                    .recordCreatedAt(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
                    .recordId("rec-001")
                    .recordType(AiSearchConversationHistoriesResponse.Data.RecordType.VOICE)
                    .region(AiSearchConversationHistoriesResponse.Data.Region.USA)
                    .score(0.92f)
                    .text(
                        "Customer called regarding a billing discrepancy on their latest invoice."
                    )
                    .userId("user-123")
                    .metadata(
                        AiSearchConversationHistoriesResponse.Data.Metadata.builder()
                            .putAdditionalProperty("source", JsonValue.from("bar"))
                            .putAdditionalProperty("language", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(aiSearchConversationHistoriesResponse.meta())
            .isEqualTo(
                AiSearchConversationHistoriesResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(1L)
                    .totalResults(42L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiSearchConversationHistoriesResponse =
            AiSearchConversationHistoriesResponse.builder()
                .addData(
                    AiSearchConversationHistoriesResponse.Data.builder()
                        .id("rec-001_chunk_0")
                        .chunkIndex(0L)
                        .chunkTotal(3L)
                        .documentId(null)
                        .ingestedAt(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
                        .organizationId("org-456")
                        .recordCreatedAt(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
                        .recordId("rec-001")
                        .recordType(AiSearchConversationHistoriesResponse.Data.RecordType.VOICE)
                        .region(AiSearchConversationHistoriesResponse.Data.Region.USA)
                        .score(0.92f)
                        .text(
                            "Customer called regarding a billing discrepancy on their latest invoice."
                        )
                        .userId("user-123")
                        .metadata(
                            AiSearchConversationHistoriesResponse.Data.Metadata.builder()
                                .putAdditionalProperty("source", JsonValue.from("bar"))
                                .putAdditionalProperty("language", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .meta(
                    AiSearchConversationHistoriesResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(1L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedAiSearchConversationHistoriesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiSearchConversationHistoriesResponse),
                jacksonTypeRef<AiSearchConversationHistoriesResponse>(),
            )

        assertThat(roundtrippedAiSearchConversationHistoriesResponse)
            .isEqualTo(aiSearchConversationHistoriesResponse)
    }
}
