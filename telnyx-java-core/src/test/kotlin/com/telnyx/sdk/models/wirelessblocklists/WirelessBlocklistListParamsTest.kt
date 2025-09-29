// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistListParamsTest {

    @Test
    fun create() {
        WirelessBlocklistListParams.builder()
            .filterName("filter[name]")
            .filterType("filter[type]")
            .filterValues("filter[values]")
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WirelessBlocklistListParams.builder()
                .filterName("filter[name]")
                .filterType("filter[type]")
                .filterValues("filter[values]")
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "filter[name]")
                    .put("filter[type]", "filter[type]")
                    .put("filter[values]", "filter[values]")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WirelessBlocklistListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
