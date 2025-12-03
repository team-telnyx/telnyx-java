// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.virtualcrossconnectscoverage.VirtualCrossConnectsCoverageListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VirtualCrossConnectsCoverageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val virtualCrossConnectsCoverageServiceAsync = client.virtualCrossConnectsCoverage()

        val virtualCrossConnectsCoveragesFuture =
            virtualCrossConnectsCoverageServiceAsync.list(
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

        val virtualCrossConnectsCoverages = virtualCrossConnectsCoveragesFuture.get()
        virtualCrossConnectsCoverages.validate()
    }
}
