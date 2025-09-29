// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.globalipusage.GlobalIpUsageRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GlobalIpUsageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val globalIpUsageServiceAsync = client.globalIpUsage()

        val globalIpUsageFuture =
            globalIpUsageServiceAsync.retrieve(
                GlobalIpUsageRetrieveParams.builder()
                    .filter(
                        GlobalIpUsageRetrieveParams.Filter.builder().globalIpId("string").build()
                    )
                    .build()
            )

        val globalIpUsage = globalIpUsageFuture.get()
        globalIpUsage.validate()
    }
}
