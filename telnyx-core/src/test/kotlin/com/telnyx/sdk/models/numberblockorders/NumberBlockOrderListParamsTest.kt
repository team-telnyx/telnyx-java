// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberblockorders

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberBlockOrderListParamsTest {

    @Test
    fun create() {
        NumberBlockOrderListParams.builder()
            .filter(
                NumberBlockOrderListParams.Filter.builder()
                    .createdAt(
                        NumberBlockOrderListParams.Filter.CreatedAt.builder()
                            .gt("2018-01-01T00:00:00.000000Z")
                            .lt("2018-01-01T00:00:00.000000Z")
                            .build()
                    )
                    .phoneNumbersStartingNumber("+19705555000")
                    .status("pending")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NumberBlockOrderListParams.builder()
                .filter(
                    NumberBlockOrderListParams.Filter.builder()
                        .createdAt(
                            NumberBlockOrderListParams.Filter.CreatedAt.builder()
                                .gt("2018-01-01T00:00:00.000000Z")
                                .lt("2018-01-01T00:00:00.000000Z")
                                .build()
                        )
                        .phoneNumbersStartingNumber("+19705555000")
                        .status("pending")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at][gt]", "2018-01-01T00:00:00.000000Z")
                    .put("filter[created_at][lt]", "2018-01-01T00:00:00.000000Z")
                    .put("filter[phone_numbers.starting_number]", "+19705555000")
                    .put("filter[status]", "pending")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NumberBlockOrderListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
