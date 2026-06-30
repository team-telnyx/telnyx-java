// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BucketIdsTest {

    @Test
    fun create() {
        val bucketIds = BucketIds.builder().addBucketId("string").maxNumResults(0L).build()

        assertThat(bucketIds.bucketIds()).containsExactly("string")
        assertThat(bucketIds.maxNumResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bucketIds = BucketIds.builder().addBucketId("string").maxNumResults(0L).build()

        val roundtrippedBucketIds =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bucketIds),
                jacksonTypeRef<BucketIds>(),
            )

        assertThat(roundtrippedBucketIds).isEqualTo(bucketIds)
    }
}
