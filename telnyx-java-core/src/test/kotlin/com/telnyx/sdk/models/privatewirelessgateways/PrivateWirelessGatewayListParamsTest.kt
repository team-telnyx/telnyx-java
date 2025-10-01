// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateWirelessGatewayListParamsTest {

    @Test
    fun create() {
        PrivateWirelessGatewayListParams.builder()
            .filterCreatedAt("filter[created_at]")
            .filterIpRange("filter[ip_range]")
            .filterName("filter[name]")
            .filterRegionCode("filter[region_code]")
            .filterUpdatedAt("filter[updated_at]")
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PrivateWirelessGatewayListParams.builder()
                .filterCreatedAt("filter[created_at]")
                .filterIpRange("filter[ip_range]")
                .filterName("filter[name]")
                .filterRegionCode("filter[region_code]")
                .filterUpdatedAt("filter[updated_at]")
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at]", "filter[created_at]")
                    .put("filter[ip_range]", "filter[ip_range]")
                    .put("filter[name]", "filter[name]")
                    .put("filter[region_code]", "filter[region_code]")
                    .put("filter[updated_at]", "filter[updated_at]")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PrivateWirelessGatewayListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
