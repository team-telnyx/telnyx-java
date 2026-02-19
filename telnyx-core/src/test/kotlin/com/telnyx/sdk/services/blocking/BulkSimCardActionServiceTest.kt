// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BulkSimCardActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val bulkSimCardActionService = client.bulkSimCardActions()

        val bulkSimCardAction =
            bulkSimCardActionService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        bulkSimCardAction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val bulkSimCardActionService = client.bulkSimCardActions()

        val page = bulkSimCardActionService.list()

        page.response().validate()
    }
}
