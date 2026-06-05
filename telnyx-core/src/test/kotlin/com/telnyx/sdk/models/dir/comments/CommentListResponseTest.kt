// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentListResponseTest {

    @Test
    fun create() {
        val commentListResponse =
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

        assertThat(commentListResponse.id()).contains("30bbd13c-1f3a-47c0-8fa6-718835917b2f")
        assertThat(commentListResponse.authorName()).isEmpty
        assertThat(commentListResponse.authorRole())
            .contains(CommentListResponse.AuthorRole.CUSTOMER)
        assertThat(commentListResponse.commentType())
            .contains(CommentListResponse.CommentType.VETTING_COMMENT)
        assertThat(commentListResponse.content())
            .contains("Please re-upload a clearer scan of the certificate.")
        assertThat(commentListResponse.createdAt())
            .contains(OffsetDateTime.parse("2026-04-27T00:42:44.305835Z"))
        assertThat(commentListResponse.entityType()).contains(CommentListResponse.EntityType.DIR)
        assertThat(commentListResponse.visibility())
            .contains(CommentListResponse.Visibility.CUSTOMER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentListResponse =
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

        val roundtrippedCommentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentListResponse),
                jacksonTypeRef<CommentListResponse>(),
            )

        assertThat(roundtrippedCommentListResponse).isEqualTo(commentListResponse)
    }
}
