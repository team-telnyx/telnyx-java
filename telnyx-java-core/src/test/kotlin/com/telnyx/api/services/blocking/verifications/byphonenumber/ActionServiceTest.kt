// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.verifications.byphonenumber

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.verifications.byphonenumber.actions.ActionVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun verify() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.verifications().byPhoneNumber().actions()

        val verifyVerificationCodeResponse =
            actionService.verify(
                ActionVerifyParams.builder()
                    .phoneNumber("+13035551234")
                    .code("17686")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .build()
            )

        verifyVerificationCodeResponse.validate()
    }
}
