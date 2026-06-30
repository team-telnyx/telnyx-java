// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingSettingUpdateParamsTest {

    @Test
    fun create() {
        CallingSettingUpdateParams.builder().phoneNumber("phone_number").enabled(true).build()
    }

    @Test
    fun pathParams() {
        val params =
            CallingSettingUpdateParams.builder().phoneNumber("phone_number").enabled(true).build()

        assertThat(params._pathParam(0)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallingSettingUpdateParams.builder().phoneNumber("phone_number").enabled(true).build()

        val body = params._body()

        assertThat(body.enabled()).isEqualTo(true)
    }
}
