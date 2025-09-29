// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentCreateResponseTest {

    @Test
    fun create() {
        val commentCreateResponse =
            CommentCreateResponse.builder()
                .data(
                    CommentCreateResponse.Data.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .body("Hi there, ....")
                        .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                        .commentRecordType(
                            CommentCreateResponse.Data.CommentRecordType.SUB_NUMBER_ORDER
                        )
                        .commenter("user@company.com")
                        .commenterType(CommentCreateResponse.Data.CommenterType.USER)
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .build()
                )
                .build()

        assertThat(commentCreateResponse.data())
            .contains(
                CommentCreateResponse.Data.builder()
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .body("Hi there, ....")
                    .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                    .commentRecordType(
                        CommentCreateResponse.Data.CommentRecordType.SUB_NUMBER_ORDER
                    )
                    .commenter("user@company.com")
                    .commenterType(CommentCreateResponse.Data.CommenterType.USER)
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentCreateResponse =
            CommentCreateResponse.builder()
                .data(
                    CommentCreateResponse.Data.builder()
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .body("Hi there, ....")
                        .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                        .commentRecordType(
                            CommentCreateResponse.Data.CommentRecordType.SUB_NUMBER_ORDER
                        )
                        .commenter("user@company.com")
                        .commenterType(CommentCreateResponse.Data.CommenterType.USER)
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
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
