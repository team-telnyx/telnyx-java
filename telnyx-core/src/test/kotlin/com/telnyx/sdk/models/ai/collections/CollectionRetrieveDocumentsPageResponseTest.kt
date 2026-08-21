// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionRetrieveDocumentsPageResponseTest {

    @Test
    fun create() {
        val collectionRetrieveDocumentsPageResponse =
            CollectionRetrieveDocumentsPageResponse.builder()
                .addData(
                    CollectionRetrieveDocumentsResponse.builder()
                        .id("id")
                        .chunkIndex(0L)
                        .chunkTotal(0L)
                        .ingestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            CollectionRetrieveDocumentsResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .organizationId("organization_id")
                        .recordCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordId("record_id")
                        .recordType("voice")
                        .region("region")
                        .score(0.0f)
                        .text("text")
                        .userId("user_id")
                        .build()
                )
                .meta(
                    CollectionRetrieveDocumentsPageResponse.Meta.builder()
                        .collectionSlug("support-transcripts")
                        .pageNumber(1L)
                        .pageSize(20L)
                        .retrievalType("vector")
                        .addSearchedSource("voice")
                        .addSearchedSource("message")
                        .topK(5L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(collectionRetrieveDocumentsPageResponse.data().getOrNull())
            .containsExactly(
                CollectionRetrieveDocumentsResponse.builder()
                    .id("id")
                    .chunkIndex(0L)
                    .chunkTotal(0L)
                    .ingestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        CollectionRetrieveDocumentsResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .organizationId("organization_id")
                    .recordCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordId("record_id")
                    .recordType("voice")
                    .region("region")
                    .score(0.0f)
                    .text("text")
                    .userId("user_id")
                    .build()
            )
        assertThat(collectionRetrieveDocumentsPageResponse.meta())
            .contains(
                CollectionRetrieveDocumentsPageResponse.Meta.builder()
                    .collectionSlug("support-transcripts")
                    .pageNumber(1L)
                    .pageSize(20L)
                    .retrievalType("vector")
                    .addSearchedSource("voice")
                    .addSearchedSource("message")
                    .topK(5L)
                    .totalPages(3L)
                    .totalResults(42L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionRetrieveDocumentsPageResponse =
            CollectionRetrieveDocumentsPageResponse.builder()
                .addData(
                    CollectionRetrieveDocumentsResponse.builder()
                        .id("id")
                        .chunkIndex(0L)
                        .chunkTotal(0L)
                        .ingestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            CollectionRetrieveDocumentsResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .organizationId("organization_id")
                        .recordCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordId("record_id")
                        .recordType("voice")
                        .region("region")
                        .score(0.0f)
                        .text("text")
                        .userId("user_id")
                        .build()
                )
                .meta(
                    CollectionRetrieveDocumentsPageResponse.Meta.builder()
                        .collectionSlug("support-transcripts")
                        .pageNumber(1L)
                        .pageSize(20L)
                        .retrievalType("vector")
                        .addSearchedSource("voice")
                        .addSearchedSource("message")
                        .topK(5L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedCollectionRetrieveDocumentsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionRetrieveDocumentsPageResponse),
                jacksonTypeRef<CollectionRetrieveDocumentsPageResponse>(),
            )

        assertThat(roundtrippedCollectionRetrieveDocumentsPageResponse)
            .isEqualTo(collectionRetrieveDocumentsPageResponse)
    }
}
