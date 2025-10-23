// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.countrycoverage

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryCoverageRetrieveCountryParamsTest {

    @Test
    fun create() {
        CountryCoverageRetrieveCountryParams.builder().countryCode("US").build()
    }

    @Test
    fun pathParams() {
        val params = CountryCoverageRetrieveCountryParams.builder().countryCode("US").build()

        assertThat(params._pathParam(0)).isEqualTo("US")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
