// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendNumberPoolParamsTest {

    @Test
    fun create() {
        MessageSendNumberPoolParams.builder()
            .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
            .to("+13125550002")
            .autoDetect(true)
            .encoding(MessageSendNumberPoolParams.Encoding.AUTO)
            .addMediaUrl("http://example.com")
            .subject("From Telnyx!")
            .text("Hello, World!")
            .type(MessageSendNumberPoolParams.Type.MMS)
            .useProfileWebhooks(true)
            .webhookFailoverUrl("https://backup.example.com/hooks")
            .webhookUrl("http://example.com/webhooks")
            .build()
    }

    @Test
    fun body() {
        val params =
            MessageSendNumberPoolParams.builder()
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .to("+13125550002")
                .autoDetect(true)
                .encoding(MessageSendNumberPoolParams.Encoding.AUTO)
                .addMediaUrl("http://example.com")
                .subject("From Telnyx!")
                .text("Hello, World!")
                .type(MessageSendNumberPoolParams.Type.MMS)
                .useProfileWebhooks(true)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("http://example.com/webhooks")
                .build()

        val body = params._body()

        assertThat(body.messagingProfileId()).isEqualTo("abc85f64-5717-4562-b3fc-2c9600000000")
        assertThat(body.to()).isEqualTo("+13125550002")
        assertThat(body.autoDetect()).contains(true)
        assertThat(body.encoding()).contains(MessageSendNumberPoolParams.Encoding.AUTO)
        assertThat(body.mediaUrls().getOrNull()).containsExactly("http://example.com")
        assertThat(body.subject()).contains("From Telnyx!")
        assertThat(body.text()).contains("Hello, World!")
        assertThat(body.type()).contains(MessageSendNumberPoolParams.Type.MMS)
        assertThat(body.useProfileWebhooks()).contains(true)
        assertThat(body.webhookFailoverUrl()).contains("https://backup.example.com/hooks")
        assertThat(body.webhookUrl()).contains("http://example.com/webhooks")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageSendNumberPoolParams.builder()
                .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                .to("+13125550002")
                .build()

        val body = params._body()

        assertThat(body.messagingProfileId()).isEqualTo("abc85f64-5717-4562-b3fc-2c9600000000")
        assertThat(body.to()).isEqualTo("+13125550002")
    }
}
