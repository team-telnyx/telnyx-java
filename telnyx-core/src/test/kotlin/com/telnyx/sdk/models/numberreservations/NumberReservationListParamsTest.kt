// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberreservations

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberReservationListParamsTest {

    @Test
    fun create() {
        NumberReservationListParams.builder()
            .filter(
                NumberReservationListParams.Filter.builder()
                    .createdAt(
                        NumberReservationListParams.Filter.CreatedAt.builder()
                            .gt("gt")
                            .lt("lt")
                            .build()
                    )
                    .customerReference("customer_reference")
                    .phoneNumbersPhoneNumber("phone_numbers.phone_number")
                    .status("status")
                    .build()
            )
            .page(NumberReservationListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NumberReservationListParams.builder()
                .filter(
                    NumberReservationListParams.Filter.builder()
                        .createdAt(
                            NumberReservationListParams.Filter.CreatedAt.builder()
                                .gt("gt")
                                .lt("lt")
                                .build()
                        )
                        .customerReference("customer_reference")
                        .phoneNumbersPhoneNumber("phone_numbers.phone_number")
                        .status("status")
                        .build()
                )
                .page(NumberReservationListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at][gt]", "gt")
                    .put("filter[created_at][lt]", "lt")
                    .put("filter[customer_reference]", "customer_reference")
                    .put("filter[phone_numbers.phone_number]", "phone_numbers.phone_number")
                    .put("filter[status]", "status")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NumberReservationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
