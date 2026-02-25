// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionBridgeParamsTest {

    @Test
    fun create() {
        ActionBridgeParams.builder()
            .callControlIdToBridge("call_control_id")
            .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .muteDtmf(ActionBridgeParams.MuteDtmf.OPPOSITE)
            .parkAfterUnbridge("self")
            .playRingtone(true)
            .preventDoubleBridge(true)
            .queue("support")
            .record(ActionBridgeParams.Record.RECORD_FROM_ANSWER)
            .recordChannels(ActionBridgeParams.RecordChannels.SINGLE)
            .recordCustomFileName("my_recording_file_name")
            .recordFormat(ActionBridgeParams.RecordFormat.WAV)
            .recordMaxLength(1000)
            .recordTimeoutSecs(100)
            .recordTrack(ActionBridgeParams.RecordTrack.OUTBOUND)
            .recordTrim(ActionBridgeParams.RecordTrim.TRIM_SILENCE)
            .ringtone(ActionBridgeParams.Ringtone.PL)
            .videoRoomContext("Alice")
            .videoRoomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionBridgeParams.builder()
                .callControlIdToBridge("call_control_id")
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionBridgeParams.builder()
                .callControlIdToBridge("call_control_id")
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .muteDtmf(ActionBridgeParams.MuteDtmf.OPPOSITE)
                .parkAfterUnbridge("self")
                .playRingtone(true)
                .preventDoubleBridge(true)
                .queue("support")
                .record(ActionBridgeParams.Record.RECORD_FROM_ANSWER)
                .recordChannels(ActionBridgeParams.RecordChannels.SINGLE)
                .recordCustomFileName("my_recording_file_name")
                .recordFormat(ActionBridgeParams.RecordFormat.WAV)
                .recordMaxLength(1000)
                .recordTimeoutSecs(100)
                .recordTrack(ActionBridgeParams.RecordTrack.OUTBOUND)
                .recordTrim(ActionBridgeParams.RecordTrim.TRIM_SILENCE)
                .ringtone(ActionBridgeParams.Ringtone.PL)
                .videoRoomContext("Alice")
                .videoRoomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .build()

        val body = params._body()

        assertThat(body.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.muteDtmf()).contains(ActionBridgeParams.MuteDtmf.OPPOSITE)
        assertThat(body.parkAfterUnbridge()).contains("self")
        assertThat(body.playRingtone()).contains(true)
        assertThat(body.preventDoubleBridge()).contains(true)
        assertThat(body.queue()).contains("support")
        assertThat(body.record()).contains(ActionBridgeParams.Record.RECORD_FROM_ANSWER)
        assertThat(body.recordChannels()).contains(ActionBridgeParams.RecordChannels.SINGLE)
        assertThat(body.recordCustomFileName()).contains("my_recording_file_name")
        assertThat(body.recordFormat()).contains(ActionBridgeParams.RecordFormat.WAV)
        assertThat(body.recordMaxLength()).contains(1000)
        assertThat(body.recordTimeoutSecs()).contains(100)
        assertThat(body.recordTrack()).contains(ActionBridgeParams.RecordTrack.OUTBOUND)
        assertThat(body.recordTrim()).contains(ActionBridgeParams.RecordTrim.TRIM_SILENCE)
        assertThat(body.ringtone()).contains(ActionBridgeParams.Ringtone.PL)
        assertThat(body.videoRoomContext()).contains("Alice")
        assertThat(body.videoRoomId()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionBridgeParams.builder()
                .callControlIdToBridge("call_control_id")
                .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                .build()

        val body = params._body()

        assertThat(body.callControlId())
            .isEqualTo("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
    }
}
