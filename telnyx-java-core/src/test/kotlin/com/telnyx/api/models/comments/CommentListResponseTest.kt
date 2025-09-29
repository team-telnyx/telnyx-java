// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
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
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .body("Hi there, ....")
                        .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                        .commentRecordType(
                            CommentListResponse.Data.CommentRecordType.SUB_NUMBER_ORDER
                        )
                        .commenter("user@company.com")
                        .commenterType(CommentListResponse.Data.CommenterType.USER)
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
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
                    .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .body("Hi there, ....")
                    .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                    .commentRecordType(CommentListResponse.Data.CommentRecordType.SUB_NUMBER_ORDER)
                    .commenter("user@company.com")
                    .commenterType(CommentListResponse.Data.CommenterType.USER)
                    .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                    .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
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
                        .id("12ade33a-21c0-473b-b055-b3c836e1c292")
                        .body("Hi there, ....")
                        .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                        .commentRecordType(
                            CommentListResponse.Data.CommentRecordType.SUB_NUMBER_ORDER
                        )
                        .commenter("user@company.com")
                        .commenterType(CommentListResponse.Data.CommenterType.USER)
                        .createdAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .readAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
                        .updatedAt(OffsetDateTime.parse("2018-01-01T00:00:00.000000Z"))
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
