// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.mobilenetworkoperators.MobileNetworkOperatorListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MobileNetworkOperatorServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val mobileNetworkOperatorServiceAsync = client.mobileNetworkOperators()

        val mobileNetworkOperatorsFuture =
            mobileNetworkOperatorServiceAsync.list(
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

        val mobileNetworkOperators = mobileNetworkOperatorsFuture.get()
        mobileNetworkOperators.validate()
    }
}
