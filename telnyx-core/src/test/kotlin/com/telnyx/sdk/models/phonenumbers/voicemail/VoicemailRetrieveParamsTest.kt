// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voicemail

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoicemailRetrieveParamsTest {

    @Test
    fun create() {
        VoicemailRetrieveParams.builder().phoneNumberId("123455678900").build()
    }

    @Test
    fun pathParams() {
        val params = VoicemailRetrieveParams.builder().phoneNumberId("123455678900").build()

        assertThat(params._pathParam(0)).isEqualTo("123455678900")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
