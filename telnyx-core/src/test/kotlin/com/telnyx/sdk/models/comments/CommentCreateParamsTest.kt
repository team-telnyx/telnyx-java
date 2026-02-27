// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.comments

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentCreateParamsTest {

    @Test
    fun create() {
        CommentCreateParams.builder()
            .comment(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CommentCreateParams.builder()
                .comment(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CommentCreateParams.builder().comment(Comment.builder().build()).build()

        val body = params._body()

        assertThat(body).isEqualTo(Comment.builder().build())
    }
}
