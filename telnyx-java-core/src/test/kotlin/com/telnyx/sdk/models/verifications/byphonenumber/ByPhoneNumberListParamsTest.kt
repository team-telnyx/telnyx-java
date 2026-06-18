// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifications.byphonenumber

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ByPhoneNumberListParamsTest {

    @Test
    fun create() {
        ByPhoneNumberListParams.builder().phoneNumber("+13035551234").build()
    }

    @Test
    fun pathParams() {
        val params = ByPhoneNumberListParams.builder().phoneNumber("+13035551234").build()

        assertThat(params._pathParam(0)).isEqualTo("+13035551234")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
