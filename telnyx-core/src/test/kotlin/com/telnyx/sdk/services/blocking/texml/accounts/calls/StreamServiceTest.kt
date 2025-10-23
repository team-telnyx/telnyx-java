// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.calls

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.accounts.calls.streams.StreamStreamingSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StreamServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun streamingSidJson() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val streamService = client.texml().accounts().calls().streams()

        val response =
            streamService.streamingSidJson(
                StreamStreamingSidJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .streamingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(StreamStreamingSidJsonParams.Status.STOPPED)
                    .build()
            )

        response.validate()
    }
}
