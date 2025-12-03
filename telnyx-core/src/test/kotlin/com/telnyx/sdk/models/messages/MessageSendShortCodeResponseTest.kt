// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageSendShortCodeResponseTest {

    @Test
    fun create() {
        val messageSendShortCodeResponse =
            MessageSendShortCodeResponse.builder()
                .data(
                    OutboundMessagePayload.builder()
                        .id("40385f64-5717-4562-b3fc-2c963f66afa6")
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cost(
                            OutboundMessagePayload.Cost.builder()
                                .amount("amount")
                                .currency("USD")
                                .build()
                        )
                        .costBreakdown(
                            OutboundMessagePayload.CostBreakdown.builder()
                                .carrierFee(
                                    OutboundMessagePayload.CostBreakdown.CarrierFee.builder()
                                        .amount("amount")
                                        .currency("USD")
                                        .build()
                                )
                                .rate(
                                    OutboundMessagePayload.CostBreakdown.Rate.builder()
                                        .amount("amount")
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
                        .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                )
                .build()

        assertThat(messageSendShortCodeResponse.data())
            .contains(
                OutboundMessagePayload.builder()
                    .id("40385f64-5717-4562-b3fc-2c963f66afa6")
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cost(
                        OutboundMessagePayload.Cost.builder()
                            .amount("amount")
                            .currency("USD")
                            .build()
                    )
                    .costBreakdown(
                        OutboundMessagePayload.CostBreakdown.builder()
                            .carrierFee(
                                OutboundMessagePayload.CostBreakdown.CarrierFee.builder()
                                    .amount("amount")
                                    .currency("USD")
                                    .build()
                            )
                            .rate(
                                OutboundMessagePayload.CostBreakdown.Rate.builder()
                                    .amount("amount")
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
                    .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageSendShortCodeResponse =
            MessageSendShortCodeResponse.builder()
                .data(
                    OutboundMessagePayload.builder()
                        .id("40385f64-5717-4562-b3fc-2c963f66afa6")
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cost(
                            OutboundMessagePayload.Cost.builder()
                                .amount("amount")
                                .currency("USD")
                                .build()
                        )
                        .costBreakdown(
                            OutboundMessagePayload.CostBreakdown.builder()
                                .carrierFee(
                                    OutboundMessagePayload.CostBreakdown.CarrierFee.builder()
                                        .amount("amount")
                                        .currency("USD")
                                        .build()
                                )
                                .rate(
                                    OutboundMessagePayload.CostBreakdown.Rate.builder()
                                        .amount("amount")
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
                        .sentAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                )
                .build()

        val roundtrippedMessageSendShortCodeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageSendShortCodeResponse),
                jacksonTypeRef<MessageSendShortCodeResponse>(),
            )

        assertThat(roundtrippedMessageSendShortCodeResponse).isEqualTo(messageSendShortCodeResponse)
    }
}
