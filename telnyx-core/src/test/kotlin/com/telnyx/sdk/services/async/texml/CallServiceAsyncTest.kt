// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texml.calls.CallCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callServiceAsync = client.texml().calls()

        val callFuture =
            callServiceAsync.create(
                CallCreateParams.builder()
                    .connectionId("1234567890")
                    .from("+13120001234")
                    .to("+13121230000")
                    .method(CallCreateParams.Method.POST)
                    .texml("<Response><Say>Hello</Say></Response>")
                    .url("https://example.com/instructions.xml")
                    .build()
            )

        val call = callFuture.get()
        call.validate()
    }
}
