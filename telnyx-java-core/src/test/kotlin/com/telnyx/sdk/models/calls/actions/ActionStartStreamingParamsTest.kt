// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.models.calls.DialogflowConfig
import com.telnyx.sdk.models.calls.StreamBidirectionalCodec
import com.telnyx.sdk.models.calls.StreamBidirectionalMode
import com.telnyx.sdk.models.calls.StreamBidirectionalSamplingRate
import com.telnyx.sdk.models.calls.StreamBidirectionalTargetLegs
import com.telnyx.sdk.models.calls.StreamCodec
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartStreamingParamsTest {

    @Test
    fun create() {
        ActionStartStreamingParams.builder()
            .callControlId("call_control_id")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .dialogflowConfig(
                DialogflowConfig.builder()
                    .analyzeSentiment(false)
                    .partialAutomatedAgentReply(false)
                    .build()
            )
            .enableDialogflow(false)
            .streamBidirectionalCodec(StreamBidirectionalCodec.G722)
            .streamBidirectionalMode(StreamBidirectionalMode.RTP)
            .streamBidirectionalSamplingRate(StreamBidirectionalSamplingRate._16000)
            .streamBidirectionalTargetLegs(StreamBidirectionalTargetLegs.BOTH)
            .streamCodec(StreamCodec.PCMA)
            .streamTrack(ActionStartStreamingParams.StreamTrack.BOTH_TRACKS)
            .streamUrl("wss://www.example.com/websocket")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionStartStreamingParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionStartStreamingParams.builder()
                .callControlId("call_control_id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .dialogflowConfig(
                    DialogflowConfig.builder()
                        .analyzeSentiment(false)
                        .partialAutomatedAgentReply(false)
                        .build()
                )
                .enableDialogflow(false)
                .streamBidirectionalCodec(StreamBidirectionalCodec.G722)
                .streamBidirectionalMode(StreamBidirectionalMode.RTP)
                .streamBidirectionalSamplingRate(StreamBidirectionalSamplingRate._16000)
                .streamBidirectionalTargetLegs(StreamBidirectionalTargetLegs.BOTH)
                .streamCodec(StreamCodec.PCMA)
                .streamTrack(ActionStartStreamingParams.StreamTrack.BOTH_TRACKS)
                .streamUrl("wss://www.example.com/websocket")
                .build()

        val body = params._body()

        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.dialogflowConfig())
            .contains(
                DialogflowConfig.builder()
                    .analyzeSentiment(false)
                    .partialAutomatedAgentReply(false)
                    .build()
            )
        assertThat(body.enableDialogflow()).contains(false)
        assertThat(body.streamBidirectionalCodec()).contains(StreamBidirectionalCodec.G722)
        assertThat(body.streamBidirectionalMode()).contains(StreamBidirectionalMode.RTP)
        assertThat(body.streamBidirectionalSamplingRate())
            .contains(StreamBidirectionalSamplingRate._16000)
        assertThat(body.streamBidirectionalTargetLegs())
            .contains(StreamBidirectionalTargetLegs.BOTH)
        assertThat(body.streamCodec()).contains(StreamCodec.PCMA)
        assertThat(body.streamTrack()).contains(ActionStartStreamingParams.StreamTrack.BOTH_TRACKS)
        assertThat(body.streamUrl()).contains("wss://www.example.com/websocket")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionStartStreamingParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
