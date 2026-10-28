// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkroutes

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkRouteListParamsTest {

    @Test
    fun create() {
        NetworkRouteListParams.builder()
            .filter(
                NetworkRouteListParams.Filter.builder()
                    .networkId("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                    .cidr("10.20.0.0/16")
                    .nextHopType(NetworkRouteListParams.Filter.NextHopType.TUNNEL)
                    .origin(NetworkRouteListParams.Filter.Origin.STATIC)
                    .status(NetworkRouteListParams.Filter.Status.ACTIVE)
                    .build()
            )
            .page(NetworkRouteListParams.Page.builder().after("after").limit(1L).build())
            .sort(NetworkRouteListParams.Sort.CREATED_AT_DESC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NetworkRouteListParams.builder()
                .filter(
                    NetworkRouteListParams.Filter.builder()
                        .networkId("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                        .cidr("10.20.0.0/16")
                        .nextHopType(NetworkRouteListParams.Filter.NextHopType.TUNNEL)
                        .origin(NetworkRouteListParams.Filter.Origin.STATIC)
                        .status(NetworkRouteListParams.Filter.Status.ACTIVE)
                        .build()
                )
                .page(NetworkRouteListParams.Page.builder().after("after").limit(1L).build())
                .sort(NetworkRouteListParams.Sort.CREATED_AT_DESC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[network_id]", "91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                    .put("filter[cidr]", "10.20.0.0/16")
                    .put("filter[next_hop.type]", "tunnel")
                    .put("filter[origin]", "static")
                    .put("filter[status]", "active")
                    .put("page[after]", "after")
                    .put("page[limit]", "1")
                    .put("sort", "-created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            NetworkRouteListParams.builder()
                .filter(
                    NetworkRouteListParams.Filter.builder()
                        .networkId("91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[network_id]", "91446ee3-5b1c-4f0e-8d2a-6c7e9b0a1f24")
                    .build()
            )
    }
}
