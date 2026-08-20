// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingInboundMessagePayloadTest {

    @Test
    fun create() {
        val messagingInboundMessagePayload =
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
                            MessagingInboundMessagePayload.CostBreakdown.CarrierFee.builder()
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
                    MessagingInboundMessagePayload.From.builder()
                        .carrier("T-MOBILE USA, INC.")
                        .lineType(MessagingInboundMessagePayload.From.LineType.WIRELESS)
                        .phoneNumber("+18665550001")
                        .status(MessagingInboundMessagePayload.From.Status.DELIVERED)
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

        assertThat(messagingInboundMessagePayload.id())
            .contains("7ee4241c-f127-47e5-9c34-3aac291f8058")
        assertThat(messagingInboundMessagePayload.cc().getOrNull())
            .containsExactly(
                MessagingInboundMessagePayload.Cc.builder()
                    .carrier("carrier")
                    .lineType(MessagingInboundMessagePayload.Cc.LineType.WIRELINE)
                    .phoneNumber("phone_number")
                    .status(MessagingInboundMessagePayload.Cc.Status.QUEUED)
                    .build()
            )
        assertThat(messagingInboundMessagePayload.completedAt()).isEmpty
        assertThat(messagingInboundMessagePayload.cost())
            .contains(
                MessagingInboundMessagePayload.Cost.builder()
                    .amount("0.0051")
                    .currency("USD")
                    .build()
            )
        assertThat(messagingInboundMessagePayload.costBreakdown())
            .contains(
                MessagingInboundMessagePayload.CostBreakdown.builder()
                    .carrierFee(
                        MessagingInboundMessagePayload.CostBreakdown.CarrierFee.builder()
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
        assertThat(messagingInboundMessagePayload.direction())
            .contains(MessagingInboundMessagePayload.Direction.INBOUND)
        assertThat(messagingInboundMessagePayload.encoding()).contains("GSM-7")
        assertThat(messagingInboundMessagePayload.errors().getOrNull())
            .containsExactly(
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
        assertThat(messagingInboundMessagePayload.from())
            .contains(
                MessagingInboundMessagePayload.From.builder()
                    .carrier("T-MOBILE USA, INC.")
                    .lineType(MessagingInboundMessagePayload.From.LineType.WIRELESS)
                    .phoneNumber("+18665550001")
                    .status(MessagingInboundMessagePayload.From.Status.DELIVERED)
                    .build()
            )
        assertThat(messagingInboundMessagePayload.media().getOrNull())
            .containsExactly(
                MessagingInboundMessagePayload.Media.builder()
                    .contentType("content_type")
                    .hashSha256("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .size(0L)
                    .url("url")
                    .build()
            )
        assertThat(messagingInboundMessagePayload.messagingProfileId())
            .contains("0f512bda-ae1e-4597-8e11-e5f5686b97d3")
        assertThat(messagingInboundMessagePayload.numChars()).contains(13L)
        assertThat(messagingInboundMessagePayload.organizationId())
            .contains("b448f9cc-a842-4784-98e9-03c1a5872950")
        assertThat(messagingInboundMessagePayload.parts()).contains(1L)
        assertThat(messagingInboundMessagePayload.receivedAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(messagingInboundMessagePayload.recordType())
            .contains(MessagingInboundMessagePayload.RecordType.MESSAGE)
        assertThat(messagingInboundMessagePayload.sentAt()).isEmpty
        assertThat(messagingInboundMessagePayload.subject()).contains("From Telnyx!")
        assertThat(messagingInboundMessagePayload.tags().getOrNull()).containsExactly("Greetings")
        assertThat(messagingInboundMessagePayload.tcrCampaignBillable()).contains(true)
        assertThat(messagingInboundMessagePayload.tcrCampaignId()).contains("TCPA3X7")
        assertThat(messagingInboundMessagePayload.tcrCampaignRegistered()).contains("REGISTERED")
        assertThat(messagingInboundMessagePayload.text()).contains("Hello, World!")
        assertThat(messagingInboundMessagePayload.to().getOrNull())
            .containsExactly(
                MessagingInboundMessagePayload.To.builder()
                    .carrier("TELNYX LLC")
                    .lineType(MessagingInboundMessagePayload.To.LineType.VO_IP)
                    .phoneNumber("+18445550001")
                    .status(MessagingInboundMessagePayload.To.Status.DELIVERED)
                    .build()
            )
        assertThat(messagingInboundMessagePayload.type())
            .contains(MessagingInboundMessagePayload.Type.SMS)
        assertThat(messagingInboundMessagePayload.validUntil()).isEmpty
        assertThat(messagingInboundMessagePayload.webhookFailoverUrl())
            .contains("https://backup.example.com/hooks")
        assertThat(messagingInboundMessagePayload.webhookUrl())
            .contains("https://www.example.com/hooks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingInboundMessagePayload =
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
                            MessagingInboundMessagePayload.CostBreakdown.CarrierFee.builder()
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
                    MessagingInboundMessagePayload.From.builder()
                        .carrier("T-MOBILE USA, INC.")
                        .lineType(MessagingInboundMessagePayload.From.LineType.WIRELESS)
                        .phoneNumber("+18665550001")
                        .status(MessagingInboundMessagePayload.From.Status.DELIVERED)
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

        val roundtrippedMessagingInboundMessagePayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingInboundMessagePayload),
                jacksonTypeRef<MessagingInboundMessagePayload>(),
            )

        assertThat(roundtrippedMessagingInboundMessagePayload)
            .isEqualTo(messagingInboundMessagePayload)
    }
}
