// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.embeddings.buckets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BucketListResponseTest {

    @Test
    fun create() {
        val bucketListResponse =
            BucketListResponse.builder()
                .data(BucketListResponse.Data.builder().addBucket("string").build())
                .build()

        assertThat(bucketListResponse.data())
            .isEqualTo(BucketListResponse.Data.builder().addBucket("string").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bucketListResponse =
            BucketListResponse.builder()
                .data(BucketListResponse.Data.builder().addBucket("string").build())
                .build()

        val roundtrippedBucketListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bucketListResponse),
                jacksonTypeRef<BucketListResponse>(),
            )

        assertThat(roundtrippedBucketListResponse).isEqualTo(bucketListResponse)
    }
}
