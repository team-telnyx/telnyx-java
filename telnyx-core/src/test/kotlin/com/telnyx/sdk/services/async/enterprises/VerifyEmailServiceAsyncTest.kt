// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.enterprises

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.enterprises.verifyemail.VerifyEmailConfirmParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class VerifyEmailServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyEmailServiceAsync = client.enterprises().verifyEmail()

        val enterpriseEmailVerificationStatusWrappedFuture =
            verifyEmailServiceAsync.create("4a6192a4-573d-446d-b3ce-aff9117272a6")

        val enterpriseEmailVerificationStatusWrapped =
            enterpriseEmailVerificationStatusWrappedFuture.get()
        enterpriseEmailVerificationStatusWrapped.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun confirm() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val verifyEmailServiceAsync = client.enterprises().verifyEmail()

        val enterpriseEmailVerificationStatusWrappedFuture =
            verifyEmailServiceAsync.confirm(
                VerifyEmailConfirmParams.builder()
                    .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                    .code("482915")
                    .build()
            )

        val enterpriseEmailVerificationStatusWrapped =
            enterpriseEmailVerificationStatusWrappedFuture.get()
        enterpriseEmailVerificationStatusWrapped.validate()
    }
}
