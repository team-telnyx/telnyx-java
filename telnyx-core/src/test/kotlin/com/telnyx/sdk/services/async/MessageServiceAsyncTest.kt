// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messages.MessageScheduleParams
import com.telnyx.sdk.models.messages.MessageSendGroupMmsParams
import com.telnyx.sdk.models.messages.MessageSendLongCodeParams
import com.telnyx.sdk.models.messages.MessageSendNumberPoolParams
import com.telnyx.sdk.models.messages.MessageSendParams
import com.telnyx.sdk.models.messages.MessageSendShortCodeParams
import com.telnyx.sdk.models.messages.MessageSendWhatsappParams
import com.telnyx.sdk.models.messages.WhatsappMedia
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessageServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val messageFuture = messageServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val message = messageFuture.get()
        message.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancelScheduled() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.cancelScheduled("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun schedule() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.send(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendGroupMms() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun sendLongCode() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.sendLongCode(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendNumberPool() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.sendNumberPool(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendShortCode() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.sendShortCode(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendWhatsapp() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messageServiceAsync = client.messages()

        val responseFuture =
            messageServiceAsync.sendWhatsapp(
                MessageSendWhatsappParams.builder()
                    .from("+13125551234")
                    .to("+13125551234")
                    .whatsappMessage(
                        MessageSendWhatsappParams.WhatsappMessage.builder()
                            .audio(
                                WhatsappMedia.builder()
                                    .caption("caption")
                                    .filename("filename")
                                    .link("http://example.com/media.jpg")
                                    .voice(true)
                                    .build()
                            )
                            .bizOpaqueCallbackData("biz_opaque_callback_data")
                            .addContact(
                                MessageSendWhatsappParams.WhatsappMessage.Contact.builder()
                                    .addAddress(
                                        MessageSendWhatsappParams.WhatsappMessage.Contact.Address
                                            .builder()
                                            .city("city")
                                            .country("country")
                                            .countryCode("country_code")
                                            .state("state")
                                            .street("street")
                                            .type("type")
                                            .zip("zip")
                                            .build()
                                    )
                                    .birthday("birthday")
                                    .addEmail(
                                        MessageSendWhatsappParams.WhatsappMessage.Contact.Email
                                            .builder()
                                            .email("email")
                                            .type("type")
                                            .build()
                                    )
                                    .name("name")
                                    .org(
                                        MessageSendWhatsappParams.WhatsappMessage.Contact.Org
                                            .builder()
                                            .company("company")
                                            .department("department")
                                            .title("title")
                                            .build()
                                    )
                                    .addPhone(
                                        MessageSendWhatsappParams.WhatsappMessage.Contact.Phone
                                            .builder()
                                            .phone("phone")
                                            .type("type")
                                            .waId("wa_id")
                                            .build()
                                    )
                                    .addUrl(
                                        MessageSendWhatsappParams.WhatsappMessage.Contact.Url
                                            .builder()
                                            .type("type")
                                            .url("url")
                                            .build()
                                    )
                                    .build()
                            )
                            .document(
                                WhatsappMedia.builder()
                                    .caption("caption")
                                    .filename("filename")
                                    .link("http://example.com/media.jpg")
                                    .voice(true)
                                    .build()
                            )
                            .image(
                                WhatsappMedia.builder()
                                    .caption("caption")
                                    .filename("filename")
                                    .link("http://example.com/media.jpg")
                                    .voice(true)
                                    .build()
                            )
                            .interactive(
                                MessageSendWhatsappParams.WhatsappMessage.Interactive.builder()
                                    .action(
                                        MessageSendWhatsappParams.WhatsappMessage.Interactive.Action
                                            .builder()
                                            .button("button")
                                            .addButton(
                                                MessageSendWhatsappParams.WhatsappMessage
                                                    .Interactive
                                                    .Action
                                                    .Button
                                                    .builder()
                                                    .reply(
                                                        MessageSendWhatsappParams.WhatsappMessage
                                                            .Interactive
                                                            .Action
                                                            .Button
                                                            .Reply
                                                            .builder()
                                                            .id("id")
                                                            .title("title")
                                                            .build()
                                                    )
                                                    .type(
                                                        MessageSendWhatsappParams.WhatsappMessage
                                                            .Interactive
                                                            .Action
                                                            .Button
                                                            .Type
                                                            .REPLY
                                                    )
                                                    .build()
                                            )
                                            .addCard(
                                                MessageSendWhatsappParams.WhatsappMessage
                                                    .Interactive
                                                    .Action
                                                    .Card
                                                    .builder()
                                                    .action(
                                                        MessageSendWhatsappParams.WhatsappMessage
                                                            .Interactive
                                                            .Action
                                                            .Card
                                                            .CardAction
                                                            .builder()
                                                            .catalogId("catalog_id")
                                                            .productRetailerId(
                                                                "product_retailer_id"
                                                            )
                                                            .build()
                                                    )
                                                    .body(
                                                        MessageSendWhatsappParams.WhatsappMessage
                                                            .Interactive
                                                            .Action
                                                            .Card
                                                            .CardBody
                                                            .builder()
                                                            .text("text")
                                                            .build()
                                                    )
                                                    .cardIndex(0L)
                                                    .header(
                                                        MessageSendWhatsappParams.WhatsappMessage
                                                            .Interactive
                                                            .Action
                                                            .Card
                                                            .Header
                                                            .builder()
                                                            .image(
                                                                WhatsappMedia.builder()
                                                                    .caption("caption")
                                                                    .filename("filename")
                                                                    .link(
                                                                        "http://example.com/media.jpg"
                                                                    )
                                                                    .voice(true)
                                                                    .build()
                                                            )
                                                            .type(
                                                                MessageSendWhatsappParams
                                                                    .WhatsappMessage
                                                                    .Interactive
                                                                    .Action
                                                                    .Card
                                                                    .Header
                                                                    .Type
                                                                    .IMAGE
                                                            )
                                                            .video(
                                                                WhatsappMedia.builder()
                                                                    .caption("caption")
                                                                    .filename("filename")
                                                                    .link(
                                                                        "http://example.com/media.jpg"
                                                                    )
                                                                    .voice(true)
                                                                    .build()
                                                            )
                                                            .build()
                                                    )
                                                    .type(
                                                        MessageSendWhatsappParams.WhatsappMessage
                                                            .Interactive
                                                            .Action
                                                            .Card
                                                            .Type
                                                            .CTA_URL
                                                    )
                                                    .build()
                                            )
                                            .catalogId("catalog_id")
                                            .mode("mode")
                                            .name("name")
                                            .parameters(
                                                MessageSendWhatsappParams.WhatsappMessage
                                                    .Interactive
                                                    .Action
                                                    .Parameters
                                                    .builder()
                                                    .displayText("display_text")
                                                    .url("url")
                                                    .build()
                                            )
                                            .productRetailerId("product_retailer_id")
                                            .addSection(
                                                MessageSendWhatsappParams.WhatsappMessage
                                                    .Interactive
                                                    .Action
                                                    .Section
                                                    .builder()
                                                    .addProductItem(
                                                        MessageSendWhatsappParams.WhatsappMessage
                                                            .Interactive
                                                            .Action
                                                            .Section
                                                            .ProductItem
                                                            .builder()
                                                            .productRetailerId(
                                                                "product_retailer_id"
                                                            )
                                                            .build()
                                                    )
                                                    .addRow(
                                                        MessageSendWhatsappParams.WhatsappMessage
                                                            .Interactive
                                                            .Action
                                                            .Section
                                                            .Row
                                                            .builder()
                                                            .id("id")
                                                            .description("description")
                                                            .title("title")
                                                            .build()
                                                    )
                                                    .title("title")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .body(
                                        MessageSendWhatsappParams.WhatsappMessage.Interactive
                                            .InteractiveBody
                                            .builder()
                                            .text("text")
                                            .build()
                                    )
                                    .footer(
                                        MessageSendWhatsappParams.WhatsappMessage.Interactive.Footer
                                            .builder()
                                            .text("text")
                                            .build()
                                    )
                                    .header(
                                        MessageSendWhatsappParams.WhatsappMessage.Interactive.Header
                                            .builder()
                                            .document(
                                                WhatsappMedia.builder()
                                                    .caption("caption")
                                                    .filename("filename")
                                                    .link("http://example.com/media.jpg")
                                                    .voice(true)
                                                    .build()
                                            )
                                            .image(
                                                WhatsappMedia.builder()
                                                    .caption("caption")
                                                    .filename("filename")
                                                    .link("http://example.com/media.jpg")
                                                    .voice(true)
                                                    .build()
                                            )
                                            .subText("sub_text")
                                            .text("text")
                                            .video(
                                                WhatsappMedia.builder()
                                                    .caption("caption")
                                                    .filename("filename")
                                                    .link("http://example.com/media.jpg")
                                                    .voice(true)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .type(
                                        MessageSendWhatsappParams.WhatsappMessage.Interactive.Type
                                            .CTA_URL
                                    )
                                    .build()
                            )
                            .location(
                                MessageSendWhatsappParams.WhatsappMessage.Location.builder()
                                    .address("address")
                                    .latitude("latitude")
                                    .longitude("longitude")
                                    .name("name")
                                    .build()
                            )
                            .reaction(
                                MessageSendWhatsappParams.WhatsappMessage.Reaction.builder()
                                    .emoji("emoji")
                                    .messageId("message_id")
                                    .build()
                            )
                            .sticker(
                                WhatsappMedia.builder()
                                    .caption("caption")
                                    .filename("filename")
                                    .link("http://example.com/media.jpg")
                                    .voice(true)
                                    .build()
                            )
                            .type(MessageSendWhatsappParams.WhatsappMessage.Type.AUDIO)
                            .video(
                                WhatsappMedia.builder()
                                    .caption("caption")
                                    .filename("filename")
                                    .link("http://example.com/media.jpg")
                                    .voice(true)
                                    .build()
                            )
                            .build()
                    )
                    .type(MessageSendWhatsappParams.Type.WHATSAPP)
                    .webhookUrl("webhook_url")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
