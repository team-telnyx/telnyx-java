// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.verifications

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.verifications.actions.ActionVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.verifications().actions()

        val verifyVerificationCodeResponse =
            actionService.verify(
                ActionVerifyParams.builder()
                    .verificationId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .code("17686")
                    .status(ActionVerifyParams.Status.ACCEPTED)
                    .build()
            )

        verifyVerificationCodeResponse.validate()
    }
}
