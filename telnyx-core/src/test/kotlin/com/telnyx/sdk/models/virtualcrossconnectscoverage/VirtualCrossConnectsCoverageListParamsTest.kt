// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnectscoverage

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectsCoverageListParamsTest {

    @Test
    fun create() {
        VirtualCrossConnectsCoverageListParams.builder()
            .filter(
                VirtualCrossConnectsCoverageListParams.Filter.builder()
                    .cloudProvider(VirtualCrossConnectsCoverageListParams.Filter.CloudProvider.AWS)
                    .cloudProviderRegion("us-east-1")
                    .locationCode("silicon_valley-ca")
                    .locationPop("SV1")
                    .locationRegion("AMER")
                    .locationSite("SJC")
                    .build()
            )
            .filters(
                VirtualCrossConnectsCoverageListParams.Filters.builder()
                    .availableBandwidth(0L)
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VirtualCrossConnectsCoverageListParams.builder()
                .filter(
                    VirtualCrossConnectsCoverageListParams.Filter.builder()
                        .cloudProvider(
                            VirtualCrossConnectsCoverageListParams.Filter.CloudProvider.AWS
                        )
                        .cloudProviderRegion("us-east-1")
                        .locationCode("silicon_valley-ca")
                        .locationPop("SV1")
                        .locationRegion("AMER")
                        .locationSite("SJC")
                        .build()
                )
                .filters(
                    VirtualCrossConnectsCoverageListParams.Filters.builder()
                        .availableBandwidth(0L)
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[cloud_provider]", "aws")
                    .put("filter[cloud_provider_region]", "us-east-1")
                    .put("filter[location.code]", "silicon_valley-ca")
                    .put("filter[location.pop]", "SV1")
                    .put("filter[location.region]", "AMER")
                    .put("filter[location.site]", "SJC")
                    .put("filters[available_bandwidth]", "0")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VirtualCrossConnectsCoverageListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
