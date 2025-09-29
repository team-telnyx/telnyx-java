// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.channelzones.ChannelZoneListParams
import com.telnyx.api.models.channelzones.ChannelZoneUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelZoneServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val channelZoneServiceAsync = client.channelZones()

        val channelZoneFuture =
            channelZoneServiceAsync.update(
                ChannelZoneUpdateParams.builder()
                    .channelZoneId("channel_zone_id")
                    .channels(0L)
                    .build()
            )

        val channelZone = channelZoneFuture.get()
        channelZone.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val channelZoneServiceAsync = client.channelZones()

        val channelZonesFuture =
            channelZoneServiceAsync.list(
                ChannelZoneListParams.builder()
                    .page(ChannelZoneListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val channelZones = channelZonesFuture.get()
        channelZones.validate()
    }
}
