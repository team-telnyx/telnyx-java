// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberordersreport

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrdersReportRetrieveResponseTest {

    @Test
    fun create() {
        val subNumberOrdersReportRetrieveResponse =
            SubNumberOrdersReportRetrieveResponse.builder()
                .data(
                    SubNumberOrdersReportRetrieveResponse.Data.builder()
                        .id("cada7e84-122b-4b47-bc66-58c7c3becd40")
                        .createdAt(OffsetDateTime.parse("2025-06-11T13:21:40.967339+00:00"))
                        .filters(
                            SubNumberOrdersReportRetrieveResponse.Data.Filters.builder()
                                .countryCode("US")
                                .createdAtGt(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
                                .createdAtLt(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
                                .customerReference("STRING")
                                .orderRequestId("991b8ff5-4daf-4826-9a22-e3991b444a9c")
                                .status("success")
                                .build()
                        )
                        .orderType("sub_number_order")
                        .status(SubNumberOrdersReportRetrieveResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2025-06-11T13:21:45.753260+00:00"))
                        .userId("0d7ef697-df19-413a-b724-56b0539f5397")
                        .build()
                )
                .build()

        assertThat(subNumberOrdersReportRetrieveResponse.data())
            .contains(
                SubNumberOrdersReportRetrieveResponse.Data.builder()
                    .id("cada7e84-122b-4b47-bc66-58c7c3becd40")
                    .createdAt(OffsetDateTime.parse("2025-06-11T13:21:40.967339+00:00"))
                    .filters(
                        SubNumberOrdersReportRetrieveResponse.Data.Filters.builder()
                            .countryCode("US")
                            .createdAtGt(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
                            .createdAtLt(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
                            .customerReference("STRING")
                            .orderRequestId("991b8ff5-4daf-4826-9a22-e3991b444a9c")
                            .status("success")
                            .build()
                    )
                    .orderType("sub_number_order")
                    .status(SubNumberOrdersReportRetrieveResponse.Data.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2025-06-11T13:21:45.753260+00:00"))
                    .userId("0d7ef697-df19-413a-b724-56b0539f5397")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subNumberOrdersReportRetrieveResponse =
            SubNumberOrdersReportRetrieveResponse.builder()
                .data(
                    SubNumberOrdersReportRetrieveResponse.Data.builder()
                        .id("cada7e84-122b-4b47-bc66-58c7c3becd40")
                        .createdAt(OffsetDateTime.parse("2025-06-11T13:21:40.967339+00:00"))
                        .filters(
                            SubNumberOrdersReportRetrieveResponse.Data.Filters.builder()
                                .countryCode("US")
                                .createdAtGt(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
                                .createdAtLt(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
                                .customerReference("STRING")
                                .orderRequestId("991b8ff5-4daf-4826-9a22-e3991b444a9c")
                                .status("success")
                                .build()
                        )
                        .orderType("sub_number_order")
                        .status(SubNumberOrdersReportRetrieveResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2025-06-11T13:21:45.753260+00:00"))
                        .userId("0d7ef697-df19-413a-b724-56b0539f5397")
                        .build()
                )
                .build()

        val roundtrippedSubNumberOrdersReportRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subNumberOrdersReportRetrieveResponse),
                jacksonTypeRef<SubNumberOrdersReportRetrieveResponse>(),
            )

        assertThat(roundtrippedSubNumberOrdersReportRetrieveResponse)
            .isEqualTo(subNumberOrdersReportRetrieveResponse)
    }
}
