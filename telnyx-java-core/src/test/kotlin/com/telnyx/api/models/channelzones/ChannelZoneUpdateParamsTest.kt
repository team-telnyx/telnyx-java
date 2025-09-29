// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.channelzones

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelZoneUpdateParamsTest {

    @Test
    fun create() {
        ChannelZoneUpdateParams.builder().channelZoneId("channel_zone_id").channels(0L).build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelZoneUpdateParams.builder().channelZoneId("channel_zone_id").channels(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("channel_zone_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChannelZoneUpdateParams.builder().channelZoneId("channel_zone_id").channels(0L).build()

        val body = params._body()

        assertThat(body.channels()).isEqualTo(0L)
    }
}
