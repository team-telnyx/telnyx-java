// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallCallsParamsTest {

    @Test
    fun create() {
        CallCallsParams.builder()
            .accountSid("account_sid")
            .applicationSid("example-app-sid")
            .from("+13120001234")
            .to("+13121230000")
            .asyncAmd(true)
            .asyncAmdStatusCallback("https://www.example.com/callback")
            .asyncAmdStatusCallbackMethod(CallCallsParams.AsyncAmdStatusCallbackMethod.GET)
            .callerId("Info")
            .cancelPlaybackOnDetectMessageEnd(false)
            .cancelPlaybackOnMachineDetection(false)
            .addCustomHeader(
                CallCallsParams.CustomHeader.builder()
                    .name("X-Custom-Header")
                    .value("custom-value")
                    .build()
            )
            .detectionMode(CallCallsParams.DetectionMode.PREMIUM)
            .fallbackUrl("https://www.example.com/instructions-fallback.xml")
            .machineDetection(CallCallsParams.MachineDetection.ENABLE)
            .machineDetectionSilenceTimeout(2000L)
            .machineDetectionSpeechEndThreshold(2000L)
            .machineDetectionSpeechThreshold(2000L)
            .machineDetectionTimeout(5000L)
            .preferredCodecs("PCMA,PCMU")
            .record(false)
            .recordingChannels(CallCallsParams.RecordingChannels.DUAL)
            .recordingStatusCallback("https://example.com/recording_status_callback")
            .recordingStatusCallbackEvent("in-progress completed absent")
            .recordingStatusCallbackMethod(CallCallsParams.RecordingStatusCallbackMethod.GET)
            .recordingTimeout(5L)
            .recordingTrack(CallCallsParams.RecordingTrack.INBOUND)
            .sendRecordingUrl(false)
            .sipAuthPassword("1234")
            .sipAuthUsername("user")
            .sipRegion(CallCallsParams.SipRegion.CANADA)
            .statusCallback("https://www.example.com/statuscallback-listener")
            .statusCallbackEvent(CallCallsParams.StatusCallbackEvent.INITIATED)
            .statusCallbackMethod(CallCallsParams.StatusCallbackMethod.GET)
            .trim(CallCallsParams.Trim.TRIM_SILENCE)
            .url("https://www.example.com/texml.xml")
            .urlMethod(CallCallsParams.UrlMethod.GET)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallCallsParams.builder()
                .accountSid("account_sid")
                .applicationSid("example-app-sid")
                .from("+13120001234")
                .to("+13121230000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallCallsParams.builder()
                .accountSid("account_sid")
                .applicationSid("example-app-sid")
                .from("+13120001234")
                .to("+13121230000")
                .asyncAmd(true)
                .asyncAmdStatusCallback("https://www.example.com/callback")
                .asyncAmdStatusCallbackMethod(CallCallsParams.AsyncAmdStatusCallbackMethod.GET)
                .callerId("Info")
                .cancelPlaybackOnDetectMessageEnd(false)
                .cancelPlaybackOnMachineDetection(false)
                .addCustomHeader(
                    CallCallsParams.CustomHeader.builder()
                        .name("X-Custom-Header")
                        .value("custom-value")
                        .build()
                )
                .detectionMode(CallCallsParams.DetectionMode.PREMIUM)
                .fallbackUrl("https://www.example.com/instructions-fallback.xml")
                .machineDetection(CallCallsParams.MachineDetection.ENABLE)
                .machineDetectionSilenceTimeout(2000L)
                .machineDetectionSpeechEndThreshold(2000L)
                .machineDetectionSpeechThreshold(2000L)
                .machineDetectionTimeout(5000L)
                .preferredCodecs("PCMA,PCMU")
                .record(false)
                .recordingChannels(CallCallsParams.RecordingChannels.DUAL)
                .recordingStatusCallback("https://example.com/recording_status_callback")
                .recordingStatusCallbackEvent("in-progress completed absent")
                .recordingStatusCallbackMethod(CallCallsParams.RecordingStatusCallbackMethod.GET)
                .recordingTimeout(5L)
                .recordingTrack(CallCallsParams.RecordingTrack.INBOUND)
                .sendRecordingUrl(false)
                .sipAuthPassword("1234")
                .sipAuthUsername("user")
                .sipRegion(CallCallsParams.SipRegion.CANADA)
                .statusCallback("https://www.example.com/statuscallback-listener")
                .statusCallbackEvent(CallCallsParams.StatusCallbackEvent.INITIATED)
                .statusCallbackMethod(CallCallsParams.StatusCallbackMethod.GET)
                .trim(CallCallsParams.Trim.TRIM_SILENCE)
                .url("https://www.example.com/texml.xml")
                .urlMethod(CallCallsParams.UrlMethod.GET)
                .build()

        val body = params._body()

        assertThat(body.applicationSid()).isEqualTo("example-app-sid")
        assertThat(body.from()).isEqualTo("+13120001234")
        assertThat(body.to()).isEqualTo("+13121230000")
        assertThat(body.asyncAmd()).contains(true)
        assertThat(body.asyncAmdStatusCallback()).contains("https://www.example.com/callback")
        assertThat(body.asyncAmdStatusCallbackMethod())
            .contains(CallCallsParams.AsyncAmdStatusCallbackMethod.GET)
        assertThat(body.callerId()).contains("Info")
        assertThat(body.cancelPlaybackOnDetectMessageEnd()).contains(false)
        assertThat(body.cancelPlaybackOnMachineDetection()).contains(false)
        assertThat(body.customHeaders().getOrNull())
            .containsExactly(
                CallCallsParams.CustomHeader.builder()
                    .name("X-Custom-Header")
                    .value("custom-value")
                    .build()
            )
        assertThat(body.detectionMode()).contains(CallCallsParams.DetectionMode.PREMIUM)
        assertThat(body.fallbackUrl()).contains("https://www.example.com/instructions-fallback.xml")
        assertThat(body.machineDetection()).contains(CallCallsParams.MachineDetection.ENABLE)
        assertThat(body.machineDetectionSilenceTimeout()).contains(2000L)
        assertThat(body.machineDetectionSpeechEndThreshold()).contains(2000L)
        assertThat(body.machineDetectionSpeechThreshold()).contains(2000L)
        assertThat(body.machineDetectionTimeout()).contains(5000L)
        assertThat(body.preferredCodecs()).contains("PCMA,PCMU")
        assertThat(body.record()).contains(false)
        assertThat(body.recordingChannels()).contains(CallCallsParams.RecordingChannels.DUAL)
        assertThat(body.recordingStatusCallback())
            .contains("https://example.com/recording_status_callback")
        assertThat(body.recordingStatusCallbackEvent()).contains("in-progress completed absent")
        assertThat(body.recordingStatusCallbackMethod())
            .contains(CallCallsParams.RecordingStatusCallbackMethod.GET)
        assertThat(body.recordingTimeout()).contains(5L)
        assertThat(body.recordingTrack()).contains(CallCallsParams.RecordingTrack.INBOUND)
        assertThat(body.sendRecordingUrl()).contains(false)
        assertThat(body.sipAuthPassword()).contains("1234")
        assertThat(body.sipAuthUsername()).contains("user")
        assertThat(body.sipRegion()).contains(CallCallsParams.SipRegion.CANADA)
        assertThat(body.statusCallback())
            .contains("https://www.example.com/statuscallback-listener")
        assertThat(body.statusCallbackEvent())
            .contains(CallCallsParams.StatusCallbackEvent.INITIATED)
        assertThat(body.statusCallbackMethod()).contains(CallCallsParams.StatusCallbackMethod.GET)
        assertThat(body.trim()).contains(CallCallsParams.Trim.TRIM_SILENCE)
        assertThat(body.url()).contains("https://www.example.com/texml.xml")
        assertThat(body.urlMethod()).contains(CallCallsParams.UrlMethod.GET)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallCallsParams.builder()
                .accountSid("account_sid")
                .applicationSid("example-app-sid")
                .from("+13120001234")
                .to("+13121230000")
                .build()

        val body = params._body()

        assertThat(body.applicationSid()).isEqualTo("example-app-sid")
        assertThat(body.from()).isEqualTo("+13120001234")
        assertThat(body.to()).isEqualTo("+13121230000")
    }
}
