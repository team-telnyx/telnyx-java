// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.profile

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileRetrieveParamsTest {

    @Test
    fun create() {
        ProfileRetrieveParams.builder().phoneNumber("phone_number").build()
    }

    @Test
    fun pathParams() {
        val params = ProfileRetrieveParams.builder().phoneNumber("phone_number").build()

        assertThat(params._pathParam(0)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
