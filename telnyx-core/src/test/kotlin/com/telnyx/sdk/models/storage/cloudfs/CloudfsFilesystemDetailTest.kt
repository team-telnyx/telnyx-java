// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudfsFilesystemDetailTest {

    @Test
    fun create() {
        val cloudfsFilesystemDetail =
            CloudfsFilesystemDetail.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                .error("failed to create storage bucket")
                .metaUrl(
                    "postgres://fs_0123456789abcdef@us-east-1.telnyxcloudfs.com:5432/fs_0123456789abcdef?sslmode=require"
                )
                .name("agent-fs")
                .recordType("cloudfs")
                .region("us-east-1")
                .s3Bucket("cloudfs-fs-0123456789abcdef")
                .s3Endpoint("https://us-east-1.telnyxcloudstorage.com")
                .status(CloudfsFilesystemStatus.READY)
                .updatedAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                .build()

        assertThat(cloudfsFilesystemDetail.id()).contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(cloudfsFilesystemDetail.createdAt())
            .contains(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
        assertThat(cloudfsFilesystemDetail.error()).contains("failed to create storage bucket")
        assertThat(cloudfsFilesystemDetail.metaUrl())
            .contains(
                "postgres://fs_0123456789abcdef@us-east-1.telnyxcloudfs.com:5432/fs_0123456789abcdef?sslmode=require"
            )
        assertThat(cloudfsFilesystemDetail.name()).contains("agent-fs")
        assertThat(cloudfsFilesystemDetail.recordType()).contains("cloudfs")
        assertThat(cloudfsFilesystemDetail.region()).contains("us-east-1")
        assertThat(cloudfsFilesystemDetail.s3Bucket()).contains("cloudfs-fs-0123456789abcdef")
        assertThat(cloudfsFilesystemDetail.s3Endpoint())
            .contains("https://us-east-1.telnyxcloudstorage.com")
        assertThat(cloudfsFilesystemDetail.status()).contains(CloudfsFilesystemStatus.READY)
        assertThat(cloudfsFilesystemDetail.updatedAt())
            .contains(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudfsFilesystemDetail =
            CloudfsFilesystemDetail.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                .error("failed to create storage bucket")
                .metaUrl(
                    "postgres://fs_0123456789abcdef@us-east-1.telnyxcloudfs.com:5432/fs_0123456789abcdef?sslmode=require"
                )
                .name("agent-fs")
                .recordType("cloudfs")
                .region("us-east-1")
                .s3Bucket("cloudfs-fs-0123456789abcdef")
                .s3Endpoint("https://us-east-1.telnyxcloudstorage.com")
                .status(CloudfsFilesystemStatus.READY)
                .updatedAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                .build()

        val roundtrippedCloudfsFilesystemDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudfsFilesystemDetail),
                jacksonTypeRef<CloudfsFilesystemDetail>(),
            )

        assertThat(roundtrippedCloudfsFilesystemDetail).isEqualTo(cloudfsFilesystemDetail)
    }
}
