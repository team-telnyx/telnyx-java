// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudfListPageResponseTest {

    @Test
    fun create() {
        val cloudfListPageResponse =
            CloudfListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    CloudfListPageResponse.Meta.builder()
                        .cursors(
                            CloudfListPageResponse.Meta.Cursors.builder()
                                .after("after")
                                .before("before")
                                .build()
                        )
                        .next("next")
                        .previous("previous")
                        .build()
                )
                .build()

        assertThat(cloudfListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(cloudfListPageResponse.meta())
            .contains(
                CloudfListPageResponse.Meta.builder()
                    .cursors(
                        CloudfListPageResponse.Meta.Cursors.builder()
                            .after("after")
                            .before("before")
                            .build()
                    )
                    .next("next")
                    .previous("previous")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cloudfListPageResponse =
            CloudfListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    CloudfListPageResponse.Meta.builder()
                        .cursors(
                            CloudfListPageResponse.Meta.Cursors.builder()
                                .after("after")
                                .before("before")
                                .build()
                        )
                        .next("next")
                        .previous("previous")
                        .build()
                )
                .build()

        val roundtrippedCloudfListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudfListPageResponse),
                jacksonTypeRef<CloudfListPageResponse>(),
            )

        assertThat(roundtrippedCloudfListPageResponse).isEqualTo(cloudfListPageResponse)
    }
}
