// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.calls

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.accounts.calls.siprec.SiprecSiprecSidJsonParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SiprecServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun siprecSidJson() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val siprecService = client.texml().accounts().calls().siprec()

        val response =
            siprecService.siprecSidJson(
                SiprecSiprecSidJsonParams.builder()
                    .accountSid("account_sid")
                    .callSid("call_sid")
                    .siprecSid("siprec_sid")
                    .status(SiprecSiprecSidJsonParams.Status.STOPPED)
                    .build()
            )

        response.validate()
    }
}
