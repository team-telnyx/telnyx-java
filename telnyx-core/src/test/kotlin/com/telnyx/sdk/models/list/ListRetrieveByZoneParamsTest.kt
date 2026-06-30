// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.list

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListRetrieveByZoneParamsTest {

    @Test
    fun create() {
        ListRetrieveByZoneParams.builder().channelZoneId("channel_zone_id").build()
    }

    @Test
    fun pathParams() {
        val params = ListRetrieveByZoneParams.builder().channelZoneId("channel_zone_id").build()

        assertThat(params._pathParam(0)).isEqualTo("channel_zone_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
