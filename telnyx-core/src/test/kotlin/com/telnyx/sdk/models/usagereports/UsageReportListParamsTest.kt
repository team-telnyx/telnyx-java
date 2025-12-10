// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.usagereports

import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageReportListParamsTest {

    @Test
    fun create() {
        UsageReportListParams.builder()
            .addDimension("string")
            .addMetric("string")
            .product("product")
            .dateRange("date_range")
            .endDate("end_date")
            .filter("filter")
            .format(UsageReportListParams.Format.CSV)
            .managedAccounts(true)
            .page(UsageReportListParams.Page.builder().number(1L).size(5000L).build())
            .addSort("string")
            .startDate("start_date")
            .authorizationBearer("authorization_bearer")
            .build()
    }

    @Test
    fun headers() {
        val params =
            UsageReportListParams.builder()
                .addDimension("string")
                .addMetric("string")
                .product("product")
                .dateRange("date_range")
                .endDate("end_date")
                .filter("filter")
                .format(UsageReportListParams.Format.CSV)
                .managedAccounts(true)
                .page(UsageReportListParams.Page.builder().number(1L).size(5000L).build())
                .addSort("string")
                .startDate("start_date")
                .authorizationBearer("authorization_bearer")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("authorization_bearer", "authorization_bearer").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            UsageReportListParams.builder()
                .addDimension("string")
                .addMetric("string")
                .product("product")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            UsageReportListParams.builder()
                .addDimension("string")
                .addMetric("string")
                .product("product")
                .dateRange("date_range")
                .endDate("end_date")
                .filter("filter")
                .format(UsageReportListParams.Format.CSV)
                .managedAccounts(true)
                .page(UsageReportListParams.Page.builder().number(1L).size(5000L).build())
                .addSort("string")
                .startDate("start_date")
                .authorizationBearer("authorization_bearer")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("dimensions", listOf("string").joinToString(","))
                    .put("metrics", listOf("string").joinToString(","))
                    .put("product", "product")
                    .put("date_range", "date_range")
                    .put("end_date", "end_date")
                    .put("filter", "filter")
                    .put("format", "csv")
                    .put("managed_accounts", "true")
                    .put("page[number]", "1")
                    .put("page[size]", "5000")
                    .put("sort", listOf("string").joinToString(","))
                    .put("start_date", "start_date")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            UsageReportListParams.builder()
                .addDimension("string")
                .addMetric("string")
                .product("product")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("dimensions", listOf("string").joinToString(","))
                    .put("metrics", listOf("string").joinToString(","))
                    .put("product", "product")
                    .build()
            )
    }
}
