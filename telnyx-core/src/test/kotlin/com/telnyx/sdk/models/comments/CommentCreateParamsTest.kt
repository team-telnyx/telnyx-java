// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.comments

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentCreateParamsTest {

    @Test
    fun create() {
        CommentCreateParams.builder()
            .id("12ade33a-21c0-473b-b055-b3c836e1c292")
            .commentBody("Hi there, ....")
            .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
            .commentRecordType(CommentCreateParams.CommentRecordType.SUB_NUMBER_ORDER)
            .commenter("user@company.com")
            .commenterType(CommentCreateParams.CommenterType.USER)
            .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
            .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
            .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            CommentCreateParams.builder()
                .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                .commentBody("Hi there, ....")
                .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                .commentRecordType(CommentCreateParams.CommentRecordType.SUB_NUMBER_ORDER)
                .commenter("user@company.com")
                .commenterType(CommentCreateParams.CommenterType.USER)
                .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                .build()

        val body = params._body()

        assertThat(body.id()).contains("12ade33a-21c0-473b-b055-b3c836e1c292")
        assertThat(body.commentBody()).contains("Hi there, ....")
        assertThat(body.commentRecordId()).contains("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
        assertThat(body.commentRecordType())
            .contains(CommentCreateParams.CommentRecordType.SUB_NUMBER_ORDER)
        assertThat(body.commenter()).contains("user@company.com")
        assertThat(body.commenterType()).contains(CommentCreateParams.CommenterType.USER)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(body.readAt()).contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
        assertThat(body.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CommentCreateParams.builder().build()

        val body = params._body()
    }
}
