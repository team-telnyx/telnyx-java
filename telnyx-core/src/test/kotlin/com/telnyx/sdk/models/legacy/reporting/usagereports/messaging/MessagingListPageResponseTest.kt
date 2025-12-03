// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingListPageResponseTest {

    @Test
    fun create() {
        val messagingListPageResponse =
            MessagingListPageResponse.builder()
                .addData(
                    MdrUsageReportResponseLegacy.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .aggregationType(0)
                        .addConnection("1234567890")
                        .addConnection("9876543210")
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                        .recordType("mdr_usage_report_v2_legacy")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .result(
                            MdrUsageReportResponseLegacy.Result.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .status(0)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .meta(
                    StandardPaginationMeta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        assertThat(messagingListPageResponse.data().getOrNull())
            .containsExactly(
                MdrUsageReportResponseLegacy.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .aggregationType(0)
                    .addConnection("1234567890")
                    .addConnection("9876543210")
                    .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                    .recordType("mdr_usage_report_v2_legacy")
                    .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                    .result(
                        MdrUsageReportResponseLegacy.Result.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .status(0)
                    .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .build()
            )
        assertThat(messagingListPageResponse.meta())
            .contains(
                StandardPaginationMeta.builder()
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
        val messagingListPageResponse =
            MessagingListPageResponse.builder()
                .addData(
                    MdrUsageReportResponseLegacy.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .aggregationType(0)
                        .addConnection("1234567890")
                        .addConnection("9876543210")
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                        .recordType("mdr_usage_report_v2_legacy")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .result(
                            MdrUsageReportResponseLegacy.Result.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .status(0)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .meta(
                    StandardPaginationMeta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        val roundtrippedMessagingListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingListPageResponse),
                jacksonTypeRef<MessagingListPageResponse>(),
            )

        assertThat(roundtrippedMessagingListPageResponse).isEqualTo(messagingListPageResponse)
    }
}
