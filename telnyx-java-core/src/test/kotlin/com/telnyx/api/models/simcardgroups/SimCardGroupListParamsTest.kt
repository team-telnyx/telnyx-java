// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardgroups

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGroupListParamsTest {

    @Test
    fun create() {
        SimCardGroupListParams.builder()
            .filterName("My Test Group")
            .filterPrivateWirelessGatewayId("7606c6d3-ff7c-49c1-943d-68879e9d584d")
            .filterWirelessBlocklistId("0f3f490e-c4d3-4cf5-838a-9970f10ee259")
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SimCardGroupListParams.builder()
                .filterName("My Test Group")
                .filterPrivateWirelessGatewayId("7606c6d3-ff7c-49c1-943d-68879e9d584d")
                .filterWirelessBlocklistId("0f3f490e-c4d3-4cf5-838a-9970f10ee259")
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "My Test Group")
                    .put(
                        "filter[private_wireless_gateway_id]",
                        "7606c6d3-ff7c-49c1-943d-68879e9d584d",
                    )
                    .put("filter[wireless_blocklist_id]", "0f3f490e-c4d3-4cf5-838a-9970f10ee259")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SimCardGroupListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
