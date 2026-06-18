// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueueListParamsTest {

    @Test
    fun create() {
        QueueListParams.builder().pageNumber(1L).pageSize(1L).build()
    }

    @Test
    fun queryParams() {
        val params = QueueListParams.builder().pageNumber(1L).pageSize(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = QueueListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
