// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.mobilenetworkoperators.MobileNetworkOperatorListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MobileNetworkOperatorServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobileNetworkOperatorService = client.mobileNetworkOperators()

        val mobileNetworkOperators =
            mobileNetworkOperatorService.list(
                MobileNetworkOperatorListParams.builder()
                    .filter(
                        MobileNetworkOperatorListParams.Filter.builder()
                            .countryCode("US")
                            .mcc("310")
                            .mnc("410")
                            .name(
                                MobileNetworkOperatorListParams.Filter.Name.builder()
                                    .contains("T&T")
                                    .endsWith("T")
                                    .startsWith("AT")
                                    .build()
                            )
                            .networkPreferencesEnabled(true)
                            .tadig("USACG")
                            .build()
                    )
                    .page(
                        MobileNetworkOperatorListParams.Page.builder().number(1L).size(1L).build()
                    )
                    .build()
            )

        mobileNetworkOperators.validate()
    }
}
