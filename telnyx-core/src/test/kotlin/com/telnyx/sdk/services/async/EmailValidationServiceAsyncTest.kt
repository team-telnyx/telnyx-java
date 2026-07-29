// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailvalidations.EmailValidationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailValidationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailValidationServiceAsync = client.emailValidations()

        val emailValidationFuture =
            emailValidationServiceAsync.create(
                EmailValidationCreateParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .email("user@example.com")
                    .build()
            )

        val emailValidation = emailValidationFuture.get()
        emailValidation.validate()
    }
}
