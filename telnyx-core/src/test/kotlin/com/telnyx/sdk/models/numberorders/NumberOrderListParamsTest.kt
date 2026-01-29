// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorders

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOrderListParamsTest {

    @Test
    fun create() {
        NumberOrderListParams.builder()
            .filter(
                NumberOrderListParams.Filter.builder()
                    .createdAt(
                        NumberOrderListParams.Filter.CreatedAt.builder().gt("gt").lt("lt").build()
                    )
                    .customerReference("customer_reference")
                    .phoneNumbersCount("phone_numbers_count")
                    .requirementsMet(true)
                    .status("status")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NumberOrderListParams.builder()
                .filter(
                    NumberOrderListParams.Filter.builder()
                        .createdAt(
                            NumberOrderListParams.Filter.CreatedAt.builder()
                                .gt("gt")
                                .lt("lt")
                                .build()
                        )
                        .customerReference("customer_reference")
                        .phoneNumbersCount("phone_numbers_count")
                        .requirementsMet(true)
                        .status("status")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at][gt]", "gt")
                    .put("filter[created_at][lt]", "lt")
                    .put("filter[customer_reference]", "customer_reference")
                    .put("filter[phone_numbers_count]", "phone_numbers_count")
                    .put("filter[requirements_met]", "true")
                    .put("filter[status]", "status")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NumberOrderListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
