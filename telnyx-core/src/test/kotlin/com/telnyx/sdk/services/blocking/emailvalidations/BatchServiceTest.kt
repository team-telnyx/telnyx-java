// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailvalidations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailvalidations.batch.BatchCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val batchService = client.emailValidations().batch()

        val batch =
            batchService.create(
                BatchCreateParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .addEmail("user@example.com")
                    .addEmail("admin@example.org")
                    .webhookUrl("https://example.com/webhooks/email-validation")
                    .build()
            )

        batch.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val batchService = client.emailValidations().batch()

        val batch = batchService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        batch.validate()
    }
}
