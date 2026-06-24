// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentCreateResponseTest {

    @Test
    fun create() {
        val commentCreateResponse =
            CommentCreateResponse.builder()
                .data(
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
                .build()

        assertThat(commentCreateResponse.data())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentCreateResponse =
            CommentCreateResponse.builder()
                .data(
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
                .build()

        val roundtrippedCommentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentCreateResponse),
                jacksonTypeRef<CommentCreateResponse>(),
            )

        assertThat(roundtrippedCommentCreateResponse).isEqualTo(commentCreateResponse)
    }
}
