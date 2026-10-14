// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappWabaAddedWebhookEventTest {

    @Test
    fun create() {
        val whatsappWabaAddedWebhookEvent =
            WhatsappWabaAddedWebhookEvent.builder()
                .data(
                    WhatsappWabaAddedWebhookEvent.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .eventType(WhatsappWabaAddedWebhookEvent.Data.EventType.WHATSAPP_WABA_ADDED)
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payload(
                            WhatsappWabaAddedWebhookEvent.Data.Payload.builder()
                                .eventId("event_id")
                                .recordType(
                                    WhatsappWabaAddedWebhookEvent.Data.Payload.RecordType
                                        .WABA_ACCOUNT_ADDED
                                )
                                .status(WhatsappWabaAddedWebhookEvent.Data.Payload.Status.SUCCESS)
                                .wabaId("waba_id")
                                .addError("string")
                                .addPhoneNumber("string")
                                .build()
                        )
                        .recordType(WhatsappWabaAddedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(whatsappWabaAddedWebhookEvent.data())
            .isEqualTo(
                WhatsappWabaAddedWebhookEvent.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventType(WhatsappWabaAddedWebhookEvent.Data.EventType.WHATSAPP_WABA_ADDED)
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .payload(
                        WhatsappWabaAddedWebhookEvent.Data.Payload.builder()
                            .eventId("event_id")
                            .recordType(
                                WhatsappWabaAddedWebhookEvent.Data.Payload.RecordType
                                    .WABA_ACCOUNT_ADDED
                            )
                            .status(WhatsappWabaAddedWebhookEvent.Data.Payload.Status.SUCCESS)
                            .wabaId("waba_id")
                            .addError("string")
                            .addPhoneNumber("string")
                            .build()
                    )
                    .recordType(WhatsappWabaAddedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappWabaAddedWebhookEvent =
            WhatsappWabaAddedWebhookEvent.builder()
                .data(
                    WhatsappWabaAddedWebhookEvent.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .eventType(WhatsappWabaAddedWebhookEvent.Data.EventType.WHATSAPP_WABA_ADDED)
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payload(
                            WhatsappWabaAddedWebhookEvent.Data.Payload.builder()
                                .eventId("event_id")
                                .recordType(
                                    WhatsappWabaAddedWebhookEvent.Data.Payload.RecordType
                                        .WABA_ACCOUNT_ADDED
                                )
                                .status(WhatsappWabaAddedWebhookEvent.Data.Payload.Status.SUCCESS)
                                .wabaId("waba_id")
                                .addError("string")
                                .addPhoneNumber("string")
                                .build()
                        )
                        .recordType(WhatsappWabaAddedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedWhatsappWabaAddedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappWabaAddedWebhookEvent),
                jacksonTypeRef<WhatsappWabaAddedWebhookEvent>(),
            )

        assertThat(roundtrippedWhatsappWabaAddedWebhookEvent)
            .isEqualTo(whatsappWabaAddedWebhookEvent)
    }
}
