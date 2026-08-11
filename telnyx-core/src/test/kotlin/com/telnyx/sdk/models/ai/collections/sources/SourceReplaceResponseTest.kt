// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections.sources

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceReplaceResponseTest {

    @Test
    fun create() {
        val sourceReplaceResponse =
            SourceReplaceResponse.builder()
                .addData(
                    Source.builder()
                        .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                        .bucketId("policy-docs")
                        .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                        .recordType("ai_collection_source")
                        .sourceType(SourceType.VOICE)
                        .status("ready")
                        .build()
                )
                .meta(
                    SourceReplaceResponse.Meta.builder()
                        .addAdded("string")
                        .addRemoved("string")
                        .addRetained("string")
                        .build()
                )
                .build()

        assertThat(sourceReplaceResponse.data().getOrNull())
            .containsExactly(
                Source.builder()
                    .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                    .bucketId("policy-docs")
                    .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                    .recordType("ai_collection_source")
                    .sourceType(SourceType.VOICE)
                    .status("ready")
                    .build()
            )
        assertThat(sourceReplaceResponse.meta())
            .contains(
                SourceReplaceResponse.Meta.builder()
                    .addAdded("string")
                    .addRemoved("string")
                    .addRetained("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sourceReplaceResponse =
            SourceReplaceResponse.builder()
                .addData(
                    Source.builder()
                        .id("source_8vkvtcksnawvbnxq48yv2l06wx")
                        .bucketId("policy-docs")
                        .collectionId("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                        .recordType("ai_collection_source")
                        .sourceType(SourceType.VOICE)
                        .status("ready")
                        .build()
                )
                .meta(
                    SourceReplaceResponse.Meta.builder()
                        .addAdded("string")
                        .addRemoved("string")
                        .addRetained("string")
                        .build()
                )
                .build()

        val roundtrippedSourceReplaceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sourceReplaceResponse),
                jacksonTypeRef<SourceReplaceResponse>(),
            )

        assertThat(roundtrippedSourceReplaceResponse).isEqualTo(sourceReplaceResponse)
    }
}
