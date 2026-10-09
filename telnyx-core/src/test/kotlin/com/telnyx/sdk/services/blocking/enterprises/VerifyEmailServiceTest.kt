// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.enterprises

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.enterprises.verifyemail.VerifyEmailConfirmParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerifyEmailServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifyEmailService = client.enterprises().verifyEmail()

        val enterpriseEmailVerificationStatusWrapped =
            verifyEmailService.create("4a6192a4-573d-446d-b3ce-aff9117272a6")

        enterpriseEmailVerificationStatusWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun confirm() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifyEmailService = client.enterprises().verifyEmail()

        val enterpriseEmailVerificationStatusWrapped =
            verifyEmailService.confirm(
                VerifyEmailConfirmParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .code("482915")
                    .build()
            )

        enterpriseEmailVerificationStatusWrapped.validate()
    }
}
