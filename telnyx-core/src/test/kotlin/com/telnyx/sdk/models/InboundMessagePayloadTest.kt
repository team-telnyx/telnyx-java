// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.messages.MessagingError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundMessagePayloadTest {

    @Test
    fun create() {
        val inboundMessagePayload =
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
                .cost(InboundMessagePayload.Cost.builder().amount("0.0051").currency("USD").build())
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
                        .status(InboundMessagePayload.From.Status.DELIVERED)
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

        assertThat(inboundMessagePayload.id()).contains("7ee4241c-f127-47e5-9c34-3aac291f8058")
        assertThat(inboundMessagePayload.cc().getOrNull())
            .containsExactly(
                InboundMessagePayload.Cc.builder()
                    .carrier("carrier")
                    .lineType(InboundMessagePayload.Cc.LineType.WIRELINE)
                    .phoneNumber("phone_number")
                    .status(InboundMessagePayload.Cc.Status.QUEUED)
                    .build()
            )
        assertThat(inboundMessagePayload.completedAt()).isEmpty
        assertThat(inboundMessagePayload.cost())
            .contains(InboundMessagePayload.Cost.builder().amount("0.0051").currency("USD").build())
        assertThat(inboundMessagePayload.costBreakdown())
            .contains(
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
        assertThat(inboundMessagePayload.direction())
            .contains(InboundMessagePayload.Direction.INBOUND)
        assertThat(inboundMessagePayload.encoding()).contains("GSM-7")
        assertThat(inboundMessagePayload.errors().getOrNull())
            .containsExactly(
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
        assertThat(inboundMessagePayload.from())
            .contains(
                InboundMessagePayload.From.builder()
                    .carrier("T-MOBILE USA, INC.")
                    .lineType(InboundMessagePayload.From.LineType.WIRELESS)
                    .phoneNumber("+18665550001")
                    .status(InboundMessagePayload.From.Status.DELIVERED)
                    .build()
            )
        assertThat(inboundMessagePayload.media().getOrNull())
            .containsExactly(
                InboundMessagePayload.Media.builder()
                    .contentType("content_type")
                    .hashSha256("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                    .size(0L)
                    .url("url")
                    .build()
            )
        assertThat(inboundMessagePayload.messagingProfileId())
            .contains("0f512bda-ae1e-4597-8e11-e5f5686b97d3")
        assertThat(inboundMessagePayload.organizationId())
            .contains("b448f9cc-a842-4784-98e9-03c1a5872950")
        assertThat(inboundMessagePayload.parts()).contains(1L)
        assertThat(inboundMessagePayload.receivedAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(inboundMessagePayload.recordType())
            .contains(InboundMessagePayload.RecordType.MESSAGE)
        assertThat(inboundMessagePayload.sentAt()).isEmpty
        assertThat(inboundMessagePayload.subject()).contains("From Telnyx!")
        assertThat(inboundMessagePayload.tags().getOrNull()).containsExactly("Greetings")
        assertThat(inboundMessagePayload.tcrCampaignBillable()).contains(true)
        assertThat(inboundMessagePayload.tcrCampaignId()).contains("TCPA3X7")
        assertThat(inboundMessagePayload.tcrCampaignRegistered()).contains("REGISTERED")
        assertThat(inboundMessagePayload.text()).contains("Hello, World!")
        assertThat(inboundMessagePayload.to().getOrNull())
            .containsExactly(
                InboundMessagePayload.To.builder()
                    .carrier("TELNYX LLC")
                    .lineType(InboundMessagePayload.To.LineType.VO_IP)
                    .phoneNumber("+18445550001")
                    .status(InboundMessagePayload.To.Status.DELIVERED)
                    .build()
            )
        assertThat(inboundMessagePayload.type()).contains(InboundMessagePayload.Type.SMS)
        assertThat(inboundMessagePayload.validUntil()).isEmpty
        assertThat(inboundMessagePayload.webhookFailoverUrl())
            .contains("https://backup.example.com/hooks")
        assertThat(inboundMessagePayload.webhookUrl()).contains("https://www.example.com/hooks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundMessagePayload =
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
                .cost(InboundMessagePayload.Cost.builder().amount("0.0051").currency("USD").build())
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
                        .status(InboundMessagePayload.From.Status.DELIVERED)
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

        val roundtrippedInboundMessagePayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundMessagePayload),
                jacksonTypeRef<InboundMessagePayload>(),
            )

        assertThat(roundtrippedInboundMessagePayload).isEqualTo(inboundMessagePayload)
    }
}
