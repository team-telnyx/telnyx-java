// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations.insightgroups

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightGroupRetrieveInsightGroupsParamsTest {

    @Test
    fun create() {
        InsightGroupRetrieveInsightGroupsParams.builder()
            .page(
                InsightGroupRetrieveInsightGroupsParams.Page.builder().number(1L).size(1L).build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InsightGroupRetrieveInsightGroupsParams.builder()
                .page(
                    InsightGroupRetrieveInsightGroupsParams.Page.builder()
                        .number(1L)
                        .size(1L)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InsightGroupRetrieveInsightGroupsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
