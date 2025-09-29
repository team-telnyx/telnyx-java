// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VirtualCrossConnectsCoverageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val virtualCrossConnectsCoverageService = client.virtualCrossConnectsCoverage()

        val virtualCrossConnectsCoverages =
            virtualCrossConnectsCoverageService.list(
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
                    .page(
                        VirtualCrossConnectsCoverageListParams.Page.builder()
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .build()
            )

        virtualCrossConnectsCoverages.validate()
    }
}
