// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentTest {

    @Test
    fun create() {
        val comment =
            Comment.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .commentBody("Hi there, ....")
                .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                .commentRecordType(Comment.CommentRecordType.SUB_NUMBER_ORDER)
                .commenter("user@company.com")
                .commenterType(Comment.CommenterType.USER)
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        assertThat(comment.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(comment.commentBody()).contains("Hi there, ....")
        assertThat(comment.commentRecordId()).contains("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
        assertThat(comment.commentRecordType()).contains(Comment.CommentRecordType.SUB_NUMBER_ORDER)
        assertThat(comment.commenter()).contains("user@company.com")
        assertThat(comment.commenterType()).contains(Comment.CommenterType.USER)
        assertThat(comment.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(comment.readAt()).contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(comment.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val comment =
            Comment.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .commentBody("Hi there, ....")
                .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                .commentRecordType(Comment.CommentRecordType.SUB_NUMBER_ORDER)
                .commenter("user@company.com")
                .commenterType(Comment.CommenterType.USER)
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        val roundtrippedComment =
            jsonMapper.readValue(jsonMapper.writeValueAsString(comment), jacksonTypeRef<Comment>())

        assertThat(roundtrippedComment).isEqualTo(comment)
    }
}
