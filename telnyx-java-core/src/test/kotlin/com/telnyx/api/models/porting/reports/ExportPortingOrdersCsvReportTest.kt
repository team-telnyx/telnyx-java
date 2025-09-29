// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.reports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportPortingOrdersCsvReportTest {

    @Test
    fun create() {
        val exportPortingOrdersCsvReport =
            ExportPortingOrdersCsvReport.builder()
                .filters(
                    ExportPortingOrdersCsvReport.Filters.builder()
                        .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addCustomerReferenceIn("my-customer-reference")
                        .addStatusIn(ExportPortingOrdersCsvReport.Filters.StatusIn.DRAFT)
                        .build()
                )
                .build()

        assertThat(exportPortingOrdersCsvReport.filters())
            .isEqualTo(
                ExportPortingOrdersCsvReport.Filters.builder()
                    .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addCustomerReferenceIn("my-customer-reference")
                    .addStatusIn(ExportPortingOrdersCsvReport.Filters.StatusIn.DRAFT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exportPortingOrdersCsvReport =
            ExportPortingOrdersCsvReport.builder()
                .filters(
                    ExportPortingOrdersCsvReport.Filters.builder()
                        .createdAtGt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAtLt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addCustomerReferenceIn("my-customer-reference")
                        .addStatusIn(ExportPortingOrdersCsvReport.Filters.StatusIn.DRAFT)
                        .build()
                )
                .build()

        val roundtrippedExportPortingOrdersCsvReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exportPortingOrdersCsvReport),
                jacksonTypeRef<ExportPortingOrdersCsvReport>(),
            )

        assertThat(roundtrippedExportPortingOrdersCsvReport).isEqualTo(exportPortingOrdersCsvReport)
    }
}
