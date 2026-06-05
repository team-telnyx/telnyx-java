// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberListParamsTest {

    @Test
    fun create() {
        NumberListParams.builder()
            .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
            .pageNumber(1L)
            .pageSize(10L)
            .phoneNumber("+16035551234")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NumberListParams.builder().enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6").build()

        assertThat(params._pathParam(0)).isEqualTo("4a6192a4-573d-446d-b3ce-aff9117272a6")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            NumberListParams.builder()
                .enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6")
                .pageNumber(1L)
                .pageSize(10L)
                .phoneNumber("+16035551234")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "1")
                    .put("page[size]", "10")
                    .put("phone_number", "+16035551234")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            NumberListParams.builder().enterpriseId("4a6192a4-573d-446d-b3ce-aff9117272a6").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
