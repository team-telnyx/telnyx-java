// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.messages.MessagingError0b38e7044b
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappMessageEchoTest {

    @Test
    fun create() {
        val whatsappMessageEcho =
            WhatsappMessageEcho.builder()
                .data(
                    WhatsappMessageEcho.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .eventType(WhatsappMessageEcho.Data.EventType.MESSAGE_ECHO)
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payload(
                            WhatsappMessageEcho.Data.Payload.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .body(
                                    WhatsappMessageEcho.Data.Payload.Body.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .foreignId("foreign_id")
                                        .timestamp("timestamp")
                                        .type("type")
                                        .from("from")
                                        .fromUserId("from_user_id")
                                        .build()
                                )
                                .cost(
                                    WhatsappMessageEcho.Data.Payload.Cost.builder()
                                        .amount("amount")
                                        .currency("currency")
                                        .build()
                                )
                                .direction(WhatsappMessageEcho.Data.Payload.Direction.OUTBOUND)
                                .addError(
                                    MessagingError0b38e7044b.builder()
                                        .code("code")
                                        .title("title")
                                        .detail("detail")
                                        .meta(
                                            MessagingError0b38e7044b.Meta.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .source(
                                            MessagingError0b38e7044b.Source.builder()
                                                .parameter("parameter")
                                                .pointer("pointer")
                                                .build()
                                        )
                                        .build()
                                )
                                .from(
                                    WhatsappMessageEcho.Data.Payload.From.builder()
                                        .phoneNumber("phone_number")
                                        .carrier("carrier")
                                        .lineType("line_type")
                                        .build()
                                )
                                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .origin(
                                    WhatsappMessageEcho.Data.Payload.Origin.WHATSAPP_BUSINESS_APP
                                )
                                .recordType(WhatsappMessageEcho.Data.Payload.RecordType.MESSAGE)
                                .to("to")
                                .type(WhatsappMessageEcho.Data.Payload.Type.WHATSAPP)
                                .receivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addTag("string")
                                .webhookFailoverUrl("https://example.com")
                                .webhookUrl("https://example.com")
                                .build()
                        )
                        .recordType(WhatsappMessageEcho.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(whatsappMessageEcho.data())
            .isEqualTo(
                WhatsappMessageEcho.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventType(WhatsappMessageEcho.Data.EventType.MESSAGE_ECHO)
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .payload(
                        WhatsappMessageEcho.Data.Payload.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .body(
                                WhatsappMessageEcho.Data.Payload.Body.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .foreignId("foreign_id")
                                    .timestamp("timestamp")
                                    .type("type")
                                    .from("from")
                                    .fromUserId("from_user_id")
                                    .build()
                            )
                            .cost(
                                WhatsappMessageEcho.Data.Payload.Cost.builder()
                                    .amount("amount")
                                    .currency("currency")
                                    .build()
                            )
                            .direction(WhatsappMessageEcho.Data.Payload.Direction.OUTBOUND)
                            .addError(
                                MessagingError0b38e7044b.builder()
                                    .code("code")
                                    .title("title")
                                    .detail("detail")
                                    .meta(
                                        MessagingError0b38e7044b.Meta.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .source(
                                        MessagingError0b38e7044b.Source.builder()
                                            .parameter("parameter")
                                            .pointer("pointer")
                                            .build()
                                    )
                                    .build()
                            )
                            .from(
                                WhatsappMessageEcho.Data.Payload.From.builder()
                                    .phoneNumber("phone_number")
                                    .carrier("carrier")
                                    .lineType("line_type")
                                    .build()
                            )
                            .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .origin(WhatsappMessageEcho.Data.Payload.Origin.WHATSAPP_BUSINESS_APP)
                            .recordType(WhatsappMessageEcho.Data.Payload.RecordType.MESSAGE)
                            .to("to")
                            .type(WhatsappMessageEcho.Data.Payload.Type.WHATSAPP)
                            .receivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .addTag("string")
                            .webhookFailoverUrl("https://example.com")
                            .webhookUrl("https://example.com")
                            .build()
                    )
                    .recordType(WhatsappMessageEcho.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappMessageEcho =
            WhatsappMessageEcho.builder()
                .data(
                    WhatsappMessageEcho.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .eventType(WhatsappMessageEcho.Data.EventType.MESSAGE_ECHO)
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payload(
                            WhatsappMessageEcho.Data.Payload.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .body(
                                    WhatsappMessageEcho.Data.Payload.Body.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .foreignId("foreign_id")
                                        .timestamp("timestamp")
                                        .type("type")
                                        .from("from")
                                        .fromUserId("from_user_id")
                                        .build()
                                )
                                .cost(
                                    WhatsappMessageEcho.Data.Payload.Cost.builder()
                                        .amount("amount")
                                        .currency("currency")
                                        .build()
                                )
                                .direction(WhatsappMessageEcho.Data.Payload.Direction.OUTBOUND)
                                .addError(
                                    MessagingError0b38e7044b.builder()
                                        .code("code")
                                        .title("title")
                                        .detail("detail")
                                        .meta(
                                            MessagingError0b38e7044b.Meta.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .source(
                                            MessagingError0b38e7044b.Source.builder()
                                                .parameter("parameter")
                                                .pointer("pointer")
                                                .build()
                                        )
                                        .build()
                                )
                                .from(
                                    WhatsappMessageEcho.Data.Payload.From.builder()
                                        .phoneNumber("phone_number")
                                        .carrier("carrier")
                                        .lineType("line_type")
                                        .build()
                                )
                                .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .origin(
                                    WhatsappMessageEcho.Data.Payload.Origin.WHATSAPP_BUSINESS_APP
                                )
                                .recordType(WhatsappMessageEcho.Data.Payload.RecordType.MESSAGE)
                                .to("to")
                                .type(WhatsappMessageEcho.Data.Payload.Type.WHATSAPP)
                                .receivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addTag("string")
                                .webhookFailoverUrl("https://example.com")
                                .webhookUrl("https://example.com")
                                .build()
                        )
                        .recordType(WhatsappMessageEcho.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedWhatsappMessageEcho =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappMessageEcho),
                jacksonTypeRef<WhatsappMessageEcho>(),
            )

        assertThat(roundtrippedWhatsappMessageEcho).isEqualTo(whatsappMessageEcho)
    }
}
