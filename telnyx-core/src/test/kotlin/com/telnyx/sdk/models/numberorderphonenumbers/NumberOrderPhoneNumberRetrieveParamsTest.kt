// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorderphonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberOrderPhoneNumberRetrieveParamsTest {

    @Test
    fun create() {
        NumberOrderPhoneNumberRetrieveParams.builder()
            .numberOrderPhoneNumberId("number_order_phone_number_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NumberOrderPhoneNumberRetrieveParams.builder()
                .numberOrderPhoneNumberId("number_order_phone_number_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("number_order_phone_number_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
