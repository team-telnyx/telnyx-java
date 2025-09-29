// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.networkcoverage.AvailableService
import com.telnyx.api.models.networkcoverage.NetworkCoverageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NetworkCoverageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkCoverageServiceAsync = client.networkCoverage()

        val networkCoveragesFuture =
            networkCoverageServiceAsync.list(
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

        val networkCoverages = networkCoveragesFuture.get()
        networkCoverages.validate()
    }
}
