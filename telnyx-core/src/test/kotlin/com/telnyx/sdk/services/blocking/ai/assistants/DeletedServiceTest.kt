// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeletedServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val deletedService = client.ai().assistants().deleted()

        val page = deletedService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val deletedService = client.ai().assistants().deleted()

        val deletedAssistant = deletedService.get("assistant_id")

        deletedAssistant.validate()
    }
}
