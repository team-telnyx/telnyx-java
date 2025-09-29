// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml.accounts.calls

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.texml.accounts.calls.streams.StreamStreamingSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StreamServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun streamingSidJson() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val streamServiceAsync = client.texml().accounts().calls().streams()

        val responseFuture =
            streamServiceAsync.streamingSidJson(
                StreamStreamingSidJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .streamingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(StreamStreamingSidJsonParams.Status.STOPPED)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
