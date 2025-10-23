// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messages

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messages.rcs.RcGenerateDeeplinkParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RcServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun generateDeeplink() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rcService = client.messages().rcs()

        val response =
            rcService.generateDeeplink(
                RcGenerateDeeplinkParams.builder()
                    .agentId("agent_id")
                    .body("body")
                    .phoneNumber("phone_number")
                    .build()
            )

        response.validate()
    }
}
