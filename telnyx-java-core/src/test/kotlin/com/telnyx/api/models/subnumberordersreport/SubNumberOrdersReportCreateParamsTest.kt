// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.subnumberordersreport

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrdersReportCreateParamsTest {

    @Test
    fun create() {
        SubNumberOrdersReportCreateParams.builder()
            .countryCode("US")
            .createdAtGt(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
            .createdAtLt(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
            .customerReference("STRING")
            .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
            .status(SubNumberOrdersReportCreateParams.Status.SUCCESS)
            .build()
    }

    @Test
    fun body() {
        val params =
            SubNumberOrdersReportCreateParams.builder()
                .countryCode("US")
                .createdAtGt(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
                .createdAtLt(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
                .customerReference("STRING")
                .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                .status(SubNumberOrdersReportCreateParams.Status.SUCCESS)
                .build()

        val body = params._body()

        assertThat(body.countryCode()).contains("US")
        assertThat(body.createdAtGt()).contains(OffsetDateTime.parse("2023-04-05T10:22:08.230549Z"))
        assertThat(body.createdAtLt()).contains(OffsetDateTime.parse("2025-06-05T10:22:08.230549Z"))
        assertThat(body.customerReference()).contains("STRING")
        assertThat(body.orderRequestId()).contains("12ade33a-21c0-473b-b055-b3c836e1c293")
        assertThat(body.status()).contains(SubNumberOrdersReportCreateParams.Status.SUCCESS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubNumberOrdersReportCreateParams.builder().build()

        val body = params._body()
    }
}
