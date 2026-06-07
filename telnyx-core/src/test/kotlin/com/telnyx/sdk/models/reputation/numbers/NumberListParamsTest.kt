// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reputation.numbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberListParamsTest {

    @Test
    fun create() {
        NumberListParams.builder()
            .filterEnterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filterPhoneNumberContains("+16035551234")
            .filterPhoneNumberEq("+16035551234")
            .pageNumber(1L)
            .pageSize(20L)
            .phoneNumber("+16035551234")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NumberListParams.builder()
                .filterEnterpriseId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filterPhoneNumberContains("+16035551234")
                .filterPhoneNumberEq("+16035551234")
                .pageNumber(1L)
                .pageSize(20L)
                .phoneNumber("+16035551234")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[enterprise_id]", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("filter[phone_number][contains]", "+16035551234")
                    .put("filter[phone_number][eq]", "+16035551234")
                    .put("page[number]", "1")
                    .put("page[size]", "20")
                    .put("phone_number", "+16035551234")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NumberListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
