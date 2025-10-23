// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageScheduleParamsTest {

    @Test
    fun create() {
        MessageScheduleParams.builder()
            .to("+18445550001")
            .autoDetect(true)
            .from("+18445550001")
            .addMediaUrl("string")
            .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
            .sendAt(OffsetDateTime.parse("2019-01-23T18:30:00Z"))
            .subject("From Telnyx!")
            .text("Hello, World!")
            .type(MessageScheduleParams.Type.SMS)
            .useProfileWebhooks(true)
            .webhookFailoverUrl("https://backup.example.com/hooks")
            .webhookUrl("http://example.com/webhooks")
            .build()
    }

    @Test
    fun body() {
        val params =
            MessageScheduleParams.builder()
                .to("+18445550001")
                .autoDetect(true)
                .from("+18445550001")
                .addMediaUrl("string")
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .sendAt(OffsetDateTime.parse("2019-01-23T18:30:00Z"))
                .subject("From Telnyx!")
                .text("Hello, World!")
                .type(MessageScheduleParams.Type.SMS)
                .useProfileWebhooks(true)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("http://example.com/webhooks")
                .build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("+18445550001")
        assertThat(body.autoDetect()).contains(true)
        assertThat(body.from()).contains("+18445550001")
        assertThat(body.mediaUrls().getOrNull()).containsExactly("string")
        assertThat(body.messagingProfileId()).contains("abc85f64-5717-4562-b3fc-2c9600000000")
        assertThat(body.sendAt()).contains(OffsetDateTime.parse("2019-01-23T18:30:00Z"))
        assertThat(body.subject()).contains("From Telnyx!")
        assertThat(body.text()).contains("Hello, World!")
        assertThat(body.type()).contains(MessageScheduleParams.Type.SMS)
        assertThat(body.useProfileWebhooks()).contains(true)
        assertThat(body.webhookFailoverUrl()).contains("https://backup.example.com/hooks")
        assertThat(body.webhookUrl()).contains("http://example.com/webhooks")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MessageScheduleParams.builder().to("+18445550001").build()

        val body = params._body()

        assertThat(body.to()).isEqualTo("+18445550001")
    }
}
