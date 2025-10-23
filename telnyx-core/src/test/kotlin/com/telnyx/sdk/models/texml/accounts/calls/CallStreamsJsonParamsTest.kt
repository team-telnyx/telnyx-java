// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallStreamsJsonParamsTest {

    @Test
    fun create() {
        CallStreamsJsonParams.builder()
            .accountSid("account_sid")
            .callSid("call_sid")
            .bidirectionalCodec(CallStreamsJsonParams.BidirectionalCodec.G722)
            .bidirectionalMode(CallStreamsJsonParams.BidirectionalMode.RTP)
            .name("My stream")
            .statusCallback("http://webhook.com/callback")
            .statusCallbackMethod(CallStreamsJsonParams.StatusCallbackMethod.GET)
            .track(CallStreamsJsonParams.Track.BOTH_TRACKS)
            .url("wss://www.example.com/websocket")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallStreamsJsonParams.builder().accountSid("account_sid").callSid("call_sid").build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("call_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallStreamsJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .bidirectionalCodec(CallStreamsJsonParams.BidirectionalCodec.G722)
                .bidirectionalMode(CallStreamsJsonParams.BidirectionalMode.RTP)
                .name("My stream")
                .statusCallback("http://webhook.com/callback")
                .statusCallbackMethod(CallStreamsJsonParams.StatusCallbackMethod.GET)
                .track(CallStreamsJsonParams.Track.BOTH_TRACKS)
                .url("wss://www.example.com/websocket")
                .build()

        val body = params._body()

        assertThat(body.bidirectionalCodec())
            .contains(CallStreamsJsonParams.BidirectionalCodec.G722)
        assertThat(body.bidirectionalMode()).contains(CallStreamsJsonParams.BidirectionalMode.RTP)
        assertThat(body.name()).contains("My stream")
        assertThat(body.statusCallback()).contains("http://webhook.com/callback")
        assertThat(body.statusCallbackMethod())
            .contains(CallStreamsJsonParams.StatusCallbackMethod.GET)
        assertThat(body.track()).contains(CallStreamsJsonParams.Track.BOTH_TRACKS)
        assertThat(body.url()).contains("wss://www.example.com/websocket")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallStreamsJsonParams.builder().accountSid("account_sid").callSid("call_sid").build()

        val body = params._body()
    }
}
