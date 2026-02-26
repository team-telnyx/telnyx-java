// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messages.MessageScheduleParams
import com.telnyx.sdk.models.messages.MessageSendGroupMmsParams
import com.telnyx.sdk.models.messages.MessageSendLongCodeParams
import com.telnyx.sdk.models.messages.MessageSendNumberPoolParams
import com.telnyx.sdk.models.messages.MessageSendParams
import com.telnyx.sdk.models.messages.MessageSendShortCodeParams
import com.telnyx.sdk.models.messages.MessageSendWhatsappParams
import com.telnyx.sdk.models.messages.MessageSendWithAlphanumericSenderParams
import com.telnyx.sdk.models.messages.WhatsappContact
import com.telnyx.sdk.models.messages.WhatsappInteractive
import com.telnyx.sdk.models.messages.WhatsappLocation
import com.telnyx.sdk.models.messages.WhatsappMedia
import com.telnyx.sdk.models.messages.WhatsappMessageContent
import com.telnyx.sdk.models.messages.WhatsappReaction
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.messages()

        val message = messageService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        message.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelScheduled() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.messages()

        val response = messageService.cancelScheduled("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveGroupMessages() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.messages()

        val response = messageService.retrieveGroupMessages("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun schedule() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.messages()

        val response =
            messageService.send(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendGroupMms() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendLongCode() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.messages()

        val response =
            messageService.sendLongCode(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendNumberPool() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.messages()

        val response =
            messageService.sendNumberPool(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendShortCode() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.messages()

        val response =
            messageService.sendShortCode(
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendWhatsapp() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.messages()

        val response =
            messageService.sendWhatsapp(
                MessageSendWhatsappParams.builder()
                    .from("+13125551234")
                    .to("+13125551234")
                    .whatsappMessage(
                        WhatsappMessageContent.builder()
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
                                WhatsappContact.builder()
                                    .addAddress(
                                        WhatsappContact.Address.builder()
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
                                        WhatsappContact.Email.builder()
                                            .email("email")
                                            .type("type")
                                            .build()
                                    )
                                    .name("name")
                                    .org(
                                        WhatsappContact.Org.builder()
                                            .company("company")
                                            .department("department")
                                            .title("title")
                                            .build()
                                    )
                                    .addPhone(
                                        WhatsappContact.Phone.builder()
                                            .phone("phone")
                                            .type("type")
                                            .waId("wa_id")
                                            .build()
                                    )
                                    .addUrl(
                                        WhatsappContact.Url.builder()
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
                                WhatsappInteractive.builder()
                                    .action(
                                        WhatsappInteractive.Action.builder()
                                            .button("button")
                                            .addButton(
                                                WhatsappInteractive.Action.Button.builder()
                                                    .reply(
                                                        WhatsappInteractive.Action.Button.Reply
                                                            .builder()
                                                            .id("id")
                                                            .title("title")
                                                            .build()
                                                    )
                                                    .type(
                                                        WhatsappInteractive.Action.Button.Type.REPLY
                                                    )
                                                    .build()
                                            )
                                            .addCard(
                                                WhatsappInteractive.Action.Card.builder()
                                                    .action(
                                                        WhatsappInteractive.Action.Card.CardAction
                                                            .builder()
                                                            .catalogId("catalog_id")
                                                            .productRetailerId(
                                                                "product_retailer_id"
                                                            )
                                                            .build()
                                                    )
                                                    .body(
                                                        WhatsappInteractive.Action.Card.CardBody
                                                            .builder()
                                                            .text("text")
                                                            .build()
                                                    )
                                                    .cardIndex(0L)
                                                    .header(
                                                        WhatsappInteractive.Action.Card.Header
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
                                                                WhatsappInteractive.Action.Card
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
                                                        WhatsappInteractive.Action.Card.Type.CTA_URL
                                                    )
                                                    .build()
                                            )
                                            .catalogId("catalog_id")
                                            .mode("mode")
                                            .name("name")
                                            .parameters(
                                                WhatsappInteractive.Action.Parameters.builder()
                                                    .displayText("display_text")
                                                    .url("url")
                                                    .build()
                                            )
                                            .productRetailerId("product_retailer_id")
                                            .addSection(
                                                WhatsappInteractive.Action.Section.builder()
                                                    .addProductItem(
                                                        WhatsappInteractive.Action.Section
                                                            .ProductItem
                                                            .builder()
                                                            .productRetailerId(
                                                                "product_retailer_id"
                                                            )
                                                            .build()
                                                    )
                                                    .addRow(
                                                        WhatsappInteractive.Action.Section.Row
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
                                        WhatsappInteractive.InteractiveBody.builder()
                                            .text("text")
                                            .build()
                                    )
                                    .footer(
                                        WhatsappInteractive.Footer.builder().text("text").build()
                                    )
                                    .header(
                                        WhatsappInteractive.Header.builder()
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
                                    .type(WhatsappInteractive.Type.CTA_URL)
                                    .build()
                            )
                            .location(
                                WhatsappLocation.builder()
                                    .address("address")
                                    .latitude("latitude")
                                    .longitude("longitude")
                                    .name("name")
                                    .build()
                            )
                            .reaction(
                                WhatsappReaction.builder()
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
                            .type(WhatsappMessageContent.Type.AUDIO)
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

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendWithAlphanumericSender() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messageService = client.messages()

        val response =
            messageService.sendWithAlphanumericSender(
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

        response.validate()
    }
}
