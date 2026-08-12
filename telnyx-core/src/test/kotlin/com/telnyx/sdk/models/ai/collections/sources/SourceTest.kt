// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.sources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceTest {

    @Test
    fun create() {
        val source =
            Source.builder()
                .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                .bucketId("policy-docs")
                .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .recordType("ai_collection_source")
                .sourceType(SourceType.VOICE)
                .status("ready")
                .build()

        assertThat(source.id()).contains("source_8vkvtcksnawvbnxq48yv2l06wx")
        assertThat(source.bucketId()).contains("policy-docs")
        assertThat(source.collectionId()).contains("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
        assertThat(source.recordType()).contains("ai_collection_source")
        assertThat(source.sourceType()).contains(SourceType.VOICE)
        assertThat(source.status()).contains("ready")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val source =
            Source.builder()
                .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                .bucketId("policy-docs")
                .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                .recordType("ai_collection_source")
                .sourceType(SourceType.VOICE)
                .status("ready")
                .build()

        val roundtrippedSource =
            jsonMapper.readValue(jsonMapper.writeValueAsString(source), jacksonTypeRef<Source>())

        assertThat(roundtrippedSource).isEqualTo(source)
    }
}
