// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.dir.verifyemail.VerifyEmailConfirmParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerifyEmailServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyEmailServiceAsync = client.dir().verifyEmail()

        val emailVerificationStatusWrappedFuture =
            verifyEmailServiceAsync.create("16635d38-75a6-4481-82e8-69af60e05011")

        val emailVerificationStatusWrapped = emailVerificationStatusWrappedFuture.get()
        emailVerificationStatusWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyEmailServiceAsync = client.dir().verifyEmail()

        val emailVerificationStatusWrappedFuture =
            verifyEmailServiceAsync.list("16635d38-75a6-4481-82e8-69af60e05011")

        val emailVerificationStatusWrapped = emailVerificationStatusWrappedFuture.get()
        emailVerificationStatusWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun confirm() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyEmailServiceAsync = client.dir().verifyEmail()

        val emailVerificationStatusWrappedFuture =
            verifyEmailServiceAsync.confirm(
                VerifyEmailConfirmParams.builder()
                    .dirId("16635d38-75a6-4481-82e8-69af60e05011")
                    .code("482915")
                    .build()
            )

        val emailVerificationStatusWrapped = emailVerificationStatusWrappedFuture.get()
        emailVerificationStatusWrapped.validate()
    }
}
