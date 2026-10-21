// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.queues

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueListParamsTest {

    @Test
    fun create() {
        QueueListParams.builder()
            .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
            .dateCreated("DateCreated")
            .dateUpdated("DateUpdated")
            .page(0L)
            .pageSize(0L)
            .pageToken("PageToken")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            QueueListParams.builder().accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9").build()

        assertThat(params._pathParam(0)).isEqualTo("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            QueueListParams.builder()
                .accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9")
                .dateCreated("DateCreated")
                .dateUpdated("DateUpdated")
                .page(0L)
                .pageSize(0L)
                .pageToken("PageToken")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("DateCreated", "DateCreated")
                    .put("DateUpdated", "DateUpdated")
                    .put("Page", "0")
                    .put("PageSize", "0")
                    .put("PageToken", "PageToken")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            QueueListParams.builder().accountSid("f5586561-8ff0-4291-a51b-c7dfe4139ff9").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
