// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.embeddings.buckets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BucketRetrieveResponseTest {

    @Test
    fun create() {
        val bucketRetrieveResponse =
            BucketRetrieveResponse.builder()
                .addData(
                    BucketRetrieveResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filename("filename")
                        .status("status")
                        .errorReason("error_reason")
                        .lastEmbeddedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(bucketRetrieveResponse.data())
            .containsExactly(
                BucketRetrieveResponse.Data.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filename("filename")
                    .status("status")
                    .errorReason("error_reason")
                    .lastEmbeddedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bucketRetrieveResponse =
            BucketRetrieveResponse.builder()
                .addData(
                    BucketRetrieveResponse.Data.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filename("filename")
                        .status("status")
                        .errorReason("error_reason")
                        .lastEmbeddedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedBucketRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bucketRetrieveResponse),
                jacksonTypeRef<BucketRetrieveResponse>(),
            )

        assertThat(roundtrippedBucketRetrieveResponse).isEqualTo(bucketRetrieveResponse)
    }
}
