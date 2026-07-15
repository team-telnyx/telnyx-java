// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudfsFilesystemDetailResponseWrapperTest {

    @Test
    fun create() {
        val cloudfsFilesystemDetailResponseWrapper =
            CloudfsFilesystemDetailResponseWrapper.builder()
                .data(
                    CloudfsFilesystemDetailResponseWrapper.Data.builder()
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
                )
                .build()

        assertThat(cloudfsFilesystemDetailResponseWrapper.data())
            .contains(
                CloudfsFilesystemDetailResponseWrapper.Data.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudfsFilesystemDetailResponseWrapper =
            CloudfsFilesystemDetailResponseWrapper.builder()
                .data(
                    CloudfsFilesystemDetailResponseWrapper.Data.builder()
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
                )
                .build()

        val roundtrippedCloudfsFilesystemDetailResponseWrapper =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudfsFilesystemDetailResponseWrapper),
                jacksonTypeRef<CloudfsFilesystemDetailResponseWrapper>(),
            )

        assertThat(roundtrippedCloudfsFilesystemDetailResponseWrapper)
            .isEqualTo(cloudfsFilesystemDetailResponseWrapper)
    }
}
