// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messages

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendShortCodeParamsTest {

    @Test
    fun create() {
        MessageSendShortCodeParams.builder()
            .from("+18445550001")
            .to("+18445550001")
            .autoDetect(true)
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
    fun body() {
        val params =
            MessageSendShortCodeParams.builder()
                .from("+18445550001")
                .to("+18445550001")
                .autoDetect(true)
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
