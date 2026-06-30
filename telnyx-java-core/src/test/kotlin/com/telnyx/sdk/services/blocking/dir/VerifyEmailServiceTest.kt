// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.dir

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmCodeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerifyEmailServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun confirmCode() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifyEmailService = client.dir().verifyEmail()

        val response =
            verifyEmailService.confirmCode(
                VerifyEmailConfirmCodeParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .code("482915")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendCode() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifyEmailService = client.dir().verifyEmail()

        val response = verifyEmailService.sendCode("16635d38-75a6-4481-82e8-69af60e05011")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun status() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val verifyEmailService = client.dir().verifyEmail()

        val response = verifyEmailService.status("16635d38-75a6-4481-82e8-69af60e05011")

        response.validate()
    }
}
