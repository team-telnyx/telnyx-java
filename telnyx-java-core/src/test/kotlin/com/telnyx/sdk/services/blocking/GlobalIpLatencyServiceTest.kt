// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.globaliplatency.GlobalIpLatencyRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpLatencyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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
