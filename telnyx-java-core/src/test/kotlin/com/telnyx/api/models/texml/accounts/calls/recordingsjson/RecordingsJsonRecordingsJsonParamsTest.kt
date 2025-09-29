// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.calls.recordingsjson

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingsJsonRecordingsJsonParamsTest {

    @Test
    fun create() {
        RecordingsJsonRecordingsJsonParams.builder()
            .accountSid("account_sid")
            .callSid("call_sid")
            .playBeep(false)
            .recordingChannels(RecordingsJsonRecordingsJsonParams.RecordingChannels.SINGLE)
            .recordingStatusCallback("http://webhook.com/callback")
            .recordingStatusCallbackEvent("in-progress completed absent")
            .recordingStatusCallbackMethod(
                RecordingsJsonRecordingsJsonParams.RecordingStatusCallbackMethod.GET
            )
            .recordingTrack(RecordingsJsonRecordingsJsonParams.RecordingTrack.INBOUND)
            .sendRecordingUrl(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RecordingsJsonRecordingsJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("call_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RecordingsJsonRecordingsJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .playBeep(false)
                .recordingChannels(RecordingsJsonRecordingsJsonParams.RecordingChannels.SINGLE)
                .recordingStatusCallback("http://webhook.com/callback")
                .recordingStatusCallbackEvent("in-progress completed absent")
                .recordingStatusCallbackMethod(
                    RecordingsJsonRecordingsJsonParams.RecordingStatusCallbackMethod.GET
                )
                .recordingTrack(RecordingsJsonRecordingsJsonParams.RecordingTrack.INBOUND)
                .sendRecordingUrl(false)
                .build()

        val body = params._body()

        assertThat(body.playBeep()).contains(false)
        assertThat(body.recordingChannels())
            .contains(RecordingsJsonRecordingsJsonParams.RecordingChannels.SINGLE)
        assertThat(body.recordingStatusCallback()).contains("http://webhook.com/callback")
        assertThat(body.recordingStatusCallbackEvent()).contains("in-progress completed absent")
        assertThat(body.recordingStatusCallbackMethod())
            .contains(RecordingsJsonRecordingsJsonParams.RecordingStatusCallbackMethod.GET)
        assertThat(body.recordingTrack())
            .contains(RecordingsJsonRecordingsJsonParams.RecordingTrack.INBOUND)
        assertThat(body.sendRecordingUrl()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RecordingsJsonRecordingsJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .build()

        val body = params._body()
    }
}
