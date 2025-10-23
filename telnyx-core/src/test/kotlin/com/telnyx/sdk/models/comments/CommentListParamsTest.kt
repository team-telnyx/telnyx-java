// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.comments

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentListParamsTest {

    @Test
    fun create() {
        CommentListParams.builder()
            .filter(
                CommentListParams.Filter.builder()
                    .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                    .commentRecordType(CommentListParams.Filter.CommentRecordType.SUB_NUMBER_ORDER)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CommentListParams.builder()
                .filter(
                    CommentListParams.Filter.builder()
                        .commentRecordId("8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                        .commentRecordType(
                            CommentListParams.Filter.CommentRecordType.SUB_NUMBER_ORDER
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[comment_record_id]", "8ffb3622-7c6b-4ccc-b65f-7a3dc0099576")
                    .put("filter[comment_record_type]", "sub_number_order")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CommentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
