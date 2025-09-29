// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messages

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendGroupMmsParamsTest {

    @Test
    fun create() {
        MessageSendGroupMmsParams.builder()
            .from("+13125551234")
            .addTo("+18655551234")
            .addTo("+14155551234")
            .addMediaUrl("http://example.com")
            .subject("From Telnyx!")
            .text("Hello, World!")
            .useProfileWebhooks(true)
            .webhookFailoverUrl("https://backup.example.com/hooks")
            .webhookUrl("http://example.com/webhooks")
            .build()
    }

    @Test
    fun body() {
        val params =
            MessageSendGroupMmsParams.builder()
                .from("+13125551234")
                .addTo("+18655551234")
                .addTo("+14155551234")
                .addMediaUrl("http://example.com")
                .subject("From Telnyx!")
                .text("Hello, World!")
                .useProfileWebhooks(true)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("http://example.com/webhooks")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("+13125551234")
        assertThat(body.to()).containsExactly("+18655551234", "+14155551234")
        assertThat(body.mediaUrls().getOrNull()).containsExactly("http://example.com")
        assertThat(body.subject()).contains("From Telnyx!")
        assertThat(body.text()).contains("Hello, World!")
        assertThat(body.useProfileWebhooks()).contains(true)
        assertThat(body.webhookFailoverUrl()).contains("https://backup.example.com/hooks")
        assertThat(body.webhookUrl()).contains("http://example.com/webhooks")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageSendGroupMmsParams.builder()
                .from("+13125551234")
                .addTo("+18655551234")
                .addTo("+14155551234")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("+13125551234")
        assertThat(body.to()).containsExactly("+18655551234", "+14155551234")
    }
}
