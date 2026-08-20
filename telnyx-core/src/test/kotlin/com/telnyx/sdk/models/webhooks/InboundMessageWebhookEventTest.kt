// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.messages.MessagingError0b38e7044b
import com.telnyx.sdk.models.messages.MessagingInboundMessagePayload
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundMessageWebhookEventTest {

    @Test
    fun create() {
        val inboundMessageWebhookEvent =
            InboundMessageWebhookEvent.builder()
                .data(
                    InboundMessageWebhookEvent.Data.builder()
                        .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                        .eventType(InboundMessageWebhookEvent.Data.EventType.MESSAGE_RECEIVED)
                        .occurredAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .payload(
                            MessagingInboundMessagePayload.builder()
                                .id("7ee4241c-f127-47e5-9c34-3aac291f8058")
                                .addCc(
                                    MessagingInboundMessagePayload.Cc.builder()
                                        .carrier("carrier")
                                        .lineType(
                                            MessagingInboundMessagePayload.Cc.LineType.WIRELINE
                                        )
                                        .phoneNumber("phone_number")
                                        .status(MessagingInboundMessagePayload.Cc.Status.QUEUED)
                                        .build()
                                )
                                .completedAt(null)
                                .cost(
                                    MessagingInboundMessagePayload.Cost.builder()
                                        .amount("0.0051")
                                        .currency("USD")
                                        .build()
                                )
                                .costBreakdown(
                                    MessagingInboundMessagePayload.CostBreakdown.builder()
                                        .carrierFee(
                                            MessagingInboundMessagePayload.CostBreakdown.CarrierFee
                                                .builder()
                                                .amount("0.00305")
                                                .currency("USD")
                                                .build()
                                        )
                                        .rate(
                                            MessagingInboundMessagePayload.CostBreakdown.Rate
                                                .builder()
                                                .amount("0.00205")
                                                .currency("USD")
                                                .build()
                                        )
                                        .build()
                                )
                                .direction(MessagingInboundMessagePayload.Direction.INBOUND)
                                .encoding("GSM-7")
                                .addError(
                                    MessagingError0b38e7044b.builder()
                                        .code("code")
                                        .title("title")
                                        .detail("detail")
                                        .meta(JsonValue.from(mapOf<String, Any>()))
                                        .source(
                                            MessagingError0b38e7044b.Source.builder()
                                                .parameter("parameter")
                                                .pointer("pointer")
                                                .build()
                                        )
                                        .build()
                                )
                                .from(
                                    MessagingInboundMessagePayload.From.builder()
                                        .carrier("T-MOBILE USA, INC.")
                                        .lineType(
                                            MessagingInboundMessagePayload.From.LineType.WIRELESS
                                        )
                                        .phoneNumber("+18665550001")
                                        .status(MessagingInboundMessagePayload.From.Status.RECEIVED)
                                        .build()
                                )
                                .addMedia(
                                    MessagingInboundMessagePayload.Media.builder()
                                        .contentType("content_type")
                                        .hashSha256("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                        .size(0L)
                                        .url("url")
                                        .build()
                                )
                                .messagingProfileId("0f512bda-ae1e-4597-8e11-e5f5686b97d3")
                                .numChars(13L)
                                .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                                .parts(1L)
                                .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                                .recordType(MessagingInboundMessagePayload.RecordType.MESSAGE)
                                .sentAt(null)
                                .subject("From Telnyx!")
                                .addTag("Greetings")
                                .tcrCampaignBillable(true)
                                .tcrCampaignId("TCPA3X7")
                                .tcrCampaignRegistered("REGISTERED")
                                .text("Hello, World!")
                                .addTo(
                                    MessagingInboundMessagePayload.To.builder()
                                        .carrier("TELNYX LLC")
                                        .lineType(MessagingInboundMessagePayload.To.LineType.VO_IP)
                                        .phoneNumber("+18445550001")
                                        .status(MessagingInboundMessagePayload.To.Status.DELIVERED)
                                        .build()
                                )
                                .type(MessagingInboundMessagePayload.Type.SMS)
                                .validUntil(null)
                                .webhookFailoverUrl("https://backup.example.com/hooks")
                                .webhookUrl("https://www.example.com/hooks")
                                .build()
                        )
                        .recordType(InboundMessageWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(inboundMessageWebhookEvent.data())
            .contains(
                InboundMessageWebhookEvent.Data.builder()
                    .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                    .eventType(InboundMessageWebhookEvent.Data.EventType.MESSAGE_RECEIVED)
                    .occurredAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .payload(
                        MessagingInboundMessagePayload.builder()
                            .id("7ee4241c-f127-47e5-9c34-3aac291f8058")
                            .addCc(
                                MessagingInboundMessagePayload.Cc.builder()
                                    .carrier("carrier")
                                    .lineType(MessagingInboundMessagePayload.Cc.LineType.WIRELINE)
                                    .phoneNumber("phone_number")
                                    .status(MessagingInboundMessagePayload.Cc.Status.QUEUED)
                                    .build()
                            )
                            .completedAt(null)
                            .cost(
                                MessagingInboundMessagePayload.Cost.builder()
                                    .amount("0.0051")
                                    .currency("USD")
                                    .build()
                            )
                            .costBreakdown(
                                MessagingInboundMessagePayload.CostBreakdown.builder()
                                    .carrierFee(
                                        MessagingInboundMessagePayload.CostBreakdown.CarrierFee
                                            .builder()
                                            .amount("0.00305")
                                            .currency("USD")
                                            .build()
                                    )
                                    .rate(
                                        MessagingInboundMessagePayload.CostBreakdown.Rate.builder()
                                            .amount("0.00205")
                                            .currency("USD")
                                            .build()
                                    )
                                    .build()
                            )
                            .direction(MessagingInboundMessagePayload.Direction.INBOUND)
                            .encoding("GSM-7")
                            .addError(
                                MessagingError0b38e7044b.builder()
                                    .code("code")
                                    .title("title")
                                    .detail("detail")
                                    .meta(JsonValue.from(mapOf<String, Any>()))
                                    .source(
                                        MessagingError0b38e7044b.Source.builder()
                                            .parameter("parameter")
                                            .pointer("pointer")
                                            .build()
                                    )
                                    .build()
                            )
                            .from(
                                MessagingInboundMessagePayload.From.builder()
                                    .carrier("T-MOBILE USA, INC.")
                                    .lineType(MessagingInboundMessagePayload.From.LineType.WIRELESS)
                                    .phoneNumber("+18665550001")
                                    .status(MessagingInboundMessagePayload.From.Status.RECEIVED)
                                    .build()
                            )
                            .addMedia(
                                MessagingInboundMessagePayload.Media.builder()
                                    .contentType("content_type")
                                    .hashSha256("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                    .size(0L)
                                    .url("url")
                                    .build()
                            )
                            .messagingProfileId("0f512bda-ae1e-4597-8e11-e5f5686b97d3")
                            .numChars(13L)
                            .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                            .parts(1L)
                            .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                            .recordType(MessagingInboundMessagePayload.RecordType.MESSAGE)
                            .sentAt(null)
                            .subject("From Telnyx!")
                            .addTag("Greetings")
                            .tcrCampaignBillable(true)
                            .tcrCampaignId("TCPA3X7")
                            .tcrCampaignRegistered("REGISTERED")
                            .text("Hello, World!")
                            .addTo(
                                MessagingInboundMessagePayload.To.builder()
                                    .carrier("TELNYX LLC")
                                    .lineType(MessagingInboundMessagePayload.To.LineType.VO_IP)
                                    .phoneNumber("+18445550001")
                                    .status(MessagingInboundMessagePayload.To.Status.DELIVERED)
                                    .build()
                            )
                            .type(MessagingInboundMessagePayload.Type.SMS)
                            .validUntil(null)
                            .webhookFailoverUrl("https://backup.example.com/hooks")
                            .webhookUrl("https://www.example.com/hooks")
                            .build()
                    )
                    .recordType(InboundMessageWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundMessageWebhookEvent =
            InboundMessageWebhookEvent.builder()
                .data(
                    InboundMessageWebhookEvent.Data.builder()
                        .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                        .eventType(InboundMessageWebhookEvent.Data.EventType.MESSAGE_RECEIVED)
                        .occurredAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .payload(
                            MessagingInboundMessagePayload.builder()
                                .id("7ee4241c-f127-47e5-9c34-3aac291f8058")
                                .addCc(
                                    MessagingInboundMessagePayload.Cc.builder()
                                        .carrier("carrier")
                                        .lineType(
                                            MessagingInboundMessagePayload.Cc.LineType.WIRELINE
                                        )
                                        .phoneNumber("phone_number")
                                        .status(MessagingInboundMessagePayload.Cc.Status.QUEUED)
                                        .build()
                                )
                                .completedAt(null)
                                .cost(
                                    MessagingInboundMessagePayload.Cost.builder()
                                        .amount("0.0051")
                                        .currency("USD")
                                        .build()
                                )
                                .costBreakdown(
                                    MessagingInboundMessagePayload.CostBreakdown.builder()
                                        .carrierFee(
                                            MessagingInboundMessagePayload.CostBreakdown.CarrierFee
                                                .builder()
                                                .amount("0.00305")
                                                .currency("USD")
                                                .build()
                                        )
                                        .rate(
                                            MessagingInboundMessagePayload.CostBreakdown.Rate
                                                .builder()
                                                .amount("0.00205")
                                                .currency("USD")
                                                .build()
                                        )
                                        .build()
                                )
                                .direction(MessagingInboundMessagePayload.Direction.INBOUND)
                                .encoding("GSM-7")
                                .addError(
                                    MessagingError0b38e7044b.builder()
                                        .code("code")
                                        .title("title")
                                        .detail("detail")
                                        .meta(JsonValue.from(mapOf<String, Any>()))
                                        .source(
                                            MessagingError0b38e7044b.Source.builder()
                                                .parameter("parameter")
                                                .pointer("pointer")
                                                .build()
                                        )
                                        .build()
                                )
                                .from(
                                    MessagingInboundMessagePayload.From.builder()
                                        .carrier("T-MOBILE USA, INC.")
                                        .lineType(
                                            MessagingInboundMessagePayload.From.LineType.WIRELESS
                                        )
                                        .phoneNumber("+18665550001")
                                        .status(MessagingInboundMessagePayload.From.Status.RECEIVED)
                                        .build()
                                )
                                .addMedia(
                                    MessagingInboundMessagePayload.Media.builder()
                                        .contentType("content_type")
                                        .hashSha256("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                        .size(0L)
                                        .url("url")
                                        .build()
                                )
                                .messagingProfileId("0f512bda-ae1e-4597-8e11-e5f5686b97d3")
                                .numChars(13L)
                                .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                                .parts(1L)
                                .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                                .recordType(MessagingInboundMessagePayload.RecordType.MESSAGE)
                                .sentAt(null)
                                .subject("From Telnyx!")
                                .addTag("Greetings")
                                .tcrCampaignBillable(true)
                                .tcrCampaignId("TCPA3X7")
                                .tcrCampaignRegistered("REGISTERED")
                                .text("Hello, World!")
                                .addTo(
                                    MessagingInboundMessagePayload.To.builder()
                                        .carrier("TELNYX LLC")
                                        .lineType(MessagingInboundMessagePayload.To.LineType.VO_IP)
                                        .phoneNumber("+18445550001")
                                        .status(MessagingInboundMessagePayload.To.Status.DELIVERED)
                                        .build()
                                )
                                .type(MessagingInboundMessagePayload.Type.SMS)
                                .validUntil(null)
                                .webhookFailoverUrl("https://backup.example.com/hooks")
                                .webhookUrl("https://www.example.com/hooks")
                                .build()
                        )
                        .recordType(InboundMessageWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedInboundMessageWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundMessageWebhookEvent),
                jacksonTypeRef<InboundMessageWebhookEvent>(),
            )

        assertThat(roundtrippedInboundMessageWebhookEvent).isEqualTo(inboundMessageWebhookEvent)
    }
}
