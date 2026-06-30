// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentListPageResponseTest {

    @Test
    fun create() {
        val commentListPageResponse =
            CommentListPageResponse.builder()
                .addData(
                    CommentListResponse.builder()
                        .id("30bbd13c-1f3a-47c0-8fa6-718835917b2f")
                        .authorName(null)
                        .authorRole(CommentListResponse.AuthorRole.CUSTOMER)
                        .commentType(CommentListResponse.CommentType.VETTING_COMMENT)
                        .content("Please re-upload a clearer scan of the certificate.")
                        .createdAt(OffsetDateTime.parse("2026-04-27T00:42:44.305835Z"))
                        .entityType(CommentListResponse.EntityType.DIR)
                        .visibility(CommentListResponse.Visibility.CUSTOMER)
                        .build()
                )
                .meta(
                    CommentListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(commentListPageResponse.data())
            .containsExactly(
                CommentListResponse.builder()
                    .id("30bbd13c-1f3a-47c0-8fa6-718835917b2f")
                    .authorName(null)
                    .authorRole(CommentListResponse.AuthorRole.CUSTOMER)
                    .commentType(CommentListResponse.CommentType.VETTING_COMMENT)
                    .content("Please re-upload a clearer scan of the certificate.")
                    .createdAt(OffsetDateTime.parse("2026-04-27T00:42:44.305835Z"))
                    .entityType(CommentListResponse.EntityType.DIR)
                    .visibility(CommentListResponse.Visibility.CUSTOMER)
                    .build()
            )
        assertThat(commentListPageResponse.meta())
            .isEqualTo(
                CommentListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(42L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentListPageResponse =
            CommentListPageResponse.builder()
                .addData(
                    CommentListResponse.builder()
                        .id("30bbd13c-1f3a-47c0-8fa6-718835917b2f")
                        .authorName(null)
                        .authorRole(CommentListResponse.AuthorRole.CUSTOMER)
                        .commentType(CommentListResponse.CommentType.VETTING_COMMENT)
                        .content("Please re-upload a clearer scan of the certificate.")
                        .createdAt(OffsetDateTime.parse("2026-04-27T00:42:44.305835Z"))
                        .entityType(CommentListResponse.EntityType.DIR)
                        .visibility(CommentListResponse.Visibility.CUSTOMER)
                        .build()
                )
                .meta(
                    CommentListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedCommentListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentListPageResponse),
                jacksonTypeRef<CommentListPageResponse>(),
            )

        assertThat(roundtrippedCommentListPageResponse).isEqualTo(commentListPageResponse)
    }
}
