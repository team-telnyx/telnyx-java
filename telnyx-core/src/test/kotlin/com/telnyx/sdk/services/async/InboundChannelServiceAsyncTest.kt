// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.inboundchannels.InboundChannelUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InboundChannelServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inboundChannelServiceAsync = client.inboundChannels()

        val inboundChannelFuture =
            inboundChannelServiceAsync.update(
                InboundChannelUpdateParams.builder().channels(7L).build()
            )

        val inboundChannel = inboundChannelFuture.get()
        inboundChannel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val inboundChannelServiceAsync = client.inboundChannels()

        val inboundChannelsFuture = inboundChannelServiceAsync.list()

        val inboundChannels = inboundChannelsFuture.get()
        inboundChannels.validate()
    }
}
