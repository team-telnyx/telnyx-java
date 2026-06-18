// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.channelzones.ChannelZoneUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChannelZoneServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val channelZoneService = client.channelZones()

        val channelZone =
            channelZoneService.update(
                ChannelZoneUpdateParams.builder()
                    .channelZoneId("channel_zone_id")
                    .channels(0L)
                    .build()
            )

        channelZone.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val channelZoneService = client.channelZones()

        val page = channelZoneService.list()

        page.response().validate()
    }
}
