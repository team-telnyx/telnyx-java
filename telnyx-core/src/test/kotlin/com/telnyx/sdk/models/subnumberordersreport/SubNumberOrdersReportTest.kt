// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberordersreport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrdersReportTest {

    @Test
    fun create() {
        val subNumberOrdersReport =
            SubNumberOrdersReport.builder()
                .id("cada7e84-122b-4b47-bc66-58c7c3becd40")
                .createdAt(OffsetDateTime.parse("2025-06-11T13:21:40.967339+00:00"))
                .filters(
                    SubNumberOrdersReport.Filters.builder()
                        .countryCode("US")
                        .createdAtGt(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
                        .createdAtLt(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
                        .customerReference("STRING")
                        .orderRequestId("991b8ff5-4daf-4826-9a22-e3991b444a9c")
                        .status("success")
                        .build()
                )
                .orderType("sub_number_order")
                .status(SubNumberOrdersReport.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2025-06-11T13:21:45.753260+00:00"))
                .userId("0d7ef697-df19-413a-b724-56b0539f5397")
                .build()

        assertThat(subNumberOrdersReport.id()).contains("cada7e84-122b-4b47-bc66-58c7c3becd40")
        assertThat(subNumberOrdersReport.createdAt())
            .contains(OffsetDateTime.parse("2025-06-11T13:21:40.967339+00:00"))
        assertThat(subNumberOrdersReport.filters())
            .contains(
                SubNumberOrdersReport.Filters.builder()
                    .countryCode("US")
                    .createdAtGt(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
                    .createdAtLt(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
                    .customerReference("STRING")
                    .orderRequestId("991b8ff5-4daf-4826-9a22-e3991b444a9c")
                    .status("success")
                    .build()
            )
        assertThat(subNumberOrdersReport.orderType()).contains("sub_number_order")
        assertThat(subNumberOrdersReport.status()).contains(SubNumberOrdersReport.Status.PENDING)
        assertThat(subNumberOrdersReport.updatedAt())
            .contains(OffsetDateTime.parse("2025-06-11T13:21:45.753260+00:00"))
        assertThat(subNumberOrdersReport.userId()).contains("0d7ef697-df19-413a-b724-56b0539f5397")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subNumberOrdersReport =
            SubNumberOrdersReport.builder()
                .id("cada7e84-122b-4b47-bc66-58c7c3becd40")
                .createdAt(OffsetDateTime.parse("2025-06-11T13:21:40.967339+00:00"))
                .filters(
                    SubNumberOrdersReport.Filters.builder()
                        .countryCode("US")
                        .createdAtGt(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
                        .createdAtLt(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
                        .customerReference("STRING")
                        .orderRequestId("991b8ff5-4daf-4826-9a22-e3991b444a9c")
                        .status("success")
                        .build()
                )
                .orderType("sub_number_order")
                .status(SubNumberOrdersReport.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2025-06-11T13:21:45.753260+00:00"))
                .userId("0d7ef697-df19-413a-b724-56b0539f5397")
                .build()

        val roundtrippedSubNumberOrdersReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subNumberOrdersReport),
                jacksonTypeRef<SubNumberOrdersReport>(),
            )

        assertThat(roundtrippedSubNumberOrdersReport).isEqualTo(subNumberOrdersReport)
    }
}
