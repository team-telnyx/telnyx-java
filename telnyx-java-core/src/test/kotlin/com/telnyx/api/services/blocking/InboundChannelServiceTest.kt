// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.inboundchannels.InboundChannelUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundChannelServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundChannelService = client.inboundChannels()

        val inboundChannel =
            inboundChannelService.update(InboundChannelUpdateParams.builder().channels(7L).build())

        inboundChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundChannelService = client.inboundChannels()

        val inboundChannels = inboundChannelService.list()

        inboundChannels.validate()
    }
}
