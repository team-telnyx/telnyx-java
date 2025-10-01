// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentListResponseTest {

    @Test
    fun create() {
        val commentListResponse =
            CommentListResponse.builder()
                .addData(
                    CommentListResponse.Data.builder()
                        .id("f1486bae-f067-460c-ad43-73a92848f902")
                        .body("Great experience so far")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType("porting_comment")
                        .userType(CommentListResponse.Data.UserType.USER)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(commentListResponse.data().getOrNull())
            .containsExactly(
                CommentListResponse.Data.builder()
                    .id("f1486bae-f067-460c-ad43-73a92848f902")
                    .body("Great experience so far")
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                    .recordType("porting_comment")
                    .userType(CommentListResponse.Data.UserType.USER)
                    .build()
            )
        assertThat(commentListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commentListResponse =
            CommentListResponse.builder()
                .addData(
                    CommentListResponse.Data.builder()
                        .id("f1486bae-f067-460c-ad43-73a92848f902")
                        .body("Great experience so far")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                        .recordType("porting_comment")
                        .userType(CommentListResponse.Data.UserType.USER)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedCommentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commentListResponse),
                jacksonTypeRef<CommentListResponse>(),
            )

        assertThat(roundtrippedCommentListResponse).isEqualTo(commentListResponse)
    }
}
