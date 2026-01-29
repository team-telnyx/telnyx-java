// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkcoverage

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkCoverageListParamsTest {

    @Test
    fun create() {
        NetworkCoverageListParams.builder()
            .filter(
                NetworkCoverageListParams.Filter.builder()
                    .locationCode("silicon_valley-ca")
                    .locationPop("SV1")
                    .locationRegion("AMER")
                    .locationSite("SJC")
                    .build()
            )
            .filters(
                NetworkCoverageListParams.Filters.builder()
                    .availableServices(AvailableService.CLOUD_VPN)
                    .build()
            )
            .page(NetworkCoverageListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NetworkCoverageListParams.builder()
                .filter(
                    NetworkCoverageListParams.Filter.builder()
                        .locationCode("silicon_valley-ca")
                        .locationPop("SV1")
                        .locationRegion("AMER")
                        .locationSite("SJC")
                        .build()
                )
                .filters(
                    NetworkCoverageListParams.Filters.builder()
                        .availableServices(AvailableService.CLOUD_VPN)
                        .build()
                )
                .page(NetworkCoverageListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[location.code]", "silicon_valley-ca")
                    .put("filter[location.pop]", "SV1")
                    .put("filter[location.region]", "AMER")
                    .put("filter[location.site]", "SJC")
                    .put("filters[available_services]", "cloud_vpn")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NetworkCoverageListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
