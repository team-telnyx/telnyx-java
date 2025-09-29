// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.subnumberorders

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderListParamsTest {

    @Test
    fun create() {
        SubNumberOrderListParams.builder()
            .filter(
                SubNumberOrderListParams.Filter.builder()
                    .countryCode("US")
                    .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                    .phoneNumberType("local")
                    .phoneNumbersCount(1L)
                    .status("status")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SubNumberOrderListParams.builder()
                .filter(
                    SubNumberOrderListParams.Filter.builder()
                        .countryCode("US")
                        .orderRequestId("12ade33a-21c0-473b-b055-b3c836e1c293")
                        .phoneNumberType("local")
                        .phoneNumbersCount(1L)
                        .status("status")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[country_code]", "US")
                    .put("filter[order_request_id]", "12ade33a-21c0-473b-b055-b3c836e1c293")
                    .put("filter[phone_number_type]", "local")
                    .put("filter[phone_numbers_count]", "1")
                    .put("filter[status]", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SubNumberOrderListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
