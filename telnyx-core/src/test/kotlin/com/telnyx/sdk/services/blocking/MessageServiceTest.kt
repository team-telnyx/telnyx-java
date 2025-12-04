// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messages.MessageScheduleParams
import com.telnyx.sdk.models.messages.MessageSendGroupMmsParams
import com.telnyx.sdk.models.messages.MessageSendLongCodeParams
import com.telnyx.sdk.models.messages.MessageSendNumberPoolParams
import com.telnyx.sdk.models.messages.MessageSendParams
import com.telnyx.sdk.models.messages.MessageSendShortCodeParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessageServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val message = messageService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        message.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelScheduled() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response = messageService.cancelScheduled("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun schedule() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response =
            messageService.schedule(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response =
            messageService.send(
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
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendGroupMms() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response =
            messageService.sendGroupMms(
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

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendLongCode() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response =
            messageService.sendLongCode(
                MessageSendLongCodeParams.builder()
                    .from("+18445550001")
                    .to("+13125550002")
                    .autoDetect(true)
                    .addMediaUrl("http://example.com")
                    .subject("From Telnyx!")
                    .text("Hello, World!")
                    .type(MessageSendLongCodeParams.Type.MMS)
                    .useProfileWebhooks(true)
                    .webhookFailoverUrl("https://backup.example.com/hooks")
                    .webhookUrl("http://example.com/webhooks")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendNumberPool() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response =
            messageService.sendNumberPool(
                MessageSendNumberPoolParams.builder()
                    .messagingProfileId("abc85f64-5717-4562-b3fc-2c9600000000")
                    .to("+13125550002")
                    .autoDetect(true)
                    .addMediaUrl("http://example.com")
                    .subject("From Telnyx!")
                    .text("Hello, World!")
                    .type(MessageSendNumberPoolParams.Type.MMS)
                    .useProfileWebhooks(true)
                    .webhookFailoverUrl("https://backup.example.com/hooks")
                    .webhookUrl("http://example.com/webhooks")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendShortCode() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageService = client.messages()

        val response =
            messageService.sendShortCode(
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
            )

        response.validate()
    }
}
