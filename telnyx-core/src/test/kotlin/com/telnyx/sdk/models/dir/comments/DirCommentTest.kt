// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirCommentTest {

    @Test
    fun create() {
        val dirComment =
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

        assertThat(dirComment.id()).contains("30bbd13c-1f3a-47c0-8fa6-718835917b2f")
        assertThat(dirComment.authorName()).isEmpty
        assertThat(dirComment.authorRole()).contains(DirComment.AuthorRole.CUSTOMER)
        assertThat(dirComment.commentType()).contains(CommentType.VETTING_COMMENT)
        assertThat(dirComment.content())
            .contains("Please re-upload a clearer scan of the certificate.")
        assertThat(dirComment.createdAt())
            .contains(OffsetDateTime.parse("2026-04-27T00:42:44.305835Z"))
        assertThat(dirComment.entityType()).contains(DirComment.EntityType.DIR)
        assertThat(dirComment.visibility()).contains(DirComment.Visibility.CUSTOMER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dirComment =
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

        val roundtrippedDirComment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dirComment),
                jacksonTypeRef<DirComment>(),
            )

        assertThat(roundtrippedDirComment).isEqualTo(dirComment)
    }
}
