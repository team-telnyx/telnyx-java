// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipaddress

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpAddressRetrieveParamsTest {

    @Test
    fun create() {
        AccessIpAddressRetrieveParams.builder().accessIpAddressId("access_ip_address_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            AccessIpAddressRetrieveParams.builder()
                .accessIpAddressId("access_ip_address_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("access_ip_address_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
