// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.calls.CallCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callService = client.texml().calls()

        val call =
            callService.create(
                CallCreateParams.builder()
                    .connectionId("1234567890")
                    .from("+13120001234")
                    .to("+13121230000")
                    .method(CallCreateParams.Method.POST)
                    .texml("<Response><Say>Hello</Say></Response>")
                    .url("https://example.com/instructions.xml")
                    .build()
            )

        call.validate()
    }
}
