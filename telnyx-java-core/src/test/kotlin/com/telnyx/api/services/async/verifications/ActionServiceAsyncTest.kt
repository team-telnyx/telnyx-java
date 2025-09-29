// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.verifications

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.verifications.actions.ActionVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun verify() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionServiceAsync = client.verifications().actions()

        val verifyVerificationCodeResponseFuture =
            actionServiceAsync.verify(
                ActionVerifyParams.builder()
                    .verificationId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .code("17686")
                    .status(ActionVerifyParams.Status.ACCEPTED)
                    .build()
            )

        val verifyVerificationCodeResponse = verifyVerificationCodeResponseFuture.get()
        verifyVerificationCodeResponse.validate()
    }
}
