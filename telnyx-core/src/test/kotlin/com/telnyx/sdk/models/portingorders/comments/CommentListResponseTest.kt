// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.comments

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
                .id("f1486bae-f067-460c-ad43-73a92848f902")
                .body("Great experience so far")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_comment")
                .userType(CommentListResponse.UserType.USER)
                .build()

        assertThat(commentListResponse.id()).contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(commentListResponse.body()).contains("Great experience so far")
        assertThat(commentListResponse.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
        assertThat(commentListResponse.portingOrderId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(commentListResponse.recordType()).contains("porting_comment")
        assertThat(commentListResponse.userType()).contains(CommentListResponse.UserType.USER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentListResponse =
            CommentListResponse.builder()
                .id("f1486bae-f067-460c-ad43-73a92848f902")
                .body("Great experience so far")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_comment")
                .userType(CommentListResponse.UserType.USER)
                .build()

        val roundtrippedCommentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentListResponse),
                jacksonTypeRef<CommentListResponse>(),
            )

        assertThat(roundtrippedCommentListResponse).isEqualTo(commentListResponse)
    }
}
