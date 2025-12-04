// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageCancelScheduledResponseTest {

    @Test
    fun create() {
        val messageCancelScheduledResponse =
            MessageCancelScheduledResponse.builder()
                .id("40385f64-5717-4562-b3fc-2c963f66afa6")
                .addCc(
                    MessageCancelScheduledResponse.Cc.builder()
                        .carrier("carrier")
                        .lineType(MessageCancelScheduledResponse.Cc.LineType.WIRELINE)
                        .phoneNumber("phone_number")
                        .status(MessageCancelScheduledResponse.Cc.Status.SCHEDULED)
                        .build()
                )
                .completedAt(null)
                .cost(
                    MessageCancelScheduledResponse.Cost.builder()
                        .amount("0.0")
                        .currency("USD")
                        .build()
                )
                .costBreakdown(
                    MessageCancelScheduledResponse.CostBreakdown.builder()
                        .carrierFee(
                            MessageCancelScheduledResponse.CostBreakdown.CarrierFee.builder()
                                .amount("amount")
                                .currency("currency")
                                .build()
                        )
                        .rate(
                            MessageCancelScheduledResponse.CostBreakdown.Rate.builder()
                                .amount("amount")
                                .currency("currency")
                                .build()
                        )
                        .build()
                )
                .direction(MessageCancelScheduledResponse.Direction.OUTBOUND)
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
                    MessageCancelScheduledResponse.From.builder()
                        .carrier("TELNYX LLC")
                        .lineType(MessageCancelScheduledResponse.From.LineType.VO_IP)
                        .phoneNumber("+18445550001")
                        .build()
                )
                .addMedia(
                    MessageCancelScheduledResponse.Media.builder()
                        .contentType("content_type")
                        .sha256("sha256")
                        .size(0L)
                        .url("url")
                        .build()
                )
                .messagingProfileId("4000eba1-a0c0-4563-9925-b25e842a7cb6")
                .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                .parts(1L)
                .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .recordType(MessageCancelScheduledResponse.RecordType.MESSAGE)
                .sentAt(null)
                .subject("From Telnyx!")
                .addTag("Greetings")
                .tcrCampaignBillable(true)
                .tcrCampaignId("TCPA3X7")
                .tcrCampaignRegistered("REGISTERED")
                .text("Hello, World!")
                .addTo(
                    MessageCancelScheduledResponse.To.builder()
                        .carrier("T-MOBILE USA, INC.")
                        .lineType(MessageCancelScheduledResponse.To.LineType.WIRELESS)
                        .phoneNumber("+18665550001")
                        .status(MessageCancelScheduledResponse.To.Status.CANCELLED)
                        .build()
                )
                .type(MessageCancelScheduledResponse.Type.SMS)
                .validUntil(null)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("https://www.example.com/hooks")
                .build()

        assertThat(messageCancelScheduledResponse.id())
            .contains("40385f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(messageCancelScheduledResponse.cc().getOrNull())
            .containsExactly(
                MessageCancelScheduledResponse.Cc.builder()
                    .carrier("carrier")
                    .lineType(MessageCancelScheduledResponse.Cc.LineType.WIRELINE)
                    .phoneNumber("phone_number")
                    .status(MessageCancelScheduledResponse.Cc.Status.SCHEDULED)
                    .build()
            )
        assertThat(messageCancelScheduledResponse.completedAt()).isEmpty
        assertThat(messageCancelScheduledResponse.cost())
            .contains(
                MessageCancelScheduledResponse.Cost.builder().amount("0.0").currency("USD").build()
            )
        assertThat(messageCancelScheduledResponse.costBreakdown())
            .contains(
                MessageCancelScheduledResponse.CostBreakdown.builder()
                    .carrierFee(
                        MessageCancelScheduledResponse.CostBreakdown.CarrierFee.builder()
                            .amount("amount")
                            .currency("currency")
                            .build()
                    )
                    .rate(
                        MessageCancelScheduledResponse.CostBreakdown.Rate.builder()
                            .amount("amount")
                            .currency("currency")
                            .build()
                    )
                    .build()
            )
        assertThat(messageCancelScheduledResponse.direction())
            .contains(MessageCancelScheduledResponse.Direction.OUTBOUND)
        assertThat(messageCancelScheduledResponse.encoding()).contains("GSM-7")
        assertThat(messageCancelScheduledResponse.errors().getOrNull())
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
        assertThat(messageCancelScheduledResponse.from())
            .contains(
                MessageCancelScheduledResponse.From.builder()
                    .carrier("TELNYX LLC")
                    .lineType(MessageCancelScheduledResponse.From.LineType.VO_IP)
                    .phoneNumber("+18445550001")
                    .build()
            )
        assertThat(messageCancelScheduledResponse.media().getOrNull())
            .containsExactly(
                MessageCancelScheduledResponse.Media.builder()
                    .contentType("content_type")
                    .sha256("sha256")
                    .size(0L)
                    .url("url")
                    .build()
            )
        assertThat(messageCancelScheduledResponse.messagingProfileId())
            .contains("4000eba1-a0c0-4563-9925-b25e842a7cb6")
        assertThat(messageCancelScheduledResponse.organizationId())
            .contains("b448f9cc-a842-4784-98e9-03c1a5872950")
        assertThat(messageCancelScheduledResponse.parts()).contains(1L)
        assertThat(messageCancelScheduledResponse.receivedAt())
            .contains(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
        assertThat(messageCancelScheduledResponse.recordType())
            .contains(MessageCancelScheduledResponse.RecordType.MESSAGE)
        assertThat(messageCancelScheduledResponse.sentAt()).isEmpty
        assertThat(messageCancelScheduledResponse.subject()).contains("From Telnyx!")
        assertThat(messageCancelScheduledResponse.tags().getOrNull()).containsExactly("Greetings")
        assertThat(messageCancelScheduledResponse.tcrCampaignBillable()).contains(true)
        assertThat(messageCancelScheduledResponse.tcrCampaignId()).contains("TCPA3X7")
        assertThat(messageCancelScheduledResponse.tcrCampaignRegistered()).contains("REGISTERED")
        assertThat(messageCancelScheduledResponse.text()).contains("Hello, World!")
        assertThat(messageCancelScheduledResponse.to().getOrNull())
            .containsExactly(
                MessageCancelScheduledResponse.To.builder()
                    .carrier("T-MOBILE USA, INC.")
                    .lineType(MessageCancelScheduledResponse.To.LineType.WIRELESS)
                    .phoneNumber("+18665550001")
                    .status(MessageCancelScheduledResponse.To.Status.CANCELLED)
                    .build()
            )
        assertThat(messageCancelScheduledResponse.type())
            .contains(MessageCancelScheduledResponse.Type.SMS)
        assertThat(messageCancelScheduledResponse.validUntil()).isEmpty
        assertThat(messageCancelScheduledResponse.webhookFailoverUrl())
            .contains("https://backup.example.com/hooks")
        assertThat(messageCancelScheduledResponse.webhookUrl())
            .contains("https://www.example.com/hooks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageCancelScheduledResponse =
            MessageCancelScheduledResponse.builder()
                .id("40385f64-5717-4562-b3fc-2c963f66afa6")
                .addCc(
                    MessageCancelScheduledResponse.Cc.builder()
                        .carrier("carrier")
                        .lineType(MessageCancelScheduledResponse.Cc.LineType.WIRELINE)
                        .phoneNumber("phone_number")
                        .status(MessageCancelScheduledResponse.Cc.Status.SCHEDULED)
                        .build()
                )
                .completedAt(null)
                .cost(
                    MessageCancelScheduledResponse.Cost.builder()
                        .amount("0.0")
                        .currency("USD")
                        .build()
                )
                .costBreakdown(
                    MessageCancelScheduledResponse.CostBreakdown.builder()
                        .carrierFee(
                            MessageCancelScheduledResponse.CostBreakdown.CarrierFee.builder()
                                .amount("amount")
                                .currency("currency")
                                .build()
                        )
                        .rate(
                            MessageCancelScheduledResponse.CostBreakdown.Rate.builder()
                                .amount("amount")
                                .currency("currency")
                                .build()
                        )
                        .build()
                )
                .direction(MessageCancelScheduledResponse.Direction.OUTBOUND)
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
                    MessageCancelScheduledResponse.From.builder()
                        .carrier("TELNYX LLC")
                        .lineType(MessageCancelScheduledResponse.From.LineType.VO_IP)
                        .phoneNumber("+18445550001")
                        .build()
                )
                .addMedia(
                    MessageCancelScheduledResponse.Media.builder()
                        .contentType("content_type")
                        .sha256("sha256")
                        .size(0L)
                        .url("url")
                        .build()
                )
                .messagingProfileId("4000eba1-a0c0-4563-9925-b25e842a7cb6")
                .organizationId("b448f9cc-a842-4784-98e9-03c1a5872950")
                .parts(1L)
                .receivedAt(OffsetDateTime.parse("2019-01-23T18:10:02.574Z"))
                .recordType(MessageCancelScheduledResponse.RecordType.MESSAGE)
                .sentAt(null)
                .subject("From Telnyx!")
                .addTag("Greetings")
                .tcrCampaignBillable(true)
                .tcrCampaignId("TCPA3X7")
                .tcrCampaignRegistered("REGISTERED")
                .text("Hello, World!")
                .addTo(
                    MessageCancelScheduledResponse.To.builder()
                        .carrier("T-MOBILE USA, INC.")
                        .lineType(MessageCancelScheduledResponse.To.LineType.WIRELESS)
                        .phoneNumber("+18665550001")
                        .status(MessageCancelScheduledResponse.To.Status.CANCELLED)
                        .build()
                )
                .type(MessageCancelScheduledResponse.Type.SMS)
                .validUntil(null)
                .webhookFailoverUrl("https://backup.example.com/hooks")
                .webhookUrl("https://www.example.com/hooks")
                .build()

        val roundtrippedMessageCancelScheduledResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageCancelScheduledResponse),
                jacksonTypeRef<MessageCancelScheduledResponse>(),
            )

        assertThat(roundtrippedMessageCancelScheduledResponse)
            .isEqualTo(messageCancelScheduledResponse)
    }
}
