// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class IntegrationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val integrationServiceAsync = client.ai().integrations()

        val integrationFuture = integrationServiceAsync.retrieve("integration_id")

        val integration = integrationFuture.get()
        integration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val integrationServiceAsync = client.ai().integrations()

        val integrationsFuture = integrationServiceAsync.list()

        val integrations = integrationsFuture.get()
        integrations.validate()
    }
}
