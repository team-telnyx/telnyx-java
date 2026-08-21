// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudfListResponseTest {

    @Test
    fun create() {
        val cloudfListResponse =
            CloudfListResponse.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                .name("agent-fs")
                .recordType("cloudfs")
                .region("us-east-1")
                .s3Bucket("cloudfs-fs-0123456789abcdef")
                .s3Endpoint("https://us-east-1.telnyxcloudstorage.com")
                .status(CloudfsFilesystemStatus.READY)
                .updatedAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                .build()

        assertThat(cloudfListResponse.id()).contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(cloudfListResponse.createdAt())
            .contains(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
        assertThat(cloudfListResponse.name()).contains("agent-fs")
        assertThat(cloudfListResponse.recordType()).contains("cloudfs")
        assertThat(cloudfListResponse.region()).contains("us-east-1")
        assertThat(cloudfListResponse.s3Bucket()).contains("cloudfs-fs-0123456789abcdef")
        assertThat(cloudfListResponse.s3Endpoint())
            .contains("https://us-east-1.telnyxcloudstorage.com")
        assertThat(cloudfListResponse.status()).contains(CloudfsFilesystemStatus.READY)
        assertThat(cloudfListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudfListResponse =
            CloudfListResponse.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                .name("agent-fs")
                .recordType("cloudfs")
                .region("us-east-1")
                .s3Bucket("cloudfs-fs-0123456789abcdef")
                .s3Endpoint("https://us-east-1.telnyxcloudstorage.com")
                .status(CloudfsFilesystemStatus.READY)
                .updatedAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                .build()

        val roundtrippedCloudfListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudfListResponse),
                jacksonTypeRef<CloudfListResponse>(),
            )

        assertThat(roundtrippedCloudfListResponse).isEqualTo(cloudfListResponse)
    }
}
