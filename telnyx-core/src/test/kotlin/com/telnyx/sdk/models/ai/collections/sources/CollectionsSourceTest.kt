// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.sources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionsSourceTest {

    @Test
    fun create() {
        val collectionsSource =
            CollectionsSource.builder()
                .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                .bucketId("policy-docs")
                .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .recordType("ai_collection_source")
                .sourceType(SourceType.VOICE)
                .status("ready")
                .build()

        assertThat(collectionsSource.id()).contains("source_8vkvtcksnawvbnxq48yv2l06wx")
        assertThat(collectionsSource.bucketId()).contains("policy-docs")
        assertThat(collectionsSource.collectionId())
            .contains("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
        assertThat(collectionsSource.recordType()).contains("ai_collection_source")
        assertThat(collectionsSource.sourceType()).contains(SourceType.VOICE)
        assertThat(collectionsSource.status()).contains("ready")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionsSource =
            CollectionsSource.builder()
                .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                .bucketId("policy-docs")
                .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .recordType("ai_collection_source")
                .sourceType(SourceType.VOICE)
                .status("ready")
                .build()

        val roundtrippedCollectionsSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionsSource),
                jacksonTypeRef<CollectionsSource>(),
            )

        assertThat(roundtrippedCollectionsSource).isEqualTo(collectionsSource)
    }
}
