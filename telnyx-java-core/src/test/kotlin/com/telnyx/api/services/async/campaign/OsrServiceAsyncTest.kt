// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.campaign

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
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
        val osrServiceAsync = client.campaign().osr()

        val responseFuture = osrServiceAsync.getAttributes("campaignId")

        val response = responseFuture.get()
        response.validate()
    }
}
