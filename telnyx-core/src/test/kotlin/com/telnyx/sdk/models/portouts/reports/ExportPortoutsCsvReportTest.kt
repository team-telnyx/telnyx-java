// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.reports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportPortoutsCsvReportTest {

    @Test
    fun create() {
        val exportPortoutsCsvReport =
            ExportPortoutsCsvReport.builder()
                .filters(
                    ExportPortoutsCsvReport.Filters.builder()
                        .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addCustomerReferenceIn("my-customer-reference")
                        .endUserName("McPortersen")
                        .addPhoneNumbersOverlap("+1234567890")
                        .addStatusIn(ExportPortoutsCsvReport.Filters.StatusIn.PENDING)
                        .build()
                )
                .build()

        assertThat(exportPortoutsCsvReport.filters())
            .isEqualTo(
                ExportPortoutsCsvReport.Filters.builder()
                    .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addCustomerReferenceIn("my-customer-reference")
                    .endUserName("McPortersen")
                    .addPhoneNumbersOverlap("+1234567890")
                    .addStatusIn(ExportPortoutsCsvReport.Filters.StatusIn.PENDING)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exportPortoutsCsvReport =
            ExportPortoutsCsvReport.builder()
                .filters(
                    ExportPortoutsCsvReport.Filters.builder()
                        .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addCustomerReferenceIn("my-customer-reference")
                        .endUserName("McPortersen")
                        .addPhoneNumbersOverlap("+1234567890")
                        .addStatusIn(ExportPortoutsCsvReport.Filters.StatusIn.PENDING)
                        .build()
                )
                .build()

        val roundtrippedExportPortoutsCsvReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exportPortoutsCsvReport),
                jacksonTypeRef<ExportPortoutsCsvReport>(),
            )

        assertThat(roundtrippedExportPortoutsCsvReport).isEqualTo(exportPortoutsCsvReport)
    }
}
