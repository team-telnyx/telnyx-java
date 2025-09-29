// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml.accounts.calls

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.texml.accounts.calls.siprec.SiprecSiprecSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SiprecServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun siprecSidJson() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val siprecServiceAsync = client.texml().accounts().calls().siprec()

        val responseFuture =
            siprecServiceAsync.siprecSidJson(
                SiprecSiprecSidJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .siprecSid("siprec_sid")
                    .status(SiprecSiprecSidJsonParams.Status.STOPPED)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
