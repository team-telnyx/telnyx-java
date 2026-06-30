// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendWithAlphanumericSenderParamsTest {

    @Test
    fun create() {
        MessageSendWithAlphanumericSenderParams.builder()
            .from("MyCompany")
            .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .text("text")
            .to("+E.164")
            .useProfileWebhooks(true)
            .webhookFailoverUrl("webhook_failover_url")
            .webhookUrl("webhook_url")
            .build()
    }

    @Test
    fun body() {
        val params =
            MessageSendWithAlphanumericSenderParams.builder()
                .from("MyCompany")
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .text("text")
                .to("+E.164")
                .useProfileWebhooks(true)
                .webhookFailoverUrl("webhook_failover_url")
                .webhookUrl("webhook_url")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("MyCompany")
        assertThat(body.messagingProfileId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.text()).isEqualTo("text")
        assertThat(body.to()).isEqualTo("+E.164")
        assertThat(body.useProfileWebhooks()).contains(true)
        assertThat(body.webhookFailoverUrl()).contains("webhook_failover_url")
        assertThat(body.webhookUrl()).contains("webhook_url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageSendWithAlphanumericSenderParams.builder()
                .from("MyCompany")
                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .text("text")
                .to("+E.164")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("MyCompany")
        assertThat(body.messagingProfileId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.text()).isEqualTo("text")
        assertThat(body.to()).isEqualTo("+E.164")
    }
}
