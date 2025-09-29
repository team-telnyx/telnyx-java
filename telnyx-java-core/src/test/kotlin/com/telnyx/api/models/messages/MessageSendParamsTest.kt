// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messages

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendParamsTest {

    @Test
    fun create() {
        MessageSendParams.builder()
            .to("+18445550001")
            .autoDetect(true)
            .from("+18445550001")
            .addMediaUrl("http://example.com")
            .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
            .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .subject("From Telnyx!")
            .text("Hello, World!")
            .type(MessageSendParams.Type.MMS)
            .useProfileWebhooks(true)
            .webhookFailoverUrl("https://backup.example.com/hooks")
            .webhookUrl("http://example.com/webhooks")
            .build()
    }

    @Test
    fun body() {
        val params =
            MessageSendParams.builder()
                .to("+18445550001")
                .autoDetect(true)
                .from("+18445550001")
                .addMediaUrl("http://example.com")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .sendAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subject("From Telnyx!")
                .text("Hello, World!")
                .type(MessageSendParams.Type.MMS)
                .useProfileWebhooks(true)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("http://example.com/webhooks")
                .build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("+18445550001")
        assertThat(body.autoDetect()).contains(true)
        assertThat(body.from()).contains("+18445550001")
        assertThat(body.mediaUrls().getOrNull()).containsExactly("http://example.com")
        assertThat(body.messagingProfileId()).contains("abc85f64-5717-4562-b3fc-2c9600000000")
        assertThat(body.sendAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.subject()).contains("From Telnyx!")
        assertThat(body.text()).contains("Hello, World!")
        assertThat(body.type()).contains(MessageSendParams.Type.MMS)
        assertThat(body.useProfileWebhooks()).contains(true)
        assertThat(body.webhookFailoverUrl()).contains("https://backup.example.com/hooks")
        assertThat(body.webhookUrl()).contains("http://example.com/webhooks")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MessageSendParams.builder().to("+18445550001").build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("+18445550001")
    }
}
