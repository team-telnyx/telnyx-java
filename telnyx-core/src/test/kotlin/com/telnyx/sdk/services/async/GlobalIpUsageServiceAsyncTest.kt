// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.globalipusage.GlobalIpUsageRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpUsageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
