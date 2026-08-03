// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailvalidations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailvalidations.batch.BatchCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val batchServiceAsync = client.emailValidations().batch()

        val batchFuture =
            batchServiceAsync.create(
                BatchCreateParams.builder()
                    .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .addEmail("user@example.com")
                    .addEmail("admin@example.org")
                    .webhookUrl("https://example.com/webhooks/email-validation")
                    .build()
            )

        val batch = batchFuture.get()
        batch.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val batchServiceAsync = client.emailValidations().batch()

        val batchFuture = batchServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val batch = batchFuture.get()
        batch.validate()
    }
}
