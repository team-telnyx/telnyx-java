// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardListWirelessConnectivityLogsParamsTest {

    @Test
    fun create() {
        SimCardListWirelessConnectivityLogsParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SimCardListWirelessConnectivityLogsParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SimCardListWirelessConnectivityLogsParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SimCardListWirelessConnectivityLogsParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
