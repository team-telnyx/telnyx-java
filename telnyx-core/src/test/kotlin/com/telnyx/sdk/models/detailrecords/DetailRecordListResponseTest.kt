// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.detailrecords

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetailRecordListResponseTest {

    @Test
    fun create() {
        val detailRecordListResponse =
            DetailRecordListResponse.builder()
                .addData(
                    DetailRecordListResponse.Data.MessageDetailRecord.builder()
                        .recordType("message_detail_record")
                        .carrier("T-Mobile USA")
                        .carrierFee("0.003")
                        .cld("+1555123456")
                        .cli("+1555123456")
                        .completedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .cost("0.003")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .currency("USD")
                        .deliveryStatus("success: webhook succeeded")
                        .deliveryStatusFailoverUrl("https://api.example.com/sms/telnyx/inbound")
                        .deliveryStatusWebhookUrl("https://api.example.com/sms/telnyx/inbound")
                        .direction(
                            DetailRecordListResponse.Data.MessageDetailRecord.Direction.OUTBOUND
                        )
                        .addError("40001")
                        .fteu(false)
                        .mcc("204")
                        .messageType(
                            DetailRecordListResponse.Data.MessageDetailRecord.MessageType.SMS
                        )
                        .mnc("01")
                        .onNet(true)
                        .parts(2L)
                        .profileId("30ef55db-c4a2-4c4a-9804-a68077973d07")
                        .profileName("My Messaging Profile")
                        .rate("0.003")
                        .sentAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .sourceCountryCode("US")
                        .status(DetailRecordListResponse.Data.MessageDetailRecord.Status.DELIVERED)
                        .tags("tag1,tag2,tag3")
                        .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                        .uuid("3ca7bd3d-7d82-4e07-9df4-009123068320")
                        .build()
                )
                .meta(
                    DetailRecordListResponse.Meta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        assertThat(detailRecordListResponse.data().getOrNull())
            .containsExactly(
                DetailRecordListResponse.Data.ofMessageDetailRecord(
                    DetailRecordListResponse.Data.MessageDetailRecord.builder()
                        .recordType("message_detail_record")
                        .carrier("T-Mobile USA")
                        .carrierFee("0.003")
                        .cld("+1555123456")
                        .cli("+1555123456")
                        .completedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .cost("0.003")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .currency("USD")
                        .deliveryStatus("success: webhook succeeded")
                        .deliveryStatusFailoverUrl("https://api.example.com/sms/telnyx/inbound")
                        .deliveryStatusWebhookUrl("https://api.example.com/sms/telnyx/inbound")
                        .direction(
                            DetailRecordListResponse.Data.MessageDetailRecord.Direction.OUTBOUND
                        )
                        .addError("40001")
                        .fteu(false)
                        .mcc("204")
                        .messageType(
                            DetailRecordListResponse.Data.MessageDetailRecord.MessageType.SMS
                        )
                        .mnc("01")
                        .onNet(true)
                        .parts(2L)
                        .profileId("30ef55db-c4a2-4c4a-9804-a68077973d07")
                        .profileName("My Messaging Profile")
                        .rate("0.003")
                        .sentAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .sourceCountryCode("US")
                        .status(DetailRecordListResponse.Data.MessageDetailRecord.Status.DELIVERED)
                        .tags("tag1,tag2,tag3")
                        .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                        .uuid("3ca7bd3d-7d82-4e07-9df4-009123068320")
                        .build()
                )
            )
        assertThat(detailRecordListResponse.meta())
            .contains(
                DetailRecordListResponse.Meta.builder()
                    .pageNumber(2)
                    .pageSize(25)
                    .totalPages(3)
                    .totalResults(55)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val detailRecordListResponse =
            DetailRecordListResponse.builder()
                .addData(
                    DetailRecordListResponse.Data.MessageDetailRecord.builder()
                        .recordType("message_detail_record")
                        .carrier("T-Mobile USA")
                        .carrierFee("0.003")
                        .cld("+1555123456")
                        .cli("+1555123456")
                        .completedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .cost("0.003")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .currency("USD")
                        .deliveryStatus("success: webhook succeeded")
                        .deliveryStatusFailoverUrl("https://api.example.com/sms/telnyx/inbound")
                        .deliveryStatusWebhookUrl("https://api.example.com/sms/telnyx/inbound")
                        .direction(
                            DetailRecordListResponse.Data.MessageDetailRecord.Direction.OUTBOUND
                        )
                        .addError("40001")
                        .fteu(false)
                        .mcc("204")
                        .messageType(
                            DetailRecordListResponse.Data.MessageDetailRecord.MessageType.SMS
                        )
                        .mnc("01")
                        .onNet(true)
                        .parts(2L)
                        .profileId("30ef55db-c4a2-4c4a-9804-a68077973d07")
                        .profileName("My Messaging Profile")
                        .rate("0.003")
                        .sentAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .sourceCountryCode("US")
                        .status(DetailRecordListResponse.Data.MessageDetailRecord.Status.DELIVERED)
                        .tags("tag1,tag2,tag3")
                        .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00Z"))
                        .userId("3ca7bd3d-7d82-4e07-9df4-009123068320")
                        .uuid("3ca7bd3d-7d82-4e07-9df4-009123068320")
                        .build()
                )
                .meta(
                    DetailRecordListResponse.Meta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        val roundtrippedDetailRecordListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailRecordListResponse),
                jacksonTypeRef<DetailRecordListResponse>(),
            )

        assertThat(roundtrippedDetailRecordListResponse).isEqualTo(detailRecordListResponse)
    }
}
