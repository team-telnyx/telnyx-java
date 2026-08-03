// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailinboxes.EmailInboxCreateParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailInboxServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailInboxServiceAsync = client.emailInboxes()

        val emailInboxResponseFuture =
            emailInboxServiceAsync.create(
                EmailInboxCreateParams.builder()
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .username("username")
                    .build()
            )

        val emailInboxResponse = emailInboxResponseFuture.get()
        emailInboxResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailInboxServiceAsync = client.emailInboxes()

        val emailInboxResponseFuture =
            emailInboxServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val emailInboxResponse = emailInboxResponseFuture.get()
        emailInboxResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailInboxServiceAsync = client.emailInboxes()

        val emailInboxesFuture =
            emailInboxServiceAsync.list(
                EmailInboxListParams.builder().pageCursor("page_cursor").pageSize(1L).build()
            )

        val emailInboxes = emailInboxesFuture.get()
        emailInboxes.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailInboxServiceAsync = client.emailInboxes()

        val future = emailInboxServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
