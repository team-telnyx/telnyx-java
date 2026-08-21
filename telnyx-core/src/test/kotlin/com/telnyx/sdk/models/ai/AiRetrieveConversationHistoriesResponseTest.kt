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
                .id("rec-001_chunk_0")
                .chunkIndex(0L)
                .chunkTotal(3L)
                .ingestedAt(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
                .organizationId("org-456")
                .recordCreatedAt(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
                .recordId("rec-001")
                .region(AiRetrieveConversationHistoriesResponse.Region.USA)
                .score(0.92f)
                .text("Customer called regarding a billing discrepancy on their latest invoice.")
                .userId("user-123")
                .metadata(
                    AiRetrieveConversationHistoriesResponse.Metadata.builder()
                        .putAdditionalProperty("source", JsonValue.from("bar"))
                        .putAdditionalProperty("language", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(aiRetrieveConversationHistoriesResponse.id()).isEqualTo("rec-001_chunk_0")
        assertThat(aiRetrieveConversationHistoriesResponse.chunkIndex()).isEqualTo(0L)
        assertThat(aiRetrieveConversationHistoriesResponse.chunkTotal()).isEqualTo(3L)
        assertThat(aiRetrieveConversationHistoriesResponse.ingestedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
        assertThat(aiRetrieveConversationHistoriesResponse.organizationId()).isEqualTo("org-456")
        assertThat(aiRetrieveConversationHistoriesResponse.recordCreatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
        assertThat(aiRetrieveConversationHistoriesResponse.recordId()).isEqualTo("rec-001")
        assertThat(aiRetrieveConversationHistoriesResponse.region())
            .isEqualTo(AiRetrieveConversationHistoriesResponse.Region.USA)
        assertThat(aiRetrieveConversationHistoriesResponse.score()).isEqualTo(0.92f)
        assertThat(aiRetrieveConversationHistoriesResponse.text())
            .isEqualTo("Customer called regarding a billing discrepancy on their latest invoice.")
        assertThat(aiRetrieveConversationHistoriesResponse.userId()).isEqualTo("user-123")
        assertThat(aiRetrieveConversationHistoriesResponse.metadata())
            .contains(
                AiRetrieveConversationHistoriesResponse.Metadata.builder()
                    .putAdditionalProperty("source", JsonValue.from("bar"))
                    .putAdditionalProperty("language", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiRetrieveConversationHistoriesResponse =
            AiRetrieveConversationHistoriesResponse.builder()
                .id("rec-001_chunk_0")
                .chunkIndex(0L)
                .chunkTotal(3L)
                .ingestedAt(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
                .organizationId("org-456")
                .recordCreatedAt(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
                .recordId("rec-001")
                .region(AiRetrieveConversationHistoriesResponse.Region.USA)
                .score(0.92f)
                .text("Customer called regarding a billing discrepancy on their latest invoice.")
                .userId("user-123")
                .metadata(
                    AiRetrieveConversationHistoriesResponse.Metadata.builder()
                        .putAdditionalProperty("source", JsonValue.from("bar"))
                        .putAdditionalProperty("language", JsonValue.from("bar"))
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
