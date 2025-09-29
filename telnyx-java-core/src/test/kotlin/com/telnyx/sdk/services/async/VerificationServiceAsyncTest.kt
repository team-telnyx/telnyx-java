// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.verifications.VerificationTriggerCallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerFlashcallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerSmsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VerificationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verificationServiceAsync = client.verifications()

        val verificationFuture =
            verificationServiceAsync.retrieve("12ade33a-21c0-473b-b055-b3c836e1c292")

        val verification = verificationFuture.get()
        verification.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun triggerCall() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verificationServiceAsync = client.verifications()

        val createVerificationResponseFuture =
            verificationServiceAsync.triggerCall(
                VerificationTriggerCallParams.builder()
                    .phoneNumber("+13035551234")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .customCode("43612")
                    .extension("1www2WABCDw9")
                    .timeoutSecs(300L)
                    .build()
            )

        val createVerificationResponse = createVerificationResponseFuture.get()
        createVerificationResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun triggerFlashcall() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verificationServiceAsync = client.verifications()

        val createVerificationResponseFuture =
            verificationServiceAsync.triggerFlashcall(
                VerificationTriggerFlashcallParams.builder()
                    .phoneNumber("+13035551234")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .timeoutSecs(300L)
                    .build()
            )

        val createVerificationResponse = createVerificationResponseFuture.get()
        createVerificationResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun triggerSms() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val verificationServiceAsync = client.verifications()

        val createVerificationResponseFuture =
            verificationServiceAsync.triggerSms(
                VerificationTriggerSmsParams.builder()
                    .phoneNumber("+13035551234")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .customCode("43612")
                    .timeoutSecs(300L)
                    .build()
            )

        val createVerificationResponse = createVerificationResponseFuture.get()
        createVerificationResponse.validate()
    }
}
