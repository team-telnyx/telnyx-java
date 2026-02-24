// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portabilitychecks.PortabilityCheckRunParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PortabilityCheckServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun run() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val portabilityCheckService = client.portabilityChecks()

        val response =
            portabilityCheckService.run(
                PortabilityCheckRunParams.builder()
                    .phoneNumbers(listOf("+13035550000", "+13035550001", "+13035550002"))
                    .build()
            )

        response.validate()
    }
}
