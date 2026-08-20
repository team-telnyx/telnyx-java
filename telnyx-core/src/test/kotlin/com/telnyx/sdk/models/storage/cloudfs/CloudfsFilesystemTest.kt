// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudfsFilesystemTest {

    @Test
    fun create() {
        val cloudfsFilesystem =
            CloudfsFilesystem.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                .metaToken("cloudfs_tok_0123456789abcdef0123456789abcdef")
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

        assertThat(cloudfsFilesystem.id()).contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(cloudfsFilesystem.createdAt())
            .contains(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
        assertThat(cloudfsFilesystem.metaToken())
            .contains("cloudfs_tok_0123456789abcdef0123456789abcdef")
        assertThat(cloudfsFilesystem.metaUrl())
            .contains(
                "postgres://fs_0123456789abcdef@us-east-1.telnyxcloudfs.com:5432/fs_0123456789abcdef?sslmode=require"
            )
        assertThat(cloudfsFilesystem.name()).contains("agent-fs")
        assertThat(cloudfsFilesystem.recordType()).contains("cloudfs")
        assertThat(cloudfsFilesystem.region()).contains("us-east-1")
        assertThat(cloudfsFilesystem.s3Bucket()).contains("cloudfs-fs-0123456789abcdef")
        assertThat(cloudfsFilesystem.s3Endpoint())
            .contains("https://us-east-1.telnyxcloudstorage.com")
        assertThat(cloudfsFilesystem.status()).contains(CloudfsFilesystemStatus.READY)
        assertThat(cloudfsFilesystem.updatedAt())
            .contains(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudfsFilesystem =
            CloudfsFilesystem.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                .metaToken("cloudfs_tok_0123456789abcdef0123456789abcdef")
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

        val roundtrippedCloudfsFilesystem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudfsFilesystem),
                jacksonTypeRef<CloudfsFilesystem>(),
            )

        assertThat(roundtrippedCloudfsFilesystem).isEqualTo(cloudfsFilesystem)
    }
}
