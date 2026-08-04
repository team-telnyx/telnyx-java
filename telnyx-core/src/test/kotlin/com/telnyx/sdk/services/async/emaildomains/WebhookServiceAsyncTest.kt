// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emaildomains

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emaildomains.webhooks.EmailWebhookEvent
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookCreateParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookDeleteParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookRetrieveParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.emailDomains().webhooks()

        val emailWebhookResponseFuture =
            webhookServiceAsync.create(
                WebhookCreateParams.builder()
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .events(
                        listOf(
                            EmailWebhookEvent.EMAIL_SENT,
                            EmailWebhookEvent.EMAIL_DELIVERED,
                            EmailWebhookEvent.EMAIL_BOUNCED,
                        )
                    )
                    .url("https://example.com/webhooks/email")
                    .build()
            )

        val emailWebhookResponse = emailWebhookResponseFuture.get()
        emailWebhookResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.emailDomains().webhooks()

        val emailWebhookResponseFuture =
            webhookServiceAsync.retrieve(
                WebhookRetrieveParams.builder()
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val emailWebhookResponse = emailWebhookResponseFuture.get()
        emailWebhookResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.emailDomains().webhooks()

        val emailWebhookResponseFuture =
            webhookServiceAsync.update(
                WebhookUpdateParams.builder()
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .events(
                        listOf(
                            EmailWebhookEvent.EMAIL_SENT,
                            EmailWebhookEvent.EMAIL_DELIVERED,
                            EmailWebhookEvent.EMAIL_OPENED,
                        )
                    )
                    .url("https://example.com")
                    .build()
            )

        val emailWebhookResponse = emailWebhookResponseFuture.get()
        emailWebhookResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.emailDomains().webhooks()

        val pageFuture = webhookServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookServiceAsync = client.emailDomains().webhooks()

        val emailWebhookResponseFuture =
            webhookServiceAsync.delete(
                WebhookDeleteParams.builder()
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val emailWebhookResponse = emailWebhookResponseFuture.get()
        emailWebhookResponse.validate()
    }
}
