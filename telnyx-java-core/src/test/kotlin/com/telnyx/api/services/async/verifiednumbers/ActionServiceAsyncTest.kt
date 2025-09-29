// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.verifiednumbers

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.verifiednumbers.actions.ActionSubmitVerificationCodeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun submitVerificationCode() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
