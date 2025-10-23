// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferenceEmbeddingBucketIdsTest {

    @Test
    fun create() {
        val inferenceEmbeddingBucketIds =
            InferenceEmbeddingBucketIds.builder().addBucketId("string").maxNumResults(0L).build()

        assertThat(inferenceEmbeddingBucketIds.bucketIds()).containsExactly("string")
        assertThat(inferenceEmbeddingBucketIds.maxNumResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inferenceEmbeddingBucketIds =
            InferenceEmbeddingBucketIds.builder().addBucketId("string").maxNumResults(0L).build()

        val roundtrippedInferenceEmbeddingBucketIds =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inferenceEmbeddingBucketIds),
                jacksonTypeRef<InferenceEmbeddingBucketIds>(),
            )

        assertThat(roundtrippedInferenceEmbeddingBucketIds).isEqualTo(inferenceEmbeddingBucketIds)
    }
}
