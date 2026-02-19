// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.verifications.VerificationTriggerCallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerFlashcallParams
import com.telnyx.sdk.models.verifications.VerificationTriggerSmsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerificationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verificationService = client.verifications()

        val verification = verificationService.retrieve("12ade33a-21c0-473b-b055-b3c836e1c292")

        verification.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun triggerCall() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verificationService = client.verifications()

        val createVerificationResponse =
            verificationService.triggerCall(
                VerificationTriggerCallParams.builder()
                    .phoneNumber("+13035551234")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .customCode("43612")
                    .extension("1www2WABCDw9")
                    .timeoutSecs(300L)
                    .build()
            )

        createVerificationResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun triggerFlashcall() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verificationService = client.verifications()

        val createVerificationResponse =
            verificationService.triggerFlashcall(
                VerificationTriggerFlashcallParams.builder()
                    .phoneNumber("+13035551234")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .timeoutSecs(300L)
                    .build()
            )

        createVerificationResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun triggerSms() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verificationService = client.verifications()

        val createVerificationResponse =
            verificationService.triggerSms(
                VerificationTriggerSmsParams.builder()
                    .phoneNumber("+13035551234")
                    .verifyProfileId("12ade33a-21c0-473b-b055-b3c836e1c292")
                    .customCode("43612")
                    .timeoutSecs(300L)
                    .build()
            )

        createVerificationResponse.validate()
    }
}
