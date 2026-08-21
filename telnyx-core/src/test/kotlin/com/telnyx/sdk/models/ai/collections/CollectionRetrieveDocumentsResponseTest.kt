// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionRetrieveDocumentsResponseTest {

    @Test
    fun create() {
        val collectionRetrieveDocumentsResponse =
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

        assertThat(collectionRetrieveDocumentsResponse.id()).contains("id")
        assertThat(collectionRetrieveDocumentsResponse.chunkIndex()).contains(0L)
        assertThat(collectionRetrieveDocumentsResponse.chunkTotal()).contains(0L)
        assertThat(collectionRetrieveDocumentsResponse.ingestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(collectionRetrieveDocumentsResponse.metadata())
            .contains(
                CollectionRetrieveDocumentsResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(collectionRetrieveDocumentsResponse.organizationId()).contains("organization_id")
        assertThat(collectionRetrieveDocumentsResponse.recordCreatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(collectionRetrieveDocumentsResponse.recordId()).contains("record_id")
        assertThat(collectionRetrieveDocumentsResponse.recordType()).contains("voice")
        assertThat(collectionRetrieveDocumentsResponse.region()).contains("region")
        assertThat(collectionRetrieveDocumentsResponse.score()).contains(0.0f)
        assertThat(collectionRetrieveDocumentsResponse.text()).contains("text")
        assertThat(collectionRetrieveDocumentsResponse.userId()).contains("user_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionRetrieveDocumentsResponse =
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

        val roundtrippedCollectionRetrieveDocumentsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionRetrieveDocumentsResponse),
                jacksonTypeRef<CollectionRetrieveDocumentsResponse>(),
            )

        assertThat(roundtrippedCollectionRetrieveDocumentsResponse)
            .isEqualTo(collectionRetrieveDocumentsResponse)
    }
}
