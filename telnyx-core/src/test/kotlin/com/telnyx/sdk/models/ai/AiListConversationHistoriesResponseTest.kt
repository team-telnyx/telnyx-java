// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiListConversationHistoriesResponseTest {

    @Test
    fun create() {
        val aiListConversationHistoriesResponse =
            AiListConversationHistoriesResponse.builder()
                .id("rec-001_chunk_0")
                .chunkIndex(0L)
                .chunkTotal(3L)
                .ingestedAt(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
                .organizationId("org-456")
                .recordCreatedAt(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
                .recordId("rec-001")
                .region(AiListConversationHistoriesResponse.Region.USA)
                .score(0.92f)
                .text("Customer called regarding a billing discrepancy on their latest invoice.")
                .userId("user-123")
                .metadata(
                    AiListConversationHistoriesResponse.Metadata.builder()
                        .putAdditionalProperty("source", JsonValue.from("bar"))
                        .putAdditionalProperty("language", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(aiListConversationHistoriesResponse.id()).isEqualTo("rec-001_chunk_0")
        assertThat(aiListConversationHistoriesResponse.chunkIndex()).isEqualTo(0L)
        assertThat(aiListConversationHistoriesResponse.chunkTotal()).isEqualTo(3L)
        assertThat(aiListConversationHistoriesResponse.ingestedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
        assertThat(aiListConversationHistoriesResponse.organizationId()).isEqualTo("org-456")
        assertThat(aiListConversationHistoriesResponse.recordCreatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
        assertThat(aiListConversationHistoriesResponse.recordId()).isEqualTo("rec-001")
        assertThat(aiListConversationHistoriesResponse.region())
            .isEqualTo(AiListConversationHistoriesResponse.Region.USA)
        assertThat(aiListConversationHistoriesResponse.score()).isEqualTo(0.92f)
        assertThat(aiListConversationHistoriesResponse.text())
            .isEqualTo("Customer called regarding a billing discrepancy on their latest invoice.")
        assertThat(aiListConversationHistoriesResponse.userId()).isEqualTo("user-123")
        assertThat(aiListConversationHistoriesResponse.metadata())
            .contains(
                AiListConversationHistoriesResponse.Metadata.builder()
                    .putAdditionalProperty("source", JsonValue.from("bar"))
                    .putAdditionalProperty("language", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiListConversationHistoriesResponse =
            AiListConversationHistoriesResponse.builder()
                .id("rec-001_chunk_0")
                .chunkIndex(0L)
                .chunkTotal(3L)
                .ingestedAt(OffsetDateTime.parse("2026-05-28T12:01:00Z"))
                .organizationId("org-456")
                .recordCreatedAt(OffsetDateTime.parse("2026-05-28T12:00:00Z"))
                .recordId("rec-001")
                .region(AiListConversationHistoriesResponse.Region.USA)
                .score(0.92f)
                .text("Customer called regarding a billing discrepancy on their latest invoice.")
                .userId("user-123")
                .metadata(
                    AiListConversationHistoriesResponse.Metadata.builder()
                        .putAdditionalProperty("source", JsonValue.from("bar"))
                        .putAdditionalProperty("language", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedAiListConversationHistoriesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiListConversationHistoriesResponse),
                jacksonTypeRef<AiListConversationHistoriesResponse>(),
            )

        assertThat(roundtrippedAiListConversationHistoriesResponse)
            .isEqualTo(aiListConversationHistoriesResponse)
    }
}
