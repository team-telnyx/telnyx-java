// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerifyEmailServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifyEmailService = client.dir().verifyEmail()

        val emailVerificationStatusWrapped =
            verifyEmailService.create("16635d38-75a6-4481-82e8-69af60e05011")

        emailVerificationStatusWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifyEmailService = client.dir().verifyEmail()

        val emailVerificationStatusWrapped =
            verifyEmailService.list("16635d38-75a6-4481-82e8-69af60e05011")

        emailVerificationStatusWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun confirm() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifyEmailService = client.dir().verifyEmail()

        val emailVerificationStatusWrapped =
            verifyEmailService.confirm(
                VerifyEmailConfirmParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .code("482915")
                    .build()
            )

        emailVerificationStatusWrapped.validate()
    }
}
