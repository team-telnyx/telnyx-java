// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentCreateResponseTest {

    @Test
    fun create() {
        val commentCreateResponse =
            CommentCreateResponse.builder()
                .data(
                    CommentCreateResponse.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .body("This is a comment")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .recordType("portout")
                        .build()
                )
                .build()

        assertThat(commentCreateResponse.data())
            .contains(
                CommentCreateResponse.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .body("This is a comment")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .recordType("portout")
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
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .body("This is a comment")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .recordType("portout")
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
