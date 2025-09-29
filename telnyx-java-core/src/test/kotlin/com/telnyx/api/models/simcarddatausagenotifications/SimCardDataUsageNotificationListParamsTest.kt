// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcarddatausagenotifications

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardDataUsageNotificationListParamsTest {

    @Test
    fun create() {
        SimCardDataUsageNotificationListParams.builder()
            .filterSimCardId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SimCardDataUsageNotificationListParams.builder()
                .filterSimCardId("47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[sim_card_id]", "47a1c2b0-cc7b-4ab1-bb98-b33fb0fc61b9")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SimCardDataUsageNotificationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
