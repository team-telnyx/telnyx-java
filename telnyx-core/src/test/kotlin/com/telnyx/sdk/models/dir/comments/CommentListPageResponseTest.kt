// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.callreasons.BrandedCallingPaginationMeta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentListPageResponseTest {

    @Test
    fun create() {
        val commentListPageResponse =
            CommentListPageResponse.builder()
                .addData(
                    DirComment.builder()
                        .id("30bbd13c-1f3a-47c0-8fa6-718835917b2f")
                        .authorName(null)
                        .authorRole(DirComment.AuthorRole.CUSTOMER)
                        .commentType(CommentType.VETTING_COMMENT)
                        .content("Please re-upload a clearer scan of the certificate.")
                        .createdAt(OffsetDateTime.parse("2026-04-27T00:42:44.305835Z"))
                        .entityType(DirComment.EntityType.DIR)
                        .visibility(DirComment.Visibility.CUSTOMER)
                        .build()
                )
                .meta(
                    BrandedCallingPaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(commentListPageResponse.data())
            .containsExactly(
                DirComment.builder()
                    .id("30bbd13c-1f3a-47c0-8fa6-718835917b2f")
                    .authorName(null)
                    .authorRole(DirComment.AuthorRole.CUSTOMER)
                    .commentType(CommentType.VETTING_COMMENT)
                    .content("Please re-upload a clearer scan of the certificate.")
                    .createdAt(OffsetDateTime.parse("2026-04-27T00:42:44.305835Z"))
                    .entityType(DirComment.EntityType.DIR)
                    .visibility(DirComment.Visibility.CUSTOMER)
                    .build()
            )
        assertThat(commentListPageResponse.meta())
            .isEqualTo(
                BrandedCallingPaginationMeta.builder()
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
                    DirComment.builder()
                        .id("30bbd13c-1f3a-47c0-8fa6-718835917b2f")
                        .authorName(null)
                        .authorRole(DirComment.AuthorRole.CUSTOMER)
                        .commentType(CommentType.VETTING_COMMENT)
                        .content("Please re-upload a clearer scan of the certificate.")
                        .createdAt(OffsetDateTime.parse("2026-04-27T00:42:44.305835Z"))
                        .entityType(DirComment.EntityType.DIR)
                        .visibility(DirComment.Visibility.CUSTOMER)
                        .build()
                )
                .meta(
                    BrandedCallingPaginationMeta.builder()
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
