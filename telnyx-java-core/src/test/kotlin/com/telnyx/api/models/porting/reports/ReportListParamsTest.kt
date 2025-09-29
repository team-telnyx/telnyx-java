// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.reports

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReportListParamsTest {

    @Test
    fun create() {
        ReportListParams.builder()
            .filter(
                ReportListParams.Filter.builder()
                    .reportType(ReportListParams.Filter.ReportType.EXPORT_PORTING_ORDERS_CSV)
                    .status(ReportListParams.Filter.Status.COMPLETED)
                    .build()
            )
            .page(ReportListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ReportListParams.builder()
                .filter(
                    ReportListParams.Filter.builder()
                        .reportType(ReportListParams.Filter.ReportType.EXPORT_PORTING_ORDERS_CSV)
                        .status(ReportListParams.Filter.Status.COMPLETED)
                        .build()
                )
                .page(ReportListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[report_type]", "export_porting_orders_csv")
                    .put("filter[status]", "completed")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
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
