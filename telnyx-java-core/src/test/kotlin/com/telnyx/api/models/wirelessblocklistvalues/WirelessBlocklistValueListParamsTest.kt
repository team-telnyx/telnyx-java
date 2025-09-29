// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wirelessblocklistvalues

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistValueListParamsTest {

    @Test
    fun create() {
        WirelessBlocklistValueListParams.builder()
            .type(WirelessBlocklistValueListParams.Type.COUNTRY)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WirelessBlocklistValueListParams.builder()
                .type(WirelessBlocklistValueListParams.Type.COUNTRY)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("type", "country").build())
    }
}
