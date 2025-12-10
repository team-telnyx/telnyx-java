// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumbercampaigns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberCampaignRetrieveParamsTest {

    @Test
    fun create() {
        PhoneNumberCampaignRetrieveParams.builder().phoneNumber("phoneNumber").build()
    }

    @Test
    fun pathParams() {
        val params = PhoneNumberCampaignRetrieveParams.builder().phoneNumber("phoneNumber").build()

        assertThat(params._pathParam(0)).isEqualTo("phoneNumber")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
