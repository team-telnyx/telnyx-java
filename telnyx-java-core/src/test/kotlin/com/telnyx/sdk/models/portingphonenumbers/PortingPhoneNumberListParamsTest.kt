// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingphonenumbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingPhoneNumberListParamsTest {

    @Test
    fun create() {
        PortingPhoneNumberListParams.builder()
            .filter(
                PortingPhoneNumberListParams.Filter.builder()
                    .portingOrderStatus(
                        PortingPhoneNumberListParams.Filter.PortingOrderStatus.IN_PROCESS
                    )
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PortingPhoneNumberListParams.builder()
                .filter(
                    PortingPhoneNumberListParams.Filter.builder()
                        .portingOrderStatus(
                            PortingPhoneNumberListParams.Filter.PortingOrderStatus.IN_PROCESS
                        )
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[porting_order_status]", "in-process")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PortingPhoneNumberListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
