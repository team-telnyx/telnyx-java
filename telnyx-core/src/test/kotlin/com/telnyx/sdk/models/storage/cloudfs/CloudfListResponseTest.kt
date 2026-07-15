// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.storage.cloudfs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CloudfListResponseTest {

    @Test
    fun create() {
        val cloudfListResponse =
            CloudfListResponse.builder()
                .addData(
                    CloudfListResponse.Data.builder()
                        .id("3be44fad-d34c-4884-b4b2-ef12c6133af4")
                        .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                        .name("agent-fs")
                        .recordType("cloudfs")
                        .region("us-east-1")
                        .s3Bucket("cloudfs-fs-1fe301e97d7c4edd")
                        .s3Endpoint("https://us-east-1.telnyxcloudstorage.com")
                        .status(CloudfsFilesystemStatus.READY)
                        .updatedAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                        .build()
                )
                .meta(
                    CloudfListResponse.Meta.builder()
                        .cursors(
                            CloudfListResponse.Meta.Cursors.builder()
                                .after("after")
                                .before("before")
                                .build()
                        )
                        .next("next")
                        .previous("previous")
                        .build()
                )
                .build()

        assertThat(cloudfListResponse.data().getOrNull())
            .containsExactly(
                CloudfListResponse.Data.builder()
                    .id("3be44fad-d34c-4884-b4b2-ef12c6133af4")
                    .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                    .name("agent-fs")
                    .recordType("cloudfs")
                    .region("us-east-1")
                    .s3Bucket("cloudfs-fs-1fe301e97d7c4edd")
                    .s3Endpoint("https://us-east-1.telnyxcloudstorage.com")
                    .status(CloudfsFilesystemStatus.READY)
                    .updatedAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                    .build()
            )
        assertThat(cloudfListResponse.meta())
            .contains(
                CloudfListResponse.Meta.builder()
                    .cursors(
                        CloudfListResponse.Meta.Cursors.builder()
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
        val cloudfListResponse =
            CloudfListResponse.builder()
                .addData(
                    CloudfListResponse.Data.builder()
                        .id("3be44fad-d34c-4884-b4b2-ef12c6133af4")
                        .createdAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                        .name("agent-fs")
                        .recordType("cloudfs")
                        .region("us-east-1")
                        .s3Bucket("cloudfs-fs-1fe301e97d7c4edd")
                        .s3Endpoint("https://us-east-1.telnyxcloudstorage.com")
                        .status(CloudfsFilesystemStatus.READY)
                        .updatedAt(OffsetDateTime.parse("2026-07-14T21:42:01Z"))
                        .build()
                )
                .meta(
                    CloudfListResponse.Meta.builder()
                        .cursors(
                            CloudfListResponse.Meta.Cursors.builder()
                                .after("after")
                                .before("before")
                                .build()
                        )
                        .next("next")
                        .previous("previous")
                        .build()
                )
                .build()

        val roundtrippedCloudfListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cloudfListResponse),
                jacksonTypeRef<CloudfListResponse>(),
            )

        assertThat(roundtrippedCloudfListResponse).isEqualTo(cloudfListResponse)
    }
}
