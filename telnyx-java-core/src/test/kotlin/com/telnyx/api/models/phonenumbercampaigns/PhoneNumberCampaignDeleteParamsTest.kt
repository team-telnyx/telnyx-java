// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbercampaigns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberCampaignDeleteParamsTest {

    @Test
    fun create() {
        PhoneNumberCampaignDeleteParams.builder().phoneNumber("phoneNumber").build()
    }

    @Test
    fun pathParams() {
        val params = PhoneNumberCampaignDeleteParams.builder().phoneNumber("phoneNumber").build()

        assertThat(params._pathParam(0)).isEqualTo("phoneNumber")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
