// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globalipusage

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpUsageRetrieveParamsTest {

    @Test
    fun create() {
        GlobalIpUsageRetrieveParams.builder()
            .filter(GlobalIpUsageRetrieveParams.Filter.builder().globalIpId("string").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GlobalIpUsageRetrieveParams.builder()
                .filter(GlobalIpUsageRetrieveParams.Filter.builder().globalIpId("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("filter[global_ip_id]", "string").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GlobalIpUsageRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
