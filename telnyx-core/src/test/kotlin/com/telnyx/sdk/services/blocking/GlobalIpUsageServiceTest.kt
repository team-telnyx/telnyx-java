// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.globalipusage.GlobalIpUsageRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpUsageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val globalIpUsageService = client.globalIpUsage()

        val globalIpUsage =
            globalIpUsageService.retrieve(
                GlobalIpUsageRetrieveParams.builder()
                    .filter(
                        GlobalIpUsageRetrieveParams.Filter.builder().globalIpId("string").build()
                    )
                    .build()
            )

        globalIpUsage.validate()
    }
}
