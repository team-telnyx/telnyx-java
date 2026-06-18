// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorderphonenumbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOrderPhoneNumberListParamsTest {

    @Test
    fun create() {
        NumberOrderPhoneNumberListParams.builder()
            .filter(NumberOrderPhoneNumberListParams.Filter.builder().countryCode("US").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NumberOrderPhoneNumberListParams.builder()
                .filter(NumberOrderPhoneNumberListParams.Filter.builder().countryCode("US").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("filter[country_code]", "US").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NumberOrderPhoneNumberListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
