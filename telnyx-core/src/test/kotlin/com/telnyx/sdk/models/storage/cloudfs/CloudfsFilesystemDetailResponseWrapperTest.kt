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
                        .id("3be44fad-d34c-4884-b4b2-ef12c6133af4")
                        .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                        .error("failed to create storage bucket")
                        .metaUrl(
                            "postgres://fs_1fe301e97d7c4edd@us-east-1.telnyxcloudfs.com:5432/fs_1fe301e97d7c4edd?sslmode=require"
                        )
                        .name("agent-fs")
                        .recordType("cloudfs")
                        .region("us-east-1")
                        .s3Bucket("cloudfs-fs-1fe301e97d7c4edd")
                        .s3Endpoint("https://us-east-1.telnyxcloudstorage.com")
                        .status(CloudfsFilesystemStatus.READY)
                        .updatedAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                        .build()
                )
                .build()

        assertThat(cloudfsFilesystemDetailResponseWrapper.data())
            .contains(
                CloudfsFilesystemDetailResponseWrapper.Data.builder()
                    .id("3be44fad-d34c-4884-b4b2-ef12c6133af4")
                    .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                    .error("failed to create storage bucket")
                    .metaUrl(
                        "postgres://fs_1fe301e97d7c4edd@us-east-1.telnyxcloudfs.com:5432/fs_1fe301e97d7c4edd?sslmode=require"
                    )
                    .name("agent-fs")
                    .recordType("cloudfs")
                    .region("us-east-1")
                    .s3Bucket("cloudfs-fs-1fe301e97d7c4edd")
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
                        .id("3be44fad-d34c-4884-b4b2-ef12c6133af4")
                        .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                        .error("failed to create storage bucket")
                        .metaUrl(
                            "postgres://fs_1fe301e97d7c4edd@us-east-1.telnyxcloudfs.com:5432/fs_1fe301e97d7c4edd?sslmode=require"
                        )
                        .name("agent-fs")
                        .recordType("cloudfs")
                        .region("us-east-1")
                        .s3Bucket("cloudfs-fs-1fe301e97d7c4edd")
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
