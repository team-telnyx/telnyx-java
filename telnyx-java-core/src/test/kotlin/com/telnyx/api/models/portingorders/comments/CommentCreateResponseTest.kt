// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.comments

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
                        .id("f1486bae-f067-460c-ad43-73a92848f902")
                        .body("Great experience so far")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType("porting_comment")
                        .userType(CommentCreateResponse.Data.UserType.USER)
                        .build()
                )
                .build()

        assertThat(commentCreateResponse.data())
            .contains(
                CommentCreateResponse.Data.builder()
                    .id("f1486bae-f067-460c-ad43-73a92848f902")
                    .body("Great experience so far")
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                    .recordType("porting_comment")
                    .userType(CommentCreateResponse.Data.UserType.USER)
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
                        .id("f1486bae-f067-460c-ad43-73a92848f902")
                        .body("Great experience so far")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType("porting_comment")
                        .userType(CommentCreateResponse.Data.UserType.USER)
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
