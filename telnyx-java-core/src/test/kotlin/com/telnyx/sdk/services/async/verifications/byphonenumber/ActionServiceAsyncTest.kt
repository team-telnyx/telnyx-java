// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.verifications.byphonenumber

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.verifications.byphonenumber.actions.ActionVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.verifications().byPhoneNumber().actions()

        val verifyVerificationCodeResponseFuture =
            actionServiceAsync.verify(
                ActionVerifyParams.builder()
                    .phoneNumber("+13035551234")
                    .code("17686")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .build()
            )

        val verifyVerificationCodeResponse = verifyVerificationCodeResponseFuture.get()
        verifyVerificationCodeResponse.validate()
    }
}
