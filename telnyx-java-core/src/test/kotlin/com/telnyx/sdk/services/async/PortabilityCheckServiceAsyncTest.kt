// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portabilitychecks.PortabilityCheckRunParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PortabilityCheckServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun run() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portabilityCheckServiceAsync = client.portabilityChecks()

        val responseFuture =
            portabilityCheckServiceAsync.run(
                PortabilityCheckRunParams.builder()
                    .phoneNumbers(listOf("+13035550000", "+13035550001", "+13035550002"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
