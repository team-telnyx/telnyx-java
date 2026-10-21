// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendShortCodeParamsTest {

    @Test
    fun create() {
        MessageSendShortCodeParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .from("+18445550001")
            .to("+18445550001")
            .autoDetect(true)
            .encoding(MessageSendShortCodeParams.Encoding.AUTO)
            .addMediaUrl("http://example.com")
            .subject("From Telnyx!")
            .text("Hello, World!")
            .type(MessageSendShortCodeParams.Type.MMS)
            .useProfileWebhooks(true)
            .webhookFailoverUrl("https://backup.example.com/hooks")
            .webhookUrl("http://example.com/webhooks")
            .build()
    }

    @Test
    fun headers() {
        val params =
            MessageSendShortCodeParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .from("+18445550001")
                .to("+18445550001")
                .autoDetect(true)
                .encoding(MessageSendShortCodeParams.Encoding.AUTO)
                .addMediaUrl("http://example.com")
                .subject("From Telnyx!")
                .text("Hello, World!")
                .type(MessageSendShortCodeParams.Type.MMS)
                .useProfileWebhooks(true)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("http://example.com/webhooks")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            MessageSendShortCodeParams.builder().from("+18445550001").to("+18445550001").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            MessageSendShortCodeParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .from("+18445550001")
                .to("+18445550001")
                .autoDetect(true)
                .encoding(MessageSendShortCodeParams.Encoding.AUTO)
                .addMediaUrl("http://example.com")
                .subject("From Telnyx!")
                .text("Hello, World!")
                .type(MessageSendShortCodeParams.Type.MMS)
                .useProfileWebhooks(true)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("http://example.com/webhooks")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("+18445550001")
        assertThat(body.to()).isEqualTo("+18445550001")
        assertThat(body.autoDetect()).contains(true)
        assertThat(body.encoding()).contains(MessageSendShortCodeParams.Encoding.AUTO)
        assertThat(body.mediaUrls().getOrNull()).containsExactly("http://example.com")
        assertThat(body.subject()).contains("From Telnyx!")
        assertThat(body.text()).contains("Hello, World!")
        assertThat(body.type()).contains(MessageSendShortCodeParams.Type.MMS)
        assertThat(body.useProfileWebhooks()).contains(true)
        assertThat(body.webhookFailoverUrl()).contains("https://backup.example.com/hooks")
        assertThat(body.webhookUrl()).contains("http://example.com/webhooks")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageSendShortCodeParams.builder().from("+18445550001").to("+18445550001").build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("+18445550001")
        assertThat(body.to()).isEqualTo("+18445550001")
    }
}
