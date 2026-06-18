// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.texml.accounts.queues.QueueCreateParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueDeleteParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueRetrieveParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QueueServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.texml().accounts().queues()

        val queueFuture =
            queueServiceAsync.create(
                QueueCreateParams.builder()
                    .accountSid("account_sid")
                    .friendlyName("Support Queue")
                    .maxSize(10L)
                    .build()
            )

        val queue = queueFuture.get()
        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.texml().accounts().queues()

        val queueFuture =
            queueServiceAsync.retrieve(
                QueueRetrieveParams.builder()
                    .accountSid("account_sid")
                    .queueSid("queue_sid")
                    .build()
            )

        val queue = queueFuture.get()
        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.texml().accounts().queues()

        val queueFuture =
            queueServiceAsync.update(
                QueueUpdateParams.builder()
                    .accountSid("account_sid")
                    .queueSid("queue_sid")
                    .maxSize(10L)
                    .build()
            )

        val queue = queueFuture.get()
        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.texml().accounts().queues()

        val pageFuture = queueServiceAsync.list("account_sid")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.texml().accounts().queues()

        val future =
            queueServiceAsync.delete(
                QueueDeleteParams.builder().accountSid("account_sid").queueSid("queue_sid").build()
            )

        val response = future.get()
    }
}
