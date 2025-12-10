// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portingphonenumbers.PortingPhoneNumberListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PortingPhoneNumberServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portingPhoneNumberServiceAsync = client.portingPhoneNumbers()

        val portingPhoneNumbersFuture =
            portingPhoneNumberServiceAsync.list(
                PortingPhoneNumberListParams.builder()
                    .filter(
                        PortingPhoneNumberListParams.Filter.builder()
                            .portingOrderStatus(
                                PortingPhoneNumberListParams.Filter.PortingOrderStatus.IN_PROCESS
                            )
                            .build()
                    )
                    .page(PortingPhoneNumberListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val portingPhoneNumbers = portingPhoneNumbersFuture.get()
        portingPhoneNumbers.validate()
    }
}
