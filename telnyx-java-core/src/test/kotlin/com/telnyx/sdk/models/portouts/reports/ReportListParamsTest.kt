// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.reports

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListParamsTest {

    @Test
    fun create() {
        ReportListParams.builder()
            .filter(
                ReportListParams.Filter.builder()
                    .reportType(ReportListParams.Filter.ReportType.EXPORT_PORTOUTS_CSV)
                    .status(ReportListParams.Filter.Status.COMPLETED)
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReportListParams.builder()
                .filter(
                    ReportListParams.Filter.builder()
                        .reportType(ReportListParams.Filter.ReportType.EXPORT_PORTOUTS_CSV)
                        .status(ReportListParams.Filter.Status.COMPLETED)
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[report_type]", "export_portouts_csv")
                    .put("filter[status]", "completed")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReportListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
