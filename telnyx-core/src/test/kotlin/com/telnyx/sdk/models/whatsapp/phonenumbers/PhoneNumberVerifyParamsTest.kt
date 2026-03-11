// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberVerifyParamsTest {

    @Test
    fun create() {
        PhoneNumberVerifyParams.builder().phoneNumber("phone_number").code("code").build()
    }

    @Test
    fun pathParams() {
        val params =
            PhoneNumberVerifyParams.builder().phoneNumber("phone_number").code("code").build()

        assertThat(params._pathParam(0)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PhoneNumberVerifyParams.builder().phoneNumber("phone_number").code("code").build()

        val body = params._body()

        assertThat(body.code()).isEqualTo("code")
    }
}
