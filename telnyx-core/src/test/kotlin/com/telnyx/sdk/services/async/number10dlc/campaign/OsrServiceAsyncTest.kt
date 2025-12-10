// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.campaign

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OsrServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getAttributes() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val osrServiceAsync = client.number10dlc().campaign().osr()

        val responseFuture = osrServiceAsync.getAttributes("campaignId")

        val response = responseFuture.get()
        response.validate()
    }
}
