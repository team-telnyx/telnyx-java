// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WhatsappAccountUpdateTest {

    @Test
    fun create() {
        val whatsappAccountUpdate =
            WhatsappAccountUpdate.builder()
                .data(
                    WhatsappAccountUpdate.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .eventType(WhatsappAccountUpdate.Data.EventType.WHATSAPP_ACCOUNT_UPDATE)
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payload(
                            WhatsappAccountUpdate.Data.Payload.builder()
                                .event("ACCOUNT_OFFBOARDED")
                                .recordType(
                                    WhatsappAccountUpdate.Data.Payload.RecordType.WHATSAPP_ACCOUNT
                                )
                                .wabaId("waba_id")
                                .build()
                        )
                        .recordType(WhatsappAccountUpdate.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(whatsappAccountUpdate.data())
            .isEqualTo(
                WhatsappAccountUpdate.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventType(WhatsappAccountUpdate.Data.EventType.WHATSAPP_ACCOUNT_UPDATE)
                    .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .payload(
                        WhatsappAccountUpdate.Data.Payload.builder()
                            .event("ACCOUNT_OFFBOARDED")
                            .recordType(
                                WhatsappAccountUpdate.Data.Payload.RecordType.WHATSAPP_ACCOUNT
                            )
                            .wabaId("waba_id")
                            .build()
                    )
                    .recordType(WhatsappAccountUpdate.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val whatsappAccountUpdate =
            WhatsappAccountUpdate.builder()
                .data(
                    WhatsappAccountUpdate.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .eventType(WhatsappAccountUpdate.Data.EventType.WHATSAPP_ACCOUNT_UPDATE)
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payload(
                            WhatsappAccountUpdate.Data.Payload.builder()
                                .event("ACCOUNT_OFFBOARDED")
                                .recordType(
                                    WhatsappAccountUpdate.Data.Payload.RecordType.WHATSAPP_ACCOUNT
                                )
                                .wabaId("waba_id")
                                .build()
                        )
                        .recordType(WhatsappAccountUpdate.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedWhatsappAccountUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(whatsappAccountUpdate),
                jacksonTypeRef<WhatsappAccountUpdate>(),
            )

        assertThat(roundtrippedWhatsappAccountUpdate).isEqualTo(whatsappAccountUpdate)
    }
}
