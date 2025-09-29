// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.inboundchannels

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundChannelUpdateParamsTest {

    @Test
    fun create() {
        InboundChannelUpdateParams.builder().channels(7L).build()
    }

    @Test
    fun body() {
        val params = InboundChannelUpdateParams.builder().channels(7L).build()

        val body = params._body()

        assertThat(body.channels()).isEqualTo(7L)
    }
}
