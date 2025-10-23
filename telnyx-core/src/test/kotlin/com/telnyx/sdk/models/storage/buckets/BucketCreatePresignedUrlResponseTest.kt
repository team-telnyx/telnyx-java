// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.buckets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BucketCreatePresignedUrlResponseTest {

    @Test
    fun create() {
        val bucketCreatePresignedUrlResponse =
            BucketCreatePresignedUrlResponse.builder()
                .content(
                    BucketCreatePresignedUrlResponse.Content.builder()
                        .token("token")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .presignedUrl("presigned_url")
                        .build()
                )
                .build()

        assertThat(bucketCreatePresignedUrlResponse.content())
            .contains(
                BucketCreatePresignedUrlResponse.Content.builder()
                    .token("token")
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .presignedUrl("presigned_url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bucketCreatePresignedUrlResponse =
            BucketCreatePresignedUrlResponse.builder()
                .content(
                    BucketCreatePresignedUrlResponse.Content.builder()
                        .token("token")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .presignedUrl("presigned_url")
                        .build()
                )
                .build()

        val roundtrippedBucketCreatePresignedUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bucketCreatePresignedUrlResponse),
                jacksonTypeRef<BucketCreatePresignedUrlResponse>(),
            )

        assertThat(roundtrippedBucketCreatePresignedUrlResponse)
            .isEqualTo(bucketCreatePresignedUrlResponse)
    }
}
