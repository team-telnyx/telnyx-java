// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiRetrieveConversationHistoriesResponseTest {

    @Test
    fun create() {
        val aiRetrieveConversationHistoriesResponse =
            AiRetrieveConversationHistoriesResponse.builder()
                .addData(
                    AiRetrieveConversationHistoriesResponse.Data.builder()
                        .id("rec-001_chunk_0")
                        .chunkIndex(0L)
                        .chunkTotal(3L)
                        .ingestedAt(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
                        .organizationId("org-456")
                        .recordCreatedAt(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
                        .recordId("rec-001")
                        .region(AiRetrieveConversationHistoriesResponse.Data.Region.USA)
                        .score(0.92f)
                        .text(
                            "Customer called regarding a billing discrepancy on their latest invoice."
                        )
                        .userId("user-123")
                        .metadata(
                            AiRetrieveConversationHistoriesResponse.Data.Metadata.builder()
                                .putAdditionalProperty("source", JsonValue.from("bar"))
                                .putAdditionalProperty("language", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .meta(
                    AiRetrieveConversationHistoriesResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(1L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(aiRetrieveConversationHistoriesResponse.data())
            .containsExactly(
                AiRetrieveConversationHistoriesResponse.Data.builder()
                    .id("rec-001_chunk_0")
                    .chunkIndex(0L)
                    .chunkTotal(3L)
                    .ingestedAt(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
                    .organizationId("org-456")
                    .recordCreatedAt(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
                    .recordId("rec-001")
                    .region(AiRetrieveConversationHistoriesResponse.Data.Region.USA)
                    .score(0.92f)
                    .text(
                        "Customer called regarding a billing discrepancy on their latest invoice."
                    )
                    .userId("user-123")
                    .metadata(
                        AiRetrieveConversationHistoriesResponse.Data.Metadata.builder()
                            .putAdditionalProperty("source", JsonValue.from("bar"))
                            .putAdditionalProperty("language", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(aiRetrieveConversationHistoriesResponse.meta())
            .isEqualTo(
                AiRetrieveConversationHistoriesResponse.Meta.builder()
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
        val aiRetrieveConversationHistoriesResponse =
            AiRetrieveConversationHistoriesResponse.builder()
                .addData(
                    AiRetrieveConversationHistoriesResponse.Data.builder()
                        .id("rec-001_chunk_0")
                        .chunkIndex(0L)
                        .chunkTotal(3L)
                        .ingestedAt(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
                        .organizationId("org-456")
                        .recordCreatedAt(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
                        .recordId("rec-001")
                        .region(AiRetrieveConversationHistoriesResponse.Data.Region.USA)
                        .score(0.92f)
                        .text(
                            "Customer called regarding a billing discrepancy on their latest invoice."
                        )
                        .userId("user-123")
                        .metadata(
                            AiRetrieveConversationHistoriesResponse.Data.Metadata.builder()
                                .putAdditionalProperty("source", JsonValue.from("bar"))
                                .putAdditionalProperty("language", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .meta(
                    AiRetrieveConversationHistoriesResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(1L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedAiRetrieveConversationHistoriesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiRetrieveConversationHistoriesResponse),
                jacksonTypeRef<AiRetrieveConversationHistoriesResponse>(),
            )

        assertThat(roundtrippedAiRetrieveConversationHistoriesResponse)
            .isEqualTo(aiRetrieveConversationHistoriesResponse)
    }
}
