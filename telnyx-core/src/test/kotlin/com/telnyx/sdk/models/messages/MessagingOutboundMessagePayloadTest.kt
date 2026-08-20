// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingOutboundMessagePayloadTest {

    @Test
    fun create() {
        val messagingOutboundMessagePayload =
            MessagingOutboundMessagePayload.builder()
                .id("40385f64-5717-4562-b3fc-2c963f66afa6")
                .addCc(
                    MessagingOutboundMessagePayload.Cc.builder()
                        .carrier("carrier")
                        .lineType(MessagingOutboundMessagePayload.Cc.LineType.WIRELINE)
                        .phoneNumber("phone_number")
                        .status(MessagingOutboundMessagePayload.Cc.Status.QUEUED)
                        .build()
                )
                .completedAt(null)
                .cost(
                    MessagingOutboundMessagePayload.Cost.builder()
                        .amount("0.0051")
                        .currency("USD")
                        .build()
                )
                .costBreakdown(
                    MessagingOutboundMessagePayload.CostBreakdown.builder()
                        .carrierFee(
                            MessagingOutboundMessagePayload.CostBreakdown.CarrierFee.builder()
                                .amount("0.00305")
                                .currency("USD")
                                .build()
                        )
                        .rate(
                            MessagingOutboundMessagePayload.CostBreakdown.Rate.builder()
                                .amount("0.00205")
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .direction(MessagingOutboundMessagePayload.Direction.OUTBOUND)
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
                    MessagingOutboundMessagePayload.From.builder()
                        .carrier("TELNYX LLC")
                        .lineType(MessagingOutboundMessagePayload.From.LineType.VO_IP)
                        .phoneNumber("+18445550001")
                        .build()
                )
                .addMedia(
                    MessagingOutboundMessagePayload.Media.builder()
                        .contentType(null)
                        .sha256(null)
                        .size(null)
                        .url(
                            "https://pbs.twimg.com/profile_images/1142168442042118144/AW3F4fFD_400x400.png"
                        )
                        .build()
                )
                .messagingProfileId("4000eba1-a0c0-4563-9925-b25e842a7cb6")
                .numChars(13L)
                .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                .parts(1L)
                .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .recordType(MessagingOutboundMessagePayload.RecordType.MESSAGE)
                .sentAt(null)
                .smartEncodingApplied(true)
                .subject("From Telnyx!")
                .addTag("Greetings")
                .tcrCampaignBillable(true)
                .tcrCampaignId("TCPA3X7")
                .tcrCampaignRegistered("REGISTERED")
                .text("Hello, World!")
                .addTo(
                    MessagingOutboundMessagePayload.To.builder()
                        .carrier("T-MOBILE USA, INC.")
                        .lineType(MessagingOutboundMessagePayload.To.LineType.WIRELESS)
                        .phoneNumber("+18665550001")
                        .status(MessagingOutboundMessagePayload.To.Status.QUEUED)
                        .build()
                )
                .type(MessagingOutboundMessagePayload.Type.MMS)
                .validUntil(null)
                .waitSeconds(0.5f)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("https://www.example.com/hooks")
                .build()

        assertThat(messagingOutboundMessagePayload.id())
            .contains("40385f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(messagingOutboundMessagePayload.cc().getOrNull())
            .containsExactly(
                MessagingOutboundMessagePayload.Cc.builder()
                    .carrier("carrier")
                    .lineType(MessagingOutboundMessagePayload.Cc.LineType.WIRELINE)
                    .phoneNumber("phone_number")
                    .status(MessagingOutboundMessagePayload.Cc.Status.QUEUED)
                    .build()
            )
        assertThat(messagingOutboundMessagePayload.completedAt()).isEmpty
        assertThat(messagingOutboundMessagePayload.cost())
            .contains(
                MessagingOutboundMessagePayload.Cost.builder()
                    .amount("0.0051")
                    .currency("USD")
                    .build()
            )
        assertThat(messagingOutboundMessagePayload.costBreakdown())
            .contains(
                MessagingOutboundMessagePayload.CostBreakdown.builder()
                    .carrierFee(
                        MessagingOutboundMessagePayload.CostBreakdown.CarrierFee.builder()
                            .amount("0.00305")
                            .currency("USD")
                            .build()
                    )
                    .rate(
                        MessagingOutboundMessagePayload.CostBreakdown.Rate.builder()
                            .amount("0.00205")
                            .currency("USD")
                            .build()
                    )
                    .build()
            )
        assertThat(messagingOutboundMessagePayload.direction())
            .contains(MessagingOutboundMessagePayload.Direction.OUTBOUND)
        assertThat(messagingOutboundMessagePayload.encoding()).contains("GSM-7")
        assertThat(messagingOutboundMessagePayload.errors().getOrNull())
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
        assertThat(messagingOutboundMessagePayload.from())
            .contains(
                MessagingOutboundMessagePayload.From.builder()
                    .carrier("TELNYX LLC")
                    .lineType(MessagingOutboundMessagePayload.From.LineType.VO_IP)
                    .phoneNumber("+18445550001")
                    .build()
            )
        assertThat(messagingOutboundMessagePayload.media().getOrNull())
            .containsExactly(
                MessagingOutboundMessagePayload.Media.builder()
                    .contentType(null)
                    .sha256(null)
                    .size(null)
                    .url(
                        "https://pbs.twimg.com/profile_images/1142168442042118144/AW3F4fFD_400x400.png"
                    )
                    .build()
            )
        assertThat(messagingOutboundMessagePayload.messagingProfileId())
            .contains("4000eba1-a0c0-4563-9925-b25e842a7cb6")
        assertThat(messagingOutboundMessagePayload.numChars()).contains(13L)
        assertThat(messagingOutboundMessagePayload.organizationId())
            .contains("b448f9cc-a842-4784-98e9-03c1a5872950")
        assertThat(messagingOutboundMessagePayload.parts()).contains(1L)
        assertThat(messagingOutboundMessagePayload.receivedAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(messagingOutboundMessagePayload.recordType())
            .contains(MessagingOutboundMessagePayload.RecordType.MESSAGE)
        assertThat(messagingOutboundMessagePayload.sentAt()).isEmpty
        assertThat(messagingOutboundMessagePayload.smartEncodingApplied()).contains(true)
        assertThat(messagingOutboundMessagePayload.subject()).contains("From Telnyx!")
        assertThat(messagingOutboundMessagePayload.tags().getOrNull()).containsExactly("Greetings")
        assertThat(messagingOutboundMessagePayload.tcrCampaignBillable()).contains(true)
        assertThat(messagingOutboundMessagePayload.tcrCampaignId()).contains("TCPA3X7")
        assertThat(messagingOutboundMessagePayload.tcrCampaignRegistered()).contains("REGISTERED")
        assertThat(messagingOutboundMessagePayload.text()).contains("Hello, World!")
        assertThat(messagingOutboundMessagePayload.to().getOrNull())
            .containsExactly(
                MessagingOutboundMessagePayload.To.builder()
                    .carrier("T-MOBILE USA, INC.")
                    .lineType(MessagingOutboundMessagePayload.To.LineType.WIRELESS)
                    .phoneNumber("+18665550001")
                    .status(MessagingOutboundMessagePayload.To.Status.QUEUED)
                    .build()
            )
        assertThat(messagingOutboundMessagePayload.type())
            .contains(MessagingOutboundMessagePayload.Type.MMS)
        assertThat(messagingOutboundMessagePayload.validUntil()).isEmpty
        assertThat(messagingOutboundMessagePayload.waitSeconds()).contains(0.5f)
        assertThat(messagingOutboundMessagePayload.webhookFailoverUrl())
            .contains("https://backup.example.com/hooks")
        assertThat(messagingOutboundMessagePayload.webhookUrl())
            .contains("https://www.example.com/hooks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingOutboundMessagePayload =
            MessagingOutboundMessagePayload.builder()
                .id("40385f64-5717-4562-b3fc-2c963f66afa6")
                .addCc(
                    MessagingOutboundMessagePayload.Cc.builder()
                        .carrier("carrier")
                        .lineType(MessagingOutboundMessagePayload.Cc.LineType.WIRELINE)
                        .phoneNumber("phone_number")
                        .status(MessagingOutboundMessagePayload.Cc.Status.QUEUED)
                        .build()
                )
                .completedAt(null)
                .cost(
                    MessagingOutboundMessagePayload.Cost.builder()
                        .amount("0.0051")
                        .currency("USD")
                        .build()
                )
                .costBreakdown(
                    MessagingOutboundMessagePayload.CostBreakdown.builder()
                        .carrierFee(
                            MessagingOutboundMessagePayload.CostBreakdown.CarrierFee.builder()
                                .amount("0.00305")
                                .currency("USD")
                                .build()
                        )
                        .rate(
                            MessagingOutboundMessagePayload.CostBreakdown.Rate.builder()
                                .amount("0.00205")
                                .currency("USD")
                                .build()
                        )
                        .build()
                )
                .direction(MessagingOutboundMessagePayload.Direction.OUTBOUND)
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
                    MessagingOutboundMessagePayload.From.builder()
                        .carrier("TELNYX LLC")
                        .lineType(MessagingOutboundMessagePayload.From.LineType.VO_IP)
                        .phoneNumber("+18445550001")
                        .build()
                )
                .addMedia(
                    MessagingOutboundMessagePayload.Media.builder()
                        .contentType(null)
                        .sha256(null)
                        .size(null)
                        .url(
                            "https://pbs.twimg.com/profile_images/1142168442042118144/AW3F4fFD_400x400.png"
                        )
                        .build()
                )
                .messagingProfileId("4000eba1-a0c0-4563-9925-b25e842a7cb6")
                .numChars(13L)
                .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                .parts(1L)
                .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .recordType(MessagingOutboundMessagePayload.RecordType.MESSAGE)
                .sentAt(null)
                .smartEncodingApplied(true)
                .subject("From Telnyx!")
                .addTag("Greetings")
                .tcrCampaignBillable(true)
                .tcrCampaignId("TCPA3X7")
                .tcrCampaignRegistered("REGISTERED")
                .text("Hello, World!")
                .addTo(
                    MessagingOutboundMessagePayload.To.builder()
                        .carrier("T-MOBILE USA, INC.")
                        .lineType(MessagingOutboundMessagePayload.To.LineType.WIRELESS)
                        .phoneNumber("+18665550001")
                        .status(MessagingOutboundMessagePayload.To.Status.QUEUED)
                        .build()
                )
                .type(MessagingOutboundMessagePayload.Type.MMS)
                .validUntil(null)
                .waitSeconds(0.5f)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("https://www.example.com/hooks")
                .build()

        val roundtrippedMessagingOutboundMessagePayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingOutboundMessagePayload),
                jacksonTypeRef<MessagingOutboundMessagePayload>(),
            )

        assertThat(roundtrippedMessagingOutboundMessagePayload)
            .isEqualTo(messagingOutboundMessagePayload)
    }
}
