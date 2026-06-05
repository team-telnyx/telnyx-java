// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dir.comments

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentListParamsTest {

    @Test
    fun create() {
        CommentListParams.builder()
            .dirId("16635d38-75a6-4481-82e8-69af60e05011")
            .commentType(CommentListParams.CommentType.VETTING_COMMENT)
            .pageNumber(1L)
            .pageSize(20L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommentListParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()

        assertThat(params._pathParam(0)).isEqualTo("16635d38-75a6-4481-82e8-69af60e05011")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CommentListParams.builder()
                .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                .commentType(CommentListParams.CommentType.VETTING_COMMENT)
                .pageNumber(1L)
                .pageSize(20L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("comment_type", "vetting_comment")
                    .put("page[number]", "1")
                    .put("page[size]", "20")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CommentListParams.builder().dirId("16635d38-75a6-4481-82e8-69af60e05011").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
