// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues.calls

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallListParamsTest {

    @Test
    fun create() {
        CallListParams.builder().queueName("queue_name").pageNumber(0L).pageSize(0L).build()
    }

    @Test
    fun pathParams() {
        val params = CallListParams.builder().queueName("queue_name").build()

        assertThat(params._pathParam(0)).isEqualTo("queue_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CallListParams.builder().queueName("queue_name").pageNumber(0L).pageSize(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "0").put("page[size]", "0").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CallListParams.builder().queueName("queue_name").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
