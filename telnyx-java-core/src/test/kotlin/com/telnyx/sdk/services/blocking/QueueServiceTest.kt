// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.queues.QueueCreateParams
import com.telnyx.sdk.models.queues.QueueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QueueServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.queues()

        val queue =
            queueService.create(
                QueueCreateParams.builder().queueName("tier_1_support").maxSize(100L).build()
            )

        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.queues()

        val queue = queueService.retrieve("queue_name")

        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.queues()

        val queue =
            queueService.update(
                QueueUpdateParams.builder().queueName("queue_name").maxSize(200L).build()
            )

        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.queues()

        val page = queueService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.queues()

        queueService.delete("queue_name")
    }
}
