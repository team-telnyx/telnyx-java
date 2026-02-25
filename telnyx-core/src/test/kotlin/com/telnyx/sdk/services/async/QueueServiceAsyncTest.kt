// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.queues.QueueCreateParams
import com.telnyx.sdk.models.queues.QueueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QueueServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.queues()

        val queueFuture =
            queueServiceAsync.create(
                QueueCreateParams.builder().queueName("tier_1_support").maxSize(100L).build()
            )

        val queue = queueFuture.get()
        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.queues()

        val queueFuture = queueServiceAsync.retrieve("queue_name")

        val queue = queueFuture.get()
        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.queues()

        val queueFuture =
            queueServiceAsync.update(
                QueueUpdateParams.builder().queueName("queue_name").maxSize(200L).build()
            )

        val queue = queueFuture.get()
        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.queues()

        val pageFuture = queueServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val queueServiceAsync = client.queues()

        val future = queueServiceAsync.delete("queue_name")

        val response = future.get()
    }
}
