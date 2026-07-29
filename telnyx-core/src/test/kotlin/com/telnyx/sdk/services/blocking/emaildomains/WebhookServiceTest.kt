// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emaildomains

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emaildomains.webhooks.EmailWebhookEvent
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookCreateParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookDeleteParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookRetrieveParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.emailDomains().webhooks()

        val emailWebhookResponse =
            webhookService.create(
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

        emailWebhookResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.emailDomains().webhooks()

        val emailWebhookResponse =
            webhookService.retrieve(
                WebhookRetrieveParams.builder()
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        emailWebhookResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.emailDomains().webhooks()

        val emailWebhookResponse =
            webhookService.update(
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

        emailWebhookResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.emailDomains().webhooks()

        val page = webhookService.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.emailDomains().webhooks()

        val emailWebhookResponse =
            webhookService.delete(
                WebhookDeleteParams.builder()
                    .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        emailWebhookResponse.validate()
    }
}
