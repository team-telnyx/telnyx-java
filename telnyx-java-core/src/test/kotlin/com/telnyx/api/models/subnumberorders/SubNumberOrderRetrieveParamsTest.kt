// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.subnumberorders

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubNumberOrderRetrieveParamsTest {

    @Test
    fun create() {
        SubNumberOrderRetrieveParams.builder()
            .subNumberOrderId("sub_number_order_id")
            .filter(SubNumberOrderRetrieveParams.Filter.builder().includePhoneNumbers(true).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubNumberOrderRetrieveParams.builder().subNumberOrderId("sub_number_order_id").build()

        assertThat(params._pathParam(0)).isEqualTo("sub_number_order_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SubNumberOrderRetrieveParams.builder()
                .subNumberOrderId("sub_number_order_id")
                .filter(
                    SubNumberOrderRetrieveParams.Filter.builder().includePhoneNumbers(true).build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("filter[include_phone_numbers]", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SubNumberOrderRetrieveParams.builder().subNumberOrderId("sub_number_order_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
