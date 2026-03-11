// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BusinessAccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val businessAccountServiceAsync = client.whatsapp().businessAccounts()

        val businessAccountFuture = businessAccountServiceAsync.retrieve("id")

        val businessAccount = businessAccountFuture.get()
        businessAccount.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val businessAccountServiceAsync = client.whatsapp().businessAccounts()

        val pageFuture = businessAccountServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val businessAccountServiceAsync = client.whatsapp().businessAccounts()

        val future = businessAccountServiceAsync.delete("id")

        val response = future.get()
    }
}
