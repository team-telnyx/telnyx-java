// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberRetrievePhoneNumberParamsTest {

    @Test
    fun create() {
        PhoneNumberRetrievePhoneNumberParams.builder().phoneNumber("phone_number").build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberRetrievePhoneNumberParams.builder().phoneNumber("phone_number").build()

        assertThat(params._pathParam(0)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
