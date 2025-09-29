// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.portingphonenumbers.PortingPhoneNumberListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PortingPhoneNumberServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portingPhoneNumberService = client.portingPhoneNumbers()

        val portingPhoneNumbers =
            portingPhoneNumberService.list(
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

        portingPhoneNumbers.validate()
    }
}
