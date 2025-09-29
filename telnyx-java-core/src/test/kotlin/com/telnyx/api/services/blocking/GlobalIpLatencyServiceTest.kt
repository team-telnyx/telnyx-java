// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.globaliplatency.GlobalIpLatencyRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GlobalIpLatencyServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpLatencyService = client.globalIpLatency()

        val globalIpLatency =
            globalIpLatencyService.retrieve(
                GlobalIpLatencyRetrieveParams.builder()
                    .filter(
                        GlobalIpLatencyRetrieveParams.Filter.builder().globalIpId("string").build()
                    )
                    .build()
            )

        globalIpLatency.validate()
    }
}
