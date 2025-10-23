// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.invoices

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceListParamsTest {

    @Test
    fun create() {
        InvoiceListParams.builder()
            .page(InvoiceListParams.Page.builder().number(1L).size(1L).build())
            .sort(InvoiceListParams.Sort.PERIOD_START)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InvoiceListParams.builder()
                .page(InvoiceListParams.Page.builder().number(1L).size(1L).build())
                .sort(InvoiceListParams.Sort.PERIOD_START)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "1")
                    .put("page[size]", "1")
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
