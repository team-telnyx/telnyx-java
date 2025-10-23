// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.globaliplatency.GlobalIpLatencyRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GlobalIpLatencyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpLatencyServiceAsync = client.globalIpLatency()

        val globalIpLatencyFuture =
            globalIpLatencyServiceAsync.retrieve(
                GlobalIpLatencyRetrieveParams.builder()
                    .filter(
                        GlobalIpLatencyRetrieveParams.Filter.builder().globalIpId("string").build()
                    )
                    .build()
            )

        val globalIpLatency = globalIpLatencyFuture.get()
        globalIpLatency.validate()
    }
}
