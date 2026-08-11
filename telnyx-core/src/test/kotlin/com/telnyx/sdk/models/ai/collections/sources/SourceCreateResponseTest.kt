// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.sources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceCreateResponseTest {

    @Test
    fun create() {
        val sourceCreateResponse =
            SourceCreateResponse.builder()
                .data(
                    Source.builder()
                        .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                        .bucketId("policy-docs")
                        .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                        .recordType("ai_collection_source")
                        .sourceType(SourceType.VOICE)
                        .status("ready")
                        .build()
                )
                .build()

        assertThat(sourceCreateResponse.data())
            .contains(
                Source.builder()
                    .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                    .bucketId("policy-docs")
                    .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                    .recordType("ai_collection_source")
                    .sourceType(SourceType.VOICE)
                    .status("ready")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sourceCreateResponse =
            SourceCreateResponse.builder()
                .data(
                    Source.builder()
                        .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                        .bucketId("policy-docs")
                        .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                        .recordType("ai_collection_source")
                        .sourceType(SourceType.VOICE)
                        .status("ready")
                        .build()
                )
                .build()

        val roundtrippedSourceCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sourceCreateResponse),
                jacksonTypeRef<SourceCreateResponse>(),
            )

        assertThat(roundtrippedSourceCreateResponse).isEqualTo(sourceCreateResponse)
    }
}
