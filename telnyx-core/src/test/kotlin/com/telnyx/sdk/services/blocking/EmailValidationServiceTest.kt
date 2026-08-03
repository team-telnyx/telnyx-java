// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailvalidations.EmailValidationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailValidationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailValidationService = client.emailValidations()

        val emailValidation =
            emailValidationService.create(
                EmailValidationCreateParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .email("user@example.com")
                    .build()
            )

        emailValidation.validate()
    }
}
