// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingSettingRetrieveParamsTest {

    @Test
    fun create() {
        CallingSettingRetrieveParams.builder().phoneNumber("phone_number").build()
    }

    @Test
    fun pathParams() {
        val params = CallingSettingRetrieveParams.builder().phoneNumber("phone_number").build()

        assertThat(params._pathParam(0)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
