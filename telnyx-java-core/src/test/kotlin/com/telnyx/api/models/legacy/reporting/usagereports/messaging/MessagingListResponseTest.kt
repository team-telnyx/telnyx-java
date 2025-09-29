// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.legacy.reporting.usagereports.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessagingListResponseTest {

    @Test
    fun create() {
        val messagingListResponse =
            MessagingListResponse.builder()
                .addData(
                    MessagingListResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .aggregationType(0)
                        .addConnection(0L)
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                        .recordType("mdr_usage_report_v2_legacy")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .result(JsonValue.from(mapOf<String, Any>()))
                        .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .status(0)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .meta(
                    MessagingListResponse.Meta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        assertThat(messagingListResponse.data().getOrNull())
            .containsExactly(
                MessagingListResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .aggregationType(0)
                    .addConnection(0L)
                    .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                    .recordType("mdr_usage_report_v2_legacy")
                    .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                    .result(JsonValue.from(mapOf<String, Any>()))
                    .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .status(0)
                    .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .build()
            )
        assertThat(messagingListResponse.meta())
            .contains(
                MessagingListResponse.Meta.builder()
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
        val messagingListResponse =
            MessagingListResponse.builder()
                .addData(
                    MessagingListResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .aggregationType(0)
                        .addConnection(0L)
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                        .recordType("mdr_usage_report_v2_legacy")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .result(JsonValue.from(mapOf<String, Any>()))
                        .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .status(0)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .meta(
                    MessagingListResponse.Meta.builder()
                        .pageNumber(2)
                        .pageSize(25)
                        .totalPages(3)
                        .totalResults(55)
                        .build()
                )
                .build()

        val roundtrippedMessagingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messagingListResponse),
                jacksonTypeRef<MessagingListResponse>(),
            )

        assertThat(roundtrippedMessagingListResponse).isEqualTo(messagingListResponse)
    }
}
