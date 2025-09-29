// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.networkcoverage.AvailableService
import com.telnyx.api.models.networkcoverage.NetworkCoverageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NetworkCoverageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkCoverageService = client.networkCoverage()

        val networkCoverages =
            networkCoverageService.list(
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
            )

        networkCoverages.validate()
    }
}
