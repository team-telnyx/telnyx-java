// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.phonenumbers.callingrouting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingRoutingPatchAllParamsTest {

    @Test
    fun create() {
        CallingRoutingPatchAllParams.builder().id("+13125550100").connectionId("1234567890").build()
    }

    @Test
    fun pathParams() {
        val params =
            CallingRoutingPatchAllParams.builder()
                .id("+13125550100")
                .connectionId("1234567890")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("+13125550100")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallingRoutingPatchAllParams.builder()
                .id("+13125550100")
                .connectionId("1234567890")
                .build()

        val body = params._body()

        assertThat(body.connectionId())
            .contains(CallingRoutingPatchAllParams.ConnectionId.ofString("1234567890"))
    }
}
