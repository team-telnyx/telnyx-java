// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.verifiednumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.verifiednumbers.actions.ActionSubmitVerificationCodeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun submitVerificationCode() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.verifiedNumbers().actions()

        val verifiedNumberDataWrapperFuture =
            actionServiceAsync.submitVerificationCode(
                ActionSubmitVerificationCodeParams.builder()
                    .phoneNumber("+15551234567")
                    .verificationCode("123456")
                    .build()
            )

        val verifiedNumberDataWrapper = verifiedNumberDataWrapperFuture.get()
        verifiedNumberDataWrapper.validate()
    }
}
