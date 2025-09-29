// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.accessipranges

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpRangeDeleteParamsTest {

    @Test
    fun create() {
        AccessIpRangeDeleteParams.builder().accessIpRangeId("access_ip_range_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            AccessIpRangeDeleteParams.builder().accessIpRangeId("access_ip_range_id").build()

        assertThat(params._pathParam(0)).isEqualTo("access_ip_range_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
