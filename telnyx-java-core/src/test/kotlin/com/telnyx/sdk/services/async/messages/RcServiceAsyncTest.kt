// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messages

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messages.rcs.RcGenerateDeeplinkParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RcServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun generateDeeplink() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rcServiceAsync = client.messages().rcs()

        val responseFuture =
            rcServiceAsync.generateDeeplink(
                RcGenerateDeeplinkParams.builder()
                    .agentId("agent_id")
                    .body("body")
                    .phoneNumber("phone_number")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
