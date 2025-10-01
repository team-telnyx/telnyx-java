// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingDeleteResponseTest {

    @Test
    fun create() {
        val messagingDeleteResponse =
            MessagingDeleteResponse.builder()
                .data(
                    MessagingDeleteResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addConnection(0L)
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .addDirection(MessagingDeleteResponse.Data.Direction.INBOUND)
                        .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .addFilter(
                            MessagingDeleteResponse.Data.Filter.builder()
                                .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                                .cld("+13129457420")
                                .cldFilter(MessagingDeleteResponse.Data.Filter.CldFilter.CONTAINS)
                                .cli("+13129457420")
                                .cliFilter(MessagingDeleteResponse.Data.Filter.CliFilter.CONTAINS)
                                .filterType(MessagingDeleteResponse.Data.Filter.FilterType.AND)
                                .tagsList("tag1")
                                .build()
                        )
                        .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                        .recordType("mdr_report")
                        .addRecordType(MessagingDeleteResponse.Data.RecordType.INCOMPLETE)
                        .reportName("report_name_8hvb45Gu")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .status(MessagingDeleteResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .build()
                )
                .build()

        assertThat(messagingDeleteResponse.data())
            .contains(
                MessagingDeleteResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addConnection(0L)
                    .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .addDirection(MessagingDeleteResponse.Data.Direction.INBOUND)
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .addFilter(
                        MessagingDeleteResponse.Data.Filter.builder()
                            .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                            .cld("+13129457420")
                            .cldFilter(MessagingDeleteResponse.Data.Filter.CldFilter.CONTAINS)
                            .cli("+13129457420")
                            .cliFilter(MessagingDeleteResponse.Data.Filter.CliFilter.CONTAINS)
                            .filterType(MessagingDeleteResponse.Data.Filter.FilterType.AND)
                            .tagsList("tag1")
                            .build()
                    )
                    .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                    .recordType("mdr_report")
                    .addRecordType(MessagingDeleteResponse.Data.RecordType.INCOMPLETE)
                    .reportName("report_name_8hvb45Gu")
                    .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .status(MessagingDeleteResponse.Data.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messagingDeleteResponse =
            MessagingDeleteResponse.builder()
                .data(
                    MessagingDeleteResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addConnection(0L)
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .addDirection(MessagingDeleteResponse.Data.Direction.INBOUND)
                        .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .addFilter(
                            MessagingDeleteResponse.Data.Filter.builder()
                                .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                                .cld("+13129457420")
                                .cldFilter(MessagingDeleteResponse.Data.Filter.CldFilter.CONTAINS)
                                .cli("+13129457420")
                                .cliFilter(MessagingDeleteResponse.Data.Filter.CliFilter.CONTAINS)
                                .filterType(MessagingDeleteResponse.Data.Filter.FilterType.AND)
                                .tagsList("tag1")
                                .build()
                        )
                        .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                        .recordType("mdr_report")
                        .addRecordType(MessagingDeleteResponse.Data.RecordType.INCOMPLETE)
                        .reportName("report_name_8hvb45Gu")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .status(MessagingDeleteResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .build()
                )
                .build()

        val roundtrippedMessagingDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingDeleteResponse),
                jacksonTypeRef<MessagingDeleteResponse>(),
            )

        assertThat(roundtrippedMessagingDeleteResponse).isEqualTo(messagingDeleteResponse)
    }
}
