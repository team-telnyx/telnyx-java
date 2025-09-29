// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.channelzones.ChannelZoneListParams
import com.telnyx.sdk.models.channelzones.ChannelZoneUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelZoneServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val channelZoneService = client.channelZones()

        val channelZones =
            channelZoneService.list(
                ChannelZoneListParams.builder()
                    .page(ChannelZoneListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        channelZones.validate()
    }
}
