// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.accounts.queues.QueueCreateParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueDeleteParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueRetrieveParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class QueueServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.texml().accounts().queues()

        val queue =
            queueService.create(
                QueueCreateParams.builder()
                    .accountSid("account_sid")
                    .friendlyName("Support Queue")
                    .maxSize(10L)
                    .build()
            )

        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.texml().accounts().queues()

        val queue =
            queueService.retrieve(
                QueueRetrieveParams.builder()
                    .accountSid("account_sid")
                    .queueSid("queue_sid")
                    .build()
            )

        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.texml().accounts().queues()

        val queue =
            queueService.update(
                QueueUpdateParams.builder()
                    .accountSid("account_sid")
                    .queueSid("queue_sid")
                    .maxSize(10L)
                    .build()
            )

        queue.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.texml().accounts().queues()

        val page = queueService.list("account_sid")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val queueService = client.texml().accounts().queues()

        queueService.delete(
            QueueDeleteParams.builder().accountSid("account_sid").queueSid("queue_sid").build()
        )
    }
}
