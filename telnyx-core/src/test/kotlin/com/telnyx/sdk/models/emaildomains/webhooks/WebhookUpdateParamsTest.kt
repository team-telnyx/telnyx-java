// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains.webhooks

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            WebhookUpdateParams.builder()
                .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.events().getOrNull())
            .containsExactly(
                EmailWebhookEvent.EMAIL_SENT,
                EmailWebhookEvent.EMAIL_DELIVERED,
                EmailWebhookEvent.EMAIL_OPENED,
            )
        assertThat(body.url()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookUpdateParams.builder()
                .domainId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
