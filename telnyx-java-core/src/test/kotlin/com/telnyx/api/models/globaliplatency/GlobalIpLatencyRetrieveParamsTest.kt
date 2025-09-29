// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.globaliplatency

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GlobalIpLatencyRetrieveParamsTest {

    @Test
    fun create() {
        GlobalIpLatencyRetrieveParams.builder()
            .filter(GlobalIpLatencyRetrieveParams.Filter.builder().globalIpId("string").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GlobalIpLatencyRetrieveParams.builder()
                .filter(GlobalIpLatencyRetrieveParams.Filter.builder().globalIpId("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("filter[global_ip_id]", "string").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GlobalIpLatencyRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
