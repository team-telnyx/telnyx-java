// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.invoices

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceListParamsTest {

    @Test
    fun create() {
        InvoiceListParams.builder()
            .pageNumber(0L)
            .pageSize(0L)
            .sort(InvoiceListParams.Sort.PERIOD_START)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InvoiceListParams.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .sort(InvoiceListParams.Sort.PERIOD_START)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("sort", "period_start")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InvoiceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
