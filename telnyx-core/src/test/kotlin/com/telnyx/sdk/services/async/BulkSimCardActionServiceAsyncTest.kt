// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BulkSimCardActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bulkSimCardActionServiceAsync = client.bulkSimCardActions()

        val bulkSimCardActionFuture =
            bulkSimCardActionServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val bulkSimCardAction = bulkSimCardActionFuture.get()
        bulkSimCardAction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val bulkSimCardActionServiceAsync = client.bulkSimCardActions()

        val pageFuture = bulkSimCardActionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
