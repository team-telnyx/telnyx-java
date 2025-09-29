// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.verifiednumbers

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.verifiednumbers.actions.ActionSubmitVerificationCodeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun submitVerificationCode() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.verifiedNumbers().actions()

        val verifiedNumberDataWrapper =
            actionService.submitVerificationCode(
                ActionSubmitVerificationCodeParams.builder()
                    .phoneNumber("+15551234567")
                    .verificationCode("123456")
                    .build()
            )

        verifiedNumberDataWrapper.validate()
    }
}
