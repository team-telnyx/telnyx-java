// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.texml.accounts.queues.QueueCreateParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueDeleteParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueListParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueRetrieveParams
import com.telnyx.sdk.models.texml.accounts.queues.QueueUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class QueueServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val queueService = client.texml().accounts().queues()

        val queues =
            queueService.list(
                QueueListParams.builder()
                    .accountSid("account_sid")
                    .dateCreated("DateCreated")
                    .dateUpdated("DateUpdated")
                    .page(0L)
                    .pageSize(0L)
                    .pageToken("PageToken")
                    .build()
            )

        queues.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val queueService = client.texml().accounts().queues()

        queueService.delete(
            QueueDeleteParams.builder().accountSid("account_sid").queueSid("queue_sid").build()
        )
    }
}
