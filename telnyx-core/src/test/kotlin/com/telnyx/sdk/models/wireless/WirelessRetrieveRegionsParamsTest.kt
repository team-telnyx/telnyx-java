// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireless

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessRetrieveRegionsParamsTest {

    @Test
    fun create() {
        WirelessRetrieveRegionsParams.builder().product("public_ips").build()
    }

    @Test
    fun queryParams() {
        val params = WirelessRetrieveRegionsParams.builder().product("public_ips").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("product", "public_ips").build())
    }
}
