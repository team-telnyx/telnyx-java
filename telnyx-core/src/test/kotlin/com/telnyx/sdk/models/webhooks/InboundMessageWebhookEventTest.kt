// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.InboundMessagePayload
import com.telnyx.sdk.models.messages.MessagingError
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundMessageWebhookEventTest {

    @Test
    fun create() {
        val inboundMessageWebhookEvent =
            InboundMessageWebhookEvent.builder()
                .data(
                    InboundMessage.builder()
                        .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                        .eventType(InboundMessage.EventType.MESSAGE_RECEIVED)
                        .occurredAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .payload(
                            InboundMessagePayload.builder()
                                .id("7ee4241c-f127-47e5-9c34-3aac291f8058")
                                .addCc(
                                    InboundMessagePayload.Cc.builder()
                                        .carrier("carrier")
                                        .lineType(InboundMessagePayload.Cc.LineType.WIRELINE)
                                        .phoneNumber("phone_number")
                                        .status(InboundMessagePayload.Cc.Status.QUEUED)
                                        .build()
                                )
                                .completedAt(null)
                                .cost(
                                    InboundMessagePayload.Cost.builder()
                                        .amount("0.0051")
                                        .currency("USD")
                                        .build()
                                )
                                .costBreakdown(
                                    InboundMessagePayload.CostBreakdown.builder()
                                        .carrierFee(
                                            InboundMessagePayload.CostBreakdown.CarrierFee.builder()
                                                .amount("0.00305")
                                                .currency("USD")
                                                .build()
                                        )
                                        .rate(
                                            InboundMessagePayload.CostBreakdown.Rate.builder()
                                                .amount("0.00205")
                                                .currency("USD")
                                                .build()
                                        )
                                        .build()
                                )
                                .direction(InboundMessagePayload.Direction.INBOUND)
                                .encoding("GSM-7")
                                .addError(
                                    MessagingError.builder()
                                        .code("code")
                                        .title("title")
                                        .detail("detail")
                                        .meta(
                                            MessagingError.Meta.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .source(
                                            MessagingError.Source.builder()
                                                .parameter("parameter")
                                                .pointer("pointer")
                                                .build()
                                        )
                                        .build()
                                )
                                .from(
                                    InboundMessagePayload.From.builder()
                                        .carrier("T-MOBILE USA, INC.")
                                        .lineType(InboundMessagePayload.From.LineType.WIRELESS)
                                        .phoneNumber("+18665550001")
                                        .status(InboundMessagePayload.From.Status.RECEIVED)
                                        .build()
                                )
                                .addMedia(
                                    InboundMessagePayload.Media.builder()
                                        .contentType("content_type")
                                        .hashSha256("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                        .size(0L)
                                        .url("url")
                                        .build()
                                )
                                .messagingProfileId("0f512bda-ae1e-4597-8e11-e5f5686b97d3")
                                .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                                .parts(1L)
                                .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                                .recordType(InboundMessagePayload.RecordType.MESSAGE)
                                .sentAt(null)
                                .subject("From Telnyx!")
                                .addTag("Greetings")
                                .tcrCampaignBillable(true)
                                .tcrCampaignId("TCPA3X7")
                                .tcrCampaignRegistered("REGISTERED")
                                .text("Hello, World!")
                                .addTo(
                                    InboundMessagePayload.To.builder()
                                        .carrier("TELNYX LLC")
                                        .lineType(InboundMessagePayload.To.LineType.VO_IP)
                                        .phoneNumber("+18445550001")
                                        .status(InboundMessagePayload.To.Status.DELIVERED)
                                        .build()
                                )
                                .type(InboundMessagePayload.Type.SMS)
                                .validUntil(null)
                                .webhookFailoverUrl("https://backup.example.com/hooks")
                                .webhookUrl("https://www.example.com/hooks")
                                .build()
                        )
                        .recordType(InboundMessage.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(inboundMessageWebhookEvent.data())
            .contains(
                InboundMessage.builder()
                    .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                    .eventType(InboundMessage.EventType.MESSAGE_RECEIVED)
                    .occurredAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                    .payload(
                        InboundMessagePayload.builder()
                            .id("7ee4241c-f127-47e5-9c34-3aac291f8058")
                            .addCc(
                                InboundMessagePayload.Cc.builder()
                                    .carrier("carrier")
                                    .lineType(InboundMessagePayload.Cc.LineType.WIRELINE)
                                    .phoneNumber("phone_number")
                                    .status(InboundMessagePayload.Cc.Status.QUEUED)
                                    .build()
                            )
                            .completedAt(null)
                            .cost(
                                InboundMessagePayload.Cost.builder()
                                    .amount("0.0051")
                                    .currency("USD")
                                    .build()
                            )
                            .costBreakdown(
                                InboundMessagePayload.CostBreakdown.builder()
                                    .carrierFee(
                                        InboundMessagePayload.CostBreakdown.CarrierFee.builder()
                                            .amount("0.00305")
                                            .currency("USD")
                                            .build()
                                    )
                                    .rate(
                                        InboundMessagePayload.CostBreakdown.Rate.builder()
                                            .amount("0.00205")
                                            .currency("USD")
                                            .build()
                                    )
                                    .build()
                            )
                            .direction(InboundMessagePayload.Direction.INBOUND)
                            .encoding("GSM-7")
                            .addError(
                                MessagingError.builder()
                                    .code("code")
                                    .title("title")
                                    .detail("detail")
                                    .meta(
                                        MessagingError.Meta.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .source(
                                        MessagingError.Source.builder()
                                            .parameter("parameter")
                                            .pointer("pointer")
                                            .build()
                                    )
                                    .build()
                            )
                            .from(
                                InboundMessagePayload.From.builder()
                                    .carrier("T-MOBILE USA, INC.")
                                    .lineType(InboundMessagePayload.From.LineType.WIRELESS)
                                    .phoneNumber("+18665550001")
                                    .status(InboundMessagePayload.From.Status.RECEIVED)
                                    .build()
                            )
                            .addMedia(
                                InboundMessagePayload.Media.builder()
                                    .contentType("content_type")
                                    .hashSha256("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                    .size(0L)
                                    .url("url")
                                    .build()
                            )
                            .messagingProfileId("0f512bda-ae1e-4597-8e11-e5f5686b97d3")
                            .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                            .parts(1L)
                            .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                            .recordType(InboundMessagePayload.RecordType.MESSAGE)
                            .sentAt(null)
                            .subject("From Telnyx!")
                            .addTag("Greetings")
                            .tcrCampaignBillable(true)
                            .tcrCampaignId("TCPA3X7")
                            .tcrCampaignRegistered("REGISTERED")
                            .text("Hello, World!")
                            .addTo(
                                InboundMessagePayload.To.builder()
                                    .carrier("TELNYX LLC")
                                    .lineType(InboundMessagePayload.To.LineType.VO_IP)
                                    .phoneNumber("+18445550001")
                                    .status(InboundMessagePayload.To.Status.DELIVERED)
                                    .build()
                            )
                            .type(InboundMessagePayload.Type.SMS)
                            .validUntil(null)
                            .webhookFailoverUrl("https://backup.example.com/hooks")
                            .webhookUrl("https://www.example.com/hooks")
                            .build()
                    )
                    .recordType(InboundMessage.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundMessageWebhookEvent =
            InboundMessageWebhookEvent.builder()
                .data(
                    InboundMessage.builder()
                        .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                        .eventType(InboundMessage.EventType.MESSAGE_RECEIVED)
                        .occurredAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                        .payload(
                            InboundMessagePayload.builder()
                                .id("7ee4241c-f127-47e5-9c34-3aac291f8058")
                                .addCc(
                                    InboundMessagePayload.Cc.builder()
                                        .carrier("carrier")
                                        .lineType(InboundMessagePayload.Cc.LineType.WIRELINE)
                                        .phoneNumber("phone_number")
                                        .status(InboundMessagePayload.Cc.Status.QUEUED)
                                        .build()
                                )
                                .completedAt(null)
                                .cost(
                                    InboundMessagePayload.Cost.builder()
                                        .amount("0.0051")
                                        .currency("USD")
                                        .build()
                                )
                                .costBreakdown(
                                    InboundMessagePayload.CostBreakdown.builder()
                                        .carrierFee(
                                            InboundMessagePayload.CostBreakdown.CarrierFee.builder()
                                                .amount("0.00305")
                                                .currency("USD")
                                                .build()
                                        )
                                        .rate(
                                            InboundMessagePayload.CostBreakdown.Rate.builder()
                                                .amount("0.00205")
                                                .currency("USD")
                                                .build()
                                        )
                                        .build()
                                )
                                .direction(InboundMessagePayload.Direction.INBOUND)
                                .encoding("GSM-7")
                                .addError(
                                    MessagingError.builder()
                                        .code("code")
                                        .title("title")
                                        .detail("detail")
                                        .meta(
                                            MessagingError.Meta.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .source(
                                            MessagingError.Source.builder()
                                                .parameter("parameter")
                                                .pointer("pointer")
                                                .build()
                                        )
                                        .build()
                                )
                                .from(
                                    InboundMessagePayload.From.builder()
                                        .carrier("T-MOBILE USA, INC.")
                                        .lineType(InboundMessagePayload.From.LineType.WIRELESS)
                                        .phoneNumber("+18665550001")
                                        .status(InboundMessagePayload.From.Status.RECEIVED)
                                        .build()
                                )
                                .addMedia(
                                    InboundMessagePayload.Media.builder()
                                        .contentType("content_type")
                                        .hashSha256("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                                        .size(0L)
                                        .url("url")
                                        .build()
                                )
                                .messagingProfileId("0f512bda-ae1e-4597-8e11-e5f5686b97d3")
                                .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                                .parts(1L)
                                .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                                .recordType(InboundMessagePayload.RecordType.MESSAGE)
                                .sentAt(null)
                                .subject("From Telnyx!")
                                .addTag("Greetings")
                                .tcrCampaignBillable(true)
                                .tcrCampaignId("TCPA3X7")
                                .tcrCampaignRegistered("REGISTERED")
                                .text("Hello, World!")
                                .addTo(
                                    InboundMessagePayload.To.builder()
                                        .carrier("TELNYX LLC")
                                        .lineType(InboundMessagePayload.To.LineType.VO_IP)
                                        .phoneNumber("+18445550001")
                                        .status(InboundMessagePayload.To.Status.DELIVERED)
                                        .build()
                                )
                                .type(InboundMessagePayload.Type.SMS)
                                .validUntil(null)
                                .webhookFailoverUrl("https://backup.example.com/hooks")
                                .webhookUrl("https://www.example.com/hooks")
                                .build()
                        )
                        .recordType(InboundMessage.RecordType.EVENT)
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
