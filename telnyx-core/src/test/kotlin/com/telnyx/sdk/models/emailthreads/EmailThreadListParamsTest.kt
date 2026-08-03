// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailthreads

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailThreadListParamsTest {

    @Test
    fun create() {
        EmailThreadListParams.builder()
            .addFilterInboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filterLabel("filter[label]")
            .pageAfter("page[after]")
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmailThreadListParams.builder()
                .addFilterInboxId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filterLabel("filter[label]")
                .pageAfter("page[after]")
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "filter[inbox_id]",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .put("filter[label]", "filter[label]")
                    .put("page[after]", "page[after]")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailThreadListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
