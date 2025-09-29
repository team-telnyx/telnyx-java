// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.reports.mdrusagereports

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MdrUsageReportListParamsTest {

    @Test
    fun create() {
        MdrUsageReportListParams.builder()
            .page(MdrUsageReportListParams.Page.builder().number(0).size(0).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MdrUsageReportListParams.builder()
                .page(MdrUsageReportListParams.Page.builder().number(0).size(0).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "0").put("page[size]", "0").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MdrUsageReportListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
