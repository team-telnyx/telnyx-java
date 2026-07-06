// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messages.MessageScheduleParams
import com.telnyx.sdk.models.messages.MessageSendGroupMmsParams
import com.telnyx.sdk.models.messages.MessageSendLongCodeParams
import com.telnyx.sdk.models.messages.MessageSendNumberPoolParams
import com.telnyx.sdk.models.messages.MessageSendParams
import com.telnyx.sdk.models.messages.MessageSendShortCodeParams
import com.telnyx.sdk.models.messages.MessageSendWithAlphanumericSenderParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val messageFuture = messageServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val message = messageFuture.get()
        message.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelScheduled() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.cancelScheduled("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveGroupMessages() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.retrieveGroupMessages("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun schedule() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.schedule(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.send(
                MessageSendParams.builder()
                    .to("+18445550001")
                    .autoDetect(true)
                    .encoding(MessageSendParams.Encoding.AUTO)
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendGroupMms() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.sendGroupMms(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendLongCode() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.sendLongCode(
                MessageSendLongCodeParams.builder()
                    .from("+18445550001")
                    .to("+13125550002")
                    .autoDetect(true)
                    .encoding(MessageSendLongCodeParams.Encoding.AUTO)
                    .addMediaUrl("http://example.com")
                    .subject("From Telnyx!")
                    .text("Hello, World!")
                    .type(MessageSendLongCodeParams.Type.MMS)
                    .useProfileWebhooks(true)
                    .webhookFailoverUrl("https://backup.example.com/hooks")
                    .webhookUrl("http://example.com/webhooks")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendNumberPool() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.sendNumberPool(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendShortCode() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.sendShortCode(
                MessageSendShortCodeParams.builder()
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendWithAlphanumericSender() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.sendWithAlphanumericSender(
                MessageSendWithAlphanumericSenderParams.builder()
                    .from("MyCompany")
                    .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .text("text")
                    .to("+E.164")
                    .useProfileWebhooks(true)
                    .webhookFailoverUrl("webhook_failover_url")
                    .webhookUrl("webhook_url")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
