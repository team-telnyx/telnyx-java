// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.channelzones.ChannelZoneUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChannelZoneServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val channelZoneServiceAsync = client.channelZones()

        val gcbChannelZoneFuture =
            channelZoneServiceAsync.update(
                ChannelZoneUpdateParams.builder()
                    .channelZoneId("channel_zone_id")
                    .channels(0L)
                    .build()
            )

        val gcbChannelZone = gcbChannelZoneFuture.get()
        gcbChannelZone.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val channelZoneServiceAsync = client.channelZones()

        val pageFuture = channelZoneServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
