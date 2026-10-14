// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeletedServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val deletedServiceAsync = client.ai().assistants().deleted()

        val pageFuture = deletedServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val deletedServiceAsync = client.ai().assistants().deleted()

        val deletedAssistantFuture = deletedServiceAsync.get("assistant_id")

        val deletedAssistant = deletedAssistantFuture.get()
        deletedAssistant.validate()
    }
}
