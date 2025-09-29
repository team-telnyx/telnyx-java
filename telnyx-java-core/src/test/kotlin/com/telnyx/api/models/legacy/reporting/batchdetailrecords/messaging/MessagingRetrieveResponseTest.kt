// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.legacy.reporting.batchdetailrecords.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingRetrieveResponseTest {

    @Test
    fun create() {
        val messagingRetrieveResponse =
            MessagingRetrieveResponse.builder()
                .data(
                    MessagingRetrieveResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addConnection(0L)
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .addDirection(MessagingRetrieveResponse.Data.Direction.INBOUND)
                        .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .addFilter(
                            MessagingRetrieveResponse.Data.Filter.builder()
                                .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                                .cld("+13129457420")
                                .cldFilter(MessagingRetrieveResponse.Data.Filter.CldFilter.CONTAINS)
                                .cli("+13129457420")
                                .cliFilter(MessagingRetrieveResponse.Data.Filter.CliFilter.CONTAINS)
                                .filterType(MessagingRetrieveResponse.Data.Filter.FilterType.AND)
                                .tagsList("tag1")
                                .build()
                        )
                        .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                        .recordType("mdr_report")
                        .addRecordType(MessagingRetrieveResponse.Data.RecordType.INCOMPLETE)
                        .reportName("report_name_8hvb45Gu")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .status(MessagingRetrieveResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .build()
                )
                .build()

        assertThat(messagingRetrieveResponse.data())
            .contains(
                MessagingRetrieveResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addConnection(0L)
                    .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .addDirection(MessagingRetrieveResponse.Data.Direction.INBOUND)
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .addFilter(
                        MessagingRetrieveResponse.Data.Filter.builder()
                            .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                            .cld("+13129457420")
                            .cldFilter(MessagingRetrieveResponse.Data.Filter.CldFilter.CONTAINS)
                            .cli("+13129457420")
                            .cliFilter(MessagingRetrieveResponse.Data.Filter.CliFilter.CONTAINS)
                            .filterType(MessagingRetrieveResponse.Data.Filter.FilterType.AND)
                            .tagsList("tag1")
                            .build()
                    )
                    .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                    .recordType("mdr_report")
                    .addRecordType(MessagingRetrieveResponse.Data.RecordType.INCOMPLETE)
                    .reportName("report_name_8hvb45Gu")
                    .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .status(MessagingRetrieveResponse.Data.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingRetrieveResponse =
            MessagingRetrieveResponse.builder()
                .data(
                    MessagingRetrieveResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addConnection(0L)
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .addDirection(MessagingRetrieveResponse.Data.Direction.INBOUND)
                        .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .addFilter(
                            MessagingRetrieveResponse.Data.Filter.builder()
                                .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                                .cld("+13129457420")
                                .cldFilter(MessagingRetrieveResponse.Data.Filter.CldFilter.CONTAINS)
                                .cli("+13129457420")
                                .cliFilter(MessagingRetrieveResponse.Data.Filter.CliFilter.CONTAINS)
                                .filterType(MessagingRetrieveResponse.Data.Filter.FilterType.AND)
                                .tagsList("tag1")
                                .build()
                        )
                        .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                        .recordType("mdr_report")
                        .addRecordType(MessagingRetrieveResponse.Data.RecordType.INCOMPLETE)
                        .reportName("report_name_8hvb45Gu")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .status(MessagingRetrieveResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .build()
                )
                .build()

        val roundtrippedMessagingRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingRetrieveResponse),
                jacksonTypeRef<MessagingRetrieveResponse>(),
            )

        assertThat(roundtrippedMessagingRetrieveResponse).isEqualTo(messagingRetrieveResponse)
    }
}
