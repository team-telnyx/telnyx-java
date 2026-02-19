// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.verifiednumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.verifiednumbers.actions.ActionSubmitVerificationCodeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun submitVerificationCode() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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
