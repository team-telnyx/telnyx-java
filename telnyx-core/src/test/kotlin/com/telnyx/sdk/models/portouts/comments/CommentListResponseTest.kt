// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.Metadata
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentListResponseTest {

    @Test
    fun create() {
        val commentListResponse =
            CommentListResponse.builder()
                .addData(
                    CommentListResponse.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .body("This is a comment")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .recordType("portout")
                        .build()
                )
                .meta(
                    Metadata.builder()
                        .pageNumber(3.0)
                        .pageSize(1.0)
                        .totalPages(13.0)
                        .totalResults(13.0)
                        .build()
                )
                .build()

        assertThat(commentListResponse.data().getOrNull())
            .containsExactly(
                CommentListResponse.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .body("This is a comment")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .recordType("portout")
                    .build()
            )
        assertThat(commentListResponse.meta())
            .contains(
                Metadata.builder()
                    .pageNumber(3.0)
                    .pageSize(1.0)
                    .totalPages(13.0)
                    .totalResults(13.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentListResponse =
            CommentListResponse.builder()
                .addData(
                    CommentListResponse.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .body("This is a comment")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .recordType("portout")
                        .build()
                )
                .meta(
                    Metadata.builder()
                        .pageNumber(3.0)
                        .pageSize(1.0)
                        .totalPages(13.0)
                        .totalResults(13.0)
                        .build()
                )
                .build()

        val roundtrippedCommentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentListResponse),
                jacksonTypeRef<CommentListResponse>(),
            )

        assertThat(roundtrippedCommentListResponse).isEqualTo(commentListResponse)
    }
}
