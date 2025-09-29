// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.inboundchannels.InboundChannelUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundChannelServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundChannelServiceAsync = client.inboundChannels()

        val inboundChannelFuture =
            inboundChannelServiceAsync.update(
                InboundChannelUpdateParams.builder().channels(7L).build()
            )

        val inboundChannel = inboundChannelFuture.get()
        inboundChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundChannelServiceAsync = client.inboundChannels()

        val inboundChannelsFuture = inboundChannelServiceAsync.list()

        val inboundChannels = inboundChannelsFuture.get()
        inboundChannels.validate()
    }
}
