// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboundMessagePayloadTest {

    @Test
    fun create() {
        val outboundMessagePayload =
            OutboundMessagePayload.builder()
                .id("40385f64-5717-4562-b3fc-2c963f66afa6")
                .addCc(
                    OutboundMessagePayload.Cc.builder()
                        .carrier("carrier")
                        .lineType(OutboundMessagePayload.Cc.LineType.WIRELINE)
                        .phoneNumber("phone_number")
                        .status(OutboundMessagePayload.Cc.Status.QUEUED)
                        .build()
                )
                .completedAt(null)
                .cost(
                    OutboundMessagePayload.Cost.builder().amount("0.0051").currency("USD").build()
                )
                .costBreakdown(
                    OutboundMessagePayload.CostBreakdown.builder()
                        .carrierFee(
                            OutboundMessagePayload.CostBreakdown.CarrierFee.builder()
                                .amount("0.00305")
                                .currency("USD")
                                .build()
                        )
                        .rate(
                            OutboundMessagePayload.CostBreakdown.Rate.builder()
                                .amount("0.00205")
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .direction(OutboundMessagePayload.Direction.OUTBOUND)
                .encoding("GSM-7")
                .addError(
                    MessagingError.builder()
                        .code("code")
                        .title("title")
                        .detail("detail")
                        .meta(JsonValue.from(mapOf<String, Any>()))
                        .source(
                            MessagingError.Source.builder()
                                .parameter("parameter")
                                .pointer("pointer")
                                .build()
                        )
                        .build()
                )
                .from(
                    OutboundMessagePayload.From.builder()
                        .carrier("TELNYX LLC")
                        .lineType(OutboundMessagePayload.From.LineType.VO_IP)
                        .phoneNumber("+18445550001")
                        .build()
                )
                .addMedia(
                    OutboundMessagePayload.Media.builder()
                        .contentType(null)
                        .sha256(null)
                        .size(null)
                        .url(
                            "https://pbs.twimg.com/profile_images/1142168442042118144/AW3F4fFD_400x400.png"
                        )
                        .build()
                )
                .messagingProfileId("4000eba1-a0c0-4563-9925-b25e842a7cb6")
                .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                .parts(1L)
                .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .recordType(OutboundMessagePayload.RecordType.MESSAGE)
                .sentAt(null)
                .subject("From Telnyx!")
                .addTag("Greetings")
                .tcrCampaignBillable(true)
                .tcrCampaignId("TCPA3X7")
                .tcrCampaignRegistered("REGISTERED")
                .text("Hello, World!")
                .addTo(
                    OutboundMessagePayload.To.builder()
                        .carrier("T-MOBILE USA, INC.")
                        .lineType(OutboundMessagePayload.To.LineType.WIRELESS)
                        .phoneNumber("+18665550001")
                        .status(OutboundMessagePayload.To.Status.QUEUED)
                        .build()
                )
                .type(OutboundMessagePayload.Type.MMS)
                .validUntil(null)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("https://www.example.com/hooks")
                .build()

        assertThat(outboundMessagePayload.id()).contains("40385f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(outboundMessagePayload.cc().getOrNull())
            .containsExactly(
                OutboundMessagePayload.Cc.builder()
                    .carrier("carrier")
                    .lineType(OutboundMessagePayload.Cc.LineType.WIRELINE)
                    .phoneNumber("phone_number")
                    .status(OutboundMessagePayload.Cc.Status.QUEUED)
                    .build()
            )
        assertThat(outboundMessagePayload.completedAt()).isEmpty
        assertThat(outboundMessagePayload.cost())
            .contains(
                OutboundMessagePayload.Cost.builder().amount("0.0051").currency("USD").build()
            )
        assertThat(outboundMessagePayload.costBreakdown())
            .contains(
                OutboundMessagePayload.CostBreakdown.builder()
                    .carrierFee(
                        OutboundMessagePayload.CostBreakdown.CarrierFee.builder()
                            .amount("0.00305")
                            .currency("USD")
                            .build()
                    )
                    .rate(
                        OutboundMessagePayload.CostBreakdown.Rate.builder()
                            .amount("0.00205")
                            .currency("USD")
                            .build()
                    )
                    .build()
            )
        assertThat(outboundMessagePayload.direction())
            .contains(OutboundMessagePayload.Direction.OUTBOUND)
        assertThat(outboundMessagePayload.encoding()).contains("GSM-7")
        assertThat(outboundMessagePayload.errors().getOrNull())
            .containsExactly(
                MessagingError.builder()
                    .code("code")
                    .title("title")
                    .detail("detail")
                    .meta(JsonValue.from(mapOf<String, Any>()))
                    .source(
                        MessagingError.Source.builder()
                            .parameter("parameter")
                            .pointer("pointer")
                            .build()
                    )
                    .build()
            )
        assertThat(outboundMessagePayload.from())
            .contains(
                OutboundMessagePayload.From.builder()
                    .carrier("TELNYX LLC")
                    .lineType(OutboundMessagePayload.From.LineType.VO_IP)
                    .phoneNumber("+18445550001")
                    .build()
            )
        assertThat(outboundMessagePayload.media().getOrNull())
            .containsExactly(
                OutboundMessagePayload.Media.builder()
                    .contentType(null)
                    .sha256(null)
                    .size(null)
                    .url(
                        "https://pbs.twimg.com/profile_images/1142168442042118144/AW3F4fFD_400x400.png"
                    )
                    .build()
            )
        assertThat(outboundMessagePayload.messagingProfileId())
            .contains("4000eba1-a0c0-4563-9925-b25e842a7cb6")
        assertThat(outboundMessagePayload.organizationId())
            .contains("b448f9cc-a842-4784-98e9-03c1a5872950")
        assertThat(outboundMessagePayload.parts()).contains(1L)
        assertThat(outboundMessagePayload.receivedAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(outboundMessagePayload.recordType())
            .contains(OutboundMessagePayload.RecordType.MESSAGE)
        assertThat(outboundMessagePayload.sentAt()).isEmpty
        assertThat(outboundMessagePayload.subject()).contains("From Telnyx!")
        assertThat(outboundMessagePayload.tags().getOrNull()).containsExactly("Greetings")
        assertThat(outboundMessagePayload.tcrCampaignBillable()).contains(true)
        assertThat(outboundMessagePayload.tcrCampaignId()).contains("TCPA3X7")
        assertThat(outboundMessagePayload.tcrCampaignRegistered()).contains("REGISTERED")
        assertThat(outboundMessagePayload.text()).contains("Hello, World!")
        assertThat(outboundMessagePayload.to().getOrNull())
            .containsExactly(
                OutboundMessagePayload.To.builder()
                    .carrier("T-MOBILE USA, INC.")
                    .lineType(OutboundMessagePayload.To.LineType.WIRELESS)
                    .phoneNumber("+18665550001")
                    .status(OutboundMessagePayload.To.Status.QUEUED)
                    .build()
            )
        assertThat(outboundMessagePayload.type()).contains(OutboundMessagePayload.Type.MMS)
        assertThat(outboundMessagePayload.validUntil()).isEmpty
        assertThat(outboundMessagePayload.webhookFailoverUrl())
            .contains("https://backup.example.com/hooks")
        assertThat(outboundMessagePayload.webhookUrl()).contains("https://www.example.com/hooks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val outboundMessagePayload =
            OutboundMessagePayload.builder()
                .id("40385f64-5717-4562-b3fc-2c963f66afa6")
                .addCc(
                    OutboundMessagePayload.Cc.builder()
                        .carrier("carrier")
                        .lineType(OutboundMessagePayload.Cc.LineType.WIRELINE)
                        .phoneNumber("phone_number")
                        .status(OutboundMessagePayload.Cc.Status.QUEUED)
                        .build()
                )
                .completedAt(null)
                .cost(
                    OutboundMessagePayload.Cost.builder().amount("0.0051").currency("USD").build()
                )
                .costBreakdown(
                    OutboundMessagePayload.CostBreakdown.builder()
                        .carrierFee(
                            OutboundMessagePayload.CostBreakdown.CarrierFee.builder()
                                .amount("0.00305")
                                .currency("USD")
                                .build()
                        )
                        .rate(
                            OutboundMessagePayload.CostBreakdown.Rate.builder()
                                .amount("0.00205")
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .direction(OutboundMessagePayload.Direction.OUTBOUND)
                .encoding("GSM-7")
                .addError(
                    MessagingError.builder()
                        .code("code")
                        .title("title")
                        .detail("detail")
                        .meta(JsonValue.from(mapOf<String, Any>()))
                        .source(
                            MessagingError.Source.builder()
                                .parameter("parameter")
                                .pointer("pointer")
                                .build()
                        )
                        .build()
                )
                .from(
                    OutboundMessagePayload.From.builder()
                        .carrier("TELNYX LLC")
                        .lineType(OutboundMessagePayload.From.LineType.VO_IP)
                        .phoneNumber("+18445550001")
                        .build()
                )
                .addMedia(
                    OutboundMessagePayload.Media.builder()
                        .contentType(null)
                        .sha256(null)
                        .size(null)
                        .url(
                            "https://pbs.twimg.com/profile_images/1142168442042118144/AW3F4fFD_400x400.png"
                        )
                        .build()
                )
                .messagingProfileId("4000eba1-a0c0-4563-9925-b25e842a7cb6")
                .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                .parts(1L)
                .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .recordType(OutboundMessagePayload.RecordType.MESSAGE)
                .sentAt(null)
                .subject("From Telnyx!")
                .addTag("Greetings")
                .tcrCampaignBillable(true)
                .tcrCampaignId("TCPA3X7")
                .tcrCampaignRegistered("REGISTERED")
                .text("Hello, World!")
                .addTo(
                    OutboundMessagePayload.To.builder()
                        .carrier("T-MOBILE USA, INC.")
                        .lineType(OutboundMessagePayload.To.LineType.WIRELESS)
                        .phoneNumber("+18665550001")
                        .status(OutboundMessagePayload.To.Status.QUEUED)
                        .build()
                )
                .type(OutboundMessagePayload.Type.MMS)
                .validUntil(null)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("https://www.example.com/hooks")
                .build()

        val roundtrippedOutboundMessagePayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outboundMessagePayload),
                jacksonTypeRef<OutboundMessagePayload>(),
            )

        assertThat(roundtrippedOutboundMessagePayload).isEqualTo(outboundMessagePayload)
    }
}
